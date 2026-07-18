/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class od extends ak {
    private ak field_Kb;
    static String field_Nb;
    static int field_Gb;
    static String field_Hb;
    int field_Jb;
    private ak[] field_Mb;
    private ak[] field_Lb;
    static String field_Fb;
    static String field_Eb;
    static String field_Ib;

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (((od) this).field_Lb.length <= var4) {
            ((od) this).field_Kb.a(param1, ((od) this).field_nb + -param1, 0, 256, ((od) this).field_K);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (var8 >= ((od) this).field_Mb.length) {
                return;
              } else {
                ((od) this).field_Mb[var8].a(param2, -(2 * param2) + ((od) this).field_Kb.field_nb, param2, 256, -(param2 * 2) + ((od) this).field_Kb.field_K);
                if (((od) this).field_Jb != var8) {
                  ((od) this).field_Mb[var8].field_D = ((od) this).field_Mb[var8].field_D + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = ((od) this).field_K * var4 / ((od) this).field_Lb.length;
            var6 = ((od) this).field_K * (var4 + 1) / ((od) this).field_Lb.length;
            ((od) this).field_Lb[var4].field_D = var5;
            ((od) this).field_Lb[var4].field_S = 0;
            ((od) this).field_Lb[var4].field_K = var6 - var5;
            ((od) this).field_Lb[var4].field_nb = param1;
            var4++;
            continue L0;
          }
        }
    }

    final static void a(int param0, we param1, int param2, cb param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            int var16 = 0;
            Object var17 = null;
            byte[][] var18 = null;
            String var19 = null;
            byte[][] var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            var14 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                var17 = (Object) (Object) new aj();
                ((aj) var17).field_s = param1.f(255);
                ((aj) var17).field_p = param1.k(0);
                ((aj) var17).field_r = new int[((aj) var17).field_s];
                ((aj) var17).field_q = new int[((aj) var17).field_s];
                ((aj) var17).field_l = new ei[((aj) var17).field_s];
                ((aj) var17).field_v = new ei[((aj) var17).field_s];
                ((aj) var17).field_w = new byte[((aj) var17).field_s][][];
                ((aj) var17).field_u = new int[((aj) var17).field_s];
                var5 = 0;
                L1: while (true) {
                  if (~var5 <= ~((aj) var17).field_s) {
                    ma.field_o.a(22125, (fa) var17);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param1.f(255);
                            if (var6_int == 0) {
                              break L4;
                            } else {
                              if (1 == var6_int) {
                                break L4;
                              } else {
                                if (var6_int != 2) {
                                  L5: {
                                    if (var6_int == 3) {
                                      break L5;
                                    } else {
                                      if (var6_int == 4) {
                                        break L5;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var19 = param1.h(5);
                                  var8 = param1.h(5);
                                  var9 = param1.f(255);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L6: while (true) {
                                    if (~var11_int <= ~var9) {
                                      L7: {
                                        var22 = new byte[var9][];
                                        var21 = var22;
                                        var20 = var21;
                                        var18 = var20;
                                        var11 = var18;
                                        if (3 == var6_int) {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (var9 <= var12_int) {
                                              break L7;
                                            } else {
                                              var13 = param1.k(0);
                                              var11[var12_int] = new byte[var13];
                                              param1.a(var22[var12_int], 0, -76, var13);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                      ((aj) var17).field_r[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var16 = 0;
                                      var13 = var16;
                                      L9: while (true) {
                                        if (var16 >= var9) {
                                          ((aj) var17).field_v[var5] = param3.a(0, var12, var8, i.a(var19, -115));
                                          ((aj) var17).field_w[var5] = var22;
                                          break L3;
                                        } else {
                                          var12[var16] = i.a(var10[var16], -113);
                                          var16++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param1.h(5);
                                      var11_int++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L10: {
                            var15 = param1.h(5);
                            var7 = var15;
                            var8 = param1.h(5);
                            var9 = 0;
                            if (var6_int != 1) {
                              break L10;
                            } else {
                              var9 = param1.k(0);
                              break L10;
                            }
                          }
                          ((aj) var17).field_r[var5] = var6_int;
                          ((aj) var17).field_q[var5] = var9;
                          ((aj) var17).field_l[var5] = param3.a(var8, i.a(var15, bn.a(-5, 121)), (byte) -94);
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((aj) var17).field_u[var5] = -1;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((aj) var17).field_u[var5] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        ((aj) var17).field_u[var5] = -5;
                        break L15;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_34_0 = (RuntimeException) var4;
                stackOut_34_1 = new StringBuilder().append("od.D(").append(-5).append(',');
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param1 == null) {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L16;
                } else {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "{...}";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  break L16;
                }
              }
              L17: {
                stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param2).append(',');
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if (param3 == null) {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "null";
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  break L17;
                } else {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "{...}";
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  break L17;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((od) this).field_S = param1;
        ((od) this).field_K = param3;
        ((od) this).field_nb = param4;
        ((od) this).field_D = param6;
        if (param0 != -19360) {
            field_Hb = null;
        }
        this.a(116, param5, param2);
    }

    od(long param0, ak param1, String[] param2, ak param3, ak[] param4, int param5) {
        super(param0, (ak) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        ak var9 = null;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            ((od) this).field_Lb = new ak[param2.length];
            ((od) this).field_Kb = new ak(0L, param3);
            ((od) this).field_Mb = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                ((od) this).a(((od) this).field_Kb, (byte) 26);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (param4.length <= var11) {
                    ((od) this).field_Jb = param5;
                    ((od) this).field_Lb[param5].field_U = true;
                    break L0;
                  } else {
                    ((od) this).field_Kb.a(param4[var11], (byte) 26);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new ak(0L, param1);
                var9.field_cb = param2[var8_int];
                ((od) this).field_Lb[var8_int] = var9;
                ((od) this).a(var9, (byte) 26);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var8;
            stackOut_9_1 = new StringBuilder().append("od.<init>(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param5 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        return param2 - -ok.a(tp.field_v, -120, -param2 + 1 - -param1);
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (((od) this).field_Lb.length <= var2) {
            L1: {
              if (param0 <= -87) {
                break L1;
              } else {
                field_Fb = null;
                break L1;
              }
            }
            return;
          } else {
            if (var2 != ((od) this).field_Jb) {
              if (((od) this).field_Lb[var2].field_P != 0) {
                ((od) this).field_Lb[((od) this).field_Jb].field_U = false;
                ((od) this).field_Mb[((od) this).field_Jb].field_D = ((od) this).field_Mb[((od) this).field_Jb].field_D + 10000;
                ((od) this).field_Jb = var2;
                ((od) this).field_Lb[var2].field_U = true;
                ((od) this).field_Mb[var2].field_D = ((od) this).field_Mb[var2].field_D - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static sn a(fm param0, int param1) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        sn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        sn stackOut_3_0 = null;
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
            var4 = param0.b(param1, -110);
            var3 = var4;
            if (var4 != null) {
              stackOut_3_0 = new sn(var4);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("od.B(");
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
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + -30805 + ')');
        }
        return stackIn_4_0;
    }

    public static void j() {
        field_Nb = null;
        field_Fb = null;
        field_Ib = null;
        field_Eb = null;
        field_Hb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = "Single-player game";
        field_Hb = "Close";
        field_Eb = "Quick Chat game";
        field_Fb = "Players: ";
        field_Ib = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
