/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.Socket;

abstract class jg {
    static String field_c;
    String field_e;
    static int field_a;
    static int field_g;
    static int[][] field_f;
    static int[][] field_h;
    int field_b;
    static String field_d;

    final java.net.Socket a(int param0) throws IOException {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        java.net.Socket stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 1) {
              stackOut_4_0 = new java.net.Socket(((jg) this).field_e, ((jg) this).field_b);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (java.net.Socket) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "jg.F(" + param0 + ')');
        }
        return stackIn_5_0;
    }

    abstract java.net.Socket b(int param0) throws IOException;

    final static boolean d(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 7) {
              L1: {
                if (ih.field_c.a(-95)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "jg.D(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static j a(byte param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        j var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        j stackIn_24_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        j stackOut_23_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_13_0 = null;
        Object stackOut_10_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (nh.field_a == null) {
                break L1;
              } else {
                if (null == param1) {
                  break L1;
                } else {
                  if (param1.length() == 0) {
                    break L1;
                  } else {
                    if (param0 == -62) {
                      var2 = oe.a((CharSequence) (Object) param1, 12);
                      if (null != var2) {
                        var3 = (j) (Object) nh.field_a.a((long)var2.hashCode(), -1);
                        L2: while (true) {
                          L3: {
                            if (var3 == null) {
                              break L3;
                            } else {
                              var4 = oe.a((CharSequence) (Object) var3.field_hb, 12);
                              if (var4.equals((Object) (Object) var2)) {
                                stackOut_23_0 = (j) var3;
                                stackIn_24_0 = stackOut_23_0;
                                return stackIn_24_0;
                              } else {
                                var3 = (j) (Object) nh.field_a.a(-29925);
                                if (var5 == 0) {
                                  continue L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          stackOut_26_0 = null;
                          stackIn_27_0 = stackOut_26_0;
                          break L0;
                        }
                      } else {
                        stackOut_16_0 = null;
                        stackIn_17_0 = stackOut_16_0;
                        return (j) (Object) stackIn_17_0;
                      }
                    } else {
                      stackOut_13_0 = null;
                      stackIn_14_0 = stackOut_13_0;
                      return (j) (Object) stackIn_14_0;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = null;
            stackIn_11_0 = stackOut_10_0;
            return (j) (Object) stackIn_11_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var2_ref;
            stackOut_28_1 = new StringBuilder().append("jg.B(").append(param0).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L4;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return (j) (Object) stackIn_27_0;
    }

    final static na a(rh param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        na stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        na stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.a((byte) 127, param2);
              if (param1 == 1) {
                break L1;
              } else {
                field_a = 100;
                break L1;
              }
            }
            var5 = param0.a(param3, -110, var4_int);
            stackOut_3_0 = vh.a(var5, param0, var4_int, true);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("jg.C(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_d = null;
              field_c = null;
              if (param0 == 16712207) {
                break L1;
              } else {
                boolean discarded$2 = jg.d(56);
                break L1;
              }
            }
            field_f = null;
            field_h = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "jg.A(" + param0 + ')');
        }
    }

    final static void a(rh param0, byte param1, rh param2, rh param3, rh param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        gd var6 = null;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              kf.field_c = param3;
              sl.field_l = param4;
              p.field_i = new ue(22050, qk.field_j);
              ll.field_d = rf.a(kf.field_c, "", "title_music_loop");
              pi.field_S = rf.a(kf.field_c, "", "game_over");
              hf.field_d = rf.a(kf.field_c, "", "sun");
              qf.field_bb = rf.a(kf.field_c, "", "bonus_bubble_jingle");
              te.field_c = new ci(param0, param2);
              boolean discarded$5 = uh.field_y.a(te.field_c, 0, -1, hf.field_d, sl.field_l);
              ag.field_j[1] = true;
              boolean discarded$6 = uh.field_y.a(te.field_c, 0, -1, qf.field_bb, sl.field_l);
              boolean discarded$7 = uh.field_y.a(te.field_c, 0, -1, pi.field_S, sl.field_l);
              boolean discarded$8 = uh.field_y.a(te.field_c, 0, -1, ll.field_d, sl.field_l);
              var5_int = 0;
              if (param1 >= 69) {
                break L1;
              } else {
                j discarded$9 = jg.a((byte) 74, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var5_int >= 33) {
                    break L4;
                  } else {
                    if (var7 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (ck.field_c[var5_int] <= 0) {
                            break L6;
                          } else {
                            if (ck.field_c[var5_int] != 1) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          L8: {
                            L9: {
                              if (var5_int < 10) {
                                break L9;
                              } else {
                                if (26 >= var5_int) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var6 = te.field_c.b(1, w.field_b[var5_int]);
                            if (var7 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                          var6 = te.field_c.c(-1879044097, w.field_b[var5_int]);
                          break L7;
                        }
                        fl.field_c[var5_int] = var6.a(p.field_i);
                        vg.field_j[var5_int] = true;
                        break L5;
                      }
                      var5_int++;
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("jg.E(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L12;
            }
          }
          L13: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param4 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L13;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L13;
            }
          }
          throw t.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0_int = 0;
        int[] var0 = null;
        int var1 = 0;
        int var2 = 0;
        float var3_float = 0.0f;
        int var3 = 0;
        float var4_float = 0.0f;
        int var4 = 0;
        float var5_float = 0.0f;
        int var5 = 0;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        field_a = 9;
        field_c = "This game has been updated! Please reload this page.";
        field_g = 35;
        field_h = new int[7][7];
        field_f = new int[][]{new int[7], new int[7], new int[7], new int[7], new int[7], new int[7], new int[7]};
        var0_int = 0;
        L0: while (true) {
          if (var0_int >= 7) {
            var0 = new int[7];
            var1 = 0;
            L1: while (true) {
              if (var1 >= 7) {
                return;
              } else {
                var2 = 0;
                L2: while (true) {
                  if (7 <= var2) {
                    var2 = 1;
                    L3: while (true) {
                      if (7 <= var2) {
                        var1++;
                        continue L1;
                      } else {
                        var3 = -1 + var2;
                        var4 = var0[var2];
                        var5 = field_h[var1][var2];
                        L4: while (true) {
                          L5: {
                            if (var3 < 0) {
                              break L5;
                            } else {
                              if (var0[var3] <= var4) {
                                break L5;
                              } else {
                                var0[var3 + 1] = var0[var3];
                                field_h[var1][1 + var3] = field_h[var1][var3];
                                var3--;
                                continue L4;
                              }
                            }
                          }
                          var0[var3 + 1] = var4;
                          field_h[var1][var3 - -1] = var5;
                          var2++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L6: {
                      L7: {
                        var3_float = (float)((field_f[var1][var2] & 16776188) >> -1813215184) / 255.0f;
                        var4_float = (float)((field_f[var1][var2] & 65454) >> 358527304) / 255.0f;
                        var5_float = (float)(255 & field_f[var1][var2]) / 255.0f;
                        var9 = 0;
                        if (var3_float <= var4_float) {
                          break L7;
                        } else {
                          if (var3_float > var5_float) {
                            var7 = var3_float;
                            if (var4_float <= var5_float) {
                              var6 = var4_float;
                              break L6;
                            } else {
                              var6 = var5_float;
                              break L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (var4_float <= var3_float) {
                          break L8;
                        } else {
                          if (var4_float <= var5_float) {
                            break L8;
                          } else {
                            L9: {
                              if (var3_float <= var5_float) {
                                var6 = var3_float;
                                break L9;
                              } else {
                                var6 = var5_float;
                                break L9;
                              }
                            }
                            var9 = 1;
                            var7 = var4_float;
                            break L6;
                          }
                        }
                      }
                      var7 = var5_float;
                      var9 = 2;
                      if (var4_float >= var3_float) {
                        var6 = var3_float;
                        break L6;
                      } else {
                        var6 = var4_float;
                        break L6;
                      }
                    }
                    L10: {
                      var8 = var7 - var6;
                      var10 = (var7 + var6) / 2.0f;
                      if (var10 >= 0.5f) {
                        var11 = var8 / (-var6 + (-var7 + 2.0f));
                        break L10;
                      } else {
                        var11 = var8 / (var7 + var6);
                        break L10;
                      }
                    }
                    L11: {
                      var13 = 0.1666666716337204f;
                      var14 = ((-var3_float + var7) * var13 + 0.5f * var8) / var8;
                      var15 = ((-var4_float + var7) * var13 + 0.5f * var8) / var8;
                      var16 = (var13 * (var7 - var5_float) + var8 * 0.5f) / var8;
                      if (var9 == 0) {
                        var12 = -var15 + var16;
                        break L11;
                      } else {
                        if (var9 == 1) {
                          var12 = -var16 + (0.3333333432674408f + var14);
                          break L11;
                        } else {
                          var12 = -var14 + (0.6666666865348816f + var15);
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var12 >= 0.0f) {
                        if (var12 <= 1.0f) {
                          break L12;
                        } else {
                          var12 = var12 - 1.0f;
                          break L12;
                        }
                      } else {
                        var12 = var12 + 1.0f;
                        break L12;
                      }
                    }
                    var0[var2] = (int)(var12 * 255.0f) << (int)(var11 * 255.0f) + 16 << 8 + (int)(255.0f * var10);
                    var2++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            sf.a(field_f[var0_int], 0, field_h[var0_int], 0, 7);
            var0_int++;
            continue L0;
          }
        }
    }
}
