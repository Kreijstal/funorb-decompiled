/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sh extends el implements ql {
    static sc field_y;
    static int[] field_x;
    static String field_z;
    el field_A;

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L1: {
            var8_int = 124 % ((-3 - param1) / 38);
            if (this.field_A != null) {
              if (this.field_A.a(this.field_m + param0, -96, this.field_v + param2, param3, param4, param5, param6)) {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            stackIn_4_0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var8);

          stackIn_7_1 = new StringBuilder().append("sh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

          if (param6 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(')').toString());
        }
        return stackIn_4_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Geoblox.field_C;
        try {
          L0: {
            if (param1 > param0) {
              if (param5 > param0 + 1) {
                if (param0 + 5 < param5) {
                  if (param3 != param2) {
                    var7_int = (1 & (param3 & param2)) + (param2 >> 1) + (param3 >> 1);
                    var8 = param0;
                    var9 = param3;
                    if (param4 >= 106) {
                      var10 = param2;
                      L2: for (var11 = param0; var11 < param5; var11++) {
                        var12 = qi.field_i[var11];
                        if (!param6) {
                          stackIn_24_0 = gk.field_a[var12];
                        } else {
                          stackIn_24_0 = hg.field_a[var12];
                        }
                        var13 = stackIn_24_0;
                        if (var13 > var7_int) {
                          qi.field_i[var11] = qi.field_i[var8];
                          incrementValue$0 = var8;
                          var8++;
                          qi.field_i[incrementValue$0] = var12;
                          if (var9 > var13) {
                            var9 = var13;
                          }
                        } else {
                          if (var10 < var13) {
                            var10 = var13;
                          } else {
                            continue L2;
                          }
                        }
                      }
                      sh.a(param0, param1, var9, param3, (byte) 118, var8, param6);
                      sh.a(var8, param1, param2, var10, (byte) 107, param5, param6);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                for (var7_int = -1 + param5; var7_int > param0; var7_int--) {
                  for (var8 = param0; var8 < var7_int; var8++) {
                    var9 = qi.field_i[var8];
                    var10 = qi.field_i[1 + var8];
                    if (ig.a(param6, var10, (byte) -125, var9)) {
                      qi.field_i[var8] = var10;
                      qi.field_i[var8 + 1] = var9;
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
              }
            } else {
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var7), "sh.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    private final boolean a(el param0, int param1) {
        RuntimeException var3 = null;
        el var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 22439) {
            var4 = (el) null;
            this.a(73, 123, false, (el) null, 48, 45);
          }
          L2: {
            if (this.field_A != null) {
              if (!this.field_A.e((byte) 54)) {
                if (this.field_A.a((byte) -117, param0)) {
                  stackIn_7_0 = 1;
                  break L2;
                }
              }
            }
            stackIn_7_0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var3);

          stackIn_10_1 = new StringBuilder().append("sh.S(");

          if (param0 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
        return stackIn_7_0 != 0;
    }

    final static boolean a(byte param0, int[] param1) {
        int var6_int = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        ma var5_ref_ma = null;
        int var5 = 0;
        ma var6 = null;
        int var8 = 0;
        var8 = Geoblox.field_C;
        try {
          L0: {
            var2_int = -108 / ((-71 - param0) / 45);
            if (eh.field_b != pk.field_l) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
            } else {
              var3 = oa.a(-12520);
              if (ab.field_b != 0) {
                if (pc.field_f < 0) {
                  var5_ref_ma = (ma) ((Object) va.field_c.firstForIteration(0));
                  if (var5_ref_ma != null) {
                    if (var3 > var5_ref_ma.field_f) {
                      var5_ref_ma.unlinkNode(false);
                      p.field_k = var5_ref_ma.field_g.length;
                      eh.field_d.field_f = 0;
                      for (var6_int = 0; var6_int < p.field_k; var6_int++) {
                        eh.field_d.field_j[var6_int] = var5_ref_ma.field_g[var6_int];
                      }
                      ad.field_o = dc.field_b;
                      dc.field_b = kg.field_n;
                      kg.field_n = ScorePopup.field_l;
                      ScorePopup.field_l = var5_ref_ma.field_h;
                      stackIn_13_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              L3: while (true) {
                if (pc.field_f < 0) {
                  eh.field_d.field_f = 0;
                  if (el.b(30000, 1)) {
                    pc.field_f = eh.field_d.j((byte) 122);
                    eh.field_d.field_f = 0;
                    p.field_k = param1[pc.field_f];
                  } else {
                    stackIn_18_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
                if (nf.a(false)) {
                  if (ab.field_b == 0) {
                    ad.field_o = dc.field_b;
                    dc.field_b = kg.field_n;
                    kg.field_n = ScorePopup.field_l;
                    ScorePopup.field_l = pc.field_f;
                    pc.field_f = -1;
                    stackIn_32_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    var5 = ab.field_b;
                    if (0.0 != fc.field_a) {
                      var5 = (int)((double)var5 + bh.field_d.nextGaussian() * fc.field_a);
                      if (var5 < 0) {
                        var5 = 0;
                      }
                    }
                    var6 = new ma((long)var5 + var3, pc.field_f, new byte[p.field_k]);
                    for (var7 = 0; p.field_k > var7; var7++) {
                      var6.field_g[var7] = eh.field_d.field_j[var7];
                    }
                    va.field_c.addLast(-108, var6);
                    pc.field_f = -1;
                    continue L3;
                  }
                } else {
                  stackIn_22_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = (RuntimeException) (var2);

          stackIn_35_1 = new StringBuilder().append("sh.HA(").append(param0).append(',');

          if (param1 == null) {
            stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
            stackIn_36_2 = "null";
          } else {
            stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
            stackIn_36_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                return stackIn_32_0 != 0;
              }
            }
          }
        }
    }

    StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
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
          if (this.a(param1, param3, 10095, param2)) {
            this.a(param3, param2, 34, param1);
            this.b(param3, param1, param2, 0);
          }
          if (param0 != 0) {
            field_y = (sc) null;
          }
          stackIn_5_0 = (StringBuilder) (param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var5);

          stackIn_8_1 = new StringBuilder().append("sh.PA(").append(param0).append(',');

          if (param1 == null) {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "null";
          } else {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "{...}";
          }


          stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

          if (param2 == null) {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
            stackIn_12_2 = "null";
          } else {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
        return stackIn_5_0;
    }

    el e(int param0) {
        el var2 = this.field_A;
        if (var2 != null) {
            if (!(!var2.e((byte) 54))) {
                return var2;
            }
        }
        if (param0 == -4863) {
            return null;
        }
        el var3 = (el) null;
        this.a(114, -49, -37, 74, 126, 94, (el) null);
        return null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (0 == param3) {
            if (!(this.field_q == null)) {
                this.field_q.a(param0, -50, param1, true, (el) (this));
            }
        }
        int var5 = 85 % ((param2 - 1) / 43);
        if (this.field_A != null) {
            this.field_A.a(this.field_v + param0, param1 + this.field_m, (byte) -74, param3);
        }
    }

    void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
        if (!param2) {
            return;
        }
        try {
            if (null != this.field_A) {
                this.field_A.a(this.field_v + param0, param1, true, param3, param4 + this.field_m, param5);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "sh.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int d(byte param0) {
        if (param0 <= 82) {
            el var3 = (el) null;
            this.a(-119, 24, -30, 98, 113, (el) null, 116);
        }
        return this.field_A != null ? this.field_A.d((byte) 123) : 0;
    }

    final void b(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$10 = null;
        int var5_int = 0;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$11 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            discarded$10 = param1.append('\n');
            for (var5_int = param3; param0 >= var5_int; var5_int++) {
              discarded$12 = param1.append(' ');
            }
            if (this.field_A != null) {
              this.field_A.a(0, param1, param2, param0 + 1);
            } else {
              discarded$11 = param1.append("null");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var5);

          stackIn_10_1 = new StringBuilder().append("sh.V(").append(param0).append(',');

          if (param1 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }


          stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

          if (param2 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    String c(byte param0) {
        String var3 = null;
        String var2 = super.c(param0);
        if (!(this.field_A == null)) {
            var3 = this.field_A.c((byte) 69);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    private final boolean a(el param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L1: {
            var3_int = -11 % ((param1 + 73) / 40);
            if (null != this.field_A) {
              if (!this.field_A.e((byte) 54)) {
                if (this.field_A.a((byte) -85, param0)) {
                  stackIn_5_0 = 1;
                  break L1;
                }
              }
            }
            stackIn_5_0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var3);

          stackIn_8_1 = new StringBuilder().append("sh.U(");

          if (param0 == null) {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "null";
          } else {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
        return stackIn_5_0 != 0;
    }

    final boolean a(byte param0, el param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -30) {
            field_y = (sc) null;
          }
          L2: {
            if (null != this.field_A) {
              if (this.field_A.a((byte) -34, param1)) {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            stackIn_6_0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var3);

          stackIn_9_1 = new StringBuilder().append("sh.UA(").append(param0).append(',');

          if (param1 == null) {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "null";
          } else {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(')').toString());
        }
        return stackIn_6_0 != 0;
    }

    final boolean e(byte param0) {
        if (param0 != 54) {
            el var3 = (el) null;
            this.a(false, 15, (el) null, 31);
        }
        return this.e(-4863) != null ? true : false;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, el param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == -1) {
            L1: {
              if (null != this.field_A) {
                if (this.field_A.e((byte) 54)) {
                  if (this.field_A.a(param0, param1, param2, -1, param4, param5, param6)) {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
              }
              stackIn_8_0 = 0;
            }
            decompiledRegionSelector0 = 1;
          } else {
            stackIn_2_0 = 1;
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = (RuntimeException) (var8);

          stackIn_11_1 = new StringBuilder().append("sh.EB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

          if (param5 == null) {
            stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param6).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final void d(int param0) {
        if (null != this.field_A) {
            this.field_A.d(-123);
        }
        if (param0 >= -122) {
            sh.a((byte) 83);
        }
    }

    void b(boolean param0) {
        if (null != this.field_A) {
            this.field_A.c(-73);
        }
        if (!param0) {
            field_x = (int[]) null;
        }
    }

    public static void a(byte param0) {
        if (param0 != -3) {
            return;
        }
        field_y = null;
        field_z = null;
        field_x = null;
    }

    void a(boolean param0, int param1, el param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (this.field_A != null) {
                this.field_A.a(false, this.field_m + param1, param2, this.field_v + param3);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "sh.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_11_0 = false;
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
            if (null != this.field_A) {
              if (this.field_A.e((byte) 54)) {
                if (this.field_A.a(param0, 13, param2, param3)) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param1 != 13) {
              field_y = (sc) null;
            }
            var5_int = param0;
            if (var5_int != 80) {
              stackIn_13_0 = 0;
              decompiledRegionSelector0 = 2;
            } else {
              if (!kj.field_o[81]) {
                stackIn_11_0 = this.a(param3, 22439);
              } else {
                stackIn_11_0 = this.a(param3, (byte) -119);
              }
              decompiledRegionSelector0 = 1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var5);

          stackIn_16_1 = new StringBuilder().append("sh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "null";
          } else {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    sh(int param0, int param1, int param2, int param3, dh param4, bb param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) -40, param3, param4);
        if (param2 > -6) {
            field_z = (String) null;
        }
        this.b(true);
    }

    static {
        field_x = new int[8192];
        field_z = "FPS: <%0>";
    }
}
