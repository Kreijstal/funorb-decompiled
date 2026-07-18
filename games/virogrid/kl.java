/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kl extends fd implements ta {
    private String[] field_H;
    private tg[] field_F;
    private fc field_G;
    static int field_E;

    final static void a(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        dh var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (dh) (Object) bl.field_D.a((byte) -99);
              if (param0 <= -18) {
                break L1;
              } else {
                field_E = 67;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                int discarded$4 = 7;
                gl.a(var4, (byte) 111);
                var4 = (dh) (Object) bl.field_D.a(16213);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "kl.A(" + param0 + ',' + 7 + ')');
        }
    }

    final void a(String[] param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        ti var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 >= 13) {
              L1: {
                ((kl) this).field_z.a(false);
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0.length != 0) {
                    var3_int = param0.length;
                    ((kl) this).field_H = new String[var3_int];
                    var4_int = 0;
                    L2: while (true) {
                      if (var3_int <= var4_int) {
                        var4 = new ti(dj.field_h, 0, 1);
                        ((kl) this).field_F = new tg[1 + var3_int];
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= var3_int) {
                            ((kl) this).field_F[var3_int] = new tg(rj.field_i, (cd) this);
                            ((kl) this).field_F[var3_int].field_w = (ol) (Object) var4;
                            ((kl) this).field_F[var3_int].a(15, true, 20 - (-(var3_int * 16) + -16), 0, 100);
                            ((kl) this).a((fi) (Object) ((kl) this).field_F[var3_int], (byte) -78);
                            break L0;
                          } else {
                            ((kl) this).field_F[var5] = new tg(((kl) this).field_H[var5], (cd) this);
                            ((kl) this).field_F[var5].field_w = (ol) (Object) var4;
                            ((kl) this).field_F[var5].field_h = jj.field_i;
                            ((kl) this).field_F[var5].a(15, true, 20 + 16 * var5, 0, 80);
                            ((kl) this).a((fi) (Object) ((kl) this).field_F[var5], (byte) -78);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        ((kl) this).field_H[var4_int] = ji.a(11, (CharSequence) (Object) param0[var4_int]).replace(' ', ' ');
                        var4_int++;
                        continue L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              ((kl) this).field_H = null;
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("kl.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
    }

    final static void a(jc param0) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3 = 0;
            int var4_int = 0;
            Exception var4 = null;
            int var5 = 0;
            int var6 = 0;
            byte[] var7 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            var6 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  var7 = new byte[24];
                  var2 = var7;
                  var3 = -2;
                  if (null == gh.field_Ib) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        gh.field_Ib.a(0L, 0);
                        gh.field_Ib.a((byte) -102, var7);
                        var4_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var4_int >= 24) {
                              break L4;
                            } else {
                              if (0 == var2[var4_int]) {
                                var4_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (var4_int < 24) {
                            break L2;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        var5 = 0;
                        L6: while (true) {
                          if (var5 >= 24) {
                            break L5;
                          } else {
                            var2[var5] = (byte) -1;
                            var5++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
                param0.a(var2, 24, 0, (byte) 41);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_15_0 = (RuntimeException) runtimeException;
                stackOut_15_1 = new StringBuilder().append("kl.B(");
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param0 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L7;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L7;
                }
              }
              throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + 111 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
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
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 12085) {
                break L1;
              } else {
                int discarded$3 = 7;
                kl.a((byte) 103);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (((kl) this).field_H.length <= var6_int) {
                L3: {
                  if (param1 == ((kl) this).field_F[((kl) this).field_H.length]) {
                    ((kl) this).field_G.a((byte) -72);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (((kl) this).field_F[var6_int] == param1) {
                    ((kl) this).field_G.a(((kl) this).field_H[var6_int], false);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("kl.L(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    kl(fc param0) {
        super(0, 0, 0, 0, (ol) null);
        try {
            ((kl) this).field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "kl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(param3 == 0)) {
            return;
        }
        e var5 = dj.field_h;
        if (((kl) this).field_H != null) {
            int discarded$0 = var5.a(bg.field_Pb, ((kl) this).field_l + param1, param2 - -((kl) this).field_u, ((kl) this).field_g, 20, 16777215, -1, 0, 0, var5.field_G + var5.field_H);
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, -118)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 == 98) {
                stackOut_6_0 = ((kl) this).b(2, param0);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var5_int = 4 / ((param3 - -75) / 36);
                if (param2 == 99) {
                  stackOut_10_0 = ((kl) this).a(-16234, param0);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("kl.AA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = 10;
    }
}
