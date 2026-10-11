/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh extends eh {
    static String field_s;
    static int field_t;
    static int field_q;
    private sb field_r;

    final static lb a(ia param0, int param1) {
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        lb stackIn_38_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        lb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = StarCannon.field_A;
        try {
          var2_int = param0.e(8, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          if (param1 < 85) {
            vh.h((byte) 12);
          }
          var3 = od.a(-2, param0) ? 1 : 0;
          var4 = od.a(-2, param0) ? 1 : 0;
          var5 = new lb();
          var5.field_R = (short)param0.e(8, 16);
          var5.field_J = fd.a(16, var5.field_J, -39, param0);
          var5.field_x = fd.a(16, var5.field_x, -118, param0);
          var5.field_q = fd.a(16, var5.field_q, 110, param0);
          var5.field_P = (short)param0.e(8, 16);
          var5.field_z = fd.a(16, var5.field_z, 117, param0);
          var5.field_c = fd.a(16, var5.field_c, 123, param0);
          var5.field_y = fd.a(16, var5.field_y, -108, param0);
          if (var3 != 0) {
            var5.field_s = (short)param0.e(8, 16);
            var5.field_N = fd.a(16, var5.field_N, -56, param0);
            var5.field_a = fd.a(16, var5.field_a, -97, param0);
            var5.field_o = fd.a(16, var5.field_o, 89, param0);
            var5.field_Q = fd.a(16, var5.field_Q, 106, param0);
            var5.field_e = fd.a(16, var5.field_e, 100, param0);
            var5.field_m = fd.a(16, var5.field_m, -25, param0);
          }
          if (var4 != 0) {
            param0.e(8, 16);
            var5.field_A = fd.a(16, var5.field_A, 116, param0);
            var5.field_b = fd.a(16, var5.field_b, 104, param0);
            var5.field_D = fd.a(16, var5.field_D, -45, param0);
            var5.field_G = fd.a(16, var5.field_G, -119, param0);
            var5.field_I = fd.a(16, var5.field_I, 89, param0);
          }
          if (od.a(-2, param0)) {
            var5.field_K = fd.a(16, var5.field_K, -82, param0);
          }
          if (od.a(-2, param0)) {
            var5.field_u = fb.a(16, var5.field_u, param0, true);
            var6 = 0;
            var7 = 0;
            while (true) {
              if (var5.field_u.length > var7) {
                stackIn_31_0 = var6;
                stackIn_31_1 = var5.field_u[var7] & 255;
                if (var8 == 0) {
                  if (stackIn_31_0 < stackIn_31_1) {
                    var6 = var5.field_u[var7] & 255;
                  }
                  var7++;
                  continue;
                }
              } else {
                stackIn_31_0 = ~var6;
                stackIn_31_1 = -1;
              }
              if (stackIn_31_0 != stackIn_31_1) {
                var5.field_O = (byte)(var6 + 1);
                if (var8 == 0) {
                  break;
                }
              }
              var5.field_u = null;
              break;
            }
          }
          stackIn_38_0 = var5;
          return stackIn_38_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("vh.R(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
          rb stackIn_9_0 = null;
          int stackIn_10_1 = 0;
          Throwable decompiledCaughtException = null;
          IOException var3 = null;
          RuntimeException var3_ref = null;
          Exception var4 = null;
          try {
            if (null == this.field_r) {
              return;
            }
            try {
              if (param0 != -100) {
                vh.a(0, false, (lb) null, -73, 33);
              }
              this.field_g.field_g = 0;
              stackIn_9_0 = this.field_g;
              if (!param1) {
                stackIn_10_1 = 3;
              } else {
                stackIn_10_1 = 2;
              }
              ((rb) (Object) stackIn_9_0).a(stackIn_10_1, -125);
              this.field_g.a((byte) -116, 0L);
              this.field_r.a(0, this.field_g.field_f, (byte) 87, this.field_g.field_f.length);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_r.b((byte) -45);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_p = this.field_p + 1;
              this.field_d = -2;
              this.field_r = null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw sd.a((Throwable) ((Object) var3_ref), "vh.S(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, re param1, int param2) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ia var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = StarCannon.field_A;
        try {
          var3 = d.field_b;
          var3.d((byte) 81, param0);
          var3.field_g = var3.field_g + 1;
          var4 = var3.field_g;
          var3.a(1, -65);
          var3.c(param1.field_g, -306);
          var3.c(param1.field_n, -306);
          var3.c(param1.field_h, -306);
          var3.c((byte) -70, param1.field_i);
          var3.c((byte) -119, param1.field_m);
          var3.c((byte) -116, param1.field_p);
          var3.c((byte) -97, param1.field_j);
          var3.a(param1.field_o.length, -91);
          var5 = param2;
          while (param1.field_o.length > var5) {
            var3.c((byte) -117, param1.field_o[var5]);
            var5++;
            if (var6 != 0) {
              return;
            }
          }
          var3.b((byte) -75, var4);
          var3.b(var3.field_g - var4, 31700);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("vh.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_r != null) {
            this.field_r.b((byte) -106);
          }
          if (param0 != -4628) {
            this.field_r = (sb) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "vh.H(" + param0 + ')');
        }
    }

    final void a(Object param0, int param1, boolean param2) {
        try {
          RuntimeException stackIn_41_0 = null;
          StringBuilder stackIn_41_1 = null;
          String stackIn_42_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          ra var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          ra var4_refLifetime1;
          var6 = StarCannon.field_A;
          try {
            if (null != this.field_r) {
              try {
                this.field_r.b((byte) -71);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_r = null;
            }
            this.field_r = (sb) (param0);
            this.i((byte) 100);
            this.a((byte) -100, param2);
            this.field_a = null;
            this.field_f.field_g = 0;
            L4: while (true) {
              var4_ref = (ra) (this.field_i.c(8));
              if (var4_ref == null) {
                if (var6 == 0) {
                  break L4;
                }
              } else {
                this.field_m.a(22197, var4_ref);
              }
              if (var6 == 0) {
                continue;
              }
              break;
            }
            L8: while (true) {
              var4_refLifetime1 = (ra) (this.field_k.c(8));
              if (null == var4_refLifetime1) {
                if (var6 == 0) {
                  break L8;
                }
              } else {
                this.field_o.a(22197, var4_refLifetime1);
              }
              if (var6 == 0) {
                continue;
              }
              break;
            }
            if (param1 <= 17) {
              this.field_r = (sb) null;
            }
            if (this.field_b != 0) {
              try {
                this.field_g.field_g = 0;
                this.field_g.a(4, -125);
                this.field_g.a((int) this.field_b, -87);
                this.field_g.c((byte) -85, 0);
                this.field_r.a(0, this.field_g.field_f, (byte) 87, this.field_g.field_f.length);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_r.b((byte) -43);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_r = null;
                this.field_d = -2;
                this.field_p = this.field_p + 1;
              }
            }
            this.field_l = 0;
            this.field_e = dd.b(121);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_41_0 = var4_ref3;
            stackIn_41_1 = new StringBuilder().append("vh.C(");
            if (param0 == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -98) {
            field_t = -12;
          }
          field_s = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "vh.T(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, lb param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
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
        int stackIn_42_0Lifetime1;
        int stackIn_42_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = StarCannon.field_A;
        try {
          var5_int = td.a(3 * (-param0 + param4), (byte) 41);
          if (param3 != -6787) {
            vh.a((ia) null, -87);
          }
          var6 = 3 * param0;
          var7 = var5_int - 10;
          ed.d(-121);
          if (param2.field_O > 0 &&
            param2.field_u != null) {
            ae.a(-5607);
          }
          wj.field_e = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param2.field_P)))) {
            var9 = param2.field_z[var8];
            var10 = param2.field_c[var8];
            var11 = param2.field_y[var8];
            stackOut_13_0 = param1;
            stackIn_51_0 = stackOut_13_0 ? 1 : 0;
            stackIn_14_0 = stackOut_13_0;
            if (var19 == 0) {
              if (stackIn_14_0) {
                var12 = bh.field_c[var9];
                var13 = ri.field_a[var9];
                var14 = bh.field_c[var10] - var12;
                var15 = -var12 + bh.field_c[var11];
                var16 = ri.field_a[var10] - var13;
                var17 = -var13 + ri.field_a[var11];
              }
              if (!stackIn_14_0 ||
                !(-(var16 * var15) + var14 * var17 >= 0)) {
                var12Lifetime1 = sc.field_d[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = sc.field_d[var10];
                  if (-2147483648 != var13Lifetime1) {
                    var14 = sc.field_d[var11];
                    if (var14 != -2147483648) {
                      var15 = var14 + (var13Lifetime1 + var12Lifetime1) - var6;
                      stackIn_30_0 = -1;
                      stackIn_30_1 = jf.field_a.length;
                      if (var7 < 0) {
                        stackIn_31_2 = var15 << -var7;
                      } else {
                        stackIn_31_2 = var15 >> var7;
                      }
                      var16 = stackIn_30_0 + (stackIn_30_1 - stackIn_31_2);
                      var17 = jf.field_a[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_42_0 = -1;
                          stackIn_42_1 = ~var16;
                          if (stackIn_42_0 < stackIn_42_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = jf.field_a[var16];
                          continue;
                        }
                        stackIn_42_0Lifetime1 = var16 << 4;
                        stackIn_42_1Lifetime1 = -var17;
                        var18 = stackIn_42_0Lifetime1 - stackIn_42_1Lifetime1;
                        ih.field_d[var18] = var8;
                        jf.field_a[var16] = 1 + var17;
                        if (0 < param2.field_O &&
                          null != param2.field_u) {
                          dupTemp$0 = param2.field_u[var8];
                          jb.field_h[dupTemp$0] = jb.field_h[dupTemp$0] + 1;
                        }
                        wj.field_e = wj.field_e + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_51_0 = -1;
          }
          if (stackIn_51_0 > ~param2.field_O &&
            param2.field_u != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= jb.field_h.length)) {
              var10Lifetime1 = jb.field_h[var9Lifetime1];
              jb.field_h[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_65_0 = var5;
          stackIn_65_1 = new StringBuilder().append("vh.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void i(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          RuntimeException var2_ref = null;
          Exception var3 = null;
          try {
            if (param0 <= 34) {
              this.field_r = (sb) null;
            }
            if (null == this.field_r) {
              return;
            }
            try {
              this.field_g.field_g = 0;
              this.field_g.a(6, -67);
              this.field_g.a(3, (byte) -39);
              this.field_g.c(0, -306);
              this.field_r.a(0, this.field_g.field_f, (byte) 87, this.field_g.field_f.length);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_r.b((byte) -110);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var3 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_d = -2;
              this.field_p = this.field_p + 1;
              this.field_r = null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw sd.a((Throwable) ((Object) var2_ref), "vh.P(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean d(byte param0) {
        try {
          int stackIn_80_0 = 0;
          int stackIn_105_0 = 0;
          int stackIn_109_0 = 0;
          int stackIn_151_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          ra var2 = null;
          int var2_int = 0;
          IOException var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var4 = 0;
          Exception var5_ref_Exception = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          long var12 = 0L;
          Object var14 = null;
          ra var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          int var5Lifetime1;
          int var6Lifetime1;
          int var7Lifetime1;
          int var6Lifetime2;
          var16 = StarCannon.field_A;
          try {
            if (null != this.field_r) {
              var2_long = dd.b(82);
              var4 = (int)(-this.field_e + var2_long);
              if (var4 > 200) {
                var4 = 200;
              }
              this.field_e = var2_long;
              this.field_l = this.field_l + var4;
              if (this.field_l > 30000) {
                try {
                  this.field_r.b((byte) -66);
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                }
                this.field_r = null;
              }
            }
            if (this.field_r == null) {
              if (0 == this.e((byte) -22) &&
                this.c((byte) -79) == 0) {
                return true;
              }
              return false;
            }
            try {
              this.field_r.a((byte) 126);
              var2 = (ra) (this.field_m.a((byte) 127));
              L5: while (true) {
                if (var2 != null) {
                  this.field_g.field_g = 0;
                  this.field_g.a(1, -97);
                  this.field_g.a((byte) -50, var2.field_j);
                  this.field_r.a(0, this.field_g.field_f, (byte) 87, this.field_g.field_f.length);
                  this.field_i.a(22197, var2);
                  var2 = (ra) (this.field_m.a(-99));
                  if (var16 != 0) {
                    break L5;
                  }
                  if (var16 == 0) {
                    continue;
                  }
                }
                var2 = (ra) (this.field_o.a((byte) 120));
                break;
              }
              L8: while (true) {
                if (null != var2) {
                  this.field_g.field_g = 0;
                  this.field_g.a(0, param0 - 55);
                  this.field_g.a((byte) -78, var2.field_j);
                  this.field_r.a(0, this.field_g.field_f, (byte) 87, this.field_g.field_f.length);
                  this.field_k.a(22197, var2);
                  var2 = (ra) (this.field_o.a(-88));
                  if (var16 != 0) {
                    break L8;
                  }
                  if (var16 == 0) {
                    continue;
                  }
                }
                if (param0 != -62) {
                  this.field_r = (sb) null;
                }
                break;
              }
              var2_int = 0;
              L11: while (true) {
                if (var2_int < 100) {
                  var3_int = this.field_r.c(66);
                  stackIn_151_0 = ~var3_int;
                  if (var16 != 0) {
                    break L11;
                  }
                  if (stackIn_151_0 > -1) {
                    throw new IOException();
                  }
                  if (var3_int != 0) {
                    this.field_l = 0;
                    var4 = 0;
                    if (null != this.field_a) {
                      if (this.field_a.field_v == 0) {
                        var4 = 1;
                        if (var16 != 0) {
                          var4 = 10;
                        }
                      }
                    } else {
                      var4 = 10;
                    }
                    boolean decompiledFrameRemainder1 = true;
                    if (var4 > 0) {
                      var5 = -this.field_f.field_g + var4;
                      if (var5 > var3_int) {
                        var5 = var3_int;
                      }
                      boolean decompiledFrameCompleted4 = true;
                      this.field_r.a(this.field_f.field_g, 32498, var5, this.field_f.field_f);
                      if (0 != this.field_b) {
                        var6 = 0;
                        while (var6 < var5) {
                          this.field_f.field_f[var6 + this.field_f.field_g] = (byte)dg.a((int) this.field_f.field_f[var6 + this.field_f.field_g], (int) this.field_b);
                          var6++;
                          if (var16 != 0) {
                            decompiledFrameCompleted4 = false;
                            break;
                          }
                          if (var16 == 0) {
                            continue;
                          }
                          break;
                        }
                      }
                      if (decompiledFrameCompleted4) {
                        this.field_f.field_g = this.field_f.field_g + var5;
                      }
                      decompiledFrameRemainder1 = (!(this.field_f.field_g < var4) ||
                        var16 != 0);
                      if (decompiledFrameRemainder1) {
                        if (this.field_a == null) {
                          this.field_f.field_g = 0;
                          var6Lifetime2 = this.field_f.j(param0 ^ -7897);
                          var7 = this.field_f.f((byte) -114);
                          var8 = this.field_f.j(7909);
                          var9 = this.field_f.f((byte) -114);
                          var10 = 127 & var8;
                          stackIn_80_0 = ((128 & var8) == 0) ? 0 : 1;
                          boolean decompiledFrameCompleted3 = true;
                          boolean decompiledFrameCompleted1 = true;
                          boolean decompiledFrameRemainder0 = true;
                          boolean decompiledFrameCompleted2 = true;
                          var11 = stackIn_80_0;
                          var12 = (long)var7 + ((long)var6Lifetime2 << 32);
                          var14 = null;
                          if (var11 == 0) {
                            var14_ref = (ra) (this.field_i.a((byte) 125));
                            while (var14_ref != null) {
                              stackIn_105_0 = $cfr$lcmp(var14_ref.field_j, var12);
                              if (var16 != 0) {
                                decompiledFrameCompleted3 = false;
                                break;
                              }
                              if (stackIn_105_0 == 0 &&
                                var16 == 0) {
                                decompiledFrameCompleted2 = false;
                                break;
                              }
                              var14_ref = (ra) (this.field_i.a(-112));
                            }
                            if (decompiledFrameCompleted3) {
                              decompiledFrameRemainder0 = !(decompiledFrameCompleted2);
                            }
                          }
                          if ((decompiledFrameRemainder0) &&
                            (decompiledFrameCompleted3) &&
                            (decompiledFrameCompleted2)) {
                            var14_ref = (ra) (this.field_k.a((byte) 124));
                            while (var14_ref != null) {
                              stackIn_105_0 = $cfr$lcmp(var12, var14_ref.field_j);
                              if (var16 != 0) {
                                decompiledFrameCompleted1 = false;
                                break;
                              }
                              if (stackIn_105_0 == 0) {
                                break;
                              }
                              var14_ref = (ra) (this.field_k.a(-93));
                              if (var16 == 0) {
                                continue;
                              }
                              break;
                            }
                          }
                          if ((decompiledFrameCompleted3) &&
                            (decompiledFrameCompleted1)) {
                            if (var14_ref == null) {
                              throw new IOException();
                            }
                            stackIn_105_0 = var10;
                          }
                          stackIn_109_0 = (stackIn_105_0 == 0) ? 5 : 9;
                          var15 = stackIn_109_0;
                          this.field_a = var14_ref;
                          this.field_a.field_u = new rb(var9 + var15 + this.field_a.field_w);
                          this.field_a.field_u.a(var10, -96);
                          this.field_a.field_u.c((byte) -105, var9);
                          this.field_f.field_g = 0;
                          this.field_a.field_v = 10;
                          decompiledFrameRemainder1 = (var16 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          if (0 == this.field_a.field_v) {
                            if (-1 != this.field_f.field_f[0]) {
                              this.field_a = null;
                              decompiledFrameRemainder1 = (var16 != 0);
                            }
                            if (decompiledFrameRemainder1) {
                              this.field_a.field_v = 1;
                              this.field_f.field_g = 0;
                              decompiledFrameRemainder1 = (var16 != 0);
                            }
                          }
                          if (decompiledFrameRemainder1) {
                            throw new IOException();
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      var5Lifetime1 = this.field_a.field_u.field_f.length - this.field_a.field_w;
                      var6Lifetime1 = -this.field_a.field_v + 512;
                      if (var6Lifetime1 > -this.field_a.field_u.field_g + var5Lifetime1) {
                        var6Lifetime1 = var5Lifetime1 - this.field_a.field_u.field_g;
                      }
                      if (var3_int < var6Lifetime1) {
                        var6Lifetime1 = var3_int;
                      }
                      boolean decompiledFrameCompleted0 = true;
                      this.field_r.a(this.field_a.field_u.field_g, 32498, var6Lifetime1, this.field_a.field_u.field_f);
                      if (0 != this.field_b) {
                        var7Lifetime1 = 0;
                        while (var6Lifetime1 > var7Lifetime1) {
                          this.field_a.field_u.field_f[var7Lifetime1 + this.field_a.field_u.field_g] = (byte)dg.a((int) this.field_a.field_u.field_f[var7Lifetime1 + this.field_a.field_u.field_g], (int) this.field_b);
                          var7Lifetime1++;
                          if (var16 != 0) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          if (var16 == 0) {
                            continue;
                          }
                          break;
                        }
                      }
                      if (decompiledFrameCompleted0) {
                        this.field_a.field_u.field_g = this.field_a.field_u.field_g + var6Lifetime1;
                        this.field_a.field_v = this.field_a.field_v + var6Lifetime1;
                      }
                      if (var5Lifetime1 != this.field_a.field_u.field_g) {
                        if (512 == this.field_a.field_v) {
                          this.field_a.field_v = 0;
                          if (var16 != 0) {
                            this.field_a.a(param0 - 6180);
                            this.field_a.field_r = false;
                            this.field_a = null;
                          }
                        }
                      } else {
                        this.field_a.a(param0 - 6180);
                        this.field_a.field_r = false;
                        this.field_a = null;
                      }
                    }
                    var2_int++;
                    if (var16 == 0) {
                      continue;
                    }
                  }
                }
                stackIn_151_0 = 1;
                break;
              }
              return stackIn_151_0 != 0;
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_r.b((byte) -41);
              } catch (java.lang.Exception decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_d = -2;
              this.field_r = null;
              this.field_p = this.field_p + 1;
              if (this.e((byte) -61) == 0 &&
                this.c((byte) -79) == 0) {
                return true;
              }
              return false;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            throw sd.a((Throwable) ((Object) var2_ref2), "vh.F(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public vh() {
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = StarCannon.field_A;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          var4 = param1;
          while (var2_int > var4) {
            var3[var2_int + (-1 - var4)] = param0.charAt(var4);
            var4++;
            if (var5 == 0) {
              continue;
            }
            break;
          }
          stackIn_5_0 = new String(var3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("vh.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0) {
        if (param0 <= 118) {
          field_s = (String) null;
        }
        try {
          this.field_r.b((byte) -105);
        } catch (Exception exception) {
        }
        this.field_p = this.field_p + 1;
        this.field_r = null;
        this.field_d = -1;
        this.field_b = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    static {
        field_s = "This password contains your email address, and would be easy to guess";
        field_t = -1;
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
