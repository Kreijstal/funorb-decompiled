/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ga extends le {
    static int field_q;
    int field_k;
    int field_p;
    int field_j;
    sk field_v;
    int field_m;
    int field_n;
    static int field_r;
    vg field_t;
    io field_h;
    String field_o;
    boolean field_l;
    String field_s;
    int field_u;
    static boolean field_w;
    int field_i;

    void c(byte param0) {
        boolean discarded$0 = false;
        if (param0 != 57) {
            discarded$0 = this.a((ga) null, -6, 18, 10, -10, false, 55);
        }
    }

    boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
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
            if (param5) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_s = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("ga.OA(");
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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(byte param0, ga param1) {
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
            if (param0 >= 67) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_l = true;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ga.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        boolean discarded$2 = false;
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
              if (!this.b(param3, 21224, param2, param4, param0)) {
                break L1;
              } else {
                this.field_m = param5;
                break L1;
              }
            }
            if (param1 == 1) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              discarded$2 = this.a((ga) null, 64, -30, -110, -58, false, 34);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var8);
            stackOut_6_1 = new StringBuilder().append("ga.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param6 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        String discarded$17 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              discarded$9 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_k).append(",").append(this.field_j).append(" ").append(this.field_i).append("x").append(this.field_n);
              if (null != this.field_o) {
                discarded$10 = param3.append(" text=\"").append(this.field_o).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_l) {
                discarded$11 = param3.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.e(-17741)) {
                discarded$12 = param3.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null == this.field_h) {
                break L4;
              } else {
                L5: {
                  discarded$13 = param3.append(" renderer=");
                  if (!(this.field_h instanceof ga)) {
                    break L5;
                  } else {
                    param3 = this.a(param0, param3, true, param1 + 1);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                discarded$14 = param3.append(this.field_h);
                break L4;
              }
            }
            L6: {
              if (this.field_v != null) {
                L7: {
                  discarded$15 = param3.append(" listener=");
                  if (!(this.field_v instanceof ga)) {
                    break L7;
                  } else {
                    param3 = this.a(param0, param3, true, param1 - -1);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                discarded$16 = param3.append(this.field_v);
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              if (param2 > 64) {
                break L8;
              } else {
                discarded$17 = this.d(37);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("ga.UA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, boolean param3) {
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        int var5 = 0;
        ij var6 = null;
        int var7 = 0;
        ij var8 = null;
        ij var9 = null;
        ij var10 = null;
        ij var11 = null;
        ij var12 = null;
        ij var13 = null;
        ij var14 = null;
        ij var15 = null;
        ij var16 = null;
        var7 = ZombieDawn.field_J;
        this.a((ga) (this), (byte) 108, param0, param1);
        if (!param3) {
          L0: {
            discarded$3 = this.a(76, 88, -58, 36, -103, -17, (ga) null);
            var5 = this.e(-17741) ? 1 : 0;
            if (param2) {
              break L0;
            } else {
              if (var5 != 0) {
                if (0 != ci.field_d) {
                  this.c((byte) 57);
                  if (var7 != 0) {
                    break L0;
                  } else {
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(this.d(-58), 0);
                  return param2;
                }
              } else {
                he.field_b = kc.field_R;
                og.a(this.d(-58), 0);
                return param2;
              }
            }
          }
          L1: {
            if (id.field_I == 0) {
              break L1;
            } else {
              if (var5 != 0) {
                discarded$4 = this.a((ga) (this), id.field_I, param1, ha.field_b, param0, true, ei.field_K);
                break L1;
              } else {
                L2: {
                  if (ci.field_d == 0) {
                    break L2;
                  } else {
                    L3: {
                      if (this.a(nc.field_j, 1, param0, hp.field_D, param1, ci.field_d, (ga) (this))) {
                        break L3;
                      } else {
                        if (var5 == 0) {
                          break L2;
                        } else {
                          this.c((byte) 57);
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    param2 = false;
                    break L2;
                  }
                }
                if (kc.field_R == 0) {
                  if (0 != he.field_b) {
                    this.a(param1, 112, ha.field_b, ei.field_K, param0, (ga) (this));
                    var11 = np.field_H;
                    var6 = var11;
                    if (var11 != null) {
                      if (!(var11.field_v instanceof in)) {
                        np.field_H = null;
                        he.field_b = kc.field_R;
                        og.a(this.d(-58), 0);
                        return param2;
                      } else {
                        ((in) ((Object) var11.field_v)).a(-12156, (rd) null, var11);
                        np.field_H = null;
                        he.field_b = kc.field_R;
                        og.a(this.d(-58), 0);
                        return param2;
                      }
                    } else {
                      he.field_b = kc.field_R;
                      og.a(this.d(-58), 0);
                      return param2;
                    }
                  } else {
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(this.d(-58), 0);
                  return param2;
                }
              }
            }
          }
          if (ci.field_d != 0) {
            if (this.a(nc.field_j, 1, param0, hp.field_D, param1, ci.field_d, (ga) (this))) {
              param2 = false;
              if (kc.field_R == 0) {
                if (0 != he.field_b) {
                  this.a(param1, 112, ha.field_b, ei.field_K, param0, (ga) (this));
                  var16 = np.field_H;
                  if (var16 != null) {
                    if (!(var16.field_v instanceof in)) {
                      np.field_H = null;
                      he.field_b = kc.field_R;
                      og.a(this.d(-58), 0);
                      return param2;
                    } else {
                      ((in) ((Object) var16.field_v)).a(-12156, (rd) null, var16);
                      np.field_H = null;
                      he.field_b = kc.field_R;
                      og.a(this.d(-58), 0);
                      return param2;
                    }
                  } else {
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(this.d(-58), 0);
                  return param2;
                }
              } else {
                he.field_b = kc.field_R;
                og.a(this.d(-58), 0);
                return param2;
              }
            } else {
              if (var5 != 0) {
                this.c((byte) 57);
                if (var7 != 0) {
                  param2 = false;
                  if (kc.field_R == 0) {
                    if (0 != he.field_b) {
                      this.a(param1, 112, ha.field_b, ei.field_K, param0, (ga) (this));
                      var15 = np.field_H;
                      if (var15 != null) {
                        if (!(var15.field_v instanceof in)) {
                          np.field_H = null;
                          he.field_b = kc.field_R;
                          og.a(this.d(-58), 0);
                          return param2;
                        } else {
                          ((in) ((Object) var15.field_v)).a(-12156, (rd) null, var15);
                          np.field_H = null;
                          he.field_b = kc.field_R;
                          og.a(this.d(-58), 0);
                          return param2;
                        }
                      } else {
                        he.field_b = kc.field_R;
                        og.a(this.d(-58), 0);
                        return param2;
                      }
                    } else {
                      he.field_b = kc.field_R;
                      og.a(this.d(-58), 0);
                      return param2;
                    }
                  } else {
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  }
                } else {
                  if (kc.field_R == 0) {
                    if (0 != he.field_b) {
                      this.a(param1, 112, ha.field_b, ei.field_K, param0, (ga) (this));
                      var14 = np.field_H;
                      if (var14 != null) {
                        if (!(var14.field_v instanceof in)) {
                          np.field_H = null;
                          he.field_b = kc.field_R;
                          og.a(this.d(-58), 0);
                          return param2;
                        } else {
                          ((in) ((Object) var14.field_v)).a(-12156, (rd) null, var14);
                          np.field_H = null;
                          he.field_b = kc.field_R;
                          og.a(this.d(-58), 0);
                          return param2;
                        }
                      } else {
                        he.field_b = kc.field_R;
                        og.a(this.d(-58), 0);
                        return param2;
                      }
                    } else {
                      he.field_b = kc.field_R;
                      og.a(this.d(-58), 0);
                      return param2;
                    }
                  } else {
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  }
                }
              } else {
                if (kc.field_R == 0) {
                  if (0 != he.field_b) {
                    this.a(param1, 112, ha.field_b, ei.field_K, param0, (ga) (this));
                    var13 = np.field_H;
                    if (var13 != null) {
                      if (!(var13.field_v instanceof in)) {
                        np.field_H = null;
                        he.field_b = kc.field_R;
                        og.a(this.d(-58), 0);
                        return param2;
                      } else {
                        ((in) ((Object) var13.field_v)).a(-12156, (rd) null, var13);
                        np.field_H = null;
                        he.field_b = kc.field_R;
                        og.a(this.d(-58), 0);
                        return param2;
                      }
                    } else {
                      he.field_b = kc.field_R;
                      og.a(this.d(-58), 0);
                      return param2;
                    }
                  } else {
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(this.d(-58), 0);
                  return param2;
                }
              }
            }
          } else {
            if (kc.field_R == 0) {
              if (0 != he.field_b) {
                this.a(param1, 112, ha.field_b, ei.field_K, param0, (ga) (this));
                var12 = np.field_H;
                if (var12 != null) {
                  if (!(var12.field_v instanceof in)) {
                    np.field_H = null;
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  } else {
                    ((in) ((Object) var12.field_v)).a(-12156, (rd) null, var12);
                    np.field_H = null;
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(this.d(-58), 0);
                  return param2;
                }
              } else {
                he.field_b = kc.field_R;
                og.a(this.d(-58), 0);
                return param2;
              }
            } else {
              he.field_b = kc.field_R;
              og.a(this.d(-58), 0);
              return param2;
            }
          }
        } else {
          L4: {
            var5 = this.e(-17741) ? 1 : 0;
            if (param2) {
              break L4;
            } else {
              if (var5 != 0) {
                if (0 != ci.field_d) {
                  this.c((byte) 57);
                  if (var7 != 0) {
                    break L4;
                  } else {
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(this.d(-58), 0);
                  return param2;
                }
              } else {
                he.field_b = kc.field_R;
                og.a(this.d(-58), 0);
                return param2;
              }
            }
          }
          L5: {
            if (id.field_I == 0) {
              break L5;
            } else {
              if (var5 != 0) {
                discarded$5 = this.a((ga) (this), id.field_I, param1, ha.field_b, param0, true, ei.field_K);
                break L5;
              } else {
                L6: {
                  if (ci.field_d == 0) {
                    break L6;
                  } else {
                    L7: {
                      if (this.a(nc.field_j, 1, param0, hp.field_D, param1, ci.field_d, (ga) (this))) {
                        break L7;
                      } else {
                        if (var5 == 0) {
                          break L6;
                        } else {
                          this.c((byte) 57);
                          if (var7 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    param2 = false;
                    break L6;
                  }
                }
                if (kc.field_R == 0) {
                  if (0 == he.field_b) {
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  } else {
                    L8: {
                      this.a(param1, 112, ha.field_b, ei.field_K, param0, (ga) (this));
                      var8 = np.field_H;
                      if (var8 != null) {
                        if (!(var8.field_v instanceof in)) {
                          np.field_H = null;
                          break L8;
                        } else {
                          ((in) ((Object) var8.field_v)).a(-12156, (rd) null, var8);
                          np.field_H = null;
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(this.d(-58), 0);
                  return param2;
                }
              }
            }
          }
          L9: {
            if (ci.field_d == 0) {
              break L9;
            } else {
              if (this.a(nc.field_j, 1, param0, hp.field_D, param1, ci.field_d, (ga) (this))) {
                param2 = false;
                break L9;
              } else {
                if (var5 == 0) {
                  break L9;
                } else {
                  this.c((byte) 57);
                  if (var7 == 0) {
                    break L9;
                  } else {
                    param2 = false;
                    if (kc.field_R == 0) {
                      if (0 == he.field_b) {
                        he.field_b = kc.field_R;
                        og.a(this.d(-58), 0);
                        return param2;
                      } else {
                        L10: {
                          this.a(param1, 112, ha.field_b, ei.field_K, param0, (ga) (this));
                          var9 = np.field_H;
                          if (var9 != null) {
                            if (!(var9.field_v instanceof in)) {
                              np.field_H = null;
                              break L10;
                            } else {
                              ((in) ((Object) var9.field_v)).a(-12156, (rd) null, var9);
                              np.field_H = null;
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                        he.field_b = kc.field_R;
                        og.a(this.d(-58), 0);
                        return param2;
                      }
                    } else {
                      he.field_b = kc.field_R;
                      og.a(this.d(-58), 0);
                      return param2;
                    }
                  }
                }
              }
            }
          }
          if (kc.field_R == 0) {
            if (0 != he.field_b) {
              this.a(param1, 112, ha.field_b, ei.field_K, param0, (ga) (this));
              var10 = np.field_H;
              if (var10 != null) {
                if (!(var10.field_v instanceof in)) {
                  np.field_H = null;
                  he.field_b = kc.field_R;
                  og.a(this.d(-58), 0);
                  return param2;
                } else {
                  ((in) ((Object) var10.field_v)).a(-12156, (rd) null, var10);
                  np.field_H = null;
                  he.field_b = kc.field_R;
                  og.a(this.d(-58), 0);
                  return param2;
                }
              } else {
                he.field_b = kc.field_R;
                og.a(this.d(-58), 0);
                return param2;
              }
            } else {
              he.field_b = kc.field_R;
              og.a(this.d(-58), 0);
              return param2;
            }
          } else {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        try {
            if (param1 < 1) {
                this.field_v = (sk) null;
            }
            this.field_m = 0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ga.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        return this.a(new Hashtable(), new StringBuilder(), true, 0).toString();
    }

    boolean b(int param0, int param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param1 == 21224) {
          if (param4 >= this.field_k + param3) {
            if (param0 < this.field_j + param2) {
              return false;
            } else {
              L0: {
                L1: {
                  if (this.field_i + param3 - -this.field_k <= param4) {
                    break L1;
                  } else {
                    if (param0 >= param2 - -this.field_j + this.field_n) {
                      break L1;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          discarded$1 = this.a(22, -63, true, true);
          if (param4 >= this.field_k + param3) {
            if (param0 >= this.field_j + param2) {
              if (this.field_i + param3 - -this.field_k > param4) {
                if (param0 >= param2 - -this.field_j + this.field_n) {
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

    int c(int param0) {
        if (param0 != 0) {
            this.field_u = 73;
            return 0;
        }
        return 0;
    }

    final static void a(int param0, int param1, lo param2) {
        am var3 = null;
        try {
            var3 = dp.field_e;
            var3.j(11, param0);
            var3.i(2, 93);
            var3.i(param1, param1 ^ 35);
            var3.i(param2.field_k, -96);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ga.VA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        var4 = this.c(0);
        var5_int = param0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              this.a(param2, var5_int, param1, 0);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var5 = eg.a(109);
          if (var5 != null) {
            se.field_j.a(mm.field_i, lc.field_i, var5, -104);
            return;
          } else {
            return;
          }
        }
    }

    void a(ga param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
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
              var5_int = this.b(ei.field_K, 21224, param2, param3, ha.field_b) ? 1 : 0;
              var6 = 7 / ((46 - param1) / 42);
              if (var5_int != 0) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 == (this.field_l ? 1 : 0)) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var5_int == 0) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((ga) (this)).field_l = stackIn_8_1 != 0;
                if (null == this.field_v) {
                  break L2;
                } else {
                  if (this.field_v instanceof ue) {
                    ((ue) ((Object) this.field_v)).a((ga) (this), 10766, var5_int != 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("ga.D(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean e(int param0) {
        boolean discarded$0 = false;
        if (param0 != -17741) {
            discarded$0 = this.a(-123, 51, -13, -35, -43, -14, (ga) null);
            return false;
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_j = param1;
        this.field_i = param3;
        this.field_k = param2;
        this.field_n = param4;
        int var6 = 124 / ((param0 - -23) / 48);
    }

    final void a(boolean param0) {
        this.a(38, this.field_j, this.field_k, this.field_i, this.field_n);
        if (!param0) {
            ga.a(122, 7, (lo) null);
        }
    }

    ga(String param0, sk param1) {
        this(param0, se.field_j.field_n, param1);
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5_int = -46 / ((param0 - -83) / 32);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var5);
            stackOut_2_1 = new StringBuilder().append("ga.I(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param3 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final boolean a(int param0, byte param1, char param2) {
        int var4 = 0;
        if (this.e(-17741)) {
          if (!this.a(28, param0, (ga) (this), param2)) {
            var4 = param0;
            if (var4 == 80) {
              return this.a((byte) 76, (ga) (this));
            } else {
              if (param1 <= 21) {
                this.field_n = 58;
                return false;
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          var4 = param0;
          if (var4 == 80) {
            return this.a((byte) 76, (ga) (this));
          } else {
            if (param1 <= 21) {
              this.field_n = 58;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        String discarded$2 = null;
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
              if (this.a(param0, param1, 11098, param3)) {
                this.a(param0, param3, 67, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2) {
                break L2;
              } else {
                discarded$2 = this.toString();
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) (param1);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("ga.NA(");
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
            if (param1 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final boolean a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$4 = null;
        Object discarded$5 = null;
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
              if (param2 == 11098) {
                break L1;
              } else {
                field_q = 49;
                break L1;
              }
            }
            if (param0.containsKey(this)) {
              discarded$4 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$5 = param0.put(this, this);
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
            stackOut_7_1 = new StringBuilder().append("ga.BB(");
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    String d(int param0) {
        int var2 = 67 / ((10 - param0) / 58);
        return !this.field_l ? null : this.field_s;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 == param3) {
            if (this.field_h == null) {
                return;
            }
            this.field_h.a(16777215, true, param0, (ga) (this), param2);
        }
    }

    protected ga() {
        this.field_p = 0;
        this.field_u = 0;
    }

    ga(String param0, io param1, sk param2) {
        RuntimeException runtimeException = null;
        ak var4 = null;
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
        this.field_u = 0;
        try {
          L0: {
            L1: {
              this.field_v = param2;
              this.field_o = param0;
              this.field_h = param1;
              if (!(this.field_h instanceof ak)) {
                break L1;
              } else {
                var4 = (ak) ((Object) this.field_h);
                this.field_i = var4.b((byte) -58, (ga) (this));
                this.field_n = var4.a(false, (ga) (this));
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
            stackOut_4_1 = new StringBuilder().append("ga.<init>(");
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
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    ga(int param0, int param1, int param2, int param3, io param4, sk param5) {
        this.field_p = 0;
        this.field_u = 0;
        try {
            this.field_h = param4;
            this.field_k = param0;
            this.field_j = param1;
            this.field_n = param3;
            this.field_i = param2;
            this.field_v = param5;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ga.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = 15;
        field_w = false;
        field_r = 0;
    }
}
