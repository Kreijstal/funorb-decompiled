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
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 19, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = param3;
              if (var5_int == 98) {
                stackIn_10_0 = this.a((byte) -128, param0, this.field_A.length);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 == var5_int) {
                  stackIn_12_0 = this.a(param0, (byte) -99, this.field_A.length);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((var5_int ^ -1) == -97) {
                    stackIn_14_0 = this.b(param0, (byte) 113);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (97 == var5_int) {
                      stackIn_16_0 = this.a((byte) -17, param0);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (param2 >= 9) {
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        this.field_A = (int[]) null;
                        return false;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("nd.KA(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L1;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  return stackIn_20_0 != 0;
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, int[] param1) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int dupTemp$0 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        int var3_int = null == this.field_A ? 0 : this.field_A.length;
        if (param0 != 50) {
            return;
        }
        try {
            var4 = param1.length;
            this.field_A = param1;
            var5 = param1;
            var6 = 0;
            var7 = 0;
            while (var6 < var5.length) {
                dupTemp$0 = var7 + var5[var6];
                var7 = dupTemp$0;
                var5[var6] = dupTemp$0;
                var6++;
            }
            this.b(-1, var4, var3_int);
            this.d(var4, 0, var3_int);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "nd.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    nd(int param0, int param1, int param2, int param3, mh param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        this.field_K = 92;
        this.field_D = 0;
        try {
            var10 = new int[param5];
            int[] var8 = var10;
            la.a(var10, 0, param5, 1);
            var9 = new int[param6];
            la.a(var9, 0, param6, 1);
            this.a((byte) 50, var10);
            this.a(-7170, var9);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "nd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(121, param1, param2, param3, param4);
        int var6 = -72 % ((param0 - 28) / 63);
    }

    final static byte[] a(int param0, byte[] param1) {
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        fs var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          L0: {
            L1: {
              var9 = new fs(param1);
              var3 = var9.e(-31302);
              var4 = var9.c(true);
              if (0 > var4) {
                break L1;
              } else {
                L2: {
                  if (-1 == (bn.field_R ^ -1)) {
                    break L2;
                  } else {
                    if (bn.field_R >= var4) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if ((var3 ^ -1) != param0) {
                  L3: {
                    var5 = var9.c(true);
                    if (-1 < (var5 ^ -1)) {
                      break L3;
                    } else {
                      L4: {
                        if (bn.field_R == 0) {
                          break L4;
                        } else {
                          if (bn.field_R >= var5) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var13 = new byte[var5];
                        var11 = var13;
                        var6 = var11;
                        if (-2 == (var3 ^ -1)) {
                          w.a(var13, var5, param1, var4, 9);
                          break L5;
                        } else {
                          var7 = sb.field_b;
                          synchronized (var7) {
                            L6: {
                              sb.field_b.a(var13, (byte) -104, var9);
                              break L6;
                            }
                          }
                          break L5;
                        }
                      }
                      stackIn_21_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var12 = new byte[var4];
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.a(var12, var4, 0, (byte) -119);
                  stackIn_7_0 = (byte[]) (var5_ref_byte__);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("nd.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_21_0;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = this.field_A == null ? 0 : this.field_A.length;
        int[] var5 = new int[var4 * param1];
        int var6 = -78 % ((param0 - 0) / 59);
        if (this.field_I != null && -1 > (this.field_I.length ^ -1) && (var5.length ^ -1) < -1) {
            if (!(param2 <= 0)) {
                la.a(this.field_I, 0, var5, 0, Math.min(param2, param1) * var4);
            }
        }
        this.field_I = var5;
    }

    final void c(int param0, int param1, int param2) {
        this.field_E = param2;
        if (param0 != -1) {
            return;
        }
        this.field_C = param1;
    }

    final static boolean a(byte param0, boolean param1) {
        try {
            pl var4 = null;
            pl var5 = null;
            if (!(tm.field_a != null)) {
                tm.field_a = jt.field_t.a((byte) 71, mc.field_C, vp.field_a);
            }
            if (param0 > -33) {
                nd.a((byte) 116, false);
            }
            if (!(tm.field_a.field_c != 0)) {
                return false;
            }
            long dupTemp$0 = wq.a(-38);
            rj.field_a = dupTemp$0;
            jt.field_x = dupTemp$0;
            if ((tm.field_a.field_c ^ -1) != -2) {
                kw.field_c = lr.field_b;
            } else {
                try {
                    qk.field_O = new dt((java.net.Socket) (tm.field_a.field_d), jt.field_t);
                    var4 = ig.field_a;
                    var5 = var4;
                    as.field_v.field_p = 0;
                    var5.field_p = 0;
                    li.field_r = param1 ? -2 : -1;
                    vb.field_I = param1 ? -2 : -1;
                    ur.field_Q = param1 ? -2 : -1;
                    kw.field_c = gg.field_t;
                    sb.a(s.field_o, 81, jt.field_r, ql.field_v, as.field_v);
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
        int var4 = null == this.field_J ? 0 : this.field_J.length;
        int[] var5 = new int[param0 * var4];
        if (null != this.field_I && 0 < this.field_I.length && -1 > (var5.length ^ -1)) {
            if (!(0 >= param2)) {
                for (var6 = 0; var6 < var4; var6++) {
                    la.a(this.field_I, var6 * param2, var5, param0 * var6, Math.min(param2, param0));
                }
            }
        }
        this.field_I = var5;
        if (param1 != 0) {
            this.a((byte) -53, 3, -113);
        }
    }

    final void e(boolean param0) {
        int incrementValue$0 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        pk var5;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= this.field_x.length) {
              break L1;
            } else {
              if (var3 >= this.field_J.length) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var2 < this.field_x.length) {
                    if (var4 < this.field_A.length) {
                      incrementValue$0 = var2;
                      var2++;
                      var5 = this.field_x[incrementValue$0];
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
              this.field_K = -124;
              break L3;
            }
          }
          return;
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        int var4 = this.field_J != null ? this.field_J.length : 0;
        pk[] var5 = new pk[param1 * var4];
        if (null != this.field_x && this.field_x.length > 0 && (var5.length ^ -1) < -1 && 0 < param2) {
            for (var6 = 0; var6 < var4; var6++) {
                la.a(this.field_x, param2 * var6, var5, param1 * var6, Math.min(param2, param1));
            }
        }
        this.field_x = var5;
        if (param0 != -1) {
            pk var8 = (pk) null;
            this.a(-101, 118, (pk) null);
        }
    }

    final void a(int param0, int param1, pk param2) {
        int var4_int = 0;
        int var5 = 0;
        try {
            var4_int = this.field_D % this.field_A.length;
            var5 = this.field_D / this.field_A.length;
            this.field_I[this.field_D] = param0;
            this.field_x[this.field_D] = param2;
            if (param1 != 0) {
                this.field_A = (int[]) null;
            }
            if (param2 != null) {
                this.a(param2, var4_int, 0, var5);
            }
            this.field_D = this.field_D + 1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "nd.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int dupTemp$0 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        try {
            var3_int = this.field_J != null ? this.field_J.length : 0;
            var4 = param1.length;
            this.field_J = param1;
            var5 = param1;
            var6 = 0;
            var7 = 0;
            while (var6 < var5.length) {
                dupTemp$0 = var7 + var5[var6];
                var7 = dupTemp$0;
                var5[var6] = dupTemp$0;
                var6++;
            }
            this.e(var4, var3_int, param0 ^ param0);
            this.a((byte) 87, var4, var3_int);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "nd.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        pk var9 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -42) {
                break L1;
              } else {
                var9 = (pk) null;
                this.a((pk) null, 107, -24, -6, 81, 67, -125);
                break L1;
              }
            }
            stackIn_3_0 = super.a(param0, -77, param2, param3, param4, param5, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("nd.R(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = this.field_A == null ? 0 : this.field_A.length;
        pk[] var5 = new pk[param0 * var4];
        if (this.field_x != null && -1 > (this.field_x.length ^ -1) && 0 < var5.length && -1 > (param1 ^ -1)) {
            la.a(this.field_x, 0, var5, 0, var4 * Math.min(param1, param0));
        }
        if (param2 != 0) {
            this.d(-38, 89, 107);
        }
        this.field_x = var5;
    }

    private final void a(pk param0, int param1, int param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var20 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_A[this.field_A.length - 1];
              var6 = this.field_J[this.field_J.length - 1];
              if (param2 >= param1) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = this.field_A[param1 - 1];
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0 * this.field_q / var5_int;
              stackIn_6_0 = this.field_p;

              if (0 >= param3) {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = this.field_J[param3 - 1];
                break L2;
              }
            }
            L3: {
              L4: {
                var8 = stackIn_7_0 * stackIn_7_1 / var6;
                var9 = this.field_A[param1] * this.field_q / var5_int;
                var10 = this.field_J[param3] * this.field_p / var6;
                var11 = param3 * this.field_A.length + param1;
                var12 = this.field_I[var11] & 48;
                var13 = 192 & this.field_I[var11];
                var14 = param0.field_r;
                var15 = param0.field_v;
                var16 = param0.field_q;
                var17 = param0.field_p;
                if (var9 - var7 <= var16) {
                  break L4;
                } else {
                  if ((this.field_I[var11] & 1) == 0) {
                    break L4;
                  } else {
                    var14 = var7;
                    var16 = -var7 + var9;
                    break L3;
                  }
                }
              }
              L5: {
                if (-var7 + var9 >= var16) {
                  break L5;
                } else {
                  if (0 != (this.field_I[var11] & 4)) {
                    var14 = var7;
                    var16 = -var7 + var9;
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              if (16 != var12) {
                if (var12 == 32) {
                  var14 = -var16 + var9;
                  break L3;
                } else {
                  var14 = var7;
                  break L3;
                }
              } else {
                var14 = -var16 + var9 + var7 >> -1432529631;
                break L3;
              }
            }
            L6: {
              L7: {
                if (var10 + -var8 <= var17) {
                  break L7;
                } else {
                  if (0 == (this.field_I[var11] & 2)) {
                    break L7;
                  } else {
                    var17 = var10 - var8;
                    var15 = var8;
                    break L6;
                  }
                }
              }
              L8: {
                if (-var8 + var10 >= var17) {
                  break L8;
                } else {
                  if ((8 & this.field_I[var11]) != 0) {
                    var15 = var8;
                    var17 = var10 - var8;
                    break L6;
                  } else {
                    break L8;
                  }
                }
              }
              if ((var13 ^ -1) == -65) {
                var15 = -var17 + (var10 + var8) >> 2092670625;
                break L6;
              } else {
                if (-129 != (var13 ^ -1)) {
                  var15 = var8;
                  break L6;
                } else {
                  var15 = -var17 + var10;
                  break L6;
                }
              }
            }
            var18 = this.field_E;
            var19 = this.field_C;
            param0.a(-89, var14 - -var18, var19 + var15, var17 + -(2 * var19), -(2 * var18) + var16);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var5);

            stackIn_35_1 = new StringBuilder().append("nd.EA(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L9;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_G = "Error connecting to server. Please try using a different server.";
    }
}
