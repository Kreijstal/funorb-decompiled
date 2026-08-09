/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc implements Runnable {
    static long field_a;
    static kg field_j;
    static nf[] field_e;
    static boolean field_d;
    static boolean field_f;
    private wd field_i;
    static int field_h;
    static String field_k;
    private boolean field_g;
    int field_b;
    private Thread field_c;

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            int var5 = 0;
            sm var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = Confined.field_J ? 1 : 0;
            L0: while (true) {
              if (this.field_g) {
                return;
              } else {
                var2 = this.field_i;
                synchronized (var2) {
                  L1: {
                    var7 = (sm) ((Object) this.field_i.c(false));
                    if (var7 != null) {
                      this.field_b = this.field_b - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      try {
                        L2: {
                          this.field_i.wait();
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
                        if (var7.field_z == 2) {
                          var7.field_B.a(-1, var7.field_C.length, var7.field_C, (int)var7.field_r);
                          var7.field_v = false;
                          break L5;
                        } else {
                          if (-4 == (var7.field_z ^ -1)) {
                            var7.field_C = var7.field_B.a(4, (int)var7.field_r);
                            var7.field_v = false;
                            break L5;
                          } else {
                            var7.field_v = false;
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      mb.a((String) null, true, (Throwable) ((Object) var2_ref));
                      var7.field_v = false;
                      break L6;
                    }
                  }
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(byte[] param0, byte param1, hb param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.g(param3, 0);
              if (param1 == -126) {
                break L1;
              } else {
                pc.b((byte) 7);
                break L1;
              }
            }
            if (var4_int != 0) {
              L2: {
                L3: {
                  if (param0 == null) {
                    break L3;
                  } else {
                    if (var4_int != param0.length) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                param0 = new byte[var4_int];
                break L2;
              }
              L4: {
                var5 = param2.g(3, param1 + 126);
                var6 = (byte)param2.g(8, 0);
                if (-1 > (var5 ^ -1)) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param0[var7] = (byte)(var6 + param2.g(var5, 0));
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param0[var7] = (byte)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (byte[]) (param0);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("pc.D(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param3 + ')');
        }
        return stackIn_18_0;
    }

    final void a(byte param0) {
        try {
            if (param0 > -97) {
                return;
            }
            this.field_g = true;
            synchronized (this.field_i) {
                this.field_i.notifyAll();
            }
            try {
                this.field_c.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_c = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(sm param0, int param1) {
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
            var3 = this.field_i;
            synchronized (var3) {
              L1: {
                L2: {
                  this.field_i.a(param0, (byte) 115);
                  this.field_b = this.field_b + 1;
                  this.field_i.notifyAll();
                  if (param1 >= 53) {
                    break L2;
                  } else {
                    this.field_c = (Thread) null;
                    break L2;
                  }
                }
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

            stackIn_10_1 = new StringBuilder().append("pc.A(");

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
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_j = null;
        field_k = null;
        field_e = null;
        if (param0 >= -108) {
            field_k = (String) null;
        }
    }

    final sm a(int param0, ae param1, byte param2) {
        sm var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        sm var6 = null;
        int var8 = 0;
        sm stackIn_10_0 = null;
        sm stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = new sm();
              var4.field_z = 1;
              if (param2 == 53) {
                break L1;
              } else {
                this.field_c = (Thread) null;
                break L1;
              }
            }
            var5 = this.field_i;
            synchronized (var5) {
              L2: {
                var6 = (sm) ((Object) this.field_i.d(62));
                L3: while (true) {
                  if (var6 == null) {
                    break L2;
                  } else {
                    L4: {
                      if ((var6.field_r ^ -1L) != ((long)param0 ^ -1L)) {
                        break L4;
                      } else {
                        if (param1 != var6.field_B) {
                          break L4;
                        } else {
                          if (-3 != (var6.field_z ^ -1)) {
                            break L4;
                          } else {
                            var4.field_C = var6.field_C;
                            var4.field_v = false;
                            stackIn_10_0 = (sm) (var4);
                            return stackIn_10_0;
                          }
                        }
                      }
                    }
                    var6 = (sm) ((Object) this.field_i.a((byte) -30));
                    continue L3;
                  }
                }
              }
            }
            var4.field_C = param1.a(param2 ^ 49, param0);
            var4.field_t = true;
            var4.field_v = false;
            stackIn_17_0 = (sm) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("pc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_17_0;
    }

    final sm a(ae param0, int param1, int param2) {
        sm var4 = null;
        RuntimeException var4_ref = null;
        sm stackIn_2_0 = null;
        sm stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new sm();
            var4.field_t = false;
            var4.field_z = 3;
            var4.field_B = param0;
            var4.field_r = (long)param2;
            if (param1 == 0) {
              this.a(var4, 81);
              stackIn_4_0 = (sm) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (sm) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("pc.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static int a(int param0, qn param1, int param2, bj param3) {
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (null == param1.field_q) {
                  break L1;
                } else {
                  if (param3 == null) {
                    break L1;
                  } else {
                    if (param1.field_w == param3.field_r) {
                      var4_int = param3.field_s.length;
                      var5 = param1.field_q[param0].length / var4_int;
                      var6 = 0;
                      L2: while (true) {
                        if (var6 >= var5) {
                          L3: {
                            if (param2 >= 105) {
                              break L3;
                            } else {
                              field_h = 36;
                              break L3;
                            }
                          }
                          stackIn_24_0 = -1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          L4: {
                            if ((param3.field_v ^ -1L) == (param1.field_p[param0][var6] ^ -1L)) {
                              if (im.a(param1.field_u[param0][var6], 113)) {
                                var7 = 0;
                                L5: while (true) {
                                  if (var7 >= var4_int) {
                                    stackIn_19_0 = var6;
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  } else {
                                    if (param1.field_q[param0][var4_int * var6 - -var7] != param3.field_s[var7]) {
                                      break L4;
                                    } else {
                                      var7++;
                                      continue L5;
                                    }
                                  }
                                }
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_7_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("pc.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            field_a = -14L;
            break L0;
          }
        }
        L1: {
          L2: {
            if (tl.field_g) {
              break L2;
            } else {
              L3: {
                if (param0) {
                  stackIn_6_0 = 0;
                  break L3;
                } else {
                  stackIn_6_0 = 1;
                  break L3;
                }
              }
              if (!tj.a(stackIn_6_0 != 0)) {
                stackIn_9_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final sm a(ae param0, int param1, byte[] param2, int param3) {
        sm var5 = null;
        RuntimeException var5_ref = null;
        sm stackIn_2_0 = null;
        sm stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = new sm();
            var5.field_r = (long)param3;
            var5.field_z = 2;
            var5.field_C = param2;
            var5.field_B = param0;
            if (param1 < -96) {
              var5.field_t = false;
              this.a(var5, 82);
              stackIn_4_0 = (sm) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (sm) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("pc.E(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    pc(df param0) {
        bc var2 = null;
        this.field_i = new wd();
        this.field_b = 0;
        this.field_g = false;
        try {
            var2 = param0.a((byte) 66, (Runnable) (this), 5);
            while (var2.field_g == 0) {
                jd.a(1, 10L);
            }
            if (-3 == (var2.field_g ^ -1)) {
                throw new RuntimeException();
            }
            this.field_c = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = false;
        field_k = "INT";
        field_h = 9;
    }
}
