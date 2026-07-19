/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ng extends fa {
    int field_B;
    eb field_y;
    static hh[] field_A;
    boolean field_D;
    static double field_s;
    int field_x;
    static int field_u;
    int field_k;
    int field_E;
    String field_l;
    int field_z;
    String field_q;
    static String field_t;
    int field_p;
    static String field_v;
    static int[] field_m;
    static String field_w;
    kd field_r;
    static hh[] field_o;
    int field_C;
    fn field_n;

    public final String toString() {
        return this.a(new StringBuilder(), false, 0, new Hashtable()).toString();
    }

    boolean a(int param0, int param1, ng param2, char param3) {
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
            if (param1 == 3) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_A = (hh[]) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("ng.G(").append(param0).append(',').append(param1).append(',');
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 == -58) {
              if (this.a(93, param5, param3, param6, param4)) {
                this.field_k = param2;
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
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
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var8);
            stackOut_7_1 = new StringBuilder().append("ng.N(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    int e(int param0) {
        if (param0 <= 31) {
            this.field_l = (String) null;
            return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        var5 = -54 / ((70 - param3) / 49);
        if (0 == param1) {
          if (null == this.field_y) {
            return;
          } else {
            this.field_y.a((ng) (this), (byte) -124, param0, param2, true);
            return;
          }
        } else {
          return;
        }
    }

    boolean a(ng param0, int param1) {
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
            if (param1 == 27) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_k = -73;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ng.HA(");
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void h(int param0) {
        boolean discarded$0 = false;
        if (param0 != 2) {
            discarded$0 = this.a(-82, false, (byte) 61, -91);
        }
    }

    final static void a(boolean param0) {
        l.b(true);
        if (param0) {
            return;
        }
        vk.n(93);
    }

    void a(int param0, int param1, int param2, ng param3) {
        boolean discarded$2 = false;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
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
              var5_int = this.a(param0 + 66, param2, param1, bg.field_k, uf.field_d) ? 1 : 0;
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
              stackOut_3_0 = stackIn_3_0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (this.field_D) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              if (stackIn_6_0 != stackIn_6_1) {
                L4: {
                  stackOut_8_0 = this;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var5_int == 0) {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L4;
                  } else {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L4;
                  }
                }
                ((ng) (this)).field_D = stackIn_11_1 != 0;
                if (null == this.field_n) {
                  break L3;
                } else {
                  if (!(this.field_n instanceof n)) {
                    break L3;
                  } else {
                    ((n) ((Object) this.field_n)).a((ng) (this), var5_int != 0, true);
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L5: {
              if (param0 == 40) {
                break L5;
              } else {
                discarded$2 = this.b(true);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("ng.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    public static void f(int param0) {
        field_m = null;
        if (param0 != 0) {
          ng.a(true);
          field_A = null;
          field_o = null;
          field_t = null;
          field_v = null;
          field_w = null;
          return;
        } else {
          field_A = null;
          field_o = null;
          field_t = null;
          field_v = null;
          field_w = null;
          return;
        }
    }

    boolean b(boolean param0) {
        if (!param0) {
            field_u = -102;
            return false;
        }
        return false;
    }

    final void c(byte param0) {
        this.a(this.field_E, (byte) 99, this.field_p, this.field_z, this.field_C);
        if (param0 <= 48) {
            ng var3 = (ng) null;
            this.a(124, -118, -106, (ng) null);
        }
    }

    String b(byte param0) {
        if (param0 < 16) {
            return (String) null;
        }
        return !this.field_D ? null : this.field_l;
    }

    final static void g(int param0) {
        RuntimeException runtimeException = null;
        tf var1 = null;
        tf var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1 = new tf(540, 140);
            h.a(-126, var1);
            ja.a();
            t.d();
            ga.field_f = param0;
            ma.d((byte) 106);
            var2 = var1.a();
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (15 <= var3) {
                    break L3;
                  } else {
                    var2.e(-2, -2, 16777215);
                    t.c(4, 4, 0, 0, 540, 140);
                    var3++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                bd.field_a.c();
                var1.d(0, 0);
                ia.a((byte) 92);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "ng.BB(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        var4 = this.e(63);
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var5 > var4) {
              var5 = -7 % ((44 - param2) / 51);
              break L1;
            } else {
              this.a(param0, var5, param1, (byte) -63);
              var5++;
              if (var7 != 0) {
                break L1;
              } else {
                continue L0;
              }
            }
          }
          var6 = hb.e((byte) -115);
          if (var6 != null) {
            h.field_X.a(var6, oo.field_f, false, tm.field_V);
            return;
          } else {
            return;
          }
        }
    }

    final static void i(int param0) {
        pj[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        pj var3 = null;
        int var4 = 0;
        pj[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var5 = up.field_n;
            var1 = var5;
            var2 = param0;
            L1: while (true) {
              if (var5.length <= var2) {
                break L0;
              } else {
                var3 = var5[var2];
                var3.field_f = true;
                var2++;
                if (var4 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "ng.FB(" + param0 + ')');
        }
    }

    final boolean a(char param0, int param1, boolean param2) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var4 = 0;
        ng var5 = null;
        if (!this.b(true)) {
          var4 = param1;
          if ((var4 ^ -1) == -81) {
            return this.a((ng) (this), 27);
          } else {
            if (param2) {
              var5 = (ng) null;
              discarded$2 = this.a((byte) -104, (ng) null, 48, -22, 91, 48, -13);
              return false;
            } else {
              return false;
            }
          }
        } else {
          if (!this.a(param1, 3, (ng) (this), param0)) {
            var4 = param1;
            if ((var4 ^ -1) == -81) {
              return this.a((ng) (this), 27);
            } else {
              if (!param2) {
                return false;
              } else {
                var5 = (ng) null;
                discarded$3 = this.a((byte) -104, (ng) null, 48, -22, 91, 48, -13);
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, boolean param1, byte param2, int param3) {
        boolean discarded$1 = false;
        int var5 = 0;
        bn var6 = null;
        int var7 = 0;
        bn var8 = null;
        bn var9 = null;
        bn var10 = null;
        bn var11 = null;
        bn var12 = null;
        bn var13 = null;
        bn var14 = null;
        bn var15 = null;
        L0: {
          L1: {
            var7 = Pixelate.field_H ? 1 : 0;
            this.a(40, param0, param3, (ng) (this));
            var5 = this.b(true) ? 1 : 0;
            if (!param1) {
              break L1;
            } else {
              L2: {
                if (lp.field_i == 0) {
                  break L2;
                } else {
                  if (var5 != 0) {
                    discarded$1 = this.a(uf.field_d, (byte) 80, param0, param3, bg.field_k, lp.field_i, (ng) (this));
                    break L2;
                  } else {
                    if (0 != nm.field_c) {
                      if (!this.a((byte) -58, (ng) (this), nm.field_c, param0, uo.field_a, param3, ji.field_c)) {
                        if (var5 == 0) {
                          L3: {
                            if (ef.field_b != 0) {
                              break L3;
                            } else {
                              if (db.field_R != 0) {
                                L4: {
                                  this.a(bg.field_k, param3, (ng) (this), param2 + -99, param0, uf.field_d);
                                  var9 = qf.field_a;
                                  var6 = var9;
                                  if (var9 != null) {
                                    L5: {
                                      if (var9.field_n instanceof s) {
                                        ((s) ((Object) var9.field_n)).a(-92, var9, (ne) null);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    qf.field_a = null;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  if (var5 == 0) {
                                    break L3;
                                  } else {
                                    if (0 == nm.field_c) {
                                      break L3;
                                    } else {
                                      this.h(2);
                                      break L3;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          L6: {
                            db.field_R = ef.field_b;
                            if (param2 == 99) {
                              break L6;
                            } else {
                              this.field_E = -110;
                              break L6;
                            }
                          }
                          ij.a(-5516, this.b((byte) 37));
                          return param1;
                        } else {
                          L7: {
                            this.h(2);
                            if (var7 == 0) {
                              break L7;
                            } else {
                              param1 = false;
                              break L7;
                            }
                          }
                          L8: {
                            if (ef.field_b != 0) {
                              break L8;
                            } else {
                              if (db.field_R != 0) {
                                L9: {
                                  this.a(bg.field_k, param3, (ng) (this), param2 + -99, param0, uf.field_d);
                                  var10 = qf.field_a;
                                  if (var10 != null) {
                                    L10: {
                                      if (var10.field_n instanceof s) {
                                        ((s) ((Object) var10.field_n)).a(-92, var10, (ne) null);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    qf.field_a = null;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                if (var7 == 0) {
                                  break L8;
                                } else {
                                  if (var5 == 0) {
                                    break L8;
                                  } else {
                                    if (0 == nm.field_c) {
                                      break L8;
                                    } else {
                                      this.h(2);
                                      break L8;
                                    }
                                  }
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                          L11: {
                            db.field_R = ef.field_b;
                            if (param2 == 99) {
                              break L11;
                            } else {
                              this.field_E = -110;
                              break L11;
                            }
                          }
                          ij.a(-5516, this.b((byte) 37));
                          return param1;
                        }
                      } else {
                        L12: {
                          param1 = false;
                          if (ef.field_b != 0) {
                            break L12;
                          } else {
                            if (db.field_R != 0) {
                              L13: {
                                this.a(bg.field_k, param3, (ng) (this), param2 + -99, param0, uf.field_d);
                                var8 = qf.field_a;
                                var6 = var8;
                                if (var8 != null) {
                                  L14: {
                                    if (var8.field_n instanceof s) {
                                      ((s) ((Object) var8.field_n)).a(-92, var8, (ne) null);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  qf.field_a = null;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              if (var7 == 0) {
                                break L12;
                              } else {
                                if (var5 == 0) {
                                  break L12;
                                } else {
                                  if (0 == nm.field_c) {
                                    break L12;
                                  } else {
                                    this.h(2);
                                    break L12;
                                  }
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                        L15: {
                          db.field_R = ef.field_b;
                          if (param2 == 99) {
                            break L15;
                          } else {
                            this.field_E = -110;
                            break L15;
                          }
                        }
                        ij.a(-5516, this.b((byte) 37));
                        return param1;
                      }
                    } else {
                      L16: {
                        if (ef.field_b != 0) {
                          break L16;
                        } else {
                          if (db.field_R != 0) {
                            L17: {
                              this.a(bg.field_k, param3, (ng) (this), param2 + -99, param0, uf.field_d);
                              var10 = qf.field_a;
                              if (var10 != null) {
                                L18: {
                                  if (var10.field_n instanceof s) {
                                    ((s) ((Object) var10.field_n)).a(-92, var10, (ne) null);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                qf.field_a = null;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var7 == 0) {
                              break L16;
                            } else {
                              if (var5 == 0) {
                                break L16;
                              } else {
                                if (0 == nm.field_c) {
                                  break L16;
                                } else {
                                  this.h(2);
                                  break L16;
                                }
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      L19: {
                        db.field_R = ef.field_b;
                        if (param2 == 99) {
                          break L19;
                        } else {
                          this.field_E = -110;
                          break L19;
                        }
                      }
                      ij.a(-5516, this.b((byte) 37));
                      return param1;
                    }
                  }
                }
              }
              if (0 != nm.field_c) {
                if (this.a((byte) -58, (ng) (this), nm.field_c, param0, uo.field_a, param3, ji.field_c)) {
                  param1 = false;
                  if (ef.field_b != 0) {
                    break L0;
                  } else {
                    if (db.field_R != 0) {
                      L20: {
                        this.a(bg.field_k, param3, (ng) (this), param2 + -99, param0, uf.field_d);
                        var15 = qf.field_a;
                        if (var15 != null) {
                          L21: {
                            if (var15.field_n instanceof s) {
                              ((s) ((Object) var15.field_n)).a(-92, var15, (ne) null);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          qf.field_a = null;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      if (var7 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    } else {
                      db.field_R = ef.field_b;
                      if (param2 == 99) {
                        ij.a(-5516, this.b((byte) 37));
                        return param1;
                      } else {
                        this.field_E = -110;
                        ij.a(-5516, this.b((byte) 37));
                        return param1;
                      }
                    }
                  }
                } else {
                  if (var5 != 0) {
                    this.h(2);
                    if (var7 != 0) {
                      L22: {
                        param1 = false;
                        if (ef.field_b != 0) {
                          break L22;
                        } else {
                          if (db.field_R != 0) {
                            L23: {
                              this.a(bg.field_k, param3, (ng) (this), param2 + -99, param0, uf.field_d);
                              var14 = qf.field_a;
                              var6 = var14;
                              if (var14 != null) {
                                L24: {
                                  if (var14.field_n instanceof s) {
                                    ((s) ((Object) var14.field_n)).a(-92, var14, (ne) null);
                                    break L24;
                                  } else {
                                    break L24;
                                  }
                                }
                                qf.field_a = null;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            if (var7 == 0) {
                              break L22;
                            } else {
                              if (var5 == 0) {
                                break L22;
                              } else {
                                if (0 == nm.field_c) {
                                  break L22;
                                } else {
                                  this.h(2);
                                  db.field_R = ef.field_b;
                                  if (param2 == 99) {
                                    ij.a(-5516, this.b((byte) 37));
                                    return param1;
                                  } else {
                                    this.field_E = -110;
                                    ij.a(-5516, this.b((byte) 37));
                                    return param1;
                                  }
                                }
                              }
                            }
                          } else {
                            L25: {
                              db.field_R = ef.field_b;
                              if (param2 == 99) {
                                break L25;
                              } else {
                                this.field_E = -110;
                                break L25;
                              }
                            }
                            ij.a(-5516, this.b((byte) 37));
                            return param1;
                          }
                        }
                      }
                      db.field_R = ef.field_b;
                      if (param2 == 99) {
                        ij.a(-5516, this.b((byte) 37));
                        return param1;
                      } else {
                        this.field_E = -110;
                        ij.a(-5516, this.b((byte) 37));
                        return param1;
                      }
                    } else {
                      L26: {
                        if (ef.field_b != 0) {
                          break L26;
                        } else {
                          if (db.field_R != 0) {
                            L27: {
                              this.a(bg.field_k, param3, (ng) (this), param2 + -99, param0, uf.field_d);
                              var13 = qf.field_a;
                              var6 = var13;
                              if (var13 != null) {
                                L28: {
                                  if (var13.field_n instanceof s) {
                                    ((s) ((Object) var13.field_n)).a(-92, var13, (ne) null);
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                qf.field_a = null;
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            if (var7 == 0) {
                              break L26;
                            } else {
                              if (var5 == 0) {
                                break L26;
                              } else {
                                if (0 == nm.field_c) {
                                  break L26;
                                } else {
                                  this.h(2);
                                  db.field_R = ef.field_b;
                                  if (param2 != 99) {
                                    this.field_E = -110;
                                    ij.a(-5516, this.b((byte) 37));
                                    return param1;
                                  } else {
                                    ij.a(-5516, this.b((byte) 37));
                                    return param1;
                                  }
                                }
                              }
                            }
                          } else {
                            db.field_R = ef.field_b;
                            if (param2 != 99) {
                              this.field_E = -110;
                              ij.a(-5516, this.b((byte) 37));
                              return param1;
                            } else {
                              ij.a(-5516, this.b((byte) 37));
                              return param1;
                            }
                          }
                        }
                      }
                      db.field_R = ef.field_b;
                      if (param2 != 99) {
                        this.field_E = -110;
                        ij.a(-5516, this.b((byte) 37));
                        return param1;
                      } else {
                        ij.a(-5516, this.b((byte) 37));
                        return param1;
                      }
                    }
                  } else {
                    L29: {
                      if (ef.field_b != 0) {
                        break L29;
                      } else {
                        if (db.field_R != 0) {
                          L30: {
                            this.a(bg.field_k, param3, (ng) (this), param2 + -99, param0, uf.field_d);
                            var12 = qf.field_a;
                            if (var12 != null) {
                              L31: {
                                if (var12.field_n instanceof s) {
                                  ((s) ((Object) var12.field_n)).a(-92, var12, (ne) null);
                                  break L31;
                                } else {
                                  break L31;
                                }
                              }
                              qf.field_a = null;
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          if (var7 == 0) {
                            break L29;
                          } else {
                            if (var5 == 0) {
                              break L29;
                            } else {
                              if (0 == nm.field_c) {
                                break L29;
                              } else {
                                this.h(2);
                                db.field_R = ef.field_b;
                                if (param2 != 99) {
                                  this.field_E = -110;
                                  ij.a(-5516, this.b((byte) 37));
                                  return param1;
                                } else {
                                  ij.a(-5516, this.b((byte) 37));
                                  return param1;
                                }
                              }
                            }
                          }
                        } else {
                          db.field_R = ef.field_b;
                          if (param2 != 99) {
                            this.field_E = -110;
                            ij.a(-5516, this.b((byte) 37));
                            return param1;
                          } else {
                            ij.a(-5516, this.b((byte) 37));
                            return param1;
                          }
                        }
                      }
                    }
                    db.field_R = ef.field_b;
                    if (param2 != 99) {
                      this.field_E = -110;
                      ij.a(-5516, this.b((byte) 37));
                      return param1;
                    } else {
                      ij.a(-5516, this.b((byte) 37));
                      return param1;
                    }
                  }
                }
              } else {
                L32: {
                  if (ef.field_b != 0) {
                    break L32;
                  } else {
                    if (db.field_R != 0) {
                      L33: {
                        this.a(bg.field_k, param3, (ng) (this), param2 + -99, param0, uf.field_d);
                        var11 = qf.field_a;
                        var6 = var11;
                        if (var11 != null) {
                          L34: {
                            if (var11.field_n instanceof s) {
                              ((s) ((Object) var11.field_n)).a(-92, var11, (ne) null);
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          qf.field_a = null;
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                      if (var7 == 0) {
                        break L32;
                      } else {
                        if (var5 == 0) {
                          break L32;
                        } else {
                          if (0 == nm.field_c) {
                            break L32;
                          } else {
                            this.h(2);
                            break L32;
                          }
                        }
                      }
                    } else {
                      break L32;
                    }
                  }
                }
                db.field_R = ef.field_b;
                if (param2 != 99) {
                  this.field_E = -110;
                  ij.a(-5516, this.b((byte) 37));
                  return param1;
                } else {
                  ij.a(-5516, this.b((byte) 37));
                  return param1;
                }
              }
            }
          }
          if (var5 == 0) {
            break L0;
          } else {
            if (0 == nm.field_c) {
              break L0;
            } else {
              this.h(2);
              db.field_R = ef.field_b;
              if (param2 == 99) {
                ij.a(-5516, this.b((byte) 37));
                return param1;
              } else {
                this.field_E = -110;
                ij.a(-5516, this.b((byte) 37));
                return param1;
              }
            }
          }
        }
        db.field_R = ef.field_b;
        if (param2 == 99) {
          ij.a(-5516, this.b((byte) 37));
          return param1;
        } else {
          this.field_E = -110;
          ij.a(-5516, this.b((byte) 37));
          return param1;
        }
    }

    ng(String param0, fn param1) {
        this(param0, h.field_X.field_a, param1);
    }

    final void a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
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
        int decompiledRegionSelector0 = 0;
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
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$8 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_z).append(",").append(this.field_p).append(" ").append(this.field_E).append("x").append(this.field_C);
              if (this.field_q != null) {
                discarded$9 = param3.append(" text=\"").append(this.field_q).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == -2) {
              L2: {
                if (!this.field_D) {
                  break L2;
                } else {
                  discarded$10 = param3.append(" mouseover");
                  break L2;
                }
              }
              L3: {
                if (this.b(true)) {
                  discarded$11 = param3.append(" focused");
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (this.field_y != null) {
                  L5: {
                    discarded$12 = param3.append(" renderer=");
                    if (this.field_y instanceof ng) {
                      break L5;
                    } else {
                      discarded$13 = param3.append(this.field_y);
                      if (var6 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  param3 = this.a(param3, false, param0 - -1, param2);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (null == this.field_n) {
                  break L6;
                } else {
                  L7: {
                    discarded$14 = param3.append(" listener=");
                    if (this.field_n instanceof ng) {
                      break L7;
                    } else {
                      discarded$15 = param3.append(this.field_n);
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param3 = this.a(param3, false, param0 + 1, param2);
                  break L6;
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
          L8: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("ng.CB(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ng param6) {
        String discarded$2 = null;
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
            if (param1 >= 61) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              discarded$2 = this.toString();
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("ng.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param6 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2 = we.b(nh.a(param0, -29667), -7067);
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -1) {
                break L2;
              } else {
                ng.i(-36);
                break L2;
              }
            }
            stackOut_5_0 = (String) (var2);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("ng.IB(");
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
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
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
              if (this.a(-59, param2, param0, param3)) {
                this.a(param2, (byte) -2, param3, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param1) {
                break L2;
              } else {
                field_o = (hh[]) null;
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) (param0);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("ng.AA(");
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
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        try {
            this.field_k = param3;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ng.EA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        this.field_E = param0;
        this.field_z = param3;
        this.field_C = param4;
        if (param1 <= 19) {
          ng.g(-105);
          this.field_p = param2;
          return;
        } else {
          this.field_p = param2;
          return;
        }
    }

    final boolean a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$4 = null;
        Object discarded$5 = null;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 < -34) {
              if (param3.containsKey(this)) {
                discarded$4 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                discarded$5 = param3.put(this, this);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("ng.AB(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param0 >= 55) {
          if (param4 >= param1 - -this.field_z) {
            if (this.field_p + param2 > param3) {
              return false;
            } else {
              L0: {
                L1: {
                  if (this.field_E + param1 + this.field_z <= param4) {
                    break L1;
                  } else {
                    if (param3 >= this.field_C + (this.field_p + param2)) {
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
          this.field_y = (eb) null;
          if (param4 >= param1 - -this.field_z) {
            if (this.field_p + param2 <= param3) {
              if (this.field_E + param1 + this.field_z > param4) {
                if (param3 >= this.field_C + (this.field_p + param2)) {
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

    protected ng() {
        this.field_B = 0;
        this.field_x = 0;
    }

    ng(String param0, eb param1, fn param2) {
        RuntimeException runtimeException = null;
        af var4 = null;
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
        this.field_B = 0;
        this.field_x = 0;
        try {
          L0: {
            L1: {
              this.field_y = param1;
              this.field_n = param2;
              this.field_q = param0;
              if (!(this.field_y instanceof af)) {
                break L1;
              } else {
                var4 = (af) ((Object) this.field_y);
                this.field_E = var4.a(14871, (ng) (this));
                this.field_C = var4.a((ng) (this), 4592);
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
            stackOut_4_1 = new StringBuilder().append("ng.<init>(");
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
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    ng(int param0, int param1, int param2, int param3, eb param4, fn param5) {
        this.field_B = 0;
        this.field_x = 0;
        try {
            this.field_y = param4;
            this.field_E = param2;
            this.field_z = param0;
            this.field_C = param3;
            this.field_p = param1;
            this.field_n = param5;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ng.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = 0.07;
        field_t = "you";
        field_v = "Please enter your date of birth to enable chat:";
        field_m = new int[]{2, 20, 21, 27, 6, 5, 13};
        field_w = "EXCLUSIVE";
    }
}
