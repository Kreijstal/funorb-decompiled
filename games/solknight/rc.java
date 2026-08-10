/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rc extends gg {
    int field_t;
    static kb field_o;
    String field_z;
    dg field_n;
    int field_j;
    String field_i;
    jf field_h;
    int field_k;
    boolean field_v;
    int field_q;
    int field_u;
    static int field_l;
    static String field_s;
    int field_m;
    j field_w;
    static String field_p;
    static String field_y;
    int field_x;
    static java.awt.Image field_r;

    boolean a(int param0, rc param1, int param2, int param3, int param4, int param5, byte param6) {
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
            if (param6 > 33) {
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

            stackIn_7_1 = new StringBuilder().append("rc.LA(").append(param0).append(',');

            if (param1 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, rc param3) {
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            var5_int = this.a(ad.field_m, gb.field_j, param0, param2, param1 + -18970) ? 1 : 0;
            if (param1 == 18874) {
              L1: {
                stackIn_4_0 = var5_int;

                if (this.field_v) {
                  stackIn_5_0 = stackIn_4_0;
                  stackIn_5_1 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = stackIn_4_0;
                  stackIn_5_1 = 1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (stackIn_5_0 != stackIn_5_1) {
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
                    ((rc) (this)).field_v = stackIn_9_1 != 0;
                    if (null == this.field_n) {
                      break L3;
                    } else {
                      if (this.field_n instanceof mk) {
                        ((mk) ((Object) this.field_n)).a((rc) (this), (byte) -121, var5_int != 0);
                        break L3;
                      } else {
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
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("rc.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void e(int param0) {
        field_y = null;
        field_r = null;
        if (param0 != -24922) {
          rc.a(32, 42, -124, -105, (o) null, -64, 78, (byte) 43);
          field_p = null;
          field_s = null;
          field_o = null;
          return;
        } else {
          field_p = null;
          field_s = null;
          field_o = null;
          return;
        }
    }

    final void b(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_m).append(",").append(this.field_j).append(" ").append(this.field_t).append("x").append(this.field_x);
              if (null != this.field_i) {
                discarded$1 = param0.append(" text=\"").append(this.field_i).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_v) {
                discarded$2 = param0.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.b(true)) {
                discarded$3 = param0.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_w != null) {
                L5: {
                  discarded$4 = param0.append(" renderer=");
                  if (this.field_w instanceof rc) {
                    break L5;
                  } else {
                    discarded$5 = param0.append(this.field_w);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param0 = this.a(-100, param2, param0, 1 + param3);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (this.field_n == null) {
                break L6;
              } else {
                L7: {
                  discarded$6 = param0.append(" listener=");
                  if (this.field_n instanceof rc) {
                    break L7;
                  } else {
                    discarded$7 = param0.append(this.field_n);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                param0 = this.a(-57, param2, param0, 1 + param3);
                break L6;
              }
            }
            var5_int = 10 / ((param1 - -43) / 58);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("rc.DB(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        try {
            this.field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "rc.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 75 / ((param1 - 31) / 56);
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("rc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static boolean a(int param0, CharSequence param1) {
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
              if (param0 > 85) {
                break L1;
              } else {
                rc.a(-41, (CharSequence) null);
                break L1;
              }
            }
            stackIn_3_0 = wh.a(false, param1, (byte) -123);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("rc.AB(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final String toString() {
        return this.a(-43, new Hashtable(), new StringBuilder(), 0).toString();
    }

    boolean b(boolean param0) {
        if (!param0) {
            field_r = (java.awt.Image) null;
            return false;
        }
        return false;
    }

    boolean a(int param0, rc param1) {
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
            if (param0 == -1463) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_w = (j) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("rc.MA(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4;
        if (this.b(true)) {
          if (!this.a(param1, (byte) -25, param0, (rc) (this))) {
            var4 = param0;
            if (-81 == (var4 ^ -1)) {
              return this.a(-1463, (rc) (this));
            } else {
              var4 = 2 / ((23 - param2) / 52);
              return false;
            }
          } else {
            return true;
          }
        } else {
          var4 = param0;
          if (-81 == (var4 ^ -1)) {
            return this.a(-1463, (rc) (this));
          } else {
            var4 = 2 / ((23 - param2) / 52);
            return false;
          }
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        bc var6;
        int var7;
        bc var8;
        bc var9;
        bc var10;
        bc var11;
        bc var12;
        bc var14;
        bc var23;
        bc var24;
        var7 = SolKnight.field_L ? 1 : 0;
        if (param0 != -1) {
          L0: {
            this.a(118, 41, -10, 127, -68);
            this.a(param3, 18874, param1, (rc) (this));
            var5 = this.b(true) ? 1 : 0;
            if (param2) {
              break L0;
            } else {
              if (var5 != 0) {
                if (0 != hg.field_F) {
                  this.g(0);
                  if (var7 != 0) {
                    break L0;
                  } else {
                    ne.field_j = wb.field_c;
                    pd.a(125, this.c((byte) 78));
                    return param2;
                  }
                } else {
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                }
              } else {
                ne.field_j = wb.field_c;
                pd.a(125, this.c((byte) 78));
                return param2;
              }
            }
          }
          if (0 != cl.field_n) {
            if (var5 == 0) {
              L1: {
                if (hg.field_F == 0) {
                  break L1;
                } else {
                  L2: {
                    if (!this.a(hg.field_F, param3, false, db.field_o, s.field_gb, param1, (rc) (this))) {
                      break L2;
                    } else {
                      param2 = false;
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
                    this.g(0);
                    if (-1 == (wb.field_c ^ -1)) {
                      if (ne.field_j != 0) {
                        this.a(ad.field_m, 0, (rc) (this), param1, gb.field_j, param3);
                        var23 = jf.field_a;
                        if (var23 != null) {
                          if (!(var23.field_n instanceof gk)) {
                            jf.field_a = null;
                            ne.field_j = wb.field_c;
                            pd.a(125, this.c((byte) 78));
                            return param2;
                          } else {
                            ((gk) ((Object) var23.field_n)).a((th) null, -7935, var23);
                            jf.field_a = null;
                            ne.field_j = wb.field_c;
                            pd.a(125, this.c((byte) 78));
                            return param2;
                          }
                        } else {
                          ne.field_j = wb.field_c;
                          pd.a(125, this.c((byte) 78));
                          return param2;
                        }
                      } else {
                        ne.field_j = wb.field_c;
                        pd.a(125, this.c((byte) 78));
                        return param2;
                      }
                    } else {
                      ne.field_j = wb.field_c;
                      pd.a(125, this.c((byte) 78));
                      return param2;
                    }
                  }
                }
              }
              if (-1 == (wb.field_c ^ -1)) {
                if (ne.field_j != 0) {
                  this.a(ad.field_m, 0, (rc) (this), param1, gb.field_j, param3);
                  var24 = jf.field_a;
                  if (var24 != null) {
                    if (!(var24.field_n instanceof gk)) {
                      jf.field_a = null;
                      ne.field_j = wb.field_c;
                      pd.a(125, this.c((byte) 78));
                      return param2;
                    } else {
                      ((gk) ((Object) var24.field_n)).a((th) null, -7935, var24);
                      jf.field_a = null;
                      ne.field_j = wb.field_c;
                      pd.a(125, this.c((byte) 78));
                      return param2;
                    }
                  } else {
                    ne.field_j = wb.field_c;
                    pd.a(125, this.c((byte) 78));
                    return param2;
                  }
                } else {
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                }
              } else {
                ne.field_j = wb.field_c;
                pd.a(125, this.c((byte) 78));
                return param2;
              }
            } else {
              L3: {
                this.a(param3, (rc) (this), param1, gb.field_j, cl.field_n, ad.field_m, (byte) 96);
                if (hg.field_F == 0) {
                  break L3;
                } else {
                  L4: {
                    if (!this.a(hg.field_F, param3, false, db.field_o, s.field_gb, param1, (rc) (this))) {
                      break L4;
                    } else {
                      param2 = false;
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
                    this.g(0);
                    break L3;
                  }
                }
              }
              if (-1 == (wb.field_c ^ -1)) {
                if (ne.field_j != 0) {
                  this.a(ad.field_m, 0, (rc) (this), param1, gb.field_j, param3);
                  var14 = jf.field_a;
                  var6 = var14;
                  if (var14 != null) {
                    if (!(var14.field_n instanceof gk)) {
                      jf.field_a = null;
                      ne.field_j = wb.field_c;
                      pd.a(125, this.c((byte) 78));
                      return param2;
                    } else {
                      ((gk) ((Object) var14.field_n)).a((th) null, -7935, var14);
                      jf.field_a = null;
                      ne.field_j = wb.field_c;
                      pd.a(125, this.c((byte) 78));
                      return param2;
                    }
                  } else {
                    ne.field_j = wb.field_c;
                    pd.a(125, this.c((byte) 78));
                    return param2;
                  }
                } else {
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                }
              } else {
                ne.field_j = wb.field_c;
                pd.a(125, this.c((byte) 78));
                return param2;
              }
            }
          } else {
            L5: {
              if (hg.field_F == 0) {
                break L5;
              } else {
                L6: {
                  if (!this.a(hg.field_F, param3, false, db.field_o, s.field_gb, param1, (rc) (this))) {
                    break L6;
                  } else {
                    param2 = false;
                    if (var7 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (var5 == 0) {
                  break L5;
                } else {
                  this.g(0);
                  if (-1 == (wb.field_c ^ -1)) {
                    if (ne.field_j != 0) {
                      this.a(ad.field_m, 0, (rc) (this), param1, gb.field_j, param3);
                      var11 = jf.field_a;
                      if (var11 != null) {
                        if (!(var11.field_n instanceof gk)) {
                          jf.field_a = null;
                          ne.field_j = wb.field_c;
                          pd.a(125, this.c((byte) 78));
                          return param2;
                        } else {
                          ((gk) ((Object) var11.field_n)).a((th) null, -7935, var11);
                          jf.field_a = null;
                          ne.field_j = wb.field_c;
                          pd.a(125, this.c((byte) 78));
                          return param2;
                        }
                      } else {
                        ne.field_j = wb.field_c;
                        pd.a(125, this.c((byte) 78));
                        return param2;
                      }
                    } else {
                      ne.field_j = wb.field_c;
                      pd.a(125, this.c((byte) 78));
                      return param2;
                    }
                  } else {
                    ne.field_j = wb.field_c;
                    pd.a(125, this.c((byte) 78));
                    return param2;
                  }
                }
              }
            }
            if (-1 == (wb.field_c ^ -1)) {
              if (ne.field_j != 0) {
                this.a(ad.field_m, 0, (rc) (this), param1, gb.field_j, param3);
                var12 = jf.field_a;
                if (var12 != null) {
                  if (!(var12.field_n instanceof gk)) {
                    jf.field_a = null;
                    ne.field_j = wb.field_c;
                    pd.a(125, this.c((byte) 78));
                    return param2;
                  } else {
                    ((gk) ((Object) var12.field_n)).a((th) null, -7935, var12);
                    jf.field_a = null;
                    ne.field_j = wb.field_c;
                    pd.a(125, this.c((byte) 78));
                    return param2;
                  }
                } else {
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                }
              } else {
                ne.field_j = wb.field_c;
                pd.a(125, this.c((byte) 78));
                return param2;
              }
            } else {
              ne.field_j = wb.field_c;
              pd.a(125, this.c((byte) 78));
              return param2;
            }
          }
        } else {
          L7: {
            this.a(param3, 18874, param1, (rc) (this));
            var5 = this.b(true) ? 1 : 0;
            if (param2) {
              break L7;
            } else {
              if (var5 != 0) {
                if (0 != hg.field_F) {
                  this.g(0);
                  if (var7 != 0) {
                    break L7;
                  } else {
                    ne.field_j = wb.field_c;
                    pd.a(125, this.c((byte) 78));
                    return param2;
                  }
                } else {
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                }
              } else {
                ne.field_j = wb.field_c;
                pd.a(125, this.c((byte) 78));
                return param2;
              }
            }
          }
          L8: {
            if (0 == cl.field_n) {
              break L8;
            } else {
              if (var5 == 0) {
                break L8;
              } else {
                L9: {
                  this.a(param3, (rc) (this), param1, gb.field_j, cl.field_n, ad.field_m, (byte) 96);
                  if (hg.field_F == 0) {
                    break L9;
                  } else {
                    L10: {
                      if (!this.a(hg.field_F, param3, false, db.field_o, s.field_gb, param1, (rc) (this))) {
                        break L10;
                      } else {
                        param2 = false;
                        if (var7 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L9;
                    } else {
                      this.g(0);
                      break L9;
                    }
                  }
                }
                if (-1 == (wb.field_c ^ -1)) {
                  if (ne.field_j == 0) {
                    ne.field_j = wb.field_c;
                    pd.a(125, this.c((byte) 78));
                    return param2;
                  } else {
                    L11: {
                      this.a(ad.field_m, 0, (rc) (this), param1, gb.field_j, param3);
                      var8 = jf.field_a;
                      if (var8 != null) {
                        if (!(var8.field_n instanceof gk)) {
                          jf.field_a = null;
                          break L11;
                        } else {
                          ((gk) ((Object) var8.field_n)).a((th) null, -7935, var8);
                          jf.field_a = null;
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                    ne.field_j = wb.field_c;
                    pd.a(125, this.c((byte) 78));
                    return param2;
                  }
                } else {
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                }
              }
            }
          }
          L12: {
            if (hg.field_F == 0) {
              break L12;
            } else {
              L13: {
                if (!this.a(hg.field_F, param3, false, db.field_o, s.field_gb, param1, (rc) (this))) {
                  break L13;
                } else {
                  param2 = false;
                  if (var7 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (var5 == 0) {
                  break L14;
                } else {
                  this.g(0);
                  break L14;
                }
              }
              if (-1 == (wb.field_c ^ -1)) {
                if (ne.field_j == 0) {
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                } else {
                  L15: {
                    this.a(ad.field_m, 0, (rc) (this), param1, gb.field_j, param3);
                    var9 = jf.field_a;
                    if (var9 != null) {
                      if (!(var9.field_n instanceof gk)) {
                        jf.field_a = null;
                        break L15;
                      } else {
                        ((gk) ((Object) var9.field_n)).a((th) null, -7935, var9);
                        jf.field_a = null;
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                }
              } else {
                ne.field_j = wb.field_c;
                pd.a(125, this.c((byte) 78));
                return param2;
              }
            }
          }
          if (-1 == (wb.field_c ^ -1)) {
            if (ne.field_j != 0) {
              this.a(ad.field_m, 0, (rc) (this), param1, gb.field_j, param3);
              var10 = jf.field_a;
              if (var10 != null) {
                if (!(var10.field_n instanceof gk)) {
                  jf.field_a = null;
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                } else {
                  ((gk) ((Object) var10.field_n)).a((th) null, -7935, var10);
                  jf.field_a = null;
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                }
              } else {
                ne.field_j = wb.field_c;
                pd.a(125, this.c((byte) 78));
                return param2;
              }
            } else {
              ne.field_j = wb.field_c;
              pd.a(125, this.c((byte) 78));
              return param2;
            }
          } else {
            ne.field_j = wb.field_c;
            pd.a(125, this.c((byte) 78));
            return param2;
          }
        }
    }

    void g(int param0) {
        if (param0 != 0) {
            this.f(36);
        }
    }

    boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
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
            if (!param2) {
              if (this.a(param4, param3, param1, param5, -113)) {
                this.field_u = param0;
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
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
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("rc.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (-1 == (param1 ^ -1)) {
          if (null != this.field_w) {
            this.field_w.a((byte) 124, param0, true, param2, (rc) (this));
            if (param3 != 0) {
              this.a(-1, 35, -37, -9);
              return;
            } else {
              return;
            }
          } else {
            if (param3 != 0) {
              this.a(-1, 35, -37, -9);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 != 0) {
            this.a(-1, 35, -37, -9);
            return;
          } else {
            return;
          }
        }
    }

    String c(byte param0) {
        if (param0 > 14) {
          if (!this.field_v) {
            return null;
          } else {
            return this.field_z;
          }
        } else {
          this.field_i = (String) null;
          if (!this.field_v) {
            return null;
          } else {
            return this.field_z;
          }
        }
    }

    int f(int param0) {
        int var2 = -86 / ((param0 - 17) / 43);
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = SolKnight.field_L ? 1 : 0;
        if (param0 != 19550) {
          return;
        } else {
          var4 = this.f(-73);
          var5_int = 0;
          L0: while (true) {
            L1: {
              if (var5_int > var4) {
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
            L2: {
              var5 = va.a(true);
              if (var5 != null) {
                ph.field_f.a(20, kd.field_c, bf.field_a, var5);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param2, -1, param1, param3)) {
                this.b(param2, -108, param1, param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 < -41) {
                break L2;
              } else {
                this.a(38, -79, 40, 69);
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("rc.GA(").append(param0).append(',');

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        this.field_m = param2;
        this.field_j = param4;
        this.field_t = param1;
        if (param3 != 0) {
          rc.e(-46);
          this.field_x = param0;
          return;
        } else {
          this.field_x = param0;
          return;
        }
    }

    final void d(int param0) {
        this.b(this.field_x, this.field_t, this.field_m, 0, this.field_j);
        if (param0 != 1) {
            this.a('�', (byte) -59, 25, (rc) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, o param4, int param5, int param6, byte param7) {
        int stackIn_22_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        o var21 = null;
        int[] var23 = null;
        int[] var24 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (mi.field_b > param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param0 = param0 - (mi.field_b - param1);
                        param1 = mi.field_b;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param5 >= mi.field_l) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param2 = param2 - (-param5 + mi.field_l);
                        param5 = mi.field_l;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (mi.field_k >= param1 - -param0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param0 = -param1 + mi.field_k;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param2 + param5 <= mi.field_e) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param2 = -param5 + mi.field_e;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((param0 ^ -1) >= -1) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (0 >= param2) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        var21 = param4.c();
                        var24 = mi.field_f;
                        var10 = mi.field_a;
                        var11 = mi.field_d;
                        var23 = new int[4];
                        mi.b(var23);
                        param4.a();
                        mi.d(var23[0], var23[1], var23[2], var23[3]);
                        var13 = param4.field_p * param5 + param1;
                        var14 = -param0 + param4.field_p;
                        var15 = var21.field_v;
                        if (param7 == 21) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        field_p = (String) null;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var16 = param5;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param2 + param5 <= var16) {
                            statePc = 39;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var19 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var17 = param1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param0 + param1 <= var17) {
                            statePc = 37;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var18 = var15[var13];
                        stackIn_38_0 = var18;
                        stackIn_22_0 = stackIn_38_0;
                        if (var19 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-1 <= (var17 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-1 == (var15[-1 + var13] ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var16 ^ -1) >= -1) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (-1 == (var15[var13 + -param4.field_p] ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var17 >= -1 + param4.field_p) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var15[1 + var13] == 0) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var16 >= param4.field_t - 1) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var15[param4.field_p + var13] == 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        mi.e(var17, var16, param3, param6);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var13++;
                        var17++;
                        if (var19 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = var13 + var14;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var13 = stackIn_38_0;
                        var16++;
                        if (var19 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var21.d(-param4.field_s, -param4.field_n);
                        mi.a(var24, var10, var11);
                        mi.a(var23);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_43_0 = (RuntimeException) (var8);
                    stackIn_42_0 = stackIn_43_0;
                    stackIn_43_1 = new StringBuilder().append("rc.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_42_1 = stackIn_43_1;
                    if (param4 == null) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackIn_44_1 = (StringBuilder) ((Object) stackIn_42_1);
                    stackIn_44_2 = "{...}";
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
                    stackIn_44_2 = "null";
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    throw fc.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
                }
                case 45: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 < -52) {
          if (this.field_m + param2 <= param1) {
            if (param0 >= this.field_j + param3) {
              if (this.field_t + this.field_m + param2 > param1) {
                if (param0 >= this.field_x + (param3 - -this.field_j)) {
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

    rc(String param0, dg param1) {
        this(param0, ph.field_f.field_a, param1);
    }

    final boolean a(StringBuilder param0, int param1, Hashtable param2, int param3) {
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
              if (param1 == -1) {
                break L1;
              } else {
                this.a(37, (rc) null);
                break L1;
              }
            }
            if (param2.containsKey(this)) {
              discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param2.put(this, this);
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

            stackIn_9_1 = new StringBuilder().append("rc.VA(");

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
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    protected rc() {
        this.field_k = 0;
        this.field_q = 0;
    }

    rc(String param0, j param1, dg param2) {
        eg var4 = null;
        this.field_k = 0;
        this.field_q = 0;
        try {
            this.field_w = param1;
            this.field_n = param2;
            this.field_i = param0;
            if (this.field_w instanceof eg) {
                var4 = (eg) ((Object) this.field_w);
                this.field_t = var4.a(true, (rc) (this));
                this.field_x = var4.a((rc) (this), -125);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "rc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    rc(int param0, int param1, int param2, int param3, j param4, dg param5) {
        this.field_k = 0;
        this.field_q = 0;
        try {
            this.field_x = param3;
            this.field_n = param5;
            this.field_j = param1;
            this.field_m = param0;
            this.field_t = param2;
            this.field_w = param4;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "rc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = "Next Level";
        field_o = new kb();
        field_p = "Creating your account";
        field_y = "Email: ";
    }
}
