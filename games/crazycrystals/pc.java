/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pc extends qm {
    static String field_w;
    static int field_y;
    boolean field_A;
    static pp[] field_u;
    private boolean field_v;
    boolean field_x;
    private boolean field_z;

    final void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        try {
            if (this.field_l != null && this.field_l instanceof i) {
                ((i) ((Object) this.field_l)).a((pc) (this), param2, param1, false, param0, param3);
            }
            this.field_s = param5;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "pc.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                this.field_z = true;
                break L1;
              }
            }
            L2: {
              if (!this.field_x) {
                break L2;
              } else {
                if (!this.a(param1, param0, param3, param4, param6)) {
                  break L2;
                } else {
                  L3: {
                    this.a(true, param2);
                    this.field_s = param5;
                    if (this.field_l == null) {
                      break L3;
                    } else {
                      if (!(this.field_l instanceof i)) {
                        break L3;
                      } else {
                        ((i) ((Object) this.field_l)).a(param0, (byte) -122, (pc) (this), param5, param6, param4, param1);
                        break L3;
                      }
                    }
                  }
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_10_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8);

            stackIn_13_1 = new StringBuilder().append("pc.KA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final boolean e(int param0) {
        if (param0 >= -107) {
            field_u = (pp[]) null;
            return this.field_z;
        }
        return this.field_z;
    }

    void a(qm param0, int param1, int param2, int param3) {
        try {
            super.a(param0, 69, param2, param3);
            int var5_int = -17 % ((-50 - param1) / 59);
            if (-1 != (this.field_s ^ -1)) {
                if (this.field_s == gg.field_c) {
                    return;
                }
                if (this.a(bm.field_h, param3, false, param2, qh.field_i)) {
                    if (!(-1 != (gg.field_c ^ -1))) {
                        this.a(bm.field_h - param2, qh.field_i + -param3, -100, this.field_s);
                    }
                }
                this.a(bm.field_h, param2, param3, qh.field_i, param0, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "pc.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
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
              if (!this.a(0, param0, param3, param2)) {
                break L1;
              } else {
                L2: {
                  this.a(param0, (byte) 121, param3, param2);
                  if (this.field_A) {
                    discarded$2 = param3.append(" active");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (!this.field_x) {
                  discarded$3 = param3.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param1 <= -85) {
                break L3;
              } else {
                field_u = (pp[]) null;
                break L3;
              }
            }
            stackIn_10_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("pc.MA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(int param0, int param1, int param2, dl param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dl var21 = null;
        var20 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var6_int = (param2 + -param4 << 2121674536) / param3.field_n;
              param5 = param5 + param3.field_v;
              param0 = param0 + param3.field_t;
              var7 = (param4 << 617553576) - -(var6_int * param3.field_v);
              var8 = kh.field_l * param0 + param5;
              var9 = 0;
              if (param1 == 617553576) {
                break L1;
              } else {
                var21 = (dl) null;
                pc.a(-79, 70, -75, (dl) null, 95, -72);
                break L1;
              }
            }
            L2: {
              var10 = param3.field_u;
              var11 = param3.field_l;
              var12 = kh.field_l + -var11;
              if (kh.field_b <= param0) {
                break L2;
              } else {
                var14 = -param0 + kh.field_b;
                var9 = var9 + var11 * var14;
                param0 = kh.field_b;
                var8 = var8 + kh.field_l * var14;
                var10 = var10 - var14;
                break L2;
              }
            }
            L3: {
              var13 = 0;
              if (param5 < kh.field_c) {
                var14 = kh.field_c - param5;
                param5 = kh.field_c;
                var8 = var8 + var14;
                var11 = var11 - var14;
                var13 = var13 + var14;
                var9 = var9 + var14;
                var7 = var7 + var14 * var6_int;
                var12 = var12 + var14;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (kh.field_j >= var10 + param0) {
                break L4;
              } else {
                var10 = var10 - (var10 + param0 + -kh.field_j);
                break L4;
              }
            }
            L5: {
              if (kh.field_g < param5 - -var11) {
                var14 = -kh.field_g + var11 + param5;
                var11 = var11 - var14;
                var12 = var12 + var14;
                var13 = var13 + var14;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((var11 ^ -1) >= -1) {
                break L6;
              } else {
                if (-1 <= (var10 ^ -1)) {
                  break L6;
                } else {
                  param0 = -var10;
                  L7: while (true) {
                    if (-1 >= (param0 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = var7;
                      param5 = -var11;
                      L8: while (true) {
                        if (-1 >= (param5 ^ -1)) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param0++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> -1179348984;
                            var16 = -var15 + 256;
                            var14 = var14 + var6_int;
                            if (0 > var15) {
                              var8++;
                              var9++;
                              break L9;
                            } else {
                              incrementValue$0 = var9;
                              var9++;
                              var17 = param3.field_w[incrementValue$0];
                              if (var17 != 0) {
                                L10: {
                                  if (255 >= var15) {
                                    var18 = kh.field_i[var8];
                                    var19 = var16 * (var18 & 16711935) + (var17 & 16711935) * var15 >> 194422856 & 16711935;
                                    kh.field_i[var8] = var19 - -(pf.b(var15 * pf.b(65280, var17) + var16 * pf.b(65280, var18), 16711789) >> 1657473032);
                                    break L10;
                                  } else {
                                    kh.field_i[var8] = var17;
                                    break L10;
                                  }
                                }
                                var8++;
                                break L9;
                              } else {
                                var8++;
                                break L9;
                              }
                            }
                          }
                          param5++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var6);

            stackIn_36_1 = new StringBuilder().append("pc.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L11;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L11;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_7_0 = 0;
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
            L1: {
              if (param1 == 19279) {
                break L1;
              } else {
                var6 = (String) null;
                pc.a((String) null, 77);
                break L1;
              }
            }
            L2: {
              if (!this.e(param1 ^ -19249)) {
                break L2;
              } else {
                L3: {
                  if (param0 == 84) {
                    break L3;
                  } else {
                    if (-84 != (param0 ^ -1)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.a(-1, -1, -87, 1);
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            stackIn_9_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("pc.AA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    pc(String param0, wo param1, bi param2) {
        super(param0, param1, param2);
        this.field_x = true;
        this.field_v = true;
        this.field_z = false;
    }

    void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (this.field_l == null) {
            break L0;
          } else {
            if (this.field_l instanceof vd) {
              ((vd) ((Object) this.field_l)).a((byte) -78, param1, param0, param3, (pc) (this));
              break L0;
            } else {
              if (param2 <= -75) {
                return;
              } else {
                field_u = (pp[]) null;
                return;
              }
            }
          }
        }
        if (param2 > -75) {
          field_u = (pp[]) null;
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        if (this.field_z) {
          this.field_z = false;
          if (this.field_l != null) {
            if (this.field_l instanceof cq) {
              ((cq) ((Object) this.field_l)).a(this.field_z, (byte) 80, (qm) (this));
              if (param0 >= -84) {
                this.field_v = false;
                return;
              } else {
                return;
              }
            } else {
              if (param0 >= -84) {
                this.field_v = false;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 >= -84) {
              this.field_v = false;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 >= -84) {
            this.field_v = false;
            return;
          } else {
            return;
          }
        }
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = param1;
            L1: while (true) {
              if (var2_int <= var4) {
                stackIn_5_0 = new String(var3);
                break L0;
              } else {
                var3[-var4 + (var2_int - 1)] = param0.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("pc.OA(");

            if (param0 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.field_x) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_v) {
                L1: {
                  param1.b((byte) -116);
                  stackIn_7_0 = this;

                  if (!param0) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 0;
                    break L1;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L1;
                  }
                }
                L2: {
                  ((pc) (this)).field_z = stackIn_8_1 != 0;
                  if (this.field_l == null) {
                    break L2;
                  } else {
                    if (this.field_l instanceof cq) {
                      ((cq) ((Object) this.field_l)).a(this.field_z, (byte) 80, (qm) (this));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_13_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("pc.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    public static void d(byte param0) {
        field_u = null;
        int var1 = -118 % ((param0 - 44) / 55);
        field_w = null;
    }

    pc(String param0, bi param1) {
        this(param0, pi.field_j.field_p, param1);
    }

    protected pc() {
        this.field_x = true;
        this.field_v = true;
        this.field_z = false;
        this.field_i = pi.field_j.field_e;
    }

    static {
    }
}
