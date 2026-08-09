/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jg extends ng implements j {
    ng[] field_L;
    static fp field_F;
    static String field_M;
    static java.awt.Image field_K;
    static tf field_H;
    static char[] field_I;
    static int field_J;

    final boolean b(boolean param0) {
        if (!param0) {
            field_H = (tf) null;
        }
        return null != this.m(0) ? true : false;
    }

    final boolean a(ng param0, int param1) {
        ng[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ng var5 = null;
        int var6 = 0;
        ng[] var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param1 == 27) {
              var7 = this.field_L;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (var5.a(param0, 27)) {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("jg.HA(");

            if (param0 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    private final void a(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var6 = 0;
        ng var7 = null;
        int var8 = 0;
        int var9 = 0;
        ng[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (null == this.field_L) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var10 = this.field_L;
                if (param2 > 126) {
                  break L1;
                } else {
                  field_J = -27;
                  break L1;
                }
              }
              var6 = 0;
              L2: while (true) {
                if (var10.length <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var10[var6];
                  discarded$6 = param0.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (param3 < var8) {
                      L4: {
                        if (var7 != null) {
                          var7.a(param0, false, param3 - -1, param1);
                          break L4;
                        } else {
                          discarded$7 = param0.append("null");
                          break L4;
                        }
                      }
                      var6++;
                      continue L2;
                    } else {
                      discarded$8 = param0.append(' ');
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("jg.H(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 56) {
            field_F = (fp) null;
        }
        return lo.field_Nb;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 75, param2, param3, param4);
        this.a(14210);
        if (param1 < 19) {
            field_H = (tf) null;
        }
    }

    final static boolean k(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 1) {
          L0: {
            L1: {
              if (null == he.field_f) {
                break L1;
              } else {
                if (!he.field_f.c((byte) -87)) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    private final boolean a(byte param0, ng param1) {
        RuntimeException var3 = null;
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
              if (param0 < -95) {
                break L1;
              } else {
                this.a(-13, (byte) -36, 75, -82, -49);
                break L1;
              }
            }
            stackIn_3_0 = this.a(-18125, 1, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jg.J(").append(param0).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    void a(int param0, int param1, int param2, ng param3) {
        ng[] var5 = null;
        int var6 = 0;
        ng var7 = null;
        int var8 = 0;
        ng[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (this.field_L != null) {
              var9 = this.field_L;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var9.length <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L2;
                    } else {
                      var7.a(param0 + 0, this.field_p + param1, param2 - -this.field_z, param3);
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5_ref);

            stackIn_11_1 = new StringBuilder().append("jg.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String b(byte param0) {
        ng[] var2;
        int var3;
        ng var4;
        int var6;
        ng[] var7;
        String var5;
        var6 = Pixelate.field_H ? 1 : 0;
        if (null != this.field_L) {
          var7 = this.field_L;
          var2 = var7;
          var3 = 0;
          if (param0 >= 16) {
            L0: while (true) {
              if (var7.length > var3) {
                var4 = var7[var3];
                if (var4 != null) {
                  var5 = var4.b((byte) 36);
                  if (var5 != null) {
                    return var5;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return (String) null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1) {
        wn.field_u = param0;
        if (!(null == to.field_q)) {
            to.field_q.c((byte) 30, param0);
        }
        int var2 = -13 % ((52 - param1) / 59);
        if (ri.field_a != null) {
            ri.field_a.a(param0, (byte) 2);
        }
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        ng[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ng var10 = null;
        int var11 = 0;
        ng[] var12 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -58) {
                break L1;
              } else {
                this.b(true);
                break L1;
              }
            }
            if (this.field_L != null) {
              var12 = this.field_L;
              var8 = var12;
              var9 = 0;
              L2: while (true) {
                if (var9 >= var12.length) {
                  stackIn_15_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (var10.a((byte) -58, param1, param2, param3 + this.field_p, param4, this.field_z + param5, param6)) {
                        stackIn_12_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9++;
                  continue L2;
                }
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8_ref);

            stackIn_18_1 = new StringBuilder().append("jg.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
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
              if (!param1) {
                break L1;
              } else {
                field_F = (fp) null;
                break L1;
              }
            }
            L2: {
              if (!this.a(-90, param2, param0, param3)) {
                break L2;
              } else {
                this.a(param2, (byte) -2, param3, param0);
                this.a(param0, param3, (byte) 127, param2);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("jg.AA(");

            if (param0 == null) {
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


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0;
    }

    final static int l(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            wa.field_c.a(hf.field_w, true, (byte) 99, ph.field_o);
            wa.field_c.d((byte) 112);
            L1: while (true) {
              if (!bh.b((byte) 120)) {
                if (0 != (u.field_h ^ -1)) {
                  var1_int = u.field_h;
                  te.a(-1, -2671);
                  stackIn_7_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L2: {
                    if (param0 > 51) {
                      break L2;
                    } else {
                      jg.a((byte) -82);
                      break L2;
                    }
                  }
                  if (!dk.field_c) {
                    if (qo.field_n == rj.field_F) {
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (!an.field_e.d(123)) {
                        stackIn_20_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (tm.field_X != rj.field_F) {
                          stackIn_25_0 = -1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackIn_23_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                  } else {
                    stackIn_12_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                wa.field_c.a(nj.field_f, ke.field_a, false);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "jg.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_23_0;
                } else {
                  return stackIn_25_0;
                }
              }
            }
          }
        }
    }

    final void h(int param0) {
        ng[] var2;
        int var3;
        ng var4;
        int var5;
        ng[] var6;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          var6 = this.field_L;
          var2 = var6;
          if (param0 == 2) {
            break L0;
          } else {
            field_K = (java.awt.Image) null;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= var6.length) {
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.h(2);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final int e(int param0) {
        int var2;
        ng[] var3;
        int var4;
        ng var5;
        int var7;
        int var6;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          var2 = 0;
          var3 = this.field_L;
          if (param0 > 31) {
            break L0;
          } else {
            this.field_L = (ng[]) null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var3.length <= var4) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.e(61);
              if (var6 > var2) {
                var2 = var6;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    private final boolean a(ng param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ng var5 = null;
        ng var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (this.field_L != null) {
              L1: {
                var4_int = 0;
                if (param1 == -44) {
                  break L1;
                } else {
                  this.e(-60);
                  break L1;
                }
              }
              L2: while (true) {
                if (this.field_L.length <= var4_int) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_L[var4_int];
                    if (null == var5) {
                      break L3;
                    } else {
                      if (!var5.b(true)) {
                        break L3;
                      } else {
                        var4_int = var4_int + param2;
                        L4: while (true) {
                          if (var4_int >= this.field_L.length) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_L[var4_int];
                              if (null != var6) {
                                if (!var6.a(param0, 27)) {
                                  break L5;
                                } else {
                                  stackIn_15_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var4_int = var4_int + param2;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4_int++;
                  continue L2;
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
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("jg.F(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    public static void j(int param0) {
        field_I = null;
        field_M = null;
        field_F = null;
        if (param0 > -65) {
            return;
        }
        field_K = null;
        field_H = null;
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        ng[] var7 = null;
        int var8 = 0;
        ng var9 = null;
        int var10 = 0;
        ng[] var11 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (null != this.field_L) {
              var11 = this.field_L;
              var7 = var11;
              var8 = param3;
              L1: while (true) {
                if (var11.length <= var8) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var9 = var11[var8];
                    if (var9 == null) {
                      break L2;
                    } else {
                      var9.a(param0, param1 + this.field_z, param2, 0, param4 + this.field_p, param5);
                      break L2;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var7_ref);

            stackIn_11_1 = new StringBuilder().append("jg.EA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final ng m(int param0) {
        ng[] var2;
        int var3;
        ng var4;
        int var5;
        ng[] var6;
        var5 = Pixelate.field_H ? 1 : 0;
        if (null != this.field_L) {
          var6 = this.field_L;
          var2 = var6;
          var3 = param0;
          L0: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.b(true)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5;
        ng var6;
        int var7;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (param1 != 0) {
            break L0;
          } else {
            if (null == this.field_y) {
              break L0;
            } else {
              this.field_y.a((ng) (this), (byte) -124, param0, param2, true);
              break L0;
            }
          }
        }
        L1: {
          if (null == this.field_L) {
            break L1;
          } else {
            var5 = this.field_L.length + -1;
            L2: while (true) {
              if (0 > var5) {
                break L1;
              } else {
                var6 = this.field_L[var5];
                if (var6 != null) {
                  var6.a(this.field_p + param0, param1, param2 - -this.field_z, (byte) -95);
                  var5--;
                  continue L2;
                } else {
                  var5--;
                  continue L2;
                }
              }
            }
          }
        }
        var5 = -65 / ((param3 - 70) / 49);
    }

    jg(int param0, int param1, int param2, int param3, eb param4) {
        super(param0, param1, param2, param3, param4, (fn) null);
    }

    abstract void a(int param0);

    private final boolean b(ng param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -17753) {
              stackIn_4_0 = this.a(param0, (byte) -44, 1);
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
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jg.I(");

            if (param0 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    private final boolean a(int param0, int param1, ng param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ng var5 = null;
        ng var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        ng stackIn_8_0 = null;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (null == this.field_L) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = -1 + this.field_L.length;
              L1: while (true) {
                if ((var4_int ^ -1) > -1) {
                  if (param0 == -18125) {
                    stackIn_24_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    field_J = -62;
                    return false;
                  }
                } else {
                  var5 = this.field_L[var4_int];
                  var6 = var5;
                  var6 = var5;
                  stackIn_8_0 = (ng) (var5);
                  L2: {
                    if (stackIn_8_0 == null) {
                      break L2;
                    } else {
                      if (var5.b(true)) {
                        var4_int = var4_int - param1;
                        L3: while (true) {
                          if (-1 < (var4_int ^ -1)) {
                            break L2;
                          } else {
                            L4: {
                              var6 = this.field_L[var4_int];
                              if (var6 != null) {
                                if (var6.a(param2, 27)) {
                                  stackIn_18_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            var4_int = var4_int - param1;
                            continue L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4_int--;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("jg.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            return stackIn_24_0 != 0;
          }
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        ng[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ng var7 = null;
        int var8 = 0;
        ng[] var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (null == this.field_L) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = this.field_L;
                var5 = var9;
                if (param1 == 3) {
                  break L1;
                } else {
                  jg.a((byte) 125);
                  break L1;
                }
              }
              var6 = 0;
              L2: while (true) {
                if (var6 >= var9.length) {
                  var5_int = param0;
                  if ((var5_int ^ -1) == -81) {
                    L3: {
                      if (!bc.field_m[81]) {
                        stackIn_20_0 = this.b(param2, -17753);
                        break L3;
                      } else {
                        stackIn_20_0 = this.a((byte) -126, param2);
                        break L3;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  L4: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L4;
                    } else {
                      if (!var7.b(true)) {
                        break L4;
                      } else {
                        if (!var7.a(param0, 3, param2, param3)) {
                          break L4;
                        } else {
                          stackIn_13_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  var6++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5_ref);

            stackIn_23_1 = new StringBuilder().append("jg.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ng param6) {
        ng[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ng var10 = null;
        int var11 = 0;
        ng[] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (this.field_L != null) {
              L1: {
                var12 = this.field_L;
                var8 = var12;
                if (param1 >= 61) {
                  break L1;
                } else {
                  this.h(91);
                  break L1;
                }
              }
              var9 = 0;
              L2: while (true) {
                if (var12.length <= var9) {
                  stackIn_15_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.b(true)) {
                        break L3;
                      } else {
                        if (!var10.a(param0, (byte) 105, param2, param3, param4, param5, param6)) {
                          break L3;
                        } else {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L2;
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
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8_ref);

            stackIn_18_1 = new StringBuilder().append("jg.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    static {
        field_F = new fp();
        field_M = "<%0> disconnected.";
        field_I = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
