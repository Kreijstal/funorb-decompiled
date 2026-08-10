/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai implements Runnable {
    private lq field_e;
    static gh field_g;
    static String field_d;
    static int field_a;
    private Thread field_i;
    private boolean field_f;
    static cj field_c;
    static int field_b;
    int field_h;

    final li b(int param0, bq param1, int param2) {
        li var4 = null;
        RuntimeException var4_ref = null;
        bq var5 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 10) {
                break L1;
              } else {
                var5 = (bq) null;
                this.a(-98, (bq) null, -12);
                break L1;
              }
            }
            var4 = new li();
            var4.field_B = param1;
            var4.field_r = false;
            var4.field_y = 3;
            var4.field_l = (long)param0;
            this.a(false, var4);
            stackIn_3_0 = (li) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("ai.G(").append(param0).append(',');

            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, byte param1) {
        try {
            wk.a(param0, (byte) 48);
            qj.a(jl.field_v, false, 102);
            int var2_int = -102 % ((52 - param1) / 40);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ai.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            int var5 = 0;
            li var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            L0: while (true) {
              if (!this.field_f) {
                var2 = this.field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (li) ((Object) this.field_e.a(11356));
                    if (var7 != null) {
                      this.field_h = this.field_h - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      try {
                        L2: {
                          this.field_e.wait();
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
                        if ((var7.field_y ^ -1) == -3) {
                          var7.field_B.a((byte) 118, var7.field_D, var7.field_D.length, (int)var7.field_l);
                          var7.field_t = false;
                          break L5;
                        } else {
                          if (-4 != (var7.field_y ^ -1)) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            var7.field_D = var7.field_B.a(1, (int)var7.field_l);
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
                      bd.a((String) null, (Throwable) ((Object) var2_ref), false);
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
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final li a(int param0, bq param1, byte[] param2, int param3) {
        li var5 = null;
        RuntimeException var5_ref = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
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
            var5 = new li();
            var5.field_r = false;
            var5.field_l = (long)param0;
            var5.field_D = param2;
            var5.field_y = 2;
            var5.field_B = param1;
            this.a(false, var5);
            if (param3 > 26) {
              stackIn_4_0 = (li) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (li) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("ai.H(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static int a(boolean param0, byte param1) {
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              lq.field_b = lq.field_b + 65536;
              if (param1 == 110) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              if (65536 > sd.a((byte) 120, lq.field_b, nf.field_b)) {
                L3: {
                  var2_int = -1;
                  if (null == ld.field_Ub) {
                    if (null != ao.field_h) {
                      var2_int = ao.field_h.length;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var2_int = ld.field_Ub.length;
                    break L3;
                  }
                }
                L4: {
                  if ((var2_int ^ -1) != 0) {
                    L5: {
                      if (lb.field_a >= nf.field_c) {
                        break L5;
                      } else {
                        L6: {
                          lb.field_a = lb.field_a + 1;
                          if (lb.field_a <= nf.field_a) {
                            break L6;
                          } else {
                            L7: {
                              if (null == ld.field_Ub) {
                                break L7;
                              } else {
                                if (null != ld.field_Ub[gf.field_g]) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            lb.field_a = lb.field_a - 1;
                            break L5;
                          }
                        }
                        if (lb.field_a < nf.field_c) {
                          break L5;
                        } else {
                          if (ld.field_Ub[(gf.field_g + 1) % var2_int] == null) {
                            lb.field_a = lb.field_a - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L8: {
                      if (nf.field_c <= lb.field_a) {
                        L9: {
                          gf.field_j = gf.field_g;
                          if (qh.field_a) {
                            gf.field_g = gf.field_g + 1;
                            if (gf.field_g >= var2_int) {
                              gf.field_g = gf.field_g - var2_int;
                              break L9;
                            } else {
                              break L9;
                            }
                          } else {
                            gf.field_g = gf.field_g - 1;
                            if (gf.field_g >= 0) {
                              break L9;
                            } else {
                              gf.field_g = gf.field_g + var2_int;
                              break L9;
                            }
                          }
                        }
                        lb.field_a = lb.field_a - nf.field_c;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (nf.field_a >= lb.field_a) {
                      break L4;
                    } else {
                      qh.field_a = true;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L10: {
                  if (fa.field_Tb == null) {
                    break L10;
                  } else {
                    L11: {
                      var3 = -(fa.field_Tb.field_u / 2) + 357;
                      var4 = 0;
                      if (kd.field_b == 0) {
                        break L11;
                      } else {
                        if (ka.field_t <= var3) {
                          break L11;
                        } else {
                          if (fa.field_Tb.field_w + var3 <= ka.field_t) {
                            break L11;
                          } else {
                            L12: {
                              if (269 + -fa.field_Tb.field_x >= vb.field_f) {
                                break L12;
                              } else {
                                if (-270 >= (vb.field_f ^ -1)) {
                                  break L12;
                                } else {
                                  var4 = 1;
                                  lb.field_a = nf.field_c;
                                  qh.field_a = false;
                                  break L12;
                                }
                              }
                            }
                            if (-587 <= (vb.field_f ^ -1)) {
                              break L11;
                            } else {
                              if (vb.field_f < fa.field_Tb.field_x + 586) {
                                var4 = 1;
                                qh.field_a = true;
                                lb.field_a = nf.field_c;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L10;
                    } else {
                      if (nf.field_a >= lb.field_a) {
                        break L10;
                      } else {
                        if (bo.field_d <= var3) {
                          break L10;
                        } else {
                          if (fa.field_Tb.field_w + var3 > bo.field_d) {
                            L13: {
                              if (-fa.field_Tb.field_x + 269 >= bd.field_g) {
                                break L13;
                              } else {
                                if (269 > bd.field_g) {
                                  lb.field_a = nf.field_a;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            if ((bd.field_g ^ -1) >= -587) {
                              break L10;
                            } else {
                              if (bd.field_g < 586 - -fa.field_Tb.field_x) {
                                lb.field_a = nf.field_a;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                }
                if (param0) {
                  L14: {
                    gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                    if (!gl.field_H.c(-85)) {
                      break L14;
                    } else {
                      if (gl.field_H.field_d == 0) {
                        stackIn_63_0 = 3;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (gl.field_H.field_d != 1) {
                          break L14;
                        } else {
                          stackIn_66_0 = 2;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L15: while (true) {
                    if (!ba.c(param1 ^ -111)) {
                      stackIn_81_0 = 0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      L16: {
                        gl.field_H.a(0, false);
                        if (!gl.field_H.c(-85)) {
                          break L16;
                        } else {
                          if (gl.field_H.field_d != 0) {
                            if (gl.field_H.field_d == 1) {
                              stackIn_76_0 = 1;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              break L16;
                            }
                          } else {
                            stackIn_72_0 = 3;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                      if (13 != sj.field_p) {
                        continue L15;
                      } else {
                        stackIn_79_0 = 1;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                fn.field_c = fn.field_c + 1;
                lq.field_b = lq.field_b - nf.field_b;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ai.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_63_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_66_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_72_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_76_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_79_0;
                } else {
                  return stackIn_81_0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 < 126) {
            field_a = 104;
            field_c = null;
            field_g = null;
            return;
        }
        field_c = null;
        field_g = null;
    }

    final li a(int param0, bq param1, int param2) {
        li var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        li var6 = null;
        int var8 = 0;
        li stackIn_3_0 = null;
        li stackIn_12_0 = null;
        li stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var4 = new li();
            if (param2 == -3) {
              var4.field_y = 1;
              var5 = this.field_e;
              synchronized (var5) {
                L1: {
                  var6 = (li) ((Object) this.field_e.c((byte) 85));
                  L2: while (true) {
                    if (var6 == null) {
                      break L1;
                    } else {
                      L3: {
                        if (var6.field_l != (long)param0) {
                          break L3;
                        } else {
                          if (param1 != var6.field_B) {
                            break L3;
                          } else {
                            if (-3 == (var6.field_y ^ -1)) {
                              var4.field_t = false;
                              var4.field_D = var6.field_D;
                              stackIn_12_0 = (li) (var4);
                              return stackIn_12_0;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      var6 = (li) ((Object) this.field_e.b((byte) 118));
                      continue L2;
                    }
                  }
                }
              }
              var4.field_D = param1.a(1, param0);
              var4.field_t = false;
              var4.field_r = true;
              stackIn_19_0 = (li) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = (li) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4_ref);

            stackIn_22_1 = new StringBuilder().append("ai.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    final static Object a(int param0, boolean param1, byte[] param2) {
        bk var3 = null;
        RuntimeException var3_ref = null;
        bk stackIn_5_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              if (param0 <= (param2.length ^ -1)) {
                if (param1) {
                  stackIn_10_0 = re.a(255, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = (byte[]) (param2);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var3 = new bk();
                ((t) ((Object) var3)).a(param2, (byte) -72);
                stackIn_5_0 = (bk) (var3);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("ai.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final void a(boolean param0, li param1) {
        synchronized (this.field_e) {
            this.field_e.a(29664, param1);
            if (param0) {
                this.field_i = (Thread) null;
            }
            this.field_h = this.field_h + 1;
            this.field_e.notifyAll();
        }
    }

    final void a(byte param0) {
        try {
            String var4 = null;
            this.field_f = true;
            synchronized (this.field_e) {
                this.field_e.notifyAll();
                if (param0 != 77) {
                    var4 = (String) null;
                    ai.a((String) null, (byte) 75);
                }
            }
            try {
                this.field_i.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_i = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (-14 != (sj.field_p ^ -1)) {
          if (sj.field_p == 102) {
            mj.field_Ib.c((byte) 113);
            return true;
          } else {
            if (!param0) {
              if (null != mj.field_Ib) {
                if (!mj.field_Ib.a(96, param2, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              ai.a(true, (byte) 112);
              if (null != mj.field_Ib) {
                if (!mj.field_Ib.a(96, param2, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        } else {
          ub.n(33423425);
          return true;
        }
    }

    ai(go param0) {
        di var2 = null;
        this.field_e = new lq();
        this.field_f = false;
        this.field_h = 0;
        try {
            var2 = param0.a(121, (Runnable) (this), 5);
            while (var2.field_f == 0) {
                vd.a(false, 10L);
            }
            if ((var2.field_f ^ -1) == -3) {
                throw new RuntimeException();
            }
            this.field_i = (Thread) (var2.field_d);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ai.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = -1;
        field_d = "The game options are not all set.";
    }
}
