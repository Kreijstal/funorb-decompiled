/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nd extends ao {
    private int[] field_A;
    private int[] field_I;
    int field_K;
    static tv field_B;
    private int field_D;
    private int[] field_J;
    static int field_F;
    static String field_G;
    private int field_C;
    private int field_E;

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int var5 = 0;
        if (super.a(param0, param1, (byte) 19, param3)) {
          return true;
        } else {
          var5 = param3;
          if (var5 == 98) {
            return ((nd) this).a((byte) -128, param0, ((nd) this).field_A.length);
          } else {
            if (99 == var5) {
              return ((nd) this).a(param0, (byte) -99, ((nd) this).field_A.length);
            } else {
              if ((var5 ^ -1) == -97) {
                return ((nd) this).b(param0, (byte) 113);
              } else {
                if (97 == var5) {
                  return ((nd) this).a((byte) -17, param0);
                } else {
                  if (param2 >= 9) {
                    return false;
                  } else {
                    ((nd) this).field_A = null;
                    return false;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, int[] param1) {
        int var8 = Sumoblitz.field_L ? 1 : 0;
        int var3 = null == ((nd) this).field_A ? 0 : ((nd) this).field_A.length;
        if (param0 != 50) {
            return;
        }
        int var4 = param1.length;
        ((nd) this).field_A = param1;
        int[] var5 = param1;
        int var6 = 0;
        int var7 = 0;
        while (var6 < var5.length) {
            var7 = var7 + var5[var6];
            var5[var6] = var7 + var5[var6];
            var6++;
        }
        this.b(-1, var4, var3);
        this.d(var4, 0, var3);
    }

    nd(int param0, int param1, int param2, int param3, mh param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        ((nd) this).field_K = 92;
        ((nd) this).field_D = 0;
        int[] var10 = new int[param5];
        int[] var8 = var10;
        la.a(var10, 0, param5, 1);
        int[] var9 = new int[param6];
        la.a(var9, 0, param6, 1);
        this.a((byte) 50, var10);
        this.a(-7170, var9);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(121, param1, param2, param3, param4);
        int var6 = -72 % ((param0 - 28) / 63);
    }

    final static byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        fs var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new fs(param1);
                    var3 = var9.e(-31302);
                    var4 = var9.c(true);
                    if (0 > var4) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (-1 == (bn.field_R ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (bn.field_R >= var4) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    throw new RuntimeException();
                }
                case 5: {
                    if ((var3 ^ -1) != param0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var16 = new byte[var4];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.a(var16, var4, 0, (byte) -119);
                    return var5_ref_byte__;
                }
                case 7: {
                    var5 = var9.c(true);
                    if (-1 < (var5 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (bn.field_R == 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (bn.field_R >= var5) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    throw new RuntimeException();
                }
                case 12: {
                    var17 = new byte[var5];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (-2 == (var3 ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var7 = (Object) (Object) sb.field_b;
                    // monitorenter sb.field_b
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        sb.field_b.a(var17, (byte) -104, var9);
                        // monitorexit var7
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) var8;
                }
                case 18: {
                    int discarded$1 = w.a(var17, var5, param1, var4, 9);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = ((nd) this).field_A == null ? 0 : ((nd) this).field_A.length;
        int[] var5 = new int[var4 * param1];
        int var6 = -78 % ((param0 - 0) / 59);
        if (((nd) this).field_I != null) {
            if (-1 > (((nd) this).field_I.length ^ -1)) {
                if ((var5.length ^ -1) < -1) {
                    if (!(param2 <= 0)) {
                        la.a(((nd) this).field_I, 0, var5, 0, Math.min(param2, param1) * var4);
                    }
                }
            }
        }
        ((nd) this).field_I = var5;
    }

    final void c(int param0, int param1, int param2) {
        ((nd) this).field_E = param2;
        if (param0 != -1) {
            return;
        }
        ((nd) this).field_C = param1;
    }

    final static boolean a(byte param0, boolean param1) {
        try {
            pl var4 = null;
            pl var5 = null;
            if (!(tm.field_a != null)) {
                tm.field_a = jt.field_t.a((byte) 71, mc.field_C, vp.field_a);
            }
            if (param0 > -33) {
                boolean discarded$0 = nd.a((byte) 116, false);
            }
            if (!(tm.field_a.field_c != 0)) {
                return false;
            }
            rj.field_a = wq.a(-38);
            jt.field_x = wq.a(-38);
            if ((tm.field_a.field_c ^ -1) != -2) {
                kw.field_c = lr.field_b;
            } else {
                try {
                    qk.field_O = new dt((java.net.Socket) tm.field_a.field_d, jt.field_t);
                    var4 = ig.field_a;
                    var5 = var4;
                    as.field_v.field_p = 0;
                    var5.field_p = 0;
                    li.field_r = param1 ? -2 : -1;
                    vb.field_I = param1 ? -2 : -1;
                    ur.field_Q = param1 ? -2 : -1;
                    kw.field_c = gg.field_t;
                    sb.a(s.field_o, 81, jt.field_r, ql.field_v, (fs) (Object) as.field_v);
                    gt.a(0, -1);
                } catch (IOException iOException) {
                    kw.field_c = lr.field_b;
                }
            }
            tm.field_a = null;
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        field_B = null;
        if (param0 != -16099) {
            return;
        }
        field_G = null;
    }

    private final void d(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        int var4 = null == ((nd) this).field_J ? 0 : ((nd) this).field_J.length;
        int[] var5 = new int[param0 * var4];
        if (null != ((nd) this).field_I) {
            if (0 < ((nd) this).field_I.length) {
                if (-1 > (var5.length ^ -1)) {
                    if (!(0 >= param2)) {
                        for (var6 = 0; var6 < var4; var6++) {
                            la.a(((nd) this).field_I, var6 * param2, var5, param0 * var6, Math.min(param2, param0));
                        }
                    }
                }
            }
        }
        ((nd) this).field_I = var5;
        if (param1 != 0) {
            this.a((byte) -53, 3, -113);
        }
    }

    final void e(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pk var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= ((nd) this).field_x.length) {
              break L1;
            } else {
              if (var3 >= ((nd) this).field_J.length) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var2 < ((nd) this).field_x.length) {
                    if (var4 < ((nd) this).field_A.length) {
                      var2++;
                      var5 = ((nd) this).field_x[var2];
                      if (var5 != null) {
                        this.a(var5, var4, 0, var3);
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            }
          }
          L3: {
            if (!param0) {
              break L3;
            } else {
              ((nd) this).field_K = -124;
              break L3;
            }
          }
          return;
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        int var4 = ((nd) this).field_J != null ? ((nd) this).field_J.length : 0;
        pk[] var5 = new pk[param1 * var4];
        if (null != ((nd) this).field_x) {
            if (((nd) this).field_x.length > 0) {
                if ((var5.length ^ -1) < -1) {
                    if (0 < param2) {
                        for (var6 = 0; var6 < var4; var6++) {
                            la.a((Object[]) (Object) ((nd) this).field_x, param2 * var6, (Object[]) (Object) var5, param1 * var6, Math.min(param2, param1));
                        }
                    }
                }
            }
        }
        ((nd) this).field_x = var5;
        if (param0 != -1) {
            Object var8 = null;
            ((nd) this).a(-101, 118, (pk) null);
        }
    }

    final void a(int param0, int param1, pk param2) {
        int var4 = ((nd) this).field_D % ((nd) this).field_A.length;
        int var5 = ((nd) this).field_D / ((nd) this).field_A.length;
        ((nd) this).field_I[((nd) this).field_D] = param0;
        ((nd) this).field_x[((nd) this).field_D] = param2;
        if (param1 != 0) {
            ((nd) this).field_A = null;
        }
        if (param2 != null) {
            this.a(param2, var4, 0, var5);
        }
        ((nd) this).field_D = ((nd) this).field_D + 1;
    }

    private final void a(int param0, int[] param1) {
        int var8 = Sumoblitz.field_L ? 1 : 0;
        int var3 = ((nd) this).field_J != null ? ((nd) this).field_J.length : 0;
        int var4 = param1.length;
        ((nd) this).field_J = param1;
        int[] var5 = param1;
        int var6 = 0;
        int var7 = 0;
        while (var6 < var5.length) {
            var7 = var7 + var5[var6];
            var5[var6] = var7 + var5[var6];
            var6++;
        }
        this.e(var4, var3, param0 ^ param0);
        this.a((byte) 87, var4, var3);
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 > -42) {
            Object var9 = null;
            boolean discarded$0 = ((nd) this).a((pk) null, 107, -24, -6, 81, 67, -125);
        }
        return super.a(param0, -77, param2, param3, param4, param5, param6);
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = ((nd) this).field_A == null ? 0 : ((nd) this).field_A.length;
        pk[] var5 = new pk[param0 * var4];
        if (((nd) this).field_x != null) {
            if (-1 > ((nd) this).field_x.length) {
                if (0 < var5.length) {
                    if (-1 < param1) {
                        la.a((Object[]) (Object) ((nd) this).field_x, 0, (Object[]) (Object) var5, 0, var4 * Math.min(param1, param0));
                    }
                }
            }
        }
        if (param2 != 0) {
            this.d(-38, 89, 107);
        }
        ((nd) this).field_x = var5;
    }

    private final void a(pk param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        L0: {
          var20 = Sumoblitz.field_L ? 1 : 0;
          var5 = ((nd) this).field_A[((nd) this).field_A.length - 1];
          var6 = ((nd) this).field_J[((nd) this).field_J.length - 1];
          if (param2 >= param1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((nd) this).field_A[param1 - 1];
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0 * ((nd) this).field_q / var5;
          stackOut_3_0 = ((nd) this).field_p;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 >= param3) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = ((nd) this).field_J[param3 - 1];
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          L3: {
            var8 = stackIn_6_0 * stackIn_6_1 / var6;
            var9 = ((nd) this).field_A[param1] * ((nd) this).field_q / var5;
            var10 = ((nd) this).field_J[param3] * ((nd) this).field_p / var6;
            var11 = param3 * ((nd) this).field_A.length + param1;
            var12 = ((nd) this).field_I[var11] & 48;
            var13 = 192 & ((nd) this).field_I[var11];
            var14 = param0.field_r;
            var15 = param0.field_v;
            var16 = param0.field_q;
            var17 = param0.field_p;
            if (var9 - var7 <= var16) {
              break L3;
            } else {
              if ((((nd) this).field_I[var11] & 1) == 0) {
                break L3;
              } else {
                var14 = var7;
                var16 = -var7 + var9;
                break L2;
              }
            }
          }
          L4: {
            if (-var7 + var9 >= var16) {
              break L4;
            } else {
              if (0 != (((nd) this).field_I[var11] & 4)) {
                var14 = var7;
                var16 = -var7 + var9;
                break L2;
              } else {
                break L4;
              }
            }
          }
          if (16 != var12) {
            if (var12 == 32) {
              var14 = -var16 + var9;
              break L2;
            } else {
              var14 = var7;
              break L2;
            }
          } else {
            var14 = -var16 + var9 + var7 >> -1432529631;
            break L2;
          }
        }
        L5: {
          L6: {
            if (var10 + -var8 <= var17) {
              break L6;
            } else {
              if (0 == (((nd) this).field_I[var11] & 2)) {
                break L6;
              } else {
                var17 = var10 - var8;
                var15 = var8;
                break L5;
              }
            }
          }
          L7: {
            if (-var8 + var10 >= var17) {
              break L7;
            } else {
              if ((8 & ((nd) this).field_I[var11]) != 0) {
                var15 = var8;
                var17 = var10 - var8;
                break L5;
              } else {
                break L7;
              }
            }
          }
          if (var13 == -65) {
            var15 = -var17 + (var10 + var8) >> 2092670625;
            break L5;
          } else {
            if (-129 != var13) {
              var15 = var8;
              break L5;
            } else {
              var15 = -var17 + var10;
              break L5;
            }
          }
        }
        var18 = ((nd) this).field_E;
        var19 = ((nd) this).field_C;
        param0.a(-89, var14 - -var18, var19 + var15, var17 + -(2 * var19), -(2 * var18) + var16);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Error connecting to server. Please try using a different server.";
    }
}
