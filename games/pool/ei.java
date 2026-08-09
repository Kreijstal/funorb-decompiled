/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ei extends ma {
    int field_D;
    int field_v;
    static vh field_A;
    int field_l;
    int field_y;
    fp field_z;
    boolean field_s;
    static int field_u;
    int field_r;
    static int field_o;
    String field_m;
    String field_p;
    op field_x;
    static java.math.BigInteger field_q;
    int field_n;
    int field_C;
    static int field_B;
    cc field_t;
    static String field_E;
    static String field_w;

    ei(String param0, cc param1) {
        this(param0, db.field_Sb.field_c, param1);
    }

    void a(ei param0, int param1, int param2, int param3) {
        int var5_int = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param1 == 958) {
              L1: {
                var5_int = this.a(param2, param3, wn.field_i, param1 + -959, gg.field_f) ? 1 : 0;
                if (var5_int != (this.field_s ? 1 : 0)) {
                  L2: {
                    stackIn_6_0 = this;

                    if (var5_int == 0) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 1;
                      break L2;
                    }
                  }
                  ((ei) (this)).field_s = stackIn_7_1 != 0;
                  if (null == this.field_t) {
                    break L1;
                  } else {
                    if (this.field_t instanceof qj) {
                      ((qj) ((Object) this.field_t)).a(var5_int != 0, (ei) (this), -101);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
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
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ei.S(");

            if (param0 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        field_q = null;
        field_A = null;
        if (param0 != 80) {
            return;
        }
        field_E = null;
        field_w = null;
    }

    boolean a(ei param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        ei var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 <= -126) {
                break L1;
              } else {
                var9 = (ei) null;
                this.a((ei) null, 51, 64, -111);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("ei.WA(");

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
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(ei param0, byte param1) {
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
            var3_int = 44 / ((param1 - -43) / 47);
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ei.M(");

            if (param0 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == field_E) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -71) {
                  break L1;
                } else {
                  field_A = (vh) null;
                  break L1;
                }
              }
              L2: {
                if (param1.toLowerCase().indexOf(field_E.toLowerCase()) < 0) {
                  stackIn_9_0 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("ei.FB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    int c(int param0) {
        if (param0 < 33) {
            this.e(-86);
            return 0;
        }
        return 0;
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.b(param1, param2, param0, -1)) {
                break L1;
              } else {
                this.a(1, param2, param0, param1);
                break L1;
              }
            }
            if (param3 > 13) {
              stackIn_6_0 = (StringBuilder) (param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ei.EA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_o = 14;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("ei.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(int param0, int param1, char param2) {
        int var4;
        if (param0 == -81) {
          if (this.d(param0 + -11)) {
            if (!this.a(param2, param1, false, (ei) (this))) {
              var4 = param1;
              if ((var4 ^ -1) == -81) {
                return this.a((ei) (this), (byte) -103);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param1;
            if ((var4 ^ -1) == -81) {
              return this.a((ei) (this), (byte) -103);
            } else {
              return false;
            }
          }
        } else {
          this.field_s = true;
          if (this.d(param0 + -11)) {
            if (!this.a(param2, param1, false, (ei) (this))) {
              var4 = param1;
              if ((var4 ^ -1) == -81) {
                return this.a((ei) (this), (byte) -103);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param1;
            if ((var4 ^ -1) == -81) {
              return this.a((ei) (this), (byte) -103);
            } else {
              return false;
            }
          }
        }
    }

    void a(int param0, int param1, int param2, boolean param3, int param4) {
        this.field_D = param4;
        if (param3) {
          this.d(43);
          this.field_l = param0;
          this.field_C = param1;
          this.field_y = param2;
          return;
        } else {
          this.field_l = param0;
          this.field_C = param1;
          this.field_y = param2;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        ei var7;
        if (param3 == -1) {
          if (param0 - -this.field_C <= param2) {
            if (param4 < this.field_D + param1) {
              return false;
            } else {
              L0: {
                L1: {
                  if (this.field_C + param0 + this.field_l <= param2) {
                    break L1;
                  } else {
                    if (param4 >= this.field_y + this.field_D + param1) {
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
          var7 = (ei) null;
          this.a((ei) null, 25, false, 45, 66, -10, 22);
          if (param0 - -this.field_C <= param2) {
            if (param4 >= this.field_D + param1) {
              if (this.field_C + param0 + this.field_l > param2) {
                if (param4 >= this.field_y + this.field_D + param1) {
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

    final static dd[] a(byte param0, int param1) {
        dd[] var2;
        String var3;
        dd[] var4;
        var4 = new dd[9];
        var2 = var4;
        if (param0 <= 4) {
          var3 = (String) null;
          ei.a((byte) 3, (String) null);
          var4[4] = ad.a(param1, 64, 7);
          return var2;
        } else {
          var4[4] = ad.a(param1, 64, 7);
          return var2;
        }
    }

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_C).append(",").append(this.field_D).append(" ").append(this.field_l).append("x").append(this.field_y);
              if (null == this.field_m) {
                break L1;
              } else {
                discarded$1 = param2.append(" text=\"").append(this.field_m).append('"');
                break L1;
              }
            }
            L2: {
              if (!this.field_s) {
                break L2;
              } else {
                discarded$2 = param2.append(" mouseover");
                break L2;
              }
            }
            L3: {
              if (!this.d(123)) {
                break L3;
              } else {
                discarded$3 = param2.append(" focused");
                break L3;
              }
            }
            L4: {
              if (param0 == 1) {
                break L4;
              } else {
                this.field_y = -51;
                break L4;
              }
            }
            L5: {
              if (this.field_z != null) {
                discarded$4 = param2.append(" renderer=");
                if (!(this.field_z instanceof ei)) {
                  discarded$5 = param2.append(this.field_z);
                  break L5;
                } else {
                  param2 = this.a(param2, param3 + 1, param1, 25);
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L6: {
              if (this.field_t != null) {
                discarded$6 = param2.append(" listener=");
                if (!(this.field_t instanceof ei)) {
                  discarded$7 = param2.append(this.field_t);
                  break L6;
                } else {
                  param2 = this.a(param2, param3 - -1, param1, 75);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("ei.LB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param3 + ')');
        }
    }

    boolean d(int param0) {
        int var2 = 101 % ((7 - param0) / 48);
        return false;
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        wj var7;
        wj var8;
        wj var9;
        wj var10;
        wj var11;
        wj var12;
        wj var13;
        wj var14;
        wj var15;
        wj var16;
        wj var17;
        this.a((ei) (this), 958, param1, param3);
        if (param0 > -118) {
          L0: {
            ei.c((byte) 17);
            var5 = this.d(85) ? 1 : 0;
            if (!param2) {
              if (var5 == 0) {
                break L0;
              } else {
                if (0 == ne.field_s) {
                  break L0;
                } else {
                  this.d((byte) 99);
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, this.e(-94));
                  return param2;
                }
              }
            } else {
              if (wp.field_d != 0) {
                if (var5 == 0) {
                  L1: {
                    if (-1 == (ne.field_s ^ -1)) {
                      break L1;
                    } else {
                      if (this.a((ei) (this), param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                        param2 = false;
                        break L1;
                      } else {
                        if (var5 != 0) {
                          L2: {
                            this.d((byte) 99);
                            if (cd.field_b != 0) {
                              break L2;
                            } else {
                              if (sa.field_t == 0) {
                                break L2;
                              } else {
                                this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) (this));
                                var16 = uh.field_u;
                                if (var16 != null) {
                                  if (!(var16.field_t instanceof jm)) {
                                    uh.field_u = null;
                                    sa.field_t = cd.field_b;
                                    ue.a((byte) 70, this.e(-94));
                                    return param2;
                                  } else {
                                    ((jm) ((Object) var16.field_t)).a(-87, (k) null, var16);
                                    uh.field_u = null;
                                    sa.field_t = cd.field_b;
                                    ue.a((byte) 70, this.e(-94));
                                    return param2;
                                  }
                                } else {
                                  sa.field_t = cd.field_b;
                                  ue.a((byte) 70, this.e(-94));
                                  return param2;
                                }
                              }
                            }
                          }
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, this.e(-94));
                          return param2;
                        } else {
                          if (cd.field_b == 0) {
                            if (sa.field_t != 0) {
                              this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) (this));
                              var15 = uh.field_u;
                              if (var15 != null) {
                                if (!(var15.field_t instanceof jm)) {
                                  uh.field_u = null;
                                  sa.field_t = cd.field_b;
                                  ue.a((byte) 70, this.e(-94));
                                  return param2;
                                } else {
                                  ((jm) ((Object) var15.field_t)).a(-87, (k) null, var15);
                                  uh.field_u = null;
                                  sa.field_t = cd.field_b;
                                  ue.a((byte) 70, this.e(-94));
                                  return param2;
                                }
                              } else {
                                sa.field_t = cd.field_b;
                                ue.a((byte) 70, this.e(-94));
                                return param2;
                              }
                            } else {
                              sa.field_t = cd.field_b;
                              ue.a((byte) 70, this.e(-94));
                              return param2;
                            }
                          } else {
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, this.e(-94));
                            return param2;
                          }
                        }
                      }
                    }
                  }
                  if (cd.field_b != 0) {
                    break L0;
                  } else {
                    if (sa.field_t == 0) {
                      break L0;
                    } else {
                      this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) (this));
                      var17 = uh.field_u;
                      if (var17 != null) {
                        if (!(var17.field_t instanceof jm)) {
                          uh.field_u = null;
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, this.e(-94));
                          return param2;
                        } else {
                          ((jm) ((Object) var17.field_t)).a(-87, (k) null, var17);
                          uh.field_u = null;
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, this.e(-94));
                          return param2;
                        }
                      } else {
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, this.e(-94));
                        return param2;
                      }
                    }
                  }
                } else {
                  L3: {
                    this.a((ei) (this), wn.field_i, wp.field_d, param3, (byte) -127, gg.field_f, param1);
                    if (-1 == (ne.field_s ^ -1)) {
                      break L3;
                    } else {
                      if (this.a((ei) (this), param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                        param2 = false;
                        break L3;
                      } else {
                        if (var5 != 0) {
                          this.d((byte) 99);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (cd.field_b != 0) {
                      break L4;
                    } else {
                      if (sa.field_t == 0) {
                        break L4;
                      } else {
                        this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) (this));
                        var14 = uh.field_u;
                        if (var14 != null) {
                          if (!(var14.field_t instanceof jm)) {
                            uh.field_u = null;
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, this.e(-94));
                            return param2;
                          } else {
                            ((jm) ((Object) var14.field_t)).a(-87, (k) null, var14);
                            uh.field_u = null;
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, this.e(-94));
                            return param2;
                          }
                        } else {
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, this.e(-94));
                          return param2;
                        }
                      }
                    }
                  }
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, this.e(-94));
                  return param2;
                }
              } else {
                L5: {
                  if (-1 == (ne.field_s ^ -1)) {
                    break L5;
                  } else {
                    if (this.a((ei) (this), param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                      param2 = false;
                      break L5;
                    } else {
                      if (var5 != 0) {
                        this.d((byte) 99);
                        if (cd.field_b == 0) {
                          if (sa.field_t != 0) {
                            this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) (this));
                            var12 = uh.field_u;
                            if (var12 != null) {
                              L6: {
                                if (!(var12.field_t instanceof jm)) {
                                  uh.field_u = null;
                                  break L6;
                                } else {
                                  ((jm) ((Object) var12.field_t)).a(-87, (k) null, var12);
                                  uh.field_u = null;
                                  break L6;
                                }
                              }
                              sa.field_t = cd.field_b;
                              ue.a((byte) 70, this.e(-94));
                              return param2;
                            } else {
                              sa.field_t = cd.field_b;
                              ue.a((byte) 70, this.e(-94));
                              return param2;
                            }
                          } else {
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, this.e(-94));
                            return param2;
                          }
                        } else {
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, this.e(-94));
                          return param2;
                        }
                      } else {
                        if (cd.field_b == 0) {
                          if (sa.field_t != 0) {
                            this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) (this));
                            var11 = uh.field_u;
                            if (var11 == null) {
                              sa.field_t = cd.field_b;
                              ue.a((byte) 70, this.e(-94));
                              return param2;
                            } else {
                              L7: {
                                if (!(var11.field_t instanceof jm)) {
                                  uh.field_u = null;
                                  break L7;
                                } else {
                                  ((jm) ((Object) var11.field_t)).a(-87, (k) null, var11);
                                  uh.field_u = null;
                                  break L7;
                                }
                              }
                              sa.field_t = cd.field_b;
                              ue.a((byte) 70, this.e(-94));
                              return param2;
                            }
                          } else {
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, this.e(-94));
                            return param2;
                          }
                        } else {
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, this.e(-94));
                          return param2;
                        }
                      }
                    }
                  }
                }
                L8: {
                  if (cd.field_b != 0) {
                    break L8;
                  } else {
                    if (sa.field_t == 0) {
                      break L8;
                    } else {
                      this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) (this));
                      var13 = uh.field_u;
                      if (var13 != null) {
                        if (!(var13.field_t instanceof jm)) {
                          uh.field_u = null;
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, this.e(-94));
                          return param2;
                        } else {
                          ((jm) ((Object) var13.field_t)).a(-87, (k) null, var13);
                          uh.field_u = null;
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, this.e(-94));
                          return param2;
                        }
                      } else {
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, this.e(-94));
                        return param2;
                      }
                    }
                  }
                }
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.e(-94));
                return param2;
              }
            }
          }
          sa.field_t = cd.field_b;
          ue.a((byte) 70, this.e(-94));
          return param2;
        } else {
          var5 = this.d(85) ? 1 : 0;
          if (!param2) {
            if (var5 != 0) {
              if (0 == ne.field_s) {
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.e(-94));
                return param2;
              } else {
                this.d((byte) 99);
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.e(-94));
                return param2;
              }
            } else {
              sa.field_t = cd.field_b;
              ue.a((byte) 70, this.e(-94));
              return param2;
            }
          } else {
            L9: {
              if (wp.field_d == 0) {
                break L9;
              } else {
                if (var5 == 0) {
                  break L9;
                } else {
                  L10: {
                    this.a((ei) (this), wn.field_i, wp.field_d, param3, (byte) -127, gg.field_f, param1);
                    if (-1 == (ne.field_s ^ -1)) {
                      break L10;
                    } else {
                      if (this.a((ei) (this), param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                        param2 = false;
                        break L10;
                      } else {
                        if (var5 != 0) {
                          this.d((byte) 99);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  if (cd.field_b == 0) {
                    if (sa.field_t != 0) {
                      this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) (this));
                      var7 = uh.field_u;
                      if (var7 == null) {
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, this.e(-94));
                        return param2;
                      } else {
                        L11: {
                          if (!(var7.field_t instanceof jm)) {
                            uh.field_u = null;
                            break L11;
                          } else {
                            ((jm) ((Object) var7.field_t)).a(-87, (k) null, var7);
                            uh.field_u = null;
                            break L11;
                          }
                        }
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, this.e(-94));
                        return param2;
                      }
                    } else {
                      sa.field_t = cd.field_b;
                      ue.a((byte) 70, this.e(-94));
                      return param2;
                    }
                  } else {
                    sa.field_t = cd.field_b;
                    ue.a((byte) 70, this.e(-94));
                    return param2;
                  }
                }
              }
            }
            L12: {
              if (-1 == (ne.field_s ^ -1)) {
                break L12;
              } else {
                if (this.a((ei) (this), param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                  param2 = false;
                  break L12;
                } else {
                  if (var5 != 0) {
                    this.d((byte) 99);
                    if (cd.field_b == 0) {
                      if (sa.field_t != 0) {
                        this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) (this));
                        var9 = uh.field_u;
                        if (var9 != null) {
                          L13: {
                            if (!(var9.field_t instanceof jm)) {
                              uh.field_u = null;
                              break L13;
                            } else {
                              ((jm) ((Object) var9.field_t)).a(-87, (k) null, var9);
                              uh.field_u = null;
                              break L13;
                            }
                          }
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, this.e(-94));
                          return param2;
                        } else {
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, this.e(-94));
                          return param2;
                        }
                      } else {
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, this.e(-94));
                        return param2;
                      }
                    } else {
                      sa.field_t = cd.field_b;
                      ue.a((byte) 70, this.e(-94));
                      return param2;
                    }
                  } else {
                    if (cd.field_b == 0) {
                      if (sa.field_t != 0) {
                        this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) (this));
                        var8 = uh.field_u;
                        if (var8 == null) {
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, this.e(-94));
                          return param2;
                        } else {
                          L14: {
                            if (!(var8.field_t instanceof jm)) {
                              uh.field_u = null;
                              break L14;
                            } else {
                              ((jm) ((Object) var8.field_t)).a(-87, (k) null, var8);
                              uh.field_u = null;
                              break L14;
                            }
                          }
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, this.e(-94));
                          return param2;
                        }
                      } else {
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, this.e(-94));
                        return param2;
                      }
                    } else {
                      sa.field_t = cd.field_b;
                      ue.a((byte) 70, this.e(-94));
                      return param2;
                    }
                  }
                }
              }
            }
            if (cd.field_b == 0) {
              if (sa.field_t != 0) {
                this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) (this));
                var10 = uh.field_u;
                if (var10 != null) {
                  if (!(var10.field_t instanceof jm)) {
                    uh.field_u = null;
                    sa.field_t = cd.field_b;
                    ue.a((byte) 70, this.e(-94));
                    return param2;
                  } else {
                    ((jm) ((Object) var10.field_t)).a(-87, (k) null, var10);
                    uh.field_u = null;
                    sa.field_t = cd.field_b;
                    ue.a((byte) 70, this.e(-94));
                    return param2;
                  }
                } else {
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, this.e(-94));
                  return param2;
                }
              } else {
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.e(-94));
                return param2;
              }
            } else {
              sa.field_t = cd.field_b;
              ue.a((byte) 70, this.e(-94));
              return param2;
            }
          }
        }
    }

    boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param1, param5, param6, -1, param4)) {
                break L1;
              } else {
                this.field_n = param3;
                break L1;
              }
            }
            if (param2) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("ei.AA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    String e(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        if (param0 > -10) {
          L0: {
            this.c(-28);
            if (this.field_s) {
              stackIn_8_0 = this.field_p;
              break L0;
            } else {
              stackIn_8_0 = null;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_s) {
              stackIn_4_0 = this.field_p;
              break L1;
            } else {
              stackIn_4_0 = null;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public final String toString() {
        return this.a(new StringBuilder(), 0, new Hashtable(), 99).toString();
    }

    void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        try {
            if (param4 < 62) {
                this.a(-128, 68, 'ﾮ');
            }
            this.field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ei.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -1) {
                break L1;
              } else {
                this.a(84, -105, '￈');
                break L1;
              }
            }
            if (param1.containsKey(this)) {
              discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param1.put(this, this);
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ei.MB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        var4 = this.c(66);
        var5_int = 0;
        L0: while (true) {
          if (var4 < var5_int) {
            if (param1 >= 73) {
              var5 = jd.a(9383);
              if (var5 != null) {
                db.field_Sb.a((byte) -52, ne.field_n, id.field_b, var5);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            this.a(var5_int, (byte) -118, param0, param2);
            var5_int++;
            continue L0;
          }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var5;
        if (param0 == 0) {
          if (null == this.field_z) {
            var5 = -117 / ((-42 - param1) / 53);
            return;
          } else {
            this.field_z.a(true, param2, (byte) 71, param3, (ei) (this));
            var5 = -117 / ((-42 - param1) / 53);
            return;
          }
        } else {
          var5 = -117 / ((-42 - param1) / 53);
          return;
        }
    }

    final void e(byte param0) {
        if (param0 > -64) {
          field_o = -58;
          this.a(this.field_l, this.field_C, this.field_y, false, this.field_D);
          return;
        } else {
          this.a(this.field_l, this.field_C, this.field_y, false, this.field_D);
          return;
        }
    }

    void d(byte param0) {
        if (param0 != 99) {
            ei var3 = (ei) null;
            this.a((ei) null, -125, false, 30, 62, -88, -86);
        }
    }

    protected ei() {
        this.field_v = 0;
        this.field_r = 0;
    }

    ei(String param0, fp param1, cc param2) {
        RuntimeException runtimeException = null;
        io var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_v = 0;
        this.field_r = 0;
        try {
          L0: {
            L1: {
              this.field_t = param2;
              this.field_z = param1;
              this.field_m = param0;
              if (!(this.field_z instanceof io)) {
                break L1;
              } else {
                var4 = (io) ((Object) this.field_z);
                this.field_l = var4.a((ei) (this), -1848150943);
                this.field_y = var4.a(1, (ei) (this));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ei.<init>(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    ei(int param0, int param1, int param2, int param3, fp param4, cc param5) {
        this.field_v = 0;
        this.field_r = 0;
        try {
            this.field_y = param3;
            this.field_D = param1;
            this.field_t = param5;
            this.field_C = param0;
            this.field_z = param4;
            this.field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ei.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = 500;
        field_u = 0;
        field_q = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_w = "You are on <%0>";
    }
}
