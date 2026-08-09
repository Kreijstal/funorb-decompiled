/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb implements Runnable {
    static int field_i;
    static String field_a;
    static int[] field_c;
    private qk field_h;
    static int[] field_b;
    private boolean field_f;
    private Thread field_g;
    static cb field_d;
    int field_e;

    final static mg[] a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = -56 / ((param1 - -9) / 63);
        return kh.a(1, param4, (byte) -105, param3, param2, 3, 1, param0, 1);
    }

    final static void a(String param0, String param1, java.applet.Applet param2, long param3, byte param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var8 = param2.getParameter("cookiehost");
                      var7 = var8;
                      var7 = var8;
                      if (param4 == -2) {
                        break L2;
                      } else {
                        field_d = (cb) null;
                        break L2;
                      }
                    }
                    L3: {
                      var9 = param0 + "=" + param1 + "; version=1; path=/; domain=" + var8;
                      var7 = var9;
                      var7 = var9;
                      if (param3 >= 0L) {
                        var7 = var9 + "; Expires=" + gh.a(param3 * 1000L + hc.a(-9986), (byte) 96) + "; Max-Age=" + param3;
                        break L3;
                      } else {
                        var7 = var9 + "; Discard;";
                        break L3;
                      }
                    }
                    q.a("document.cookie=\"" + var7 + "\"", -17107, param2);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var6 = decompiledCaughtException;
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("sb.E(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L7;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L7;
                }
              }
              throw kg.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        try {
            this.field_f = true;
            synchronized (this.field_h) {
                this.field_h.notifyAll();
            }
            if (param0 != -56) {
                return;
            }
            try {
                this.field_g.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_g = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            int var5 = 0;
            bl var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = Virogrid.field_F ? 1 : 0;
            L0: while (true) {
              if (this.field_f) {
                return;
              } else {
                var2 = this.field_h;
                synchronized (var2) {
                  L1: {
                    var7 = (bl) ((Object) this.field_h.a((byte) -103));
                    if (var7 != null) {
                      this.field_e = this.field_e - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      try {
                        L2: {
                          this.field_h.wait();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L3;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if ((var7.field_E ^ -1) == -3) {
                          var7.field_I.a(var7.field_C, (int)var7.field_j, var7.field_C.length, (byte) -45);
                          var7.field_t = false;
                          break L5;
                        } else {
                          if (-4 != (var7.field_E ^ -1)) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            var7.field_C = var7.field_I.a((int)var7.field_j, -54);
                            var7.field_t = false;
                            break L5;
                          }
                        }
                      }
                      decompiledRegionSelector1 = 1;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      en.a((String) null, (Throwable) ((Object) var2_ref), 1);
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_t = false;
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final bl a(int param0, int param1, gl param2) {
        bl var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        Object var5_ref = null;
        bl var6 = null;
        int var8 = 0;
        bl stackIn_4_0 = null;
        bl stackIn_11_0 = null;
        bl stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var4 = new bl();
            var4.field_E = 1;
            var5_ref = this.field_h;
            synchronized (var5_ref) {
              L1: {
                var6 = (bl) ((Object) this.field_h.d(param1 ^ 16577));
                if (param1 == -16578) {
                  L2: while (true) {
                    if (var6 == null) {
                      break L1;
                    } else {
                      L3: {
                        if (((long)param0 ^ -1L) != (var6.field_j ^ -1L)) {
                          break L3;
                        } else {
                          if (param2 != var6.field_I) {
                            break L3;
                          } else {
                            if (var6.field_E == 2) {
                              var4.field_t = false;
                              var4.field_C = var6.field_C;
                              stackIn_11_0 = (bl) (var4);
                              return stackIn_11_0;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      var6 = (bl) ((Object) this.field_h.a(26605));
                      continue L2;
                    }
                  }
                } else {
                  stackIn_4_0 = (bl) null;
                  return stackIn_4_0;
                }
              }
            }
            var4.field_C = param2.a(param0, param1 ^ 16542);
            var4.field_w = true;
            var4.field_t = false;
            stackIn_18_0 = (bl) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("sb.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    final static void a(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        tm var4 = null;
        int var4_int = 0;
        int var5 = 0;
        da var5_ref_da = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        hg var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -61) {
                break L1;
              } else {
                sb.a(-47, (byte) -80, -105, 81, 28);
                break L1;
              }
            }
            L2: {
              var10 = sh.field_qb;
              var2 = var10.g(11132);
              var3 = var10.g(11132);
              if (var2 == 0) {
                var4 = (tm) ((Object) bj.field_o.a((byte) -64));
                if (var4 != null) {
                  L3: {
                    var5 = -var10.field_l + ba.field_a;
                    var12 = var4.field_p;
                    var11 = var12;
                    var6 = var11;
                    if (var12.length << -851125662 >= var5) {
                      break L3;
                    } else {
                      var5 = var12.length << 235369378;
                      break L3;
                    }
                  }
                  var7 = 0;
                  L4: while (true) {
                    if (var5 <= var7) {
                      var4.a(false);
                      break L2;
                    } else {
                      var6[var7 >> -1694000542] = var6[var7 >> -1694000542] + (var10.g(jd.a((int) param0, -11073)) << (rb.a(var7, 3) << 1260042216));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  tn.a(false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                if (-2 == (var2 ^ -1)) {
                  var4_int = var10.d(123);
                  var5_ref_da = (da) ((Object) aj.field_m.a((byte) -105));
                  L5: while (true) {
                    L6: {
                      if (var5_ref_da == null) {
                        break L6;
                      } else {
                        L7: {
                          if (var5_ref_da.field_p != var3) {
                            break L7;
                          } else {
                            if (var5_ref_da.field_q != var4_int) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5_ref_da = (da) ((Object) aj.field_m.a(16213));
                        continue L5;
                      }
                    }
                    if (var5_ref_da == null) {
                      tn.a(false);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var5_ref_da.a(false);
                      break L2;
                    }
                  }
                } else {
                  en.a("LR1: " + rg.a(true), (Throwable) null, 1);
                  tn.a(false);
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "sb.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            ka.a(bl.field_F, param0, true, ka.field_m, rk.field_e, 0, 0);
            var2_int = 0;
            L1: while (true) {
              if (ka.field_m <= var2_int) {
                L2: {
                  ka.a(dj.field_c, param0 + param0, false, ka.field_m + param0, ka.field_k, 0, param0);
                  var2_int = -86 % ((10 - param1) / 33);
                  if (param0 >= ka.field_m) {
                    break L2;
                  } else {
                    ka.field_m = param0;
                    break L2;
                  }
                }
                break L0;
              } else {
                lk.field_Tb[param0 + var2_int] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "sb.I(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            kb.field_b.d(110);
            var1_int = 0;
            L1: while (true) {
              if (-33 >= (var1_int ^ -1)) {
                var1_int = 0;
                L2: while (true) {
                  if ((var1_int ^ -1) <= -33) {
                    L3: {
                      ae.field_c = 0;
                      if (param0 < -24) {
                        break L3;
                      } else {
                        field_b = (int[]) null;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    ig.field_b[var1_int] = 0L;
                    var1_int++;
                    continue L2;
                  }
                }
              } else {
                ke.field_q[var1_int] = 0L;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "sb.D(" + param0 + ')');
        }
    }

    final bl a(gl param0, byte[] param1, byte param2, int param3) {
        bl var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        bl stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = 28 % ((-56 - param2) / 63);
            var5 = new bl();
            var5.field_C = param1;
            var5.field_j = (long)param3;
            var5.field_E = 2;
            var5.field_I = param0;
            var5.field_w = false;
            this.a(var5, 0);
            stackIn_1_0 = (bl) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5_ref);

            stackIn_4_1 = new StringBuilder().append("sb.L(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != 14534) {
            field_a = (String) null;
        }
        hg var3 = gk.field_g;
        var3.g(param1, 8);
        var3.a(3, param2 + -14455);
        var3.a(10, param2 ^ 14513);
        var3.a((byte) -121, param0);
    }

    public static void b(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        if (param0 != -851125662) {
            field_b = (int[]) null;
        }
        field_c = null;
    }

    private final void a(bl param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = this.field_h;
            synchronized (var3) {
              L1: {
                L2: {
                  this.field_h.a(param0, (byte) 118);
                  this.field_e = this.field_e + 1;
                  if (param1 == 0) {
                    break L2;
                  } else {
                    sb.a(-78, (byte) -66, -14, -121, 83);
                    break L2;
                  }
                }
                this.field_h.notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("sb.K(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final bl a(byte param0, int param1, gl param2) {
        bl var4 = null;
        RuntimeException var4_ref = null;
        gl var5 = null;
        bl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 116) {
                break L1;
              } else {
                var5 = (gl) null;
                this.a((byte) -92, 49, (gl) null);
                break L1;
              }
            }
            var4 = new bl();
            var4.field_I = param2;
            var4.field_E = 3;
            var4.field_j = (long)param1;
            var4.field_w = false;
            this.a(var4, 0);
            stackIn_3_0 = (bl) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("sb.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    sb(pd param0) {
        un var2 = null;
        this.field_h = new qk();
        this.field_f = false;
        this.field_e = 0;
        try {
            var2 = param0.a(5, (Runnable) (this), 255);
            while (0 == var2.field_a) {
                mm.a(-43, 10L);
            }
            if ((var2.field_a ^ -1) == -3) {
                throw new RuntimeException();
            }
            this.field_g = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new int[]{2, 14, 15, 6, 5, 16, 17, 10, 11, 12};
        field_a = "Loading graphics";
        field_b = new int[4];
    }
}
