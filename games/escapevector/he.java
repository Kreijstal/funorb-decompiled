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
        if (param1 != -53) {
          ((he) this).field_t = null;
          ef dupTemp$4 = new ef();
          ((he) this).field_w[param0] = dupTemp$4;
          return dupTemp$4;
        } else {
          ef dupTemp$5 = new ef();
          ((he) this).field_w[param0] = dupTemp$5;
          return dupTemp$5;
        }
    }

    final static te a(mf param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        te stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (uc.a(param0, 96, param3, param2)) {
              stackOut_3_0 = da.b((byte) 8);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (te) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("he.Q(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -18109 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final void a(ed[] param0, int param1) {
        ef[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ef var5 = null;
        int var6 = 0;
        ef[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var7 = ((he) this).field_w;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                if (param1 == 6) {
                  break L0;
                } else {
                  field_v = null;
                  return;
                }
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_i = param0;
                    var4++;
                    break L2;
                  } else {
                    var4++;
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
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("he.O(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
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
                stackIn_3_0 = (hm) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (hm) param3;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (hc) (Object) stackIn_3_0;
              rd.a(param3.field_g + param3.field_k + param0, param0 - -param3.field_k, param3.field_j + (param1 + param3.field_x), 19807, param1 - -param3.field_j);
              if (var10 != null) {
                param4 = param4 & var10.field_y;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = ((he) this).field_w[0];
              ((he) this).field_t.a(true);
              var7.a(param0, ((he) this).field_t, param3, param1, 63, (he) this);
              if (var10 == null) {
                break L3;
              } else {
                L4: {
                  if (!var10.field_z) {
                    break L4;
                  } else {
                    var11 = ((he) this).field_w[1];
                    if (var11 != null) {
                      var11.a(param0, ((he) this).field_t, param3, param1, -106, (he) this);
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
                    var12 = ((he) this).field_w[3];
                    if (0 == var10.field_t) {
                      break L5;
                    } else {
                      if (var12 == null) {
                        break L5;
                      } else {
                        var12.a(param0, ((he) this).field_t, param3, param1, -124, (he) this);
                        break L3;
                      }
                    }
                  }
                  var9 = ((he) this).field_w[2];
                  if (var9 != null) {
                    var9.a(param0, ((he) this).field_t, param3, param1, -101, (he) this);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (param3.h(0)) {
                var13 = ((he) this).field_w[5];
                if (var13 == null) {
                  break L6;
                } else {
                  var13.a(param0, ((he) this).field_t, param3, param1, 51, (he) this);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!param4) {
                var14 = ((he) this).field_w[4];
                if (var14 != null) {
                  var14.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
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
            ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
            dl.a((byte) -8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("he.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param4 + ')');
        }
    }

    final void a(ed param0, byte param1) {
        ef[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ef var5 = null;
        int var6 = 0;
        ef[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var7 = ((he) this).field_w;
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
                    var4++;
                    break L2;
                  } else {
                    var4++;
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
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("he.R(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    he(he param0, boolean param1) {
        this();
        try {
            param0.a(param1, 123, (he) this);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "he.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
            var4 = -45;
            ((kb) (Object) var3).field_b = param1;
            ((kb) (Object) var3).field_a = param0;
            stackOut_0_0 = (jb) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("he.S(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + 85 + ')');
        }
        return (kb) (Object) stackIn_1_0;
    }

    public static void a(boolean param0) {
        field_v = null;
        field_u = null;
        field_q = null;
        field_s = null;
    }

    public he() {
        ((he) this).field_w = new ef[6];
        ((he) this).field_t = new ef();
        ef dupTemp$0 = new ef();
        ((he) this).field_w[0] = dupTemp$0;
        ef var1 = dupTemp$0;
        var1.a(true);
    }

    private final void a(boolean param0, int param1, he param2) {
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ef stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ef stackOut_8_2 = null;
        ef stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ef stackOut_7_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              super.a((k) (Object) param2, 127);
              if (!param0) {
                qg.a((Object[]) (Object) ((he) this).field_w, 0, (Object[]) (Object) param2.field_w, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((he) this).field_w[var4_int];
                      if (var5 != null) {
                        L4: {
                          var6 = param2.field_w[var4_int];
                          stackOut_6_0 = (ef) var5;
                          stackOut_6_1 = -2;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var6 == null) {
                            ef dupTemp$33 = new ef();
                            param2.field_w[var4_int] = dupTemp$33;
                            stackOut_8_0 = (ef) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (ef) dupTemp$33;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L4;
                          } else {
                            stackOut_7_0 = (ef) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (ef) var6;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L4;
                          }
                        }
                        ((ef) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2);
                        var4_int++;
                        break L3;
                      } else {
                        param2.field_w[var4_int] = null;
                        var4_int++;
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
              field_r = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("he.T(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final void a(ed[] param0, int param1, byte param2) {
        int var4_int = 0;
        try {
            var4_int = param1;
            if (param2 != -117) {
                Object var5 = null;
                this.a(false, -105, (he) null);
            }
            if (((he) this).field_w[var4_int] == null) {
                ((he) this).field_w[var4_int] = new ef();
            }
            ((he) this).field_w[param1].field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "he.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Tutorial";
        field_r = null;
        field_q = "Not yet achieved";
        field_s = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
