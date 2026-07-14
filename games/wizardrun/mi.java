/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class mi extends ub implements bg {
    ub field_F;
    static ga field_z;
    static kl field_y;
    static kl field_E;
    static fl field_D;
    static String field_C;
    static wc[] field_B;
    static bh field_A;

    void a(int param0, int param1, int param2, ub param3) {
        super.a(param0 + 0, param1, param2, param3);
        if (((mi) this).field_F != null) {
            ((mi) this).field_F.a(10000536, param1 - -((mi) this).field_l, param2 + ((mi) this).field_o, param3);
        }
        if (param0 != 10000536) {
            Object var6 = null;
            boolean discarded$0 = this.b((ub) null, -77);
        }
    }

    StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        if (!(!((mi) this).a(param3, param0, param2, true))) {
            ((mi) this).a(124, param2, param0, param3);
            ((mi) this).a(param3, param2, param0, (byte) -84);
        }
        if (param1 != 102) {
            ((mi) this).a(81, -127, 4, 117);
        }
        return param3;
    }

    private final boolean a(ub param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 == 80) {
            break L0;
          } else {
            String discarded$2 = ((mi) this).c(false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((mi) this).field_F == null) {
              break L2;
            } else {
              if (((mi) this).field_F.d((byte) 53)) {
                break L2;
              } else {
                if (!((mi) this).field_F.a(param0, param1 ^ 88)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(ub param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 == -23023) {
            break L0;
          } else {
            field_E = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((mi) this).field_F == null) {
              break L2;
            } else {
              if (!((mi) this).field_F.d((byte) 53)) {
                break L2;
              } else {
                if (!((mi) this).field_F.a(param0, param1 + 0, param2, param3, param4, param5, param6)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(ub param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == 8) {
          L0: {
            L1: {
              if (null == ((mi) this).field_F) {
                break L1;
              } else {
                if (!((mi) this).field_F.a(param0, 8)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public static void a(int param0) {
        field_A = null;
        field_z = null;
        field_E = null;
        field_C = null;
        field_B = null;
        field_D = null;
        field_y = null;
        if (param0 != -4) {
            field_E = null;
        }
    }

    final static void a(int param0, va param1, vh param2, int param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
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
            String var16 = null;
            int var17 = 0;
            pk var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var14 = wizardrun.field_H;
              var18 = new pk();
              if (param0 == -21284) {
                break L0;
              } else {
                field_z = null;
                break L0;
              }
            }
            var18.field_r = param1.f(255);
            var18.field_i = param1.i(255);
            var18.field_l = new jh[var18.field_r];
            var18.field_k = new byte[var18.field_r][][];
            var18.field_m = new jh[var18.field_r];
            var18.field_p = new int[var18.field_r];
            var18.field_t = new int[var18.field_r];
            var18.field_j = new int[var18.field_r];
            var5 = 0;
            L1: while (true) {
              if (var18.field_r <= var5) {
                var6_ref4 = decompiledCaughtException;
                var18.field_j[var5] = -5;
                var5++;
              } else {
                try {
                  L2: {
                    L3: {
                      var6_int = param1.f(255);
                      if (var6_int == 0) {
                        break L3;
                      } else {
                        if (1 == var6_int) {
                          break L3;
                        } else {
                          if ((var6_int ^ -1) == -3) {
                            break L3;
                          } else {
                            L4: {
                              if (var6_int == 3) {
                                break L4;
                              } else {
                                if (4 == var6_int) {
                                  break L4;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                            }
                            var20 = param1.d(param0 ^ -21284);
                            var8 = param1.d(0);
                            var9 = param1.f(255);
                            var10 = new String[var9];
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var23 = new byte[var9][];
                                  var22 = var23;
                                  var21 = var22;
                                  var19 = var21;
                                  var11 = var19;
                                  if (var6_int == 3) {
                                    var12_int = 0;
                                    L7: while (true) {
                                      if (var12_int >= var9) {
                                        break L6;
                                      } else {
                                        var13 = param1.i(255);
                                        var11[var12_int] = new byte[var13];
                                        param1.a(true, var13, var23[var12_int], 0);
                                        var12_int++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                                var18.field_t[var5] = var6_int;
                                var12 = new Class[var9];
                                var17 = 0;
                                var13 = var17;
                                L8: while (true) {
                                  if (var9 <= var17) {
                                    var18.field_m[var5] = param2.a(var8, var12, qc.a(var20, (byte) -39), 3617);
                                    var18.field_k[var5] = var23;
                                    var5++;
                                    break L2;
                                  } else {
                                    var12[var17] = qc.a(var10[var17], (byte) -39);
                                    var17++;
                                    continue L8;
                                  }
                                }
                              } else {
                                var10[var11_int] = param1.d(0);
                                var11_int++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      var15 = param1.d(0);
                      var16 = param1.d(0);
                      var8 = param1.d(0);
                      var9 = 0;
                      if (1 != var6_int) {
                        break L9;
                      } else {
                        var9 = param1.i(255);
                        break L9;
                      }
                    }
                    var18.field_t[var5] = var6_int;
                    var18.field_p[var5] = var9;
                    var18.field_l[var5] = param2.a(-8024, qc.a(var15, (byte) -39), var16);
                    break L2;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var18.field_j[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var18.field_j[var5] = -4;
                  var5++;
                }
                continue L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int e(byte param0) {
        if (param0 <= 23) {
            Object var3 = null;
            boolean discarded$0 = this.a((ub) null, (byte) 92);
        }
        return null == ((mi) this).field_F ? 0 : ((mi) this).field_F.e((byte) 112);
    }

    final boolean d(byte param0) {
        if (param0 != 53) {
            Object var3 = null;
            boolean discarded$0 = ((mi) this).a('i', 63, (byte) -120, (ub) null);
        }
        return ((mi) this).a((byte) -112) != null ? true : false;
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = wizardrun.field_H;
        if (!wd.a((byte) 43, param0, param1)) {
            return false;
        }
        for (var3 = param2; param0.length() > var3; var3++) {
            if (!(df.a(param0.charAt(var3), true))) {
                return false;
            }
        }
        return true;
    }

    void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        if (!(null == ((mi) this).field_F)) {
            ((mi) this).field_F.a(((mi) this).field_o + param0, param1, param2 + ((mi) this).field_l, param3, param4, 0);
        }
        if (param5 != 0) {
            ((mi) this).e(14);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == 0) {
            if (null != ((mi) this).field_w) {
                ((mi) this).field_w.a(param0, param3, (ub) this, true, true);
            }
        }
        if (((mi) this).field_F != null) {
            ((mi) this).field_F.a(param0 - -((mi) this).field_o, 0, param2, param3 - -((mi) this).field_l);
        }
        if (param1 != 0) {
            int discarded$0 = ((mi) this).e((byte) 12);
        }
    }

    String c(boolean param0) {
        String var3 = null;
        String var2 = super.c(param0);
        if (!(null == ((mi) this).field_F)) {
            var3 = ((mi) this).field_F.c(false);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final static void d(int param0) {
        if (param0 != 3) {
            field_y = null;
        }
    }

    void e(int param0) {
        if (!(((mi) this).field_F == null)) {
            ((mi) this).field_F.c(117);
        }
        if (param0 != 81) {
            field_A = null;
        }
    }

    private final boolean b(ub param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 > 53) {
            break L0;
          } else {
            field_z = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((mi) this).field_F) {
              break L2;
            } else {
              if (((mi) this).field_F.d((byte) 53)) {
                break L2;
              } else {
                if (!((mi) this).field_F.a(param0, 8)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var8 = -3 % ((12 - param1) / 36);
            if (null == ((mi) this).field_F) {
              break L1;
            } else {
              if (!((mi) this).field_F.a(param0 + ((mi) this).field_o, (byte) -64, param2, ((mi) this).field_l + param3, param4, param5, param6)) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        if (param2 >= -96) {
            Object var6 = null;
            StringBuilder discarded$0 = ((mi) this).a((Hashtable) null, (byte) -43, -30, (StringBuilder) null);
        }
        if (((mi) this).field_F != null) {
            if (((mi) this).field_F.d((byte) 53)) {
                if (((mi) this).field_F.a(param0, param1, (byte) -101, param3)) {
                    return true;
                }
            }
        }
        int var5 = param1;
        if ((var5 ^ -1) == -81) {
            return hi.field_p[81] ? this.b(param3, 125) : this.a(param3, (byte) 80);
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(123, param1, param2, param3, param4);
        if (param0 < 108) {
            field_B = null;
        }
        ((mi) this).e(81);
    }

    final void b(boolean param0) {
        if (!(((mi) this).field_F == null)) {
            ((mi) this).field_F.b(false);
        }
        if (param0) {
            field_B = null;
        }
    }

    ub a(byte param0) {
        ub var2 = ((mi) this).field_F;
        if (param0 > -29) {
            Object var3 = null;
            boolean discarded$0 = ((mi) this).a(-35, (byte) -44, -59, -12, 44, -70, (ub) null);
        }
        if (var2 == null) {
            return null;
        }
        if (!var2.d((byte) 53)) {
            return null;
        }
        return var2;
    }

    final void a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var6 = 0;
        int var7 = wizardrun.field_H;
        StringBuilder discarded$0 = param0.append(10);
        int var5 = 66 / ((13 - param3) / 44);
        for (var6 = 0; param1 >= var6; var6++) {
            StringBuilder discarded$1 = param0.append(32);
        }
        if (((mi) this).field_F == null) {
            StringBuilder discarded$3 = param0.append("null");
        } else {
            StringBuilder discarded$4 = ((mi) this).field_F.a(param2, (byte) 102, 1 + param1, param0);
        }
    }

    mi(int param0, int param1, int param2, int param3, bf param4, ce param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new ga();
        field_C = "Unable to connect to the data server. Please check any firewall you are using.";
        field_A = new bh(10, 2, 2, 0);
    }
}
