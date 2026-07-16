/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oc extends fl {
    static String[] field_r;
    int[] field_C;
    boolean field_B;
    private boolean field_s;
    static boolean field_t;
    static String field_v;
    int[] field_y;
    int[] field_x;
    boolean field_q;
    private int field_F;
    static mf field_D;
    int[] field_A;
    int[] field_w;
    private int field_G;
    boolean[] field_E;
    static int field_u;
    static String[] field_z;

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        var4 = 2147483647;
        var5 = -2147483648;
        var6 = 2147483647;
        var7 = -2147483648;
        var8 = 0;
        L0: while (true) {
          if (var8 >= ((oc) this).field_F) {
            L1: {
              if (param0 >= 79) {
                break L1;
              } else {
                this.a(126, 35, 57, -87, -120, 87);
                break L1;
              }
            }
            if (var4 >= var5) {
              return;
            } else {
              if (var7 > var6) {
                var8 = var5 + -var4;
                this.a(var8, var6, 58, var5, var7, var4);
                this.a(var6, var4, 26, var8);
                this.f(19507);
                this.b(var6, -641, var8, param2, var4, param1);
                return;
              } else {
                return;
              }
            }
          } else {
            L2: {
              if (((oc) this).field_E == null) {
                break L2;
              } else {
                if (((oc) this).field_E[var8]) {
                  break L2;
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
            L3: {
              var9 = ((oc) this).field_x[var8] >> 847905904;
              if (var9 - 2 < var4) {
                var4 = -2 + var9;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var5 >= var9 - -3) {
                break L4;
              } else {
                var5 = 3 + var9;
                break L4;
              }
            }
            L5: {
              var10 = ((oc) this).field_A[var8] >> -73771984;
              if (-2 + var10 >= var6) {
                break L5;
              } else {
                var6 = var10 - 2;
                break L5;
              }
            }
            if (var7 < var10 - -3) {
              var7 = var10 + 3;
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    private final void d(int param0, int param1) {
        ((oc) this).field_w = new int[param0];
        ((oc) this).field_A = new int[param0];
        ((oc) this).field_y = new int[param0];
        if (param1 != 0) {
            return;
        }
        ((oc) this).field_x = new int[param0];
        ((oc) this).field_C = new int[param0];
    }

    final void a() {
        int var1 = 0;
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((oc) this).field_F) {
            if (((oc) this).field_s) {
              return;
            } else {
              ((oc) this).field_G = ((oc) this).field_G + 3;
              return;
            }
          } else {
            L1: {
              if (((oc) this).field_E == null) {
                break L1;
              } else {
                if (((oc) this).field_E[var1]) {
                  break L1;
                } else {
                  var1++;
                  continue L0;
                }
              }
            }
            L2: {
              ((oc) this).i(var1);
              var2 = (double)((oc) this).field_y[var1];
              var4 = (double)((oc) this).field_C[var1];
              var6 = (double)((oc) this).field_w[var1];
              var8 = 1.0 - 0.000002 * Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
              if (var8 >= 0.5) {
                break L2;
              } else {
                var8 = 0.5;
                break L2;
              }
            }
            var2 = var2 * var8;
            var4 = var4 * var8;
            var6 = var6 * var8;
            ((oc) this).field_y[var1] = (int)var2;
            ((oc) this).field_C[var1] = (int)var4;
            ((oc) this).field_w[var1] = (int)var6;
            var1++;
            continue L0;
          }
        }
    }

    final void f(byte param0) {
        int var3 = EscapeVector.field_A;
        int var2 = 0;
        if (param0 > -124) {
            return;
        }
        while (var2 < ((oc) this).field_F) {
            ((oc) this).field_E[var2] = false;
            var2++;
        }
    }

    private final boolean b(int param0, int param1) {
        int var9 = 0;
        int var10 = 0;
        int[][] var3 = ma.field_a.field_V;
        int var4 = ma.field_a.field_Mb;
        int[] var5 = si.field_v;
        param0 = param0 >> 16;
        param1 = param1 >> 16;
        int var6 = param0 >> 5;
        int var7 = param1 >> 5;
        if (var7 < 0) {
            return false;
        }
        int[] var8 = var5;
        if (var7 < ma.field_a.field_D) {
            while (var6 < 0) {
                var6 = var6 + var4;
            }
            var6 = var6 % var4;
            var8 = var3[var7 * var4 + var6];
            if (var8 == null) {
                return false;
            }
        }
        if (var8 != var5) {
            var9 = param0 & 31;
            var10 = param1 & 31;
            if ((var8[var10] & 1 << var9) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void h(int param0) {
        field_z = null;
        field_D = null;
        field_r = null;
        if (param0 <= 66) {
            java.applet.Applet discarded$0 = oc.d((byte) 25);
        }
        field_v = null;
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        te var8 = null;
        te var9 = null;
        Exception var9_ref = null;
        int var10 = 0;
        te stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        te stackOut_7_0 = null;
        te stackOut_6_0 = null;
        var10 = EscapeVector.field_A;
        var7 = -param5 + param4;
        L0: while (true) {
          if (-param2 >= var7) {
            L1: {
              if (param1 == -641) {
                break L1;
              } else {
                this.e(-1, -98);
                break L1;
              }
            }
            L2: {
              var7 = var7 + ma.field_a.field_n;
              if (((oc) this).field_q) {
                stackOut_7_0 = gi.field_c;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = rl.field_k;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var8 = stackIn_8_0;
            try {
              L3: {
                var9 = this.e((byte) 96);
                L4: while (true) {
                  if (-641 >= (var7 ^ -1)) {
                    break L3;
                  } else {
                    L5: {
                      var8.a(var7, param0 + -param3);
                      if (var9 != null) {
                        var9.a(var7, -param3 + param0);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var7 = var7 + ma.field_a.field_n;
                    continue L4;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L6: {
                var9_ref = (Exception) (Object) decompiledCaughtException;
                System.out.println("Error");
                break L6;
              }
            }
            return;
          } else {
            var7 = var7 - ma.field_a.field_n;
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = EscapeVector.field_A;
          if (param2 > 8) {
            break L0;
          } else {
            var12 = null;
            this.a(-110, (te) null, (te) null);
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          if (var5 >= ((oc) this).field_F) {
            return;
          } else {
            L2: {
              if (null == ((oc) this).field_E) {
                break L2;
              } else {
                if (((oc) this).field_E[var5]) {
                  break L2;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
            var6 = ((oc) this).field_x[var5] >> -443579536;
            var7 = ((oc) this).field_A[var5] >> -1919885840;
            var6 = var6 - param1;
            var7 = var7 - param0;
            var8 = var7 * param3 + var6;
            var9 = 4096 - ((oc) this).field_G * 16 >> 1443292584;
            kh.a((byte) 99, var9, var8);
            var10 = 14 * var9 >> 51557412;
            kh.a((byte) -101, var10, -1 + var8);
            kh.a((byte) -127, var10, var8 - -1);
            kh.a((byte) -113, var10, -param3 + var8);
            kh.a((byte) -108, var10, var8 + param3);
            var10 = var9 * 12 >> -1763205340;
            kh.a((byte) -84, var10, -1 + (-param3 + var8));
            kh.a((byte) 117, var10, 1 + (var8 + -param3));
            kh.a((byte) 50, var10, var8 + param3 + -1);
            kh.a((byte) -47, var10, 1 + (var8 + param3));
            var9 = var9 >> 1;
            kh.a((byte) -103, var9, var8 - 2);
            kh.a((byte) 78, var9, var8 + 2);
            kh.a((byte) 79, var9, -(param3 * 2) + var8);
            var10 = var9 * 5 >> 463154691;
            kh.a((byte) 36, var9, var8 - -(param3 * 2));
            kh.a((byte) -69, var10, var8 - param3 + -2);
            kh.a((byte) 23, var10, -2 + var8 + param3);
            kh.a((byte) 61, var10, var8 - param3 - -2);
            kh.a((byte) 88, var10, 2 + var8 - -param3);
            kh.a((byte) 65, var10, var8 - (param3 * 2 + 1));
            kh.a((byte) 55, var10, -(param3 * 2) + var8 + 1);
            kh.a((byte) -114, var10, -1 + 2 * param3 + var8);
            kh.a((byte) 119, var10, 1 + var8 - -(2 * param3));
            var5++;
            continue L1;
          }
        }
    }

    final static void a(int param0, byte param1, cc param2) {
        if (param1 != -107) {
            field_t = true;
        }
        vn.field_e.a(-12328, (hg) (Object) param2);
        hg.a(-97, param0, param2);
    }

    private final void g(byte param0) {
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        int var3 = 118 / ((param0 - -12) / 57);
        for (var2 = 0; (var2 ^ -1) > -257; var2++) {
            var4 = -(var2 * var2) + 512 * var2 >> -128090296;
            var5 = var2;
            var6 = var2 * var2 >> 388483624;
            if (!(var2 >= 128)) {
                var6 = var6 + (var2 * 128 - var2 * var2 >> 408616005);
            }
            rl.field_k.field_l[var2] = lb.a(lb.a(var4 << 1286060432, var5 << 1160333672), var6);
        }
    }

    private final void a(int param0, te param1, te param2) {
        param2.field_a = param1.field_a;
        param2.field_g = param1.field_g;
        if (param0 <= 53) {
            this.f(32);
        }
        param2.field_d = param1.field_d;
        param2.field_h = param1.field_h;
    }

    private final boolean c(int param0, int param1) {
        int var3 = 0;
        sa var4 = null;
        ed var5 = null;
        int var6 = 0;
        int var7 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ma.field_a.field_kb.size()) {
            return false;
          } else {
            var4 = (sa) ma.field_a.field_kb.elementAt(var3);
            var5 = var4.field_i;
            var6 = var4.field_g + var5.field_v;
            if (param1 >= var6) {
              if (param1 < var6 + var5.field_x) {
                var7 = var4.field_k + var5.field_q;
                L1: while (true) {
                  if (var7 >= param0) {
                    L2: while (true) {
                      if (var7 <= param0) {
                        if (param0 < var7 + var5.field_s) {
                          if (var5.field_B[(param1 - var6) * var5.field_s + (param0 - var7)] != 0) {
                            return true;
                          } else {
                            var3++;
                            continue L0;
                          }
                        } else {
                          var3++;
                          continue L0;
                        }
                      } else {
                        var7 = var7 - ma.field_a.field_n;
                        continue L2;
                      }
                    }
                  } else {
                    var7 = var7 + ma.field_a.field_n;
                    continue L1;
                  }
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

    final static void a(byte param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        param1.addKeyListener((java.awt.event.KeyListener) (Object) ck.field_v);
        if (param0 != -38) {
            return;
        }
        param1.addFocusListener((java.awt.event.FocusListener) (Object) ck.field_v);
    }

    private final void e(int param0, int param1) {
        int[] var11 = null;
        int var9 = 0;
        int var3 = ma.field_a.field_Mb;
        int[] var4 = si.field_v;
        param0 = param0 >> 16;
        param1 = param1 >> 16;
        if (this.c(param0, param1)) {
            return;
        }
        int var5 = param0 >> 5;
        int var6 = param1 >> 5;
        if (var6 < 0) {
            return;
        }
        ma.field_a.D(var6);
        while (var5 < 0) {
            var5 = var5 + var3;
        }
        var5 = var5 % var3;
        if (ma.field_a.field_eb != null) {
            ma.field_a.field_eb.a(var5, var6, true);
        }
        int[][] var7 = ma.field_a.field_V;
        int[] var8 = var7[var6 * var3 + var5];
        if (var8 == null) {
            return;
        }
        if (var8 == var4) {
            var11 = new int[32];
            var8 = var11;
            var7[var6 * var3 + var5] = new int[32];
            for (var9 = 0; var9 < 32; var9++) {
                var11[var9] = -1;
            }
        }
        var9 = param0 & 31;
        int var10 = param1 & 31;
        var8[var10] = var8[var10] & (1 << var9 ^ -1);
    }

    final static java.applet.Applet d(byte param0) {
        if (param0 >= -58) {
            Object var2 = null;
            oc.a(56, (byte) 48, (cc) null);
        }
        if (!(null == bb.field_P)) {
            return bb.field_P;
        }
        return (java.applet.Applet) (Object) he.field_r;
    }

    final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        L0: {
          L1: {
            var2 = ((oc) this).field_x[param0];
            var3 = ((oc) this).field_A[param0];
            var4 = ((oc) this).field_y[param0];
            var5 = ((oc) this).field_C[param0];
            var6 = var2 + var4;
            var7 = var3 + var5;
            if (((oc) this).field_s) {
              break L1;
            } else {
              if (!this.b(var6, var7)) {
                ((oc) this).field_x[param0] = var6;
                ((oc) this).field_A[param0] = var7;
                break L0;
              } else {
                break L1;
              }
            }
          }
          var8 = (int)Math.sqrt((double)var4 * (double)var4 + (double)var5 * (double)var5) >> 16;
          var4 = var4 / (var8 + 1);
          var5 = var5 / (var8 + 1);
          var9 = 0;
          L2: while (true) {
            L3: {
              if (var9 >= var8) {
                var2 = var6;
                var3 = var7;
                if (!((oc) this).field_s) {
                  break L3;
                } else {
                  if (this.b(var2, var3)) {
                    break L3;
                  } else {
                    ((oc) this).field_x[param0] = var2;
                    ((oc) this).field_A[param0] = var3;
                    break L0;
                  }
                }
              } else {
                var2 = var2 + var4;
                var3 = var3 + var5;
                if (!this.b(var2, var3)) {
                  var9++;
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (!this.b(var2 - 65536, var3)) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L4;
              } else {
                stackOut_12_0 = 1;
                stackIn_14_0 = stackOut_12_0;
                break L4;
              }
            }
            L5: {
              L6: {
                var9 = stackIn_14_0;
                var10 = this.b(var2 + 65536, var3) ? 1 : 0;
                var11 = this.b(var2, var3 - 65536) ? 1 : 0;
                var12 = this.b(var2, var3 + 65536) ? 1 : 0;
                if (var11 == var12) {
                  break L6;
                } else {
                  L7: {
                    L8: {
                      if (var11 == 0) {
                        break L8;
                      } else {
                        if (var12 != 0) {
                          break L8;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          break L7;
                        }
                      }
                    }
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L7;
                  }
                  L9: {
                    stackOut_19_0 = stackIn_19_0;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (((oc) this).field_C[param0] >= 0) {
                      stackOut_21_0 = stackIn_21_0;
                      stackOut_21_1 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      break L9;
                    } else {
                      stackOut_20_0 = stackIn_20_0;
                      stackOut_20_1 = 1;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      break L9;
                    }
                  }
                  if (stackIn_22_0 != stackIn_22_1) {
                    break L6;
                  } else {
                    ((oc) this).field_C[param0] = -((oc) this).field_C[param0] >> 2;
                    ((oc) this).field_y[param0] = ((oc) this).field_y[param0] + ((oc) this).field_y[param0] * 3;
                    break L5;
                  }
                }
              }
              L10: {
                if (var9 == var10) {
                  break L10;
                } else {
                  L11: {
                    L12: {
                      if (var9 == 0) {
                        break L12;
                      } else {
                        if (var10 != 0) {
                          break L12;
                        } else {
                          stackOut_27_0 = 1;
                          stackIn_29_0 = stackOut_27_0;
                          break L11;
                        }
                      }
                    }
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L11;
                  }
                  L13: {
                    stackOut_29_0 = stackIn_29_0;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (((oc) this).field_y[param0] >= 0) {
                      stackOut_31_0 = stackIn_31_0;
                      stackOut_31_1 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      break L13;
                    } else {
                      stackOut_30_0 = stackIn_30_0;
                      stackOut_30_1 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_32_1 = stackOut_30_1;
                      break L13;
                    }
                  }
                  if (stackIn_32_0 != stackIn_32_1) {
                    break L10;
                  } else {
                    ((oc) this).field_y[param0] = -((oc) this).field_y[param0] >> 2;
                    ((oc) this).field_C[param0] = ((oc) this).field_C[param0] + ((oc) this).field_C[param0] * 3;
                    break L5;
                  }
                }
              }
              L14: {
                if (((oc) this).field_s) {
                  break L14;
                } else {
                  if (ma.field_a.field_Pb >= 0) {
                    if (var9 != 0) {
                      if (var10 != 0) {
                        if (var11 != 0) {
                          if (var12 != 0) {
                            break L5;
                          } else {
                            this.e(var2, var3);
                            break L5;
                          }
                        } else {
                          this.e(var2, var3);
                          break L5;
                        }
                      } else {
                        this.e(var2, var3);
                        break L5;
                      }
                    } else {
                      this.e(var2, var3);
                      break L5;
                    }
                  } else {
                    break L14;
                  }
                }
              }
              var2 = var2 - var4;
              var3 = var3 - var5;
              break L5;
            }
            ((oc) this).field_x[param0] = var2;
            ((oc) this).field_A[param0] = var3;
            break L0;
          }
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        ((oc) this).field_B = true;
        if (param0 == 19507) {
          var2 = rl.field_k.field_g * rl.field_k.field_d;
          var3 = 0;
          L0: while (true) {
            if (var2 <= var3) {
              return;
            } else {
              var4 = rl.field_k.field_k[var3] & 255;
              if (((oc) this).field_G >= var4) {
                rl.field_k.field_k[var3] = (byte) 0;
                var3++;
                continue L0;
              } else {
                ((oc) this).field_B = false;
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void g(int param0) {
        this.a(109, rl.field_k, gi.field_c);
        gi.field_c.field_k = rl.field_k.field_k;
        if (param0 < 114) {
            field_r = null;
        }
        this.a(112, rl.field_k, gi.field_i);
        int var2 = gi.field_i.field_h * gi.field_i.field_a;
        if (gi.field_i.field_k.length < var2) {
            gi.field_i.field_k = new byte[var2];
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = EscapeVector.field_A;
        int var7 = -100 % ((-7 - param2) / 38);
        if (rl.field_k == null) {
            rl.field_k = new te(param3 + -param5, param4 - param1, 256);
            this.g((byte) -82);
        } else {
            rl.field_k.field_g = param0;
            rl.field_k.field_a = param0;
            rl.field_k.field_d = -param1 + param4;
            rl.field_k.field_h = -param1 + param4;
            var8 = rl.field_k.field_d * rl.field_k.field_g;
            if (rl.field_k.field_k.length < var8) {
                rl.field_k.field_k = new byte[var8];
            } else {
                for (var9 = 0; var8 > var9; var9++) {
                    rl.field_k.field_k[var9] = (byte) 0;
                }
            }
        }
        this.g(122);
    }

    oc(ed param0, int param1, int param2, hh param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ((oc) this).field_s = false;
        ((oc) this).field_q = false;
        ((oc) this).field_G = 0;
        param2 = param2 + param0.field_v;
        param1 = param1 + param0.field_q;
        var5 = (param0.field_s << 2036034927) + (param1 << 454708720);
        var6 = (param0.field_x << 1071798063) + (param2 << -749409424);
        var7 = 0;
        var8 = param0.field_s * param0.field_x;
        var9 = 0;
        L0: while (true) {
          if (var8 <= var9) {
            ((oc) this).field_F = var7 * 8;
            this.d(((oc) this).field_F, 0);
            var9 = 0;
            var10 = 0;
            L1: while (true) {
              if (var10 >= var8) {
                var10 = 0;
                L2: while (true) {
                  if (((oc) this).field_F <= var10) {
                    pl.field_n.a(param3, 100, ma.field_a.b(131072 * (param0.field_x + param0.field_s), var5, 96, var6), ma.field_a.c(var5, 112));
                    return;
                  } else {
                    ((oc) this).field_y[var10] = -262144 + (int)(Math.random() * 524289.0);
                    ((oc) this).field_C[var10] = -262144 + (int)(524289.0 * Math.random());
                    ((oc) this).field_w[var10] = -262144 + (int)(Math.random() * 524289.0);
                    var10++;
                    continue L2;
                  }
                }
              } else {
                if (param0.field_B[var10] != 0) {
                  var11 = 0;
                  L3: while (true) {
                    if (-9 < (var11 ^ -1)) {
                      ((oc) this).field_x[var9] = var10 % param0.field_s + param1 << -605018768;
                      ((oc) this).field_A[var9] = param2 - -(var10 / param0.field_s) << -1953274800;
                      var9++;
                      var11++;
                      continue L3;
                    } else {
                      var10++;
                      continue L1;
                    }
                  }
                } else {
                  var10++;
                  continue L1;
                }
              }
            }
          } else {
            if (param0.field_B[var9] != 0) {
              var7++;
              var9++;
              continue L0;
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }

    oc(int param0, int param1, hh param2) {
        int var4 = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        ((oc) this).field_s = false;
        ((oc) this).field_q = false;
        ((oc) this).field_G = 0;
        ((oc) this).field_F = 4096;
        this.d(((oc) this).field_F, 0);
        for (var4 = 0; ((oc) this).field_F > var4; var4++) {
            var5 = 6.283185307179586 * Math.random();
            var7 = Math.sqrt(Math.random()) * 524288.0;
            ((oc) this).field_x[var4] = param0 + (int)(Math.sin(var5) * var7);
            ((oc) this).field_A[var4] = (int)(var7 * Math.cos(var5)) + param1;
            ((oc) this).field_y[var4] = -262144 + (int)(524289.0 * Math.random());
            ((oc) this).field_C[var4] = -262144 + (int)(Math.random() * 524289.0);
            ((oc) this).field_w[var4] = -262144 + (int)(524289.0 * Math.random());
        }
        pl.field_n.a(param2, 100, ma.field_a.b(4194304, param0, 96, param1), ma.field_a.c(param0, 109));
    }

    private final te e(byte param0) {
        int var4 = 0;
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
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var20 = null;
        byte[] var23 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        var15 = EscapeVector.field_A;
        if (((oc) this).field_q) {
          L0: {
            if (param0 > 86) {
              break L0;
            } else {
              field_z = null;
              break L0;
            }
          }
          var26 = gi.field_i.field_k;
          var23 = var26;
          var20 = var23;
          var17 = var20;
          var16 = var17;
          var28 = var16;
          var27 = rl.field_k.field_k;
          var4 = 0;
          L1: while (true) {
            if (var26.length <= var4) {
              var4 = rl.field_k.field_a;
              var5 = rl.field_k.field_h;
              var6 = 0;
              var7 = 0;
              L2: while (true) {
                if (var5 <= var7) {
                  var7 = 0;
                  var8 = (-1 + var5) * var4;
                  var9 = 0;
                  L3: while (true) {
                    if (var9 >= var4) {
                      return gi.field_i;
                    } else {
                      var10 = var7;
                      var11 = var7 + var8;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var7++;
                      L4: while (true) {
                        L5: {
                          if (var12 == 0) {
                            break L5;
                          } else {
                            if (var13 == 0) {
                              break L5;
                            } else {
                              var9++;
                              continue L3;
                            }
                          }
                        }
                        if (var14 < var5) {
                          L6: {
                            if (var12 != 0) {
                              break L6;
                            } else {
                              if (var27[var10] == 0) {
                                break L6;
                              } else {
                                var12 = 1;
                                var28[var10] = (byte) 1;
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (var13 != 0) {
                              break L7;
                            } else {
                              if (var27[var11] != 0) {
                                var28[var11] = (byte) 1;
                                var13 = 1;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var10 = var10 + var4;
                          var14++;
                          var11 = var11 - var4;
                          continue L4;
                        } else {
                          var9++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var8 = var6;
                  var9 = var6 - (-var4 + 1);
                  var10 = 0;
                  var11 = 0;
                  var12 = 0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (var10 == 0) {
                          break L10;
                        } else {
                          if (var11 != 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if (var12 >= var4) {
                        break L9;
                      } else {
                        L11: {
                          if (var10 != 0) {
                            break L11;
                          } else {
                            if (var27[var8] != 0) {
                              var10 = 1;
                              var28[var8] = (byte) 1;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (var11 == 0) {
                          if (-1 != (var27[var9] ^ -1)) {
                            var28[var9] = (byte) 1;
                            var11 = 1;
                            var8++;
                            var9--;
                            var12++;
                            continue L8;
                          } else {
                            var8++;
                            var9--;
                            var12++;
                            continue L8;
                          }
                        } else {
                          var8++;
                          var9--;
                          var12++;
                          continue L8;
                        }
                      }
                    }
                    var6 = var6 + var4;
                    var7++;
                    continue L2;
                  }
                }
              }
            } else {
              var26[var4] = (byte) 0;
              var4++;
              continue L1;
            }
          }
        } else {
          return null;
        }
    }

    oc(int param0) {
        ((oc) this).field_s = false;
        ((oc) this).field_q = false;
        ((oc) this).field_G = 0;
        ((oc) this).field_G = 96;
        ((oc) this).field_s = true;
        ((oc) this).field_F = param0;
        this.d(((oc) this).field_F, 0);
        ((oc) this).field_E = new boolean[((oc) this).field_F];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"Showing by rating", "Showing by win percentage"};
        field_v = "Objective";
        field_z = new String[]{"By rating", "By win percentage"};
    }
}
