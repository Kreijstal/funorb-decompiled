/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class vg extends oh {
    qo field_j;
    ko field_u;
    String field_v;
    int field_x;
    int field_n;
    int field_m;
    int field_q;
    iq field_p;
    int field_o;
    String field_s;
    static int[] field_w;
    int field_l;
    static long field_i;
    int field_h;
    boolean field_k;
    static String field_r;
    static bi field_t;

    final void d(byte param0) {
        int var2 = 10 / ((-44 - param0) / 63);
        this.a(this.field_q, this.field_n, (byte) 108, this.field_m, this.field_x);
    }

    final void a(Hashtable param0, int param1, boolean param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_m).append(",").append(this.field_q).append(" ").append(this.field_x).append("x").append(this.field_n);
              if (null != this.field_s) {
                discarded$1 = param3.append(" text=\"").append(this.field_s).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_k) {
                discarded$2 = param3.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            if (!param2) {
              L3: {
                if (!this.f(1)) {
                  break L3;
                } else {
                  discarded$3 = param3.append(" focused");
                  break L3;
                }
              }
              L4: {
                if (this.field_p == null) {
                  break L4;
                } else {
                  discarded$4 = param3.append(" renderer=");
                  if (!(this.field_p instanceof vg)) {
                    discarded$5 = param3.append(this.field_p);
                    break L4;
                  } else {
                    param3 = this.a((byte) 125, param0, param1 + 1, param3);
                    break L4;
                  }
                }
              }
              L5: {
                if (null != this.field_u) {
                  discarded$6 = param3.append(" listener=");
                  if (!(this.field_u instanceof vg)) {
                    discarded$7 = param3.append(this.field_u);
                    break L5;
                  } else {
                    param3 = this.a((byte) 125, param0, param1 - -1, param3);
                    break L5;
                  }
                } else {
                  break L5;
                }
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
          L6: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("vg.TB(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, boolean param1, int param2, byte param3) {
        int var5;
        fr var6;
        int var7;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          this.a(param0, param2, (vg) (this), (byte) 91);
          var5 = this.f(1) ? 1 : 0;
          if (!param1) {
            if (var5 == 0) {
              break L0;
            } else {
              if (-1 == (je.field_d ^ -1)) {
                break L0;
              } else {
                this.e((byte) 21);
                break L0;
              }
            }
          } else {
            L1: {
              if (so.field_o == 0) {
                break L1;
              } else {
                if (var5 == 0) {
                  break L1;
                } else {
                  this.a(0, bb.field_b, pd.field_k, (vg) (this), param2, param0, so.field_o);
                  break L1;
                }
              }
            }
            L2: {
              if (-1 != (je.field_d ^ -1)) {
                if (!this.a(je.field_d, nh.field_p, (byte) 96, td.field_P, param0, param2, (vg) (this))) {
                  if (var5 != 0) {
                    this.e((byte) -126);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  param1 = false;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            if (rf.field_n != 0) {
              break L0;
            } else {
              if (so.field_m != 0) {
                this.a(pd.field_k, param2, param0, bb.field_b, -600269855, (vg) (this));
                var6 = oa.field_b;
                if (var6 == null) {
                  break L0;
                } else {
                  L3: {
                    if (var6.field_u instanceof lf) {
                      ((lf) ((Object) var6.field_u)).a(-27619, (vj) null, var6);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  oa.field_b = null;
                  break L0;
                }
              } else {
                break L0;
              }
            }
          }
        }
        L4: {
          so.field_m = rf.field_n;
          vj.a(this.c(true), 0);
          if (param3 == 0) {
            break L4;
          } else {
            this.d((byte) 58);
            break L4;
          }
        }
        return param1;
    }

    boolean a(byte param0, vg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -127 % ((61 - param0) / 59);
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("vg.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        try {
            this.field_o = 0;
            if (param4 != -600269855) {
                this.a((Hashtable) null, 103, false, (StringBuilder) null);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "vg.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static tq g(int param0) {
        int var1 = 4 / ((-7 - param0) / 37);
        return eg.c(1, 0);
    }

    final static boolean a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
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
              if (param1 == -89) {
                break L1;
              } else {
                field_i = 72L;
                break L1;
              }
            }
            stackIn_3_0 = jd.a((byte) 116, false, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("vg.QB(");

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
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    void e(byte param0) {
        int var2 = -22 % ((-84 - param0) / 33);
    }

    final boolean a(int param0, char param1, boolean param2) {
        if (this.f(1) && this.a(param0, param1, 13, (vg) (this))) {
            return true;
        }
        if (!param2) {
            return true;
        }
        int var4 = param0;
        if (var4 != 80) {
            return false;
        }
        return this.a((byte) -33, (vg) (this));
    }

    int e(int param0) {
        if (param0 != -600269855) {
            this.field_k = true;
            return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 == 0 && null != this.field_p) {
            this.field_p.a((vg) (this), param3, true, param2, (byte) 12);
        }
        if (param1 != -11857) {
            this.field_m = -30;
        }
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
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
              if (param2 >= 95) {
                break L1;
              } else {
                this.field_p = (iq) null;
                break L1;
              }
            }
            if (this.a(param1, 88, param3, param5, param4)) {
              this.field_o = param0;
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

            stackIn_8_1 = new StringBuilder().append("vg.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    void a(int param0, int param1, vg param2, byte param3) {
        int var5_int = 0;
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = this.a(pd.field_k, 62, bb.field_b, param1, param0) ? 1 : 0;
              if (this.field_k) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 != var5_int) {
                break L2;
              } else {
                L3: {
                  stackIn_6_0 = this;

                  if (var5_int == 0) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L3;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L3;
                  }
                }
                ((vg) (this)).field_k = stackIn_7_1 != 0;
                if (null == this.field_u) {
                  break L2;
                } else {
                  if (this.field_u instanceof hf) {
                    ((hf) ((Object) this.field_u)).a((vg) (this), (byte) 116, var5_int != 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L4: {
              if (param3 == 91) {
                break L4;
              } else {
                this.field_s = (String) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("vg.PA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_8_0 = 0;
        L0: {
          if (param1 >= 36) {
            break L0;
          } else {
            this.a(126, '￡', false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_m + param4 > param0) {
              break L2;
            } else {
              if (param2 < param3 + this.field_q) {
                break L2;
              } else {
                if (param0 >= this.field_x + (this.field_m + param4)) {
                  break L2;
                } else {
                  if (param3 + (this.field_q - -this.field_n) <= param2) {
                    break L2;
                  } else {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_8_0 = 0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    public final String toString() {
        return this.a((byte) -103, new Hashtable(), 0, new StringBuilder()).toString();
    }

    public static void d(int param0) {
        field_r = null;
        field_t = null;
        field_w = null;
        if (param0 != 0) {
            vg.d(-30);
        }
    }

    void a(int param0, int param1, byte param2, int param3, int param4) {
        this.field_m = param3;
        this.field_q = param0;
        this.field_x = param4;
        this.field_n = param1;
        if (param2 <= 99) {
            this.e(127);
        }
    }

    boolean a(int param0, int param1, int param2, vg param3, int param4, int param5, int param6) {
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
            if (param0 == 0) {
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
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("vg.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var5_int = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var4 = this.e(-600269855);
        if (param2 != -66) {
            return;
        }
        for (var5_int = 0; var5_int <= var4; var5_int++) {
            this.a(var5_int, -11857, param0, param1);
        }
        String var5 = on.a(false);
        if (!(var5 == null)) {
            qq.field_I.a(rs.field_Fb, ra.field_g, 106, var5);
        }
    }

    String c(boolean param0) {
        if (!param0) {
            return (String) null;
        }
        if (!this.field_k) {
            return null;
        }
        return this.field_v;
    }

    final boolean a(boolean param0, int param1, StringBuilder param2, Hashtable param3) {
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
            if (!param0) {
              if (!param3.containsKey(this)) {
                param3.put(this, this);
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("vg.SB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
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

    StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(false, param2, param3, param1)) {
                break L1;
              } else {
                this.a(param1, param2, false, param3);
                break L1;
              }
            }
            var5_int = -116 / ((64 - param0) / 61);
            stackIn_3_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("vg.NA(").append(param0).append(',');

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    boolean f(int param0) {
        if (param0 != 1) {
            return false;
        }
        return false;
    }

    boolean a(int param0, char param1, int param2, vg param3) {
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
            if (param2 == 13) {
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
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("vg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    protected vg() {
        this.field_h = 0;
        this.field_l = 0;
    }

    vg(String param0, ko param1) {
        this(param0, qq.field_I.field_s, param1);
    }

    vg(String param0, iq param1, ko param2) {
        pj var4 = null;
        this.field_h = 0;
        this.field_l = 0;
        try {
            this.field_p = param1;
            this.field_s = param0;
            this.field_u = param2;
            if (this.field_p instanceof pj) {
                var4 = (pj) ((Object) this.field_p);
                this.field_x = var4.a((byte) -52, (vg) (this));
                this.field_n = var4.a(true, (vg) (this));
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    vg(int param0, int param1, int param2, int param3, iq param4, ko param5) {
        this.field_h = 0;
        this.field_l = 0;
        try {
            this.field_n = param3;
            this.field_q = param1;
            this.field_p = param4;
            this.field_u = param5;
            this.field_m = param0;
            this.field_x = param2;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "vg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_i = 20000000L;
            field_w = new int[256];
            var1 = 0;
            L0: while (true) {
              if ((var1 ^ -1) <= -257) {
                field_r = "You must be a member to play with the current options.";
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (8 <= var2) {
                    field_w[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (1 != (var0 & 1)) {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    } else {
                      var0 = -306674912 ^ var0 >>> -600269855;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
