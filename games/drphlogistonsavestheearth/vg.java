/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class vg extends gi {
    em field_s;
    int field_t;
    int field_y;
    int field_k;
    String field_v;
    int field_m;
    static int field_i;
    fd field_u;
    int field_w;
    static String field_x;
    int field_o;
    int field_q;
    static int[] field_r;
    cg field_l;
    String field_p;
    static hm field_j;
    static he[] field_h;
    boolean field_n;

    final boolean a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        Object discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var5_int = 0;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
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
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5_int = -8 % ((param3 - -11) / 48);
            if (!param0.containsKey(this)) {
              discarded$4 = param0.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$5 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
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
            stackOut_5_1 = new StringBuilder().append("vg.QB(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    boolean a(int param0, char param1, vg param2, int param3) {
        boolean discarded$2 = false;
        RuntimeException var5 = null;
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
            if (param3 > 63) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              discarded$2 = this.a(false);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("vg.BA(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(int param0, int param1, byte param2, int param3, vg param4, int param5, int param6) {
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
            if (param2 >= 43) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_u = (fd) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("vg.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var4 = this.d(3);
        var5_int = param1;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              this.a(param0, var5_int, (byte) -21, param2);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var5 = hf.g(param1 ^ -1);
          if (var5 == null) {
            return;
          } else {
            ja.field_Q.a(pi.field_Q, var5, -126, oh.field_e);
            return;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        vg var7 = null;
        this.field_o = param2;
        this.field_w = param4;
        this.field_k = param1;
        this.field_m = param0;
        if (param3 == 16535) {
          return;
        } else {
          var7 = (vg) null;
          this.a(125, -80, 21, (vg) null, -78, false);
          return;
        }
    }

    final static void d(byte param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 103) {
                break L1;
              } else {
                field_x = (String) null;
                break L1;
              }
            }
            var5 = of.field_w;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                if (var4 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1_ref), "vg.OB(" + param0 + ')');
        }
    }

    boolean a(boolean param0, vg param1) {
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
            if (!param0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_v = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("vg.M(").append(param0).append(',');
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
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static vi a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        vi stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        vi stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -97) {
                break L1;
              } else {
                field_x = (String) null;
                break L1;
              }
            }
            var2_int = param1.length();
            var3 = 0;
            L2: while (true) {
              L3: {
                if (var3 >= var2_int) {
                  break L3;
                } else {
                  var4 = param1.charAt(var3);
                  if (48 <= var4) {
                    if (var4 <= 57) {
                      var3++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    } else {
                      stackOut_8_0 = null;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              stackOut_11_0 = dh.field_H;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("vg.IB(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vi) ((Object) stackIn_9_0);
        } else {
          return stackIn_12_0;
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        boolean discarded$1 = false;
        int var5 = 0;
        pi var6 = null;
        int var7 = 0;
        pi var8 = null;
        pi var9 = null;
        pi var10 = null;
        pi var11 = null;
        pi var12 = null;
        pi var14 = null;
        pi var15 = null;
        pi var16 = null;
        pi var17 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.a((vg) (this), param0, param1, (byte) -128);
        var5 = this.a(true) ? 1 : 0;
        if (!param2) {
          if (var5 != 0) {
            if (-1 == (mh.field_f ^ -1)) {
              i.field_a = db.field_a;
              g.a(this.e(param3 ^ -125), param3 ^ param3);
              return param2;
            } else {
              this.c((byte) 61);
              i.field_a = db.field_a;
              g.a(this.e(param3 ^ -125), param3 ^ param3);
              return param2;
            }
          } else {
            i.field_a = db.field_a;
            g.a(this.e(param3 ^ -125), param3 ^ param3);
            return param2;
          }
        } else {
          if (ma.field_sb != 0) {
            if (var5 != 0) {
              discarded$1 = this.a(ck.field_c, ob.field_g, (byte) 89, ma.field_sb, (vg) (this), param1, param0);
              if (0 != mh.field_f) {
                L0: {
                  L1: {
                    if (!this.a(ih.field_R, (vg) (this), mh.field_f, (byte) 115, ae.field_gb, param0, param1)) {
                      break L1;
                    } else {
                      param2 = false;
                      if (var7 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L0;
                  } else {
                    L2: {
                      this.c((byte) 117);
                      if (-1 != (db.field_a ^ -1)) {
                        break L2;
                      } else {
                        if (i.field_a == 0) {
                          break L2;
                        } else {
                          L3: {
                            this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                            var16 = oh.field_b;
                            var6 = var16;
                            if (var16 == null) {
                              break L3;
                            } else {
                              L4: {
                                if (var16.field_u instanceof hk) {
                                  ((hk) ((Object) var16.field_u)).a((byte) 70, var16, (jk) null);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              oh.field_b = null;
                              break L3;
                            }
                          }
                          if (var7 == 0) {
                            break L2;
                          } else {
                            if (var5 == 0) {
                              break L2;
                            } else {
                              if (-1 != (mh.field_f ^ -1)) {
                                this.c((byte) 61);
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                    i.field_a = db.field_a;
                    g.a(this.e(param3 ^ -125), param3 ^ param3);
                    return param2;
                  }
                }
                if (-1 == (db.field_a ^ -1)) {
                  if (i.field_a != 0) {
                    L5: {
                      this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                      var17 = oh.field_b;
                      var6 = var17;
                      if (var17 == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var17.field_u instanceof hk) {
                            ((hk) ((Object) var17.field_u)).a((byte) 70, var17, (jk) null);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        oh.field_b = null;
                        break L5;
                      }
                    }
                    if (var7 != 0) {
                      if (var5 != 0) {
                        if (-1 == (mh.field_f ^ -1)) {
                          i.field_a = db.field_a;
                          g.a(this.e(param3 ^ -125), param3 ^ param3);
                          return param2;
                        } else {
                          this.c((byte) 61);
                          i.field_a = db.field_a;
                          g.a(this.e(param3 ^ -125), param3 ^ param3);
                          return param2;
                        }
                      } else {
                        i.field_a = db.field_a;
                        g.a(this.e(param3 ^ -125), param3 ^ param3);
                        return param2;
                      }
                    } else {
                      i.field_a = db.field_a;
                      g.a(this.e(param3 ^ -125), param3 ^ param3);
                      return param2;
                    }
                  } else {
                    i.field_a = db.field_a;
                    g.a(this.e(param3 ^ -125), param3 ^ param3);
                    return param2;
                  }
                } else {
                  i.field_a = db.field_a;
                  g.a(this.e(param3 ^ -125), param3 ^ param3);
                  return param2;
                }
              } else {
                L7: {
                  if (-1 != (db.field_a ^ -1)) {
                    break L7;
                  } else {
                    if (i.field_a == 0) {
                      break L7;
                    } else {
                      L8: {
                        this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                        var15 = oh.field_b;
                        var6 = var15;
                        if (var15 == null) {
                          break L8;
                        } else {
                          L9: {
                            if (var15.field_u instanceof hk) {
                              ((hk) ((Object) var15.field_u)).a((byte) 70, var15, (jk) null);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          oh.field_b = null;
                          break L8;
                        }
                      }
                      if (var7 == 0) {
                        break L7;
                      } else {
                        if (var5 == 0) {
                          break L7;
                        } else {
                          if (-1 != (mh.field_f ^ -1)) {
                            this.c((byte) 61);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
                i.field_a = db.field_a;
                g.a(this.e(param3 ^ -125), param3 ^ param3);
                return param2;
              }
            } else {
              if (0 != mh.field_f) {
                L10: {
                  if (!this.a(ih.field_R, (vg) (this), mh.field_f, (byte) 115, ae.field_gb, param0, param1)) {
                    break L10;
                  } else {
                    param2 = false;
                    if (var7 == 0) {
                      if (-1 == (db.field_a ^ -1)) {
                        if (i.field_a != 0) {
                          L11: {
                            this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                            var14 = oh.field_b;
                            if (var14 == null) {
                              break L11;
                            } else {
                              L12: {
                                if (var14.field_u instanceof hk) {
                                  ((hk) ((Object) var14.field_u)).a((byte) 70, var14, (jk) null);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              oh.field_b = null;
                              break L11;
                            }
                          }
                          if (var7 != 0) {
                            if (var5 != 0) {
                              if (-1 != (mh.field_f ^ -1)) {
                                this.c((byte) 61);
                                i.field_a = db.field_a;
                                g.a(this.e(param3 ^ -125), param3 ^ param3);
                                return param2;
                              } else {
                                i.field_a = db.field_a;
                                g.a(this.e(param3 ^ -125), param3 ^ param3);
                                return param2;
                              }
                            } else {
                              i.field_a = db.field_a;
                              g.a(this.e(param3 ^ -125), param3 ^ param3);
                              return param2;
                            }
                          } else {
                            i.field_a = db.field_a;
                            g.a(this.e(param3 ^ -125), param3 ^ param3);
                            return param2;
                          }
                        } else {
                          i.field_a = db.field_a;
                          g.a(this.e(param3 ^ -125), param3 ^ param3);
                          return param2;
                        }
                      } else {
                        i.field_a = db.field_a;
                        g.a(this.e(param3 ^ -125), param3 ^ param3);
                        return param2;
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                L13: {
                  if (var5 == 0) {
                    break L13;
                  } else {
                    this.c((byte) 117);
                    break L13;
                  }
                }
                if (-1 == (db.field_a ^ -1)) {
                  if (i.field_a != 0) {
                    L14: {
                      this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                      var12 = oh.field_b;
                      if (var12 == null) {
                        break L14;
                      } else {
                        L15: {
                          if (var12.field_u instanceof hk) {
                            ((hk) ((Object) var12.field_u)).a((byte) 70, var12, (jk) null);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        oh.field_b = null;
                        break L14;
                      }
                    }
                    if (var7 != 0) {
                      if (var5 != 0) {
                        if (-1 != (mh.field_f ^ -1)) {
                          this.c((byte) 61);
                          i.field_a = db.field_a;
                          g.a(this.e(param3 ^ -125), param3 ^ param3);
                          return param2;
                        } else {
                          i.field_a = db.field_a;
                          g.a(this.e(param3 ^ -125), param3 ^ param3);
                          return param2;
                        }
                      } else {
                        i.field_a = db.field_a;
                        g.a(this.e(param3 ^ -125), param3 ^ param3);
                        return param2;
                      }
                    } else {
                      i.field_a = db.field_a;
                      g.a(this.e(param3 ^ -125), param3 ^ param3);
                      return param2;
                    }
                  } else {
                    i.field_a = db.field_a;
                    g.a(this.e(param3 ^ -125), param3 ^ param3);
                    return param2;
                  }
                } else {
                  i.field_a = db.field_a;
                  g.a(this.e(param3 ^ -125), param3 ^ param3);
                  return param2;
                }
              } else {
                L16: {
                  if (-1 != (db.field_a ^ -1)) {
                    break L16;
                  } else {
                    if (i.field_a == 0) {
                      break L16;
                    } else {
                      L17: {
                        this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                        var11 = oh.field_b;
                        if (var11 == null) {
                          break L17;
                        } else {
                          L18: {
                            if (var11.field_u instanceof hk) {
                              ((hk) ((Object) var11.field_u)).a((byte) 70, var11, (jk) null);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          oh.field_b = null;
                          break L17;
                        }
                      }
                      if (var7 == 0) {
                        break L16;
                      } else {
                        if (var5 == 0) {
                          break L16;
                        } else {
                          if (-1 != (mh.field_f ^ -1)) {
                            this.c((byte) 61);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                  }
                }
                i.field_a = db.field_a;
                g.a(this.e(param3 ^ -125), param3 ^ param3);
                return param2;
              }
            }
          } else {
            if (0 != mh.field_f) {
              L19: {
                L20: {
                  if (!this.a(ih.field_R, (vg) (this), mh.field_f, (byte) 115, ae.field_gb, param0, param1)) {
                    break L20;
                  } else {
                    param2 = false;
                    if (var7 == 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                if (var5 == 0) {
                  break L19;
                } else {
                  L21: {
                    this.c((byte) 117);
                    if (-1 != (db.field_a ^ -1)) {
                      break L21;
                    } else {
                      if (i.field_a == 0) {
                        break L21;
                      } else {
                        L22: {
                          this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                          var9 = oh.field_b;
                          if (var9 == null) {
                            break L22;
                          } else {
                            L23: {
                              if (var9.field_u instanceof hk) {
                                ((hk) ((Object) var9.field_u)).a((byte) 70, var9, (jk) null);
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            oh.field_b = null;
                            break L22;
                          }
                        }
                        if (var7 == 0) {
                          break L21;
                        } else {
                          if (var5 == 0) {
                            break L21;
                          } else {
                            if (-1 != (mh.field_f ^ -1)) {
                              this.c((byte) 61);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                    }
                  }
                  i.field_a = db.field_a;
                  g.a(this.e(param3 ^ -125), param3 ^ param3);
                  return param2;
                }
              }
              if (-1 == (db.field_a ^ -1)) {
                if (i.field_a != 0) {
                  L24: {
                    this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                    var10 = oh.field_b;
                    if (var10 == null) {
                      break L24;
                    } else {
                      L25: {
                        if (var10.field_u instanceof hk) {
                          ((hk) ((Object) var10.field_u)).a((byte) 70, var10, (jk) null);
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      oh.field_b = null;
                      break L24;
                    }
                  }
                  if (var7 != 0) {
                    if (var5 != 0) {
                      if (-1 == (mh.field_f ^ -1)) {
                        i.field_a = db.field_a;
                        g.a(this.e(param3 ^ -125), param3 ^ param3);
                        return param2;
                      } else {
                        this.c((byte) 61);
                        i.field_a = db.field_a;
                        g.a(this.e(param3 ^ -125), param3 ^ param3);
                        return param2;
                      }
                    } else {
                      i.field_a = db.field_a;
                      g.a(this.e(param3 ^ -125), param3 ^ param3);
                      return param2;
                    }
                  } else {
                    i.field_a = db.field_a;
                    g.a(this.e(param3 ^ -125), param3 ^ param3);
                    return param2;
                  }
                } else {
                  i.field_a = db.field_a;
                  g.a(this.e(param3 ^ -125), param3 ^ param3);
                  return param2;
                }
              } else {
                i.field_a = db.field_a;
                g.a(this.e(param3 ^ -125), param3 ^ param3);
                return param2;
              }
            } else {
              L26: {
                if (-1 != (db.field_a ^ -1)) {
                  break L26;
                } else {
                  if (i.field_a == 0) {
                    break L26;
                  } else {
                    L27: {
                      this.a(param0, param1, ob.field_g, (vg) (this), ck.field_c, false);
                      var8 = oh.field_b;
                      if (var8 == null) {
                        break L27;
                      } else {
                        L28: {
                          if (var8.field_u instanceof hk) {
                            ((hk) ((Object) var8.field_u)).a((byte) 70, var8, (jk) null);
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        oh.field_b = null;
                        break L27;
                      }
                    }
                    if (var7 == 0) {
                      break L26;
                    } else {
                      if (var5 == 0) {
                        break L26;
                      } else {
                        if (-1 != (mh.field_f ^ -1)) {
                          this.c((byte) 61);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                }
              }
              i.field_a = db.field_a;
              g.a(this.e(param3 ^ -125), param3 ^ param3);
              return param2;
            }
          }
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
          if (param1 + this.field_o <= param3) {
            if (param4 >= param0 + this.field_m) {
              if (param3 < this.field_o + param1 - -this.field_w) {
                if (this.field_k + this.field_m + param0 <= param4) {
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

    boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
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
              if (!this.a(param6, param5, false, param4, param0)) {
                break L1;
              } else {
                this.field_y = param2;
                break L1;
              }
            }
            if (param3 >= 113) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              this.field_k = -92;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var8);
            stackOut_6_1 = new StringBuilder().append("vg.JA(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        if (this.a(true)) {
          if (!this.a(param0, param1, (vg) (this), 84)) {
            if (param2 > 31) {
              var4 = param0;
              if (var4 == 80) {
                return this.a(false, (vg) (this));
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (param2 > 31) {
            var4 = param0;
            if (var4 == 80) {
              return this.a(false, (vg) (this));
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static bg a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        bg var9 = null;
        RuntimeException var9_ref = null;
        bg stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        bg stackOut_2_0 = null;
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
            L1: {
              if (param0) {
                break L1;
              } else {
                field_j = (hm) null;
                break L1;
              }
            }
            var9 = new bg(param8, param5, param2, param6, param1, param4, param7);
            gf.field_h.a(var9, 255);
            jc.a(param3, var9, -121);
            stackOut_2_0 = (bg) (var9);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var9_ref);
            stackOut_4_1 = new StringBuilder().append("vg.KB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param7 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param8 + ')');
        }
        return stackIn_3_0;
    }

    vg(String param0, fd param1) {
        this(param0, ja.field_Q.field_i, param1);
    }

    final void e(byte param0) {
        String discarded$2 = null;
        this.a(this.field_m, this.field_k, this.field_o, 16535, this.field_w);
        if (param0 > 11) {
          return;
        } else {
          discarded$2 = this.e(37);
          return;
        }
    }

    void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_y = 0;
              if (!param5) {
                break L1;
              } else {
                this.field_q = 115;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("vg.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    String e(int param0) {
        if (param0 >= -39) {
            return (String) null;
        }
        return !this.field_n ? null : this.field_v;
    }

    final static void b(byte param0) {
        int fieldTemp$1 = 0;
        lh var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var1 = nj.field_p;
            if (param0 > 45) {
              stackOut_3_0 = 99;
              stackIn_5_0 = stackOut_3_0;
              L1: while (true) {
                if (!ck.b(stackIn_5_0)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var1.d(8, -18392);
                  fieldTemp$1 = var1.field_j + 1;
                  var1.field_j = var1.field_j + 1;
                  var2 = fieldTemp$1;
                  nc.a((byte) -95, var1);
                  nj.field_p.b(-var2 + var1.field_j, (byte) 87);
                  if (var3 == 0) {
                    stackOut_4_0 = 99;
                    stackIn_5_0 = stackOut_4_0;
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1_ref), "vg.JB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder var6 = null;
        L0: {
          if (-1 != (param1 ^ -1)) {
            break L0;
          } else {
            if (this.field_l != null) {
              this.field_l.a(true, 117, (vg) (this), param3, param0);
              break L0;
            } else {
              if (param2 == -21) {
                return;
              } else {
                var6 = (StringBuilder) null;
                discarded$4 = this.a(15, (Hashtable) null, (StringBuilder) null, 118);
                return;
              }
            }
          }
        }
        if (param2 == -21) {
          return;
        } else {
          var6 = (StringBuilder) null;
          discarded$5 = this.a(15, (Hashtable) null, (StringBuilder) null, 118);
          return;
        }
    }

    final void a(StringBuilder param0, byte param1, int param2, Hashtable param3) {
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        vg var7 = null;
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
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$8 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_o).append(",").append(this.field_m).append(" ").append(this.field_w).append("x").append(this.field_k);
              if (this.field_p != null) {
                discarded$9 = param0.append(" text=\"").append(this.field_p).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_n) {
                discarded$10 = param0.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.a(true)) {
                break L3;
              } else {
                discarded$11 = param0.append(" focused");
                break L3;
              }
            }
            L4: {
              if (this.field_l == null) {
                break L4;
              } else {
                L5: {
                  discarded$12 = param0.append(" renderer=");
                  if (this.field_l instanceof vg) {
                    break L5;
                  } else {
                    discarded$13 = param0.append(this.field_l);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param0 = this.a(param2 - -1, param3, param0, -10612);
                break L4;
              }
            }
            L6: {
              if (null != this.field_u) {
                L7: {
                  discarded$14 = param0.append(" listener=");
                  if (!(this.field_u instanceof vg)) {
                    break L7;
                  } else {
                    param0 = this.a(1 + param2, param3, param0, -10612);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                discarded$15 = param0.append(this.field_u);
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              if (param1 == 89) {
                break L8;
              } else {
                var7 = (vg) null;
                this.a(45, 110, 39, (vg) null, 34, true);
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
            stackOut_22_1 = new StringBuilder().append("vg.LB(");
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
          throw ie.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    boolean a(boolean param0) {
        if (!param0) {
            this.field_k = -58;
            return false;
        }
        return false;
    }

    public final String toString() {
        return this.a(0, new Hashtable(), new StringBuilder(), -10612).toString();
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        StringBuilder stackOut_3_0 = null;
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
              if (!this.a(param1, param2, param0, param3 + 10725)) {
                break L1;
              } else {
                this.a(param2, (byte) 89, param0, param1);
                break L1;
              }
            }
            if (param3 == -10612) {
              stackOut_5_0 = (StringBuilder) (param2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = (StringBuilder) null;
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
            stackOut_7_1 = new StringBuilder().append("vg.WA(").append(param0).append(',');
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
            if (param2 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    void a(vg param0, int param1, int param2, byte param3) {
        vi discarded$2 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var5_int = this.a(param2, param1, false, ck.field_c, ob.field_g) ? 1 : 0;
              if (param3 <= -127) {
                break L1;
              } else {
                var6 = (String) null;
                discarded$2 = vg.a((byte) -123, (String) null);
                break L1;
              }
            }
            L2: {
              if (this.field_n) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              stackOut_5_0 = stackIn_5_0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var5_int != 0) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L3;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L3;
              }
            }
            L4: {
              if (stackIn_8_0 != stackIn_8_1) {
                L5: {
                  stackOut_10_0 = this;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var5_int == 0) {
                    stackOut_12_0 = this;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L5;
                  } else {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L5;
                  }
                }
                ((vg) (this)).field_n = stackIn_13_1 != 0;
                if (this.field_u == null) {
                  break L4;
                } else {
                  if (!(this.field_u instanceof wc)) {
                    break L4;
                  } else {
                    ((wc) ((Object) this.field_u)).a((vg) (this), var5_int != 0, (byte) -117);
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("vg.I(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    int d(int param0) {
        if (param0 != 3) {
            this.field_v = (String) null;
            return 0;
        }
        return 0;
    }

    final static void a(vj param0, boolean param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ja var5 = null;
        int[] var6 = null;
        int var7 = 0;
        lh var8 = null;
        lh var9 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              var8 = new lh(param0.a("logo.fo3d", "", 24874));
              var9 = var8;
              var3 = var9.l(31760);
              var9.d((byte) 65);
              dm.field_B = m.a(103, var9);
              q.field_b = new int[var3][];
              r.field_c = new ja[var3];
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (var3 <= var4) {
                    var9.o(-124);
                    break L2;
                  } else {
                    r.field_c[var4] = tl.a(var8, (byte) 105);
                    var4++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      continue L1;
                    }
                  }
                }
                var4 = 0;
                L3: while (true) {
                  if (var4 >= var3) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5 = r.field_c[var4];
                    var5.a(6, 6, 6, (byte) -65, 1);
                    var5.b(32767);
                    var6 = new int[]{var5.field_I + var5.field_s >> 557109377, var5.field_N + var5.field_d >> 374407681, var5.field_j - -var5.field_C >> 1029924961};
                    q.field_b[var4] = var6;
                    var5.a(-var6[0], -var6[2], 0, -var6[1]);
                    var4++;
                    if (var7 == 0) {
                      continue L3;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("vg.MB(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void f(byte param0) {
        field_j = null;
        field_r = null;
        field_x = null;
        field_h = null;
        int var1 = 10 % ((param0 - -2) / 56);
    }

    protected vg() {
        this.field_t = 0;
        this.field_q = 0;
    }

    void c(byte param0) {
        int var2 = -54 % ((-10 - param0) / 51);
    }

    vg(String param0, cg param1, fd param2) {
        RuntimeException runtimeException = null;
        va var4 = null;
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
        this.field_t = 0;
        this.field_q = 0;
        try {
          L0: {
            L1: {
              this.field_u = param2;
              this.field_p = param0;
              this.field_l = param1;
              if (!(this.field_l instanceof va)) {
                break L1;
              } else {
                var4 = (va) ((Object) this.field_l);
                this.field_w = var4.a((byte) 48, (vg) (this));
                this.field_k = var4.a(170, (vg) (this));
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
            stackOut_4_1 = new StringBuilder().append("vg.<init>(");
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
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    vg(int param0, int param1, int param2, int param3, cg param4, fd param5) {
        this.field_t = 0;
        this.field_q = 0;
        try {
            this.field_w = param2;
            this.field_m = param1;
            this.field_o = param0;
            this.field_u = param5;
            this.field_l = param4;
            this.field_k = param3;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "vg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = "This password is part of your Player Name, and would be easy to guess";
        field_r = new int[]{3, 2, 3, 3, 3, 0, -1, 0, -1, -1, -1, 8, -1, 5, 5, 5, 5, 8, 8, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -1, -1, 2, 3, 3, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0};
    }
}
