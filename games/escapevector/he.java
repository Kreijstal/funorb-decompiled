/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class he extends k {
    static String field_q;
    static Calendar field_s;
    static String field_v;
    private ef[] field_w;
    static eh field_r;
    static int field_y;
    private ef field_t;
    static mf field_u;
    static int field_x;

    final ef a(int param0, byte param1) {
        ef dupTemp$4 = null;
        ef dupTemp$5 = null;
        if (param1 != -53) {
          this.field_t = (ef) null;
          dupTemp$4 = new ef();
          this.field_w[param0] = dupTemp$4;
          return dupTemp$4;
        } else {
          dupTemp$5 = new ef();
          this.field_w[param0] = dupTemp$5;
          return dupTemp$5;
        }
    }

    final static te a(mf param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        te stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        te stackOut_5_0 = null;
        Object stackOut_3_0 = null;
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
              if (param1 == -18109) {
                break L1;
              } else {
                field_v = (String) null;
                break L1;
              }
            }
            if (uc.a(param0, 96, param3, param2)) {
              stackOut_5_0 = da.b((byte) 8);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("he.Q(");
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
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (te) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void a(ed[] param0, int param1) {
        ef[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ef var5 = null;
        int var6 = 0;
        ef[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var7 = this.field_w;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                if (param1 == 6) {
                  break L0;
                } else {
                  field_v = (String) null;
                  return;
                }
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_i = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("he.O(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        RuntimeException var6 = null;
        ef var7 = null;
        ef var9 = null;
        hc var10 = null;
        ef var11 = null;
        ef var12 = null;
        ef var13 = null;
        ef var14 = null;
        hm stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        hm stackOut_1_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof hc)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (hm) ((Object) stackOut_2_0);
                break L1;
              } else {
                stackOut_1_0 = (hm) (param3);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (hc) ((Object) stackIn_3_0);
              rd.a(param3.field_g + param3.field_k + param0, param0 - -param3.field_k, param3.field_j + (param1 + param3.field_x), 19807, param1 - -param3.field_j);
              if (var10 != null) {
                param4 = param4 & var10.field_y;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = this.field_w[0];
              this.field_t.a(true);
              var7.a(param0, this.field_t, param3, param1, 63, (he) (this));
              if (var10 == null) {
                break L3;
              } else {
                L4: {
                  if (!var10.field_z) {
                    break L4;
                  } else {
                    var11 = this.field_w[1];
                    if (var11 != null) {
                      var11.a(param0, this.field_t, param3, param1, -106, (he) (this));
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!var10.field_u) {
                  break L3;
                } else {
                  L5: {
                    var12 = this.field_w[3];
                    if (0 == var10.field_t) {
                      break L5;
                    } else {
                      if (var12 == null) {
                        break L5;
                      } else {
                        var12.a(param0, this.field_t, param3, param1, -124, (he) (this));
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_w[2];
                  if (var9 != null) {
                    var9.a(param0, this.field_t, param3, param1, -101, (he) (this));
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (param3.h(0)) {
                var13 = this.field_w[5];
                if (var13 == null) {
                  break L6;
                } else {
                  var13.a(param0, this.field_t, param3, param1, 51, (he) (this));
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!param4) {
                var14 = this.field_w[4];
                if (var14 != null) {
                  var14.a(param0, this.field_t, param3, param1, -94, (he) (this));
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (param2 < -14) {
                break L8;
              } else {
                he.a(true);
                break L8;
              }
            }
            this.field_t.a((he) (this), param3, param0, param1, (byte) 21);
            dl.a((byte) -8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var6);
            stackOut_31_1 = new StringBuilder().append("he.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param4 + ')');
        }
    }

    final void a(ed param0, byte param1) {
        ef[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ef var5 = null;
        int var6 = 0;
        ef[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var7 = this.field_w;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                if (param1 > 65) {
                  break L0;
                } else {
                  he.a(true);
                  return;
                }
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_g = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("he.R(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    he(he param0, boolean param1) {
        this();
        try {
            param0.a(param1, 123, (he) (this));
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static kb a(String param0, int param1, byte param2) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        jb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        jb stackOut_0_0 = null;
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
            var3 = new jb();
            var4 = -90 / ((param2 - -5) / 40);
            ((kb) ((Object) var3)).field_b = param1;
            ((kb) ((Object) var3)).field_a = param0;
            stackOut_0_0 = (jb) (var3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3_ref);
            stackOut_2_1 = new StringBuilder().append("he.S(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (kb) ((Object) stackIn_1_0);
    }

    public static void a(boolean param0) {
        field_v = null;
        field_u = null;
        field_q = null;
        if (!param0) {
            return;
        }
        field_s = null;
    }

    public he() {
        this.field_w = new ef[6];
        this.field_t = new ef();
        ef dupTemp$0 = new ef();
        this.field_w[0] = dupTemp$0;
        ef var1 = dupTemp$0;
        var1.a(true);
    }

    private final void a(boolean param0, int param1, he param2) {
        ef dupTemp$17 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ef var5 = null;
        ef var6 = null;
        int var7 = 0;
        ef stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ef stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ef stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ef stackIn_9_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ef stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ef stackOut_8_2 = null;
        ef stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ef stackOut_7_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              super.a(param2, 127);
              if (!param0) {
                qg.a(this.field_w, 0, param2.field_w, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (-7 >= (var4_int ^ -1)) {
                    break L1;
                  } else {
                    L3: {
                      var5 = this.field_w[var4_int];
                      if (var5 != null) {
                        L4: {
                          var6 = param2.field_w[var4_int];
                          stackOut_6_0 = (ef) (var5);
                          stackOut_6_1 = -2;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var6 == null) {
                            dupTemp$17 = new ef();
                            param2.field_w[var4_int] = dupTemp$17;
                            stackOut_8_0 = (ef) ((Object) stackIn_8_0);
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (ef) (dupTemp$17);
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L4;
                          } else {
                            stackOut_7_0 = (ef) ((Object) stackIn_7_0);
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (ef) (var6);
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L4;
                          }
                        }
                        ((ef) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2);
                        break L3;
                      } else {
                        param2.field_w[var4_int] = null;
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            if (param1 > 120) {
              break L0;
            } else {
              field_r = (eh) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("he.T(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final void a(ed[] param0, int param1, byte param2) {
        int var4_int = 0;
        try {
            var4_int = param1;
            if (param2 != -117) {
                he var5 = (he) null;
                this.a(false, -105, (he) null);
            }
            if (this.field_w[var4_int] == null) {
                this.field_w[var4_int] = new ef();
            }
            this.field_w[param1].field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "he.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_v = "Tutorial";
        field_r = null;
        field_q = "Not yet achieved";
        field_s = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
