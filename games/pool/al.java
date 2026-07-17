/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class al {
    static vh field_k;
    int field_y;
    static vh field_v;
    dl[] field_w;
    boolean field_m;
    bf[] field_c;
    int field_z;
    int field_n;
    int field_A;
    pq[] field_l;
    int field_j;
    boolean field_o;
    int field_x;
    int field_p;
    sq field_f;
    int field_q;
    private int[] field_d;
    int[][] field_e;
    ko field_u;
    int field_s;
    String[] field_h;
    static tm[] field_B;
    static int[] field_g;
    int field_b;
    private int[] field_a;
    ko field_i;
    df[] field_r;
    private int[] field_t;

    private final void a(boolean param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            ((al) this).field_c = new bf[param1.length / 3];
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param1.length / 3) {
                L2: {
                  ((al) this).field_e = new int[param1.length / 3][2];
                  ((al) this).field_d = new int[param1.length / 3];
                  if (param0) {
                    break L2;
                  } else {
                    ((al) this).g((byte) -43);
                    break L2;
                  }
                }
                var10 = 0;
                var3_int = var10;
                L3: while (true) {
                  if (param1.length / 3 <= var10) {
                    break L0;
                  } else {
                    ((al) this).field_d[var10] = param1[var10 * 3];
                    ((al) this).field_e[var10][0] = param1[1 + var10 * 3] << 16;
                    ((al) this).field_e[var10][1] = param1[var10 * 3 + 2] << 16;
                    var10++;
                    continue L3;
                  }
                }
              } else {
                var4 = param1[3 * var3_int % param1.length];
                var5 = param1[(3 * var3_int - -1) % param1.length] << 16;
                var6 = param1[(2 + var3_int * 3) % param1.length] << 16;
                var7 = param1[(3 + var3_int * 3) % param1.length];
                var8 = param1[(4 + 3 * var3_int) % param1.length] << 16;
                var9 = param1[(5 + var3_int * 3) % param1.length] << 16;
                ((al) this).field_c[var3_int] = new bf(var5, var6, var8, var9, var4, var7);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("al.S(").append(param0).append(44);
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        pq var6 = null;
        int var7 = 0;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        L0: {
          var14 = Pool.field_O;
          var3 = -1;
          var4 = 0L;
          if (param0 == 17897) {
            break L0;
          } else {
            int discarded$2 = this.f(-119);
            break L0;
          }
        }
        var6 = ((al) this).field_l[param1];
        var7 = 0;
        L1: while (true) {
          if (var7 >= ((al) this).field_w.length) {
            return var3;
          } else {
            L2: {
              var8 = (long)(-var6.field_g + ((al) this).field_w[var7].field_g);
              var10 = (long)(((al) this).field_w[var7].field_f - var6.field_k);
              var12 = var8 * var8 + var10 * var10;
              if (var3 == -1) {
                break L2;
              } else {
                if (var4 > var12) {
                  break L2;
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
            var4 = var12;
            var3 = var7;
            var7++;
            continue L1;
          }
        }
    }

    public static void b() {
        field_g = null;
        field_k = null;
        field_v = null;
        field_B = null;
    }

    final boolean f(byte param0) {
        int var3 = 0;
        Object var4 = null;
        qe var4_ref = null;
        int var5 = 0;
        qe var5_ref_qe = null;
        Object var6 = null;
        pq var7 = null;
        qe var8 = null;
        L0: {
          L1: {
            var4 = null;
            var8 = ((al) this).j(22);
            var3 = ((al) this).a(true, (byte) 76, var8) ? 1 : 0;
            if (((al) this).field_i == null) {
              break L1;
            } else {
              if (((al) this).field_i.c(0)) {
                break L1;
              } else {
                var4_ref = (qe) (Object) ((al) this).field_i.e((byte) -41);
                break L0;
              }
            }
          }
          var4_ref = new qe();
          break L0;
        }
        L2: {
          var4_ref.field_v = var8.field_v + 1;
          var4_ref.field_q = 0;
          if (var3 != 0) {
            var4_ref.field_L = ((al) this).field_f.a(var8, (byte) 117);
            break L2;
          } else {
            var4_ref.field_L = var8.field_L;
            break L2;
          }
        }
        L3: {
          ((al) this).field_u.b((byte) -14, (ma) (Object) var4_ref);
          ((al) this).field_A = var4_ref.field_L;
          if (var3 == 0) {
            break L3;
          } else {
            ((al) this).field_y = 0;
            ((al) this).field_z = 0;
            break L3;
          }
        }
        L4: {
          if ((ob.field_F & var8.field_s) == 0) {
            break L4;
          } else {
            ((al) this).b(ga.a(512, true, ea.field_r) + 1, 456);
            break L4;
          }
        }
        L5: {
          if (param0 >= 30) {
            break L5;
          } else {
            ((al) this).field_z = -45;
            break L5;
          }
        }
        L6: {
          if ((um.field_c & var8.field_s) == -1) {
            break L6;
          } else {
            if (var4_ref.field_P != -1) {
              if (0 != var4_ref.field_Q) {
                ((al) this).a(var4_ref.field_Q, (li) null, (byte) -118, var4_ref.field_P, 0);
                break L6;
              } else {
                this.n(-16739);
                break L6;
              }
            } else {
              this.n(-16739);
              break L6;
            }
          }
        }
        L7: {
          L8: {
            if (var4_ref.field_P != -1) {
              break L8;
            } else {
              if (var4_ref.field_Q != -1) {
                break L8;
              } else {
                var5_ref_qe = var4_ref;
                var6 = this;
                var7 = ((al) var6).field_l[0];
                var5_ref_qe.field_P = var7.field_g;
                var5_ref_qe.field_Q = var7.field_k;
                break L7;
              }
            }
          }
          boolean discarded$1 = ((al) this).a(var4_ref.field_Q, var4_ref.field_P, -91, 0, false);
          break L7;
        }
        var5 = 0;
        L9: while (true) {
          if (var5 >= ((al) this).field_w.length) {
            L10: {
              if ((var8.field_s & be.field_I) == 0) {
                break L10;
              } else {
                ((al) this).field_z = 1;
                break L10;
              }
            }
            L11: {
              if ((var8.field_s & nr.field_Y) == 0) {
                var4_ref.field_u = 0;
                break L11;
              } else {
                if ((nr.field_V & var8.field_s) == 0) {
                  if ((var8.field_s & nr.field_R) != -1) {
                    var4_ref.field_u = 1;
                    break L11;
                  } else {
                    if (-1 == (var8.field_s & nr.field_Q)) {
                      break L11;
                    } else {
                      var4_ref.field_u = 2;
                      break L11;
                    }
                  }
                } else {
                  var4_ref.field_u = 3;
                  break L11;
                }
              }
            }
            L12: {
              if (0 != (var8.field_s & sg.field_O)) {
                ((al) this).field_y = 1;
                break L12;
              } else {
                break L12;
              }
            }
            if ((oa.field_b & var8.field_s) != 0) {
              L13: {
                var5 = var8.field_l & 3;
                if (var5 != 1) {
                  if (var5 != 2) {
                    break L13;
                  } else {
                    ((al) this).field_f.a(1, -1, var8.field_L);
                    break L13;
                  }
                } else {
                  ((al) this).field_f.a(0, -1, var8.field_L);
                  break L13;
                }
              }
              ((al) this).field_f.a(var4_ref, false);
              return false;
            } else {
              ((al) this).field_f.a(var4_ref, false);
              return false;
            }
          } else {
            ((al) this).field_w[var5].a(((al) this).field_l, -80);
            var5++;
            continue L9;
          }
        }
    }

    final void a(int param0, li param1, byte param2, int param3, int param4) {
        try {
            this.a(param0, param3, param1, -30896, param4, 8192);
            int var6_int = 99 / ((param2 - -26) / 53);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "al.FA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void e(byte param0) {
        int var3 = 110 % ((-57 - param0) / 53);
        qe var2 = ((al) this).j(20);
        var2.field_T = this.b((byte) 91);
        var2.c(2, ((al) this).field_f.h(-1));
        var2.field_q = 2;
    }

    private final ge b(byte param0) {
        int var4 = 0;
        if (param0 <= 79) {
            this.n(117);
        }
        ge var2 = new ge(this.f(0));
        ge var3 = var2;
        var3.a(((al) this).field_l.length, false);
        for (var4 = 0; ((al) this).field_l.length > var4; var4++) {
            ((al) this).field_l[var4].a(0, var3);
        }
        int var5 = 0;
        var4 = var5;
        while (var5 < ((al) this).field_w.length) {
            ((al) this).field_w[var5].a(var3, 0);
            var5++;
        }
        return var2;
    }

    final qe j(int param0) {
        if (param0 < 18) {
            return null;
        }
        return (qe) (Object) ((al) this).field_u.a((byte) -127);
    }

    final void a(int param0, pq[] param1, qe param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= param1.length) {
                L2: {
                  if (param0 == 6582) {
                    break L2;
                  } else {
                    ((al) this).field_b = -87;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (param1[var4_int].field_s) {
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= ((al) this).field_w.length) {
                        break L3;
                      } else {
                        L5: {
                          var6 = -((al) this).field_w[var5].field_g + param1[var4_int].field_g;
                          var7 = -((al) this).field_w[var5].field_f + param1[var4_int].field_k;
                          int discarded$2 = 0;
                          int discarded$3 = 0;
                          if (od.a((long)var6, (long)var6) + od.a((long)var7, (long)var7) < (long)ui.a(324, (byte) 90)) {
                            L6: {
                              param1[var4_int].field_s = false;
                              param1[var4_int].field_v = 0;
                              if (param1[var4_int].field_q != null) {
                                param1[var4_int].field_q.a(23655, param1[var4_int], var5);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            param2.field_m.b((byte) -23, (ma) (Object) new cr(var4_int, var5));
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("al.Q(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final boolean a(boolean param0, byte param1, qe param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              var5 = 119 / ((param1 - -1) / 48);
              var4_int = 1;
              if (0 >= ((al) this).field_z) {
                if ((param2.field_s & nd.field_j) != 0) {
                  var4_int = 0;
                  break L1;
                } else {
                  if (((al) this).field_y > 0) {
                    L2: {
                      if (!param0) {
                        break L2;
                      } else {
                        ((al) this).field_y = ((al) this).field_y - 1;
                        break L2;
                      }
                    }
                    var4_int = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                L3: {
                  if (param0) {
                    ((al) this).field_z = ((al) this).field_z - 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4_int = 0;
                break L1;
              }
            }
            L4: {
              if ((param2.field_s & ll.field_f) == 0) {
                break L4;
              } else {
                var4_int = 1;
                break L4;
              }
            }
            L5: {
              if ((ab.field_g & param2.field_s) == 0) {
                break L5;
              } else {
                var6 = param2.field_l & 24;
                if (var6 != 8) {
                  if (16 == var6) {
                    var4_int = 1;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  var4_int = 0;
                  break L5;
                }
              }
            }
            L6: {
              if ((a.field_d & param2.field_s) == 0) {
                break L6;
              } else {
                var6 = param2.field_l & 96;
                if (32 == var6) {
                  var4_int = 1;
                  break L6;
                } else {
                  if (64 != var6) {
                    break L6;
                  } else {
                    var4_int = 0;
                    break L6;
                  }
                }
              }
            }
            stackOut_27_0 = var4_int;
            stackIn_28_0 = stackOut_27_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("al.K(").append(param0).append(44).append(param1).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
        return stackIn_28_0 != 0;
    }

    private final void n(int param0) {
        this.a(50, (li) null);
        if (param0 != -16739) {
            ((al) this).field_p = 125;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        long var6 = 0L;
        Object var8 = null;
        hh.field_e = 0;
        var2 = 0;
        L0: while (true) {
          if (((al) this).field_l.length <= var2) {
            L1: {
              if (param0 == 77) {
                break L1;
              } else {
                var8 = null;
                boolean discarded$3 = ((al) this).a(true, (byte) -9, (qe) null);
                break L1;
              }
            }
            return;
          } else {
            if (((al) this).field_l[var2].field_s) {
              var3 = var2 - -1;
              L2: while (true) {
                if (((al) this).field_l.length > var3) {
                  if (((al) this).field_l[var3].field_s) {
                    var4 = (long)(-((al) this).field_l[var3].field_g + ((al) this).field_l[var2].field_g);
                    var6 = (long)(((al) this).field_l[var2].field_k + -((al) this).field_l[var3].field_k);
                    int discarded$4 = 0;
                    var4 = od.a(var4, var4);
                    int discarded$5 = 0;
                    var6 = od.a(var6, var6);
                    if (var4 + var6 < 16777216L) {
                      k.field_N[hh.field_e][0] = var2;
                      k.field_N[hh.field_e][1] = var3;
                      hh.field_e = hh.field_e + 1;
                      var3++;
                      continue L2;
                    } else {
                      var3++;
                      continue L2;
                    }
                  } else {
                    var3++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final void g() {
        ((al) this).field_w = new dl[6];
        ((al) this).field_w[0] = new dl(((al) this).field_c[2]);
        ((al) this).field_w[1] = new dl(((al) this).field_c[6]);
        ((al) this).field_w[2] = new dl(((al) this).field_c[10]);
        ((al) this).field_w[3] = new dl(((al) this).field_c[14]);
        ((al) this).field_w[4] = new dl(((al) this).field_c[18]);
        ((al) this).field_w[5] = new dl(((al) this).field_c[22]);
    }

    private final void b(int param0, ge param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        qe var4 = null;
        qe var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        qe stackIn_4_0 = null;
        qe stackIn_5_0 = null;
        qe stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        qe stackIn_7_0 = null;
        qe stackIn_8_0 = null;
        qe stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        qe stackOut_3_0 = null;
        qe stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        qe stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        qe stackOut_6_0 = null;
        qe stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        qe stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var12 = Pool.field_O;
        try {
          L0: {
            ((al) this).field_u = new ko();
            var3_int = param1.b(true);
            var4_int = 0;
            L1: while (true) {
              if (var3_int <= var4_int) {
                L2: {
                  var4 = ((al) this).j(81);
                  ((al) this).field_A = var4.field_L;
                  if (2 > var4.field_q) {
                    break L2;
                  } else {
                    boolean discarded$1 = ((al) this).h(22042);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = new qe();
                  var5.field_v = param1.b(true);
                  var5.field_M = param1.d((byte) -86);
                  var6 = param1.g(-87);
                  var5.field_q = 15 & var6 >> 4;
                  stackOut_3_0 = (qe) var5;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (8 != (8 & var6)) {
                    stackOut_5_0 = (qe) (Object) stackIn_5_0;
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L3;
                  } else {
                    stackOut_4_0 = (qe) (Object) stackIn_4_0;
                    stackOut_4_1 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L3;
                  }
                }
                L4: {
                  stackIn_6_0.field_t = stackIn_6_1 != 0;
                  var5.field_L = var6 & 7;
                  var6 = param1.g(-120);
                  var5.field_z = 15 & var6;
                  stackOut_6_0 = (qe) var5;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if ((var6 & 64) == -1) {
                    stackOut_8_0 = (qe) (Object) stackIn_8_0;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L4;
                  } else {
                    stackOut_7_0 = (qe) (Object) stackIn_7_0;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L4;
                  }
                }
                L5: {
                  stackIn_9_0.field_E = stackIn_9_1 != 0;
                  var5.field_u = 3 & var6 >> 4;
                  if (-16 == var5.field_z) {
                    var5.field_z = -1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var5.field_P = param1.b(true);
                  var5.field_Q = param1.b(true);
                  if (var5.field_q < 1) {
                    break L6;
                  } else {
                    var5.field_C = (short)param1.d(-1034);
                    var5.field_A = (short)param1.d(-1034);
                    var5.field_V = (short)param1.d(-1034);
                    var5.field_D = (byte)param1.g(-77);
                    var5.field_H = (byte)param1.g(-103);
                    break L6;
                  }
                }
                L7: {
                  if (var5.field_q >= 2) {
                    L8: {
                      var6 = var5.field_m.a(68);
                      var6 = param1.g(-97);
                      if (var6 <= 0) {
                        break L8;
                      } else {
                        var5.field_m = new ko();
                        var7 = 0;
                        L9: while (true) {
                          if (var7 >= var6) {
                            break L8;
                          } else {
                            var8 = param1.g(-127);
                            var5.field_m.b((byte) 97, (ma) (Object) new cr(31 & var8, var8 >> 5));
                            var7++;
                            continue L9;
                          }
                        }
                      }
                    }
                    L10: {
                      var7 = param1.g(-123);
                      if (var7 > 0) {
                        var5.field_R = new ko();
                        var8 = 0;
                        L11: while (true) {
                          if (var7 <= var8) {
                            break L10;
                          } else {
                            var9 = param1.g(-99);
                            var16 = new int[param1.g(-88)];
                            var15 = var16;
                            var14 = var15;
                            var13 = var14;
                            var10 = var13;
                            var11 = 0;
                            L12: while (true) {
                              if (var11 >= var16.length) {
                                var5.field_R.b((byte) -70, (ma) (Object) new dn(var9, var16));
                                var8++;
                                continue L11;
                              } else {
                                var10[var11] = param1.g(cq.a(2, -124));
                                var11++;
                                continue L12;
                              }
                            }
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                    var5.field_s = param1.f(81);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L13: {
                  if (var5.field_q < 3) {
                    break L13;
                  } else {
                    var5.field_l = (byte)param1.g(-128);
                    break L13;
                  }
                }
                ((al) this).field_u.b((byte) 94, (ma) (Object) var5);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("al.KA(").append(2).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L14;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L14;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 41);
        }
    }

    private final boolean d() {
        int var2 = 0;
        var2 = 0;
        L0: while (true) {
          if (((al) this).field_l.length <= var2) {
            return true;
          } else {
            if (((al) this).field_l[var2].field_s) {
              if (0 != ((al) this).field_l[var2].field_v) {
                return false;
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

    final boolean h(int param0) {
        qe var2 = null;
        var2 = ((al) this).j(param0 ^ 22081);
        if (var2.field_q >= 2) {
          if (param0 == 22042) {
            if (0 != (var2.field_s & hm.field_e)) {
              ((al) this).field_A = ((al) this).field_f.a(var2, (byte) 94);
              return true;
            } else {
              if ((ag.field_e & var2.field_s) == 0) {
                if (var2.d(116)) {
                  return false;
                } else {
                  return ((al) this).f((byte) 116);
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        } else {
          throw new IllegalStateException("");
        }
    }

    private final void a(int param0, int param1, li param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        pq var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              var7_int = 0;
              var8 = 0;
              if (param2 != null) {
                var7_int = param2.a(23165, 524288);
                var8 = -262144 + param2.a(23165, 524288);
                break L1;
              } else {
                break L1;
              }
            }
            var9 = ((al) this).field_l[param4];
            var9.field_o = false;
            var9.field_s = true;
            var9.field_j = -524288;
            var9.d((byte) -105);
            var9.field_p = true;
            var9.field_x.a(false);
            var9.field_g = var7_int + param1;
            var9.field_k = var8 + param0;
            this.a((byte) 77);
            var10 = 0;
            var11 = 0;
            L2: while (true) {
              L3: {
                if (hh.field_e <= 0) {
                  break L3;
                } else {
                  var12 = 0;
                  var13 = 0;
                  L4: while (true) {
                    if (~var13 <= ~hh.field_e) {
                      if (var12 != 0) {
                        L5: {
                          var10 += 2048;
                          if (var10 >= 262144) {
                            var11 = var11 + dn.a(67108864 / (var10 >> 8), false);
                            break L5;
                          } else {
                            var11 += 256;
                            break L5;
                          }
                        }
                        var11 = var11 % param5;
                        var9.field_g = (af.c((byte) -121, var11) >> 4) * (var10 >> 12) + param1;
                        var9.field_k = param0 - -((o.a(var11, (byte) -62) >> 4) * (var10 >> 12));
                        this.a((byte) 77);
                        continue L2;
                      } else {
                        break L3;
                      }
                    } else {
                      L6: {
                        L7: {
                          if (param4 == k.field_N[var13][0]) {
                            break L7;
                          } else {
                            if (~param4 != ~k.field_N[var13][1]) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var12++;
                        break L6;
                      }
                      var13++;
                      continue L4;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var7;
            stackOut_21_1 = new StringBuilder().append("al.RA(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + -30896 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        long var11_long = 0L;
        int var11 = 0;
        long var12_long = 0L;
        int var12 = 0;
        long var13 = 0L;
        long var14 = 0L;
        long var15 = 0L;
        long var16 = 0L;
        long var17 = 0L;
        int var18 = 0;
        long var19 = 0L;
        int var19_int = 0;
        int var20 = 0;
        long var21 = 0L;
        long var23 = 0L;
        long var25 = 0L;
        long var27 = 0L;
        long var29 = 0L;
        long var31 = 0L;
        if (param5 * param5 + param0 * param0 <= 9216) {
          L0: {
            ((al) this).a(s.field_e, param2, (byte) 86, param1, param0, param5);
            var7 = 228 * param4 / 4096 + 456;
            if (param3 == 359) {
              break L0;
            } else {
              ((al) this).b(100, 52);
              break L0;
            }
          }
          var8 = 0;
          L1: while (true) {
            if (((al) this).field_c.length <= var8) {
              var8 = 4194304;
              var9 = 1;
              L2: while (true) {
                if (var9 >= ((al) this).field_l.length) {
                  return true;
                } else {
                  if (((al) this).field_l[var9].field_s) {
                    var10 = -s.field_e[0] + ((al) this).field_l[var9].field_g;
                    var11 = -s.field_e[1] + ((al) this).field_l[var9].field_k;
                    var12 = -s.field_e[2] + ((al) this).field_l[var9].field_j;
                    int discarded$22 = 0;
                    int discarded$23 = 0;
                    int discarded$24 = 0;
                    var13 = od.a((long)s.field_e[9], (long)s.field_e[9]) + (od.a((long)s.field_e[10], (long)s.field_e[10]) - -od.a((long)s.field_e[11], (long)s.field_e[11]));
                    int discarded$25 = 0;
                    int discarded$26 = 0;
                    int discarded$27 = 0;
                    var15 = -2L * (od.a((long)s.field_e[9], (long)var10) - (-od.a((long)s.field_e[10], (long)var11) - od.a((long)s.field_e[11], (long)var12)));
                    int discarded$28 = 0;
                    int discarded$29 = 0;
                    int discarded$30 = 0;
                    var17 = od.a((long)var10, (long)var10) + od.a((long)var11, (long)var11) - (-od.a((long)var12, (long)var12) - -(long)var8);
                    int discarded$31 = 0;
                    int discarded$32 = 0;
                    var19 = od.a(var15, var15) + -(4L * od.a(var13, var17));
                    if (var19 >= 0L) {
                      L3: {
                        var21 = bm.a(param3 ^ -278, var19);
                        if (var21 > 2147483647L) {
                          break L3;
                        } else {
                          if (-2147483648L > var21) {
                            break L3;
                          } else {
                            L4: {
                              var23 = (-var15 - -var21) / var13 / 2L;
                              if (0L > var23) {
                                break L4;
                              } else {
                                if ((long)var7 >= var23) {
                                  L5: {
                                    var25 = (long)s.field_e[9] * var23 + (long)s.field_e[0];
                                    var27 = (long)s.field_e[1] - -(var23 * (long)s.field_e[10]);
                                    var29 = (long)s.field_e[2] + var23 * (long)s.field_e[11];
                                    if (null == ba.field_ub) {
                                      break L5;
                                    } else {
                                      if ((pd.field_i & 16L) != 0L) {
                                        int discarded$33 = 1;
                                        hr.a(ol.a(new int[3]), 16724753, 112, ba.field_ub.field_ab);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  return false;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var25 = (-var15 + -var21) / var13 / 2L;
                            if (0L <= var25) {
                              if (~(long)var7 <= ~var25) {
                                L6: {
                                  var27 = (long)s.field_e[0] + var25 * (long)s.field_e[9];
                                  var29 = (long)s.field_e[10] * var25 + (long)s.field_e[1];
                                  var31 = (long)s.field_e[11] * var25 + (long)s.field_e[2];
                                  if (null == ba.field_ub) {
                                    break L6;
                                  } else {
                                    if ((pd.field_i & 16L) != 0L) {
                                      int discarded$34 = 1;
                                      hr.a(ol.a(new int[3]), 16724753, param3 ^ -272, ba.field_ub.field_ab);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                return false;
                              } else {
                                var9++;
                                continue L2;
                              }
                            } else {
                              var9++;
                              continue L2;
                            }
                          }
                        }
                      }
                      throw new IllegalStateException("Out of range: 0x" + Long.toString(var21, 16));
                    } else {
                      var9++;
                      continue L2;
                    }
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            } else {
              L7: {
                L8: {
                  var9 = ((al) this).field_c[var8].field_j - ((al) this).field_c[var8].field_l;
                  var10 = ((al) this).field_c[var8].field_f - ((al) this).field_c[var8].field_a;
                  int discarded$35 = 0;
                  int discarded$36 = 0;
                  var11_long = bm.a(param3 ^ -314, od.a((long)var9, (long)var9) - -od.a((long)var10, (long)var10));
                  if (-2147483648L > var11_long) {
                    break L8;
                  } else {
                    if (var11_long <= 2147483647L) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                int discarded$37 = 7697781;
                System.out.println("Wall normal overflow " + lo.a(var11_long));
                break L7;
              }
              var9 = lh.a((int)var11_long, (byte) -128, (long)var9);
              var10 = lh.a((int)var11_long, (byte) -119, (long)var10);
              var11 = -aj.a(((al) this).field_c[var8].field_a, false, var9) - aj.a(((al) this).field_c[var8].field_j, false, var10);
              int discarded$38 = 0;
              int discarded$39 = 0;
              var12_long = (long)var11 + (od.a((long)var9, (long)s.field_e[0]) + od.a((long)var10, (long)s.field_e[1]));
              int discarded$40 = 0;
              int discarded$41 = 0;
              var14 = od.a((long)var9, (long)s.field_e[9]) - -od.a((long)var10, (long)s.field_e[10]);
              if (var14 != 0L) {
                L9: {
                  var16 = -var12_long / var14;
                  if (-2147483648L > var16) {
                    break L9;
                  } else {
                    if (var16 <= 2147483647L) {
                      if (var16 >= 0L) {
                        if (~var16 >= ~(long)var7) {
                          L10: {
                            L11: {
                              var18 = s.field_e[9] * (int)var16 + s.field_e[0];
                              var19_int = s.field_e[1] - -(s.field_e[10] * (int)var16);
                              var20 = s.field_e[2] - -((int)var16 * s.field_e[11]);
                              if (var10 == 0) {
                                break L11;
                              } else {
                                if (((al) this).field_c[var8].field_a >= ((al) this).field_c[var8].field_f) {
                                  if (var18 < ((al) this).field_c[var8].field_f) {
                                    break L10;
                                  } else {
                                    if (var18 > ((al) this).field_c[var8].field_a) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                } else {
                                  if (((al) this).field_c[var8].field_a > var18) {
                                    break L10;
                                  } else {
                                    if (var18 > ((al) this).field_c[var8].field_f) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            L12: {
                              if (var9 == 0) {
                                break L12;
                              } else {
                                if (((al) this).field_c[var8].field_l <= ((al) this).field_c[var8].field_j) {
                                  if (((al) this).field_c[var8].field_l > var19_int) {
                                    break L10;
                                  } else {
                                    if (((al) this).field_c[var8].field_j < var19_int) {
                                      break L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                } else {
                                  if (var19_int < ((al) this).field_c[var8].field_j) {
                                    break L10;
                                  } else {
                                    if (((al) this).field_c[var8].field_l < var19_int) {
                                      break L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            if (var20 < -1048576) {
                              break L10;
                            } else {
                              if (var20 > 0) {
                                break L10;
                              } else {
                                L13: {
                                  if (ba.field_ub == null) {
                                    break L13;
                                  } else {
                                    if (0L != (pd.field_i & 16L)) {
                                      int discarded$42 = 1;
                                      hr.a(ol.a(new int[3]), 16724753, -128, ba.field_ub.field_ab);
                                      break L13;
                                    } else {
                                      return false;
                                    }
                                  }
                                }
                                return false;
                              }
                            }
                          }
                          if (ba.field_ub != null) {
                            if (0L != (16L & pd.field_i)) {
                              int discarded$43 = 1;
                              hr.a(ol.a(new int[3]), 16764057, -79, ba.field_ub.field_ab);
                              var8++;
                              continue L1;
                            } else {
                              var8++;
                              continue L1;
                            }
                          } else {
                            var8++;
                            continue L1;
                          }
                        } else {
                          var8++;
                          continue L1;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                throw new IllegalStateException("Wall t overflow " + var16);
              } else {
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    private final void b(int param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        pq var10 = null;
        var10 = ((al) this).field_l[param0];
        if (param0 != 0) {
          return;
        } else {
          if (0L != (524288L & pd.field_i)) {
            return;
          } else {
            L0: {
              var9 = ((al) this).j(108).field_u;
              if (var9 == 1) {
                L1: {
                  if (524544 <= var10.field_k) {
                    if (18349824 < var10.field_k) {
                      var10.field_k = 18349824;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var10.field_k = 524544;
                    break L1;
                  }
                }
                if (var10.field_g >= 28311808) {
                  if (37224192 < var10.field_g) {
                    var10.field_g = 37224192;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  var10.field_g = 28311808;
                  break L0;
                }
              } else {
                if (var9 != 3) {
                  L2: {
                    if (var10.field_g >= 524544) {
                      if (var10.field_g > 37224192) {
                        var10.field_g = 37224192;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var10.field_g = 524544;
                      break L2;
                    }
                  }
                  if (var10.field_k >= 524544) {
                    if (var10.field_k <= 18349824) {
                      break L0;
                    } else {
                      var10.field_k = 18349824;
                      break L0;
                    }
                  } else {
                    var10.field_k = 524544;
                    break L0;
                  }
                } else {
                  L3: {
                    if (var10.field_g > 9437184) {
                      var10.field_g = 9437184;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = -9437184 + var10.field_g;
                  var5 = var10.field_k + -9437184;
                  var6 = var4 >> 8;
                  var7 = var5 >> 8;
                  var8 = var6 * var6 + var7 * var7;
                  if (var8 <= 31690296) {
                    break L0;
                  } else {
                    var9 = rf.a(var8, -122);
                    var10.field_k = (var5 / (var9 >> 8) << 8) + 9437184;
                    var10.field_g = (var4 / (var9 >> 8) << 8) + 9437184;
                    break L0;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        qe var6 = null;
        qe var7 = null;
        qe var8 = null;
        if (param4 == 19063) {
          L0: {
            L1: {
              if (((al) this).field_u.c(param4 + -19063)) {
                break L1;
              } else {
                qe dupTemp$5 = ((al) this).j(49);
                var7 = dupTemp$5;
                var6 = var7;
                if ((param2 & 255) != (dupTemp$5.field_v & 255)) {
                  break L1;
                } else {
                  var7.field_L = param3;
                  break L0;
                }
              }
            }
            qe dupTemp$6 = new qe(param2, param3);
            var8 = dupTemp$6;
            var6 = var8;
            ((al) this).field_u.b((byte) -58, (ma) (Object) dupTemp$6);
            ((al) this).field_f.a(var8, false);
            break L0;
          }
          L2: {
            ((al) this).field_A = param3;
            var6.field_M = param0;
            if (var6.field_M >= 0) {
              ((al) this).c(-95);
              break L2;
            } else {
              break L2;
            }
          }
          var6.field_I = param1;
          var6.field_T = this.b((byte) 98);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, ge param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
            var3_int = param1.g(-117);
            var4 = param1.g(param0 ^ -113);
            var5 = param1.d((byte) -111);
            if (param0 != 2) {
                ((al) this).field_i = null;
            }
            var6 = -1 + param1.g(-119);
            ((al) this).a(var5, var6, var3_int, var4, 19063);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "al.R(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, int param1) {
        ((al) this).j(30).field_M = param0;
        ((al) this).c(-116);
        if (param1 != 456) {
            ((al) this).field_x = -45;
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        if (param0 > -44) {
            return;
        }
        for (var2 = 0; var2 < ((al) this).field_l.length; var2++) {
            ((al) this).field_l[var2].d((byte) 80);
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        L0: {
          var3 = param0;
          if (var3 != 0) {
            if (var3 == 1) {
              ((al) this).field_f = (sq) (Object) new fj((al) this);
              break L0;
            } else {
              if (var3 == 3) {
                ((al) this).field_f = (sq) (Object) new mc((al) this);
                break L0;
              } else {
                if (var3 == 4) {
                  ((al) this).field_f = (sq) (Object) new vp((al) this);
                  break L0;
                } else {
                  if (var3 != 2) {
                    break L0;
                  } else {
                    ((al) this).field_f = (sq) (Object) new rj((al) this);
                    break L0;
                  }
                }
              }
            }
          } else {
            ((al) this).field_f = (sq) (Object) new af((al) this);
            break L0;
          }
        }
        L1: {
          if (param1 <= -115) {
            break L1;
          } else {
            ((al) this).field_d = null;
            break L1;
          }
        }
    }

    final void e(int param0, int param1) {
        int var3 = 0;
        pq var4 = null;
        int var5_int = 0;
        df var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        df var11 = null;
        ((al) this).field_r = new df[((al) this).field_l.length + ((al) this).field_e.length];
        var3 = 0;
        L0: while (true) {
          if (((al) this).field_l.length <= var3) {
            L1: {
              var3 = 0;
              if (param0 == 12226) {
                break L1;
              } else {
                ((al) this).g((byte) 17);
                break L1;
              }
            }
            L2: while (true) {
              if (((al) this).field_e.length <= var3) {
                ((al) this).field_t = new int[((al) this).field_r.length];
                ((al) this).field_a = new int[((al) this).field_r.length];
                var4 = ((al) this).field_l[param1];
                var3 = 0;
                L3: while (true) {
                  if (var3 >= ((al) this).field_l.length) {
                    var3 = 0;
                    L4: while (true) {
                      if (((al) this).field_e.length <= var3) {
                        fd.a(((al) this).field_a, ((al) this).field_t, (byte) -54);
                        var3 = 0;
                        L5: while (true) {
                          if (((al) this).field_r.length <= var3) {
                            return;
                          } else {
                            var5 = ((al) this).field_r[((al) this).field_t[var3]];
                            if (var5.a((byte) -8, param1, (al) this)) {
                              var6 = var5.a((al) this, var4, -6661);
                              var7 = var5.a(1048576);
                              var8 = 8191 & -var7 + var6;
                              var9 = 8191 & var6 + var7;
                              var5.field_j = true;
                              var10 = 0;
                              L6: while (true) {
                                L7: {
                                  if (var10 >= var3) {
                                    break L7;
                                  } else {
                                    L8: {
                                      var11 = ((al) this).field_r[((al) this).field_t[var10]];
                                      if (!var11.a((byte) -8, param1, (al) this)) {
                                        break L8;
                                      } else {
                                        if (var9 > var8) {
                                          if (var11.field_k >= var11.field_d) {
                                            L9: {
                                              if (var11.field_k < var8) {
                                                break L9;
                                              } else {
                                                if (var11.field_d <= var9) {
                                                  if (var11.field_k >= var9) {
                                                    if (var8 < var11.field_d) {
                                                      var8 = var11.field_d;
                                                      break L8;
                                                    } else {
                                                      break L8;
                                                    }
                                                  } else {
                                                    var9 = var11.field_k;
                                                    break L8;
                                                  }
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            var5.field_j = false;
                                            break L7;
                                          } else {
                                            L10: {
                                              if (var11.field_k >= var8) {
                                                break L10;
                                              } else {
                                                if (var8 >= var11.field_d) {
                                                  break L10;
                                                } else {
                                                  if (var11.field_k >= var9) {
                                                    break L10;
                                                  } else {
                                                    if (var11.field_d > var9) {
                                                      var5.field_j = false;
                                                      break L7;
                                                    } else {
                                                      break L10;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L11: {
                                              if (var11.field_k >= var8) {
                                                break L11;
                                              } else {
                                                if (var8 >= var11.field_d) {
                                                  break L11;
                                                } else {
                                                  var8 = var11.field_d;
                                                  break L8;
                                                }
                                              }
                                            }
                                            if (var9 <= var11.field_k) {
                                              break L8;
                                            } else {
                                              if (var11.field_d <= var9) {
                                                break L8;
                                              } else {
                                                var9 = var11.field_k;
                                                break L8;
                                              }
                                            }
                                          }
                                        } else {
                                          if (var11.field_d > var11.field_k) {
                                            if (var11.field_d <= var8) {
                                              if (var9 > var11.field_k) {
                                                var9 = var11.field_k;
                                                break L8;
                                              } else {
                                                break L8;
                                              }
                                            } else {
                                              var8 = var11.field_d;
                                              break L8;
                                            }
                                          } else {
                                            L12: {
                                              if (var8 <= var11.field_k) {
                                                break L12;
                                              } else {
                                                if (var9 >= var11.field_d) {
                                                  break L12;
                                                } else {
                                                  var5.field_j = false;
                                                  break L7;
                                                }
                                              }
                                            }
                                            if (var11.field_d >= var9) {
                                              if (var11.field_k <= var8) {
                                                break L8;
                                              } else {
                                                var9 = var11.field_k;
                                                break L8;
                                              }
                                            } else {
                                              var8 = var11.field_d;
                                              break L8;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var10++;
                                    continue L6;
                                  }
                                }
                                ((al) this).field_r[((al) this).field_t[var3]].field_k = 8191 & -var7 + var6;
                                ((al) this).field_r[((al) this).field_t[var3]].field_d = 8191 & var7 + var6;
                                var3++;
                                continue L5;
                              }
                            } else {
                              var3++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        var5_int = ((al) this).field_l.length + var3;
                        ((al) this).field_r[var5_int].a(var3, false, true);
                        ((al) this).field_r[var5_int].a(1763073386, var4, (al) this);
                        ((al) this).field_a[var5_int] = ((al) this).field_r[var5_int].field_l;
                        ((al) this).field_t[var5_int] = var5_int;
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    ((al) this).field_r[var3].a(var3, true, true);
                    if (((al) this).field_r[var3].a((byte) -8, param1, (al) this)) {
                      ((al) this).field_r[var3].a(param0 + 1763061160, var4, (al) this);
                      ((al) this).field_a[var3] = ((al) this).field_r[var3].field_l;
                      ((al) this).field_t[var3] = var3;
                      var3++;
                      continue L3;
                    } else {
                      var3++;
                      continue L3;
                    }
                  }
                }
              } else {
                ((al) this).field_r[((al) this).field_l.length + var3] = new df();
                var3++;
                continue L2;
              }
            }
          } else {
            ((al) this).field_r[var3] = new df();
            var3++;
            continue L0;
          }
        }
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        if (((al) this).field_l != null) {
            if (((al) this).field_l.length == param1) {
                return;
            }
        }
        ((al) this).field_l = new pq[param1];
        for (var3 = 0; var3 < ((al) this).field_l.length; var3++) {
            ((al) this).field_l[var3] = new pq();
        }
        if (param0 != -14894) {
            ((al) this).field_m = true;
        }
    }

    final void c(int param0, int param1) {
        ((al) this).field_o = true;
        ((al) this).field_A = param1;
        if (param0 != -14286) {
            ((al) this).field_y = -45;
        }
    }

    final void i(byte param0) {
        int var3_int = 0;
        int var23 = Pool.field_O;
        qe var24 = ((al) this).j(102);
        if (!(var24.field_q == 1)) {
            throw new IllegalStateException("Starting new shot, but not animating?");
        }
        if (null != var24.field_R) {
            var24.field_R.d((byte) 106);
        }
        var24.field_T = this.b((byte) 115);
        for (var3_int = 0; var3_int < ((al) this).field_l.length; var3_int++) {
            ((al) this).field_l[var3_int].field_c = 0;
            ((al) this).field_l[var3_int].field_q = null;
        }
        if (param0 != -51) {
            al.a(true, 13);
        }
        ((al) this).field_f.n(param0 ^ -11783);
        boolean discarded$0 = ((al) this).a(var24.field_Q, var24.field_P, 72, 0, false);
        qe var3 = var24;
        pq var4 = ((al) this).field_l[0];
        int var5 = var3.field_D * var3.field_D + var3.field_H * var3.field_H;
        if (9216 < var5) {
            throw new IllegalStateException("Strike point out of range! " + var3.field_D + "," + var3.field_H);
        }
        int var6 = -rf.a(-(var5 << 2) + 65536, -121) >> 9;
        int var7 = ao.a((int) var3.field_A, true);
        int var8 = hc.a(2047, (int) var3.field_A);
        int var9 = ao.a((int) var3.field_C, true);
        int var10 = hc.a(2047, (int) var3.field_C);
        int var11 = var9;
        int var12 = -var10;
        int var13 = aj.a(var7, false, -var12);
        int var14 = aj.a(var7, false, var11);
        int var15 = var8;
        int var16 = 0 * var14 - var15 * var12 >> 16;
        int var17 = var15 * var11 + -(0 * var13) >> 16;
        int var18 = -(var14 * var11) + var12 * var13 >> 16;
        int var19 = var6 * var13 + var3.field_D * var11 + var3.field_H * var16 >> 9;
        int var20 = var12 * var3.field_D + (var14 * var6 - -(var3.field_H * var17)) >> 9;
        int var21 = 0 * var3.field_D + var6 * var15 - -(var18 * var3.field_H) >> 9;
        int discarded$1 = 0;
        var4.field_I = lh.a(uh.field_q, (byte) -73, (long)(int)(od.a((long)(var3.field_V * var13), (long)kj.field_f) / 4096L));
        int discarded$2 = 0;
        var4.field_t = lh.a(uh.field_q, (byte) -108, (long)(int)(od.a((long)(var3.field_V * var14), (long)kj.field_f) / 4096L));
        var4.field_v = 1;
        int discarded$3 = 0;
        int var22 = lh.a(uh.field_w, (byte) -116, (long)(int)(od.a((long)(var3.field_V * bl.field_g), (long)kj.field_f) / 4096L));
        var4.field_n = aj.a(-aj.a(var14, false, var21), false, var22);
        var4.field_b = aj.a(aj.a(var13, false, var21), false, var22);
        var4.field_K = aj.a(aj.a(var14, false, var19) - aj.a(var13, false, var20), false, var22);
        pq.field_i = vb.a(-6584, ((al) this).field_l[0]);
    }

    final static void l(int param0) {
        if (!(sq.field_b != ne.field_w)) {
            return;
        }
        if (dn.a(true, ne.field_w)) {
            s.field_c[ne.field_w].e((byte) -6);
        }
        ne.field_w = sq.field_b;
        if (!(!vq.field_Sb)) {
            ba.field_ub = null;
            am.field_e = null;
            vq.field_Sb = false;
        }
        sg.field_P = 0;
        nk.field_d = jc.field_c;
        int var1 = -44 % ((-83 - param0) / 40);
        if (lo.field_a) {
            ti.field_d = null;
            ad.field_l = new ko();
            oa.field_g = ek.a(124);
            hp.field_c = ek.a(-110);
            lo.field_a = false;
        }
        if (!(!l.field_a)) {
            int discarded$0 = 1;
            lq.a();
            int discarded$1 = 0;
            mj.b();
            lq.l(-121);
            l.field_a = false;
        }
    }

    final void a(ge param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        dl var5 = null;
        int var6 = 0;
        pq var7 = null;
        int var8 = 0;
        Object var9 = null;
        ge var10 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Pool.field_O;
        try {
          L0: {
            L1: {
              this.b(2, param0);
              ((al) this).field_f.a(param0, true);
              var3_int = param0.g(-67);
              if (0 != var3_int) {
                if (var3_int == 1) {
                  var10 = param0;
                  this.d(-14894, var10.g(-95));
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= ((al) this).field_l.length) {
                      var4 = 0;
                      L3: while (true) {
                        if (((al) this).field_w.length <= var4) {
                          break L1;
                        } else {
                          L4: {
                            var5 = ((al) this).field_w[var4];
                            var5.a((byte) 113, var10);
                            if (var5.field_c != null) {
                              var6 = 0;
                              L5: while (true) {
                                if (var5.field_c.a((byte) 110) <= var6) {
                                  break L4;
                                } else {
                                  var7 = ((al) this).field_l[var5.field_c.a(var6, 2229)];
                                  var7.field_k = var5.field_f;
                                  var7.field_g = var5.field_g;
                                  var7.field_p = true;
                                  var6++;
                                  continue L5;
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                          var4++;
                          continue L3;
                        }
                      }
                    } else {
                      ((al) this).field_l[var4].a(var10, -1285);
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                ((al) this).b(param0.d(-1034), 456);
                break L1;
              }
            }
            L6: {
              if (param1 > 98) {
                break L6;
              } else {
                var9 = null;
                this.a(false, (int[]) null);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("al.IA(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
    }

    private final int f(int param0) {
        int var3 = 0;
        int var2 = 1;
        for (var3 = param0; var3 < ((al) this).field_l.length; var3++) {
            var2 = var2 + ((al) this).field_l[var3].d(1);
        }
        int var4 = 0;
        var3 = var4;
        while (((al) this).field_w.length > var4) {
            var2 = var2 + ((al) this).field_w[var4].a((byte) -119);
            var4++;
        }
        return var2;
    }

    final void k(int param0) {
        int var2 = 0;
        System.out.println(((al) this).field_l.length + " balls");
        for (var2 = 0; var2 < ((al) this).field_l.length; var2++) {
            System.out.print(Integer.toString(var2));
            System.out.print(": ");
            ((al) this).field_l[var2].c(0);
            System.out.println("");
        }
        System.out.println("pockets");
        int var3 = param0;
        var2 = var3;
        while (var3 < ((al) this).field_w.length) {
            System.out.print(Integer.toString(var3));
            System.out.print(": ");
            ((al) this).field_w[var3].a(true);
            System.out.println("");
            var3++;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        qe var4 = null;
        li var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        pq var16 = null;
        int var17 = 0;
        int[] var21 = null;
        var2 = 9437184;
        var3 = 9437184;
        var4 = ((al) this).j(25);
        if (param0 <= -76) {
          L0: {
            var21 = ((al) this).field_f.a(var4.field_M, (byte) -32);
            if (var4.field_M < 0) {
              var4.field_M = ga.a(512, true, ea.field_r);
              break L0;
            } else {
              break L0;
            }
          }
          var6 = new li(new int[1]);
          var7 = 1;
          var8 = 1;
          var9 = 1;
          var10 = hc.a(2047, 170) * 16;
          L1: while (true) {
            var11 = 0;
            L2: while (true) {
              L3: {
                if (var11 >= var7) {
                  break L3;
                } else {
                  if (var21[var9] != -1) {
                    var12 = var6.a(23165, 65536);
                    var13 = var6.a(23165, 65536);
                    var14 = 524288 * var12 / 65536 / 96;
                    var15 = var13 * 524288 / 65536 / 96;
                    var16 = ((al) this).field_l[var21[var9]];
                    var16.field_g = var2 - -var14;
                    var16.field_j = -524288;
                    var16.field_k = var11 * 34603008 / 32 + var3 + var15;
                    var16.field_x.field_f = var6.a(23165, 65536);
                    var16.field_x.field_h = var6.a(23165, 65536);
                    var16.field_x.field_c = var6.a(23165, 65536);
                    var16.field_x.field_b = var6.a(23165, 65536);
                    var16.field_x.b(true);
                    var16.field_s = true;
                    var16.field_p = true;
                    var16.field_o = false;
                    var16.d((byte) -27);
                    var8++;
                    if (var8 >= ((al) this).field_l.length) {
                      break L3;
                    } else {
                      var9++;
                      var11++;
                      continue L2;
                    }
                  } else {
                    var9++;
                    var11++;
                    continue L2;
                  }
                }
              }
              var7++;
              var3 = var3 - 540672;
              var2 = var2 - 33 * var10 / 32;
              if (((al) this).field_l.length > var8) {
                continue L1;
              } else {
                var17 = 0;
                var11 = var17;
                L4: while (true) {
                  if (var17 >= ((al) this).field_w.length) {
                    L5: {
                      L6: {
                        if (-1 == var4.field_P) {
                          break L6;
                        } else {
                          if (var4.field_Q != -1) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.a(63, var6);
                      break L5;
                    }
                    ((al) this).field_f.l(-127);
                    return;
                  } else {
                    ((al) this).field_w[var17].a(((al) this).field_l, -94);
                    var17++;
                    continue L4;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final int o(int param0) {
        int var2 = 0;
        int var3 = 0;
        aa var4 = null;
        qe var5 = null;
        aa var6 = null;
        dn var7 = null;
        ma stackIn_10_0 = null;
        ma stackOut_9_0 = null;
        ma stackOut_8_0 = null;
        L0: {
          var2 = ((al) this).field_u.a(32);
          var3 = 4;
          if (param0 == 12850) {
            break L0;
          } else {
            this.d(127, -64);
            break L0;
          }
        }
        L1: {
          if (var2 <= 0) {
            break L1;
          } else {
            var2 = 0;
            var4 = new aa(((al) this).field_u);
            var5 = (qe) (Object) var4.a(0);
            L2: while (true) {
              L3: {
                if (var5 == null) {
                  break L3;
                } else {
                  if (var2 >= 3) {
                    break L3;
                  } else {
                    var2++;
                    var5 = (qe) (Object) var4.c((byte) -71);
                    continue L2;
                  }
                }
              }
              L4: {
                if (var5 == null) {
                  stackOut_9_0 = var4.b((byte) -92);
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = var4.a(var5.field_d, false);
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              var5 = (qe) (Object) stackIn_10_0;
              L5: while (true) {
                if (var5 == null) {
                  break L1;
                } else {
                  L6: {
                    var3 += 16;
                    if (1 > var5.field_q) {
                      break L6;
                    } else {
                      var3 += 8;
                      break L6;
                    }
                  }
                  L7: {
                    if (var5.field_q >= 2) {
                      L8: {
                        var3++;
                        var3 = var3 + var5.field_m.a(param0 ^ 12801);
                        var3++;
                        if (var5.field_R == null) {
                          break L8;
                        } else {
                          if (!var5.field_R.c(0)) {
                            var6 = new aa(var5.field_R);
                            var7 = (dn) (Object) var6.b((byte) -92);
                            L9: while (true) {
                              if (var7 == null) {
                                break L8;
                              } else {
                                var3 += 2;
                                var3 = var3 + var7.field_l.length;
                                var7 = (dn) (Object) var6.b(-112);
                                continue L9;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      var3 += 3;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L10: {
                    if (var5.field_q < 3) {
                      break L10;
                    } else {
                      var3++;
                      break L10;
                    }
                  }
                  var5 = (qe) (Object) var4.b(-84);
                  continue L5;
                }
              }
            }
          }
        }
        return var3;
    }

    final int a(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            field_B = null;
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_2_0 = this.o(param0 + 12851);
            stackOut_2_1 = ((al) this).field_f.m(param0 + 1) + 1;
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (-1 < ((al) this).j(81).field_M) {
              break L2;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              if (-1 == ((al) this).j(65).field_q) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 2;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L1;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              }
            }
          }
          stackOut_5_0 = stackIn_5_0;
          stackOut_5_1 = stackIn_5_1;
          stackOut_5_2 = this.f(param0 + 1);
          stackIn_7_0 = stackOut_5_0;
          stackIn_7_1 = stackOut_5_1;
          stackIn_7_2 = stackOut_5_2;
          break L1;
        }
        return stackIn_7_0 + (stackIn_7_1 + stackIn_7_2);
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        vh var7 = null;
        int var7_int = 0;
        int var8 = 0;
        vh var8_ref_vh = null;
        int var9_int = 0;
        uo var9 = null;
        int var10_int = 0;
        uo var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vh var14 = null;
        int var15 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        vh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        vh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        vh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        vh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        vh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        vh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        var13 = Pool.field_O;
        try {
          L0: {
            L1: {
              fr.field_s = qh.field_l;
              f.field_h = qh.field_f;
              stackOut_1_0 = -127;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = uf.field_z;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = nj.field_b;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              fr.a((byte) stackIn_4_0, stackIn_4_1);
              na.field_e.a(-40 + so.field_k.field_Db + -2, so.field_k.field_gb, 0, 0, (byte) -114);
              nd.field_c.b(0, 2147483647, 0, cl.field_d.field_gb, ad.field_x);
              stackOut_4_0 = br.field_M;
              stackOut_4_1 = 2 + ad.field_x;
              stackOut_4_2 = param1 ^ 2147483647;
              stackOut_4_3 = 0;
              stackOut_4_4 = cl.field_d.field_gb;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_6_3 = stackOut_4_3;
              stackIn_6_4 = stackOut_4_4;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              stackIn_5_4 = stackOut_4_4;
              if (!tq.field_p) {
                stackOut_6_0 = (vh) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = stackIn_6_4;
                stackOut_6_5 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                break L2;
              } else {
                stackOut_5_0 = (vh) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = stackIn_5_4;
                stackOut_5_5 = 2 + (2 + nk.field_n) + 40;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_7_5 = stackOut_5_5;
                break L2;
              }
            }
            L3: {
              ((vh) (Object) stackIn_7_0).b(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4 - stackIn_7_5, 18);
              jh.field_a.b(ad.field_x + 2, 2147483647, -2 + (-nk.field_n + cl.field_d.field_gb + -40), nk.field_n + 42, 18);
              wo.field_f.a(nk.field_n, -22 + (cl.field_d.field_Db - ad.field_x), (byte) -112, 2, cl.field_d.field_gb, 0, ad.field_x - -22);
              ok.field_ob.b(so.field_k.field_Db + -40, 2147483647, 0, so.field_k.field_gb, 40);
              ii.field_e.b(0, param1 ^ 2147483647, 0, uq.field_f.field_gb, 30);
              rq.field_x.b(30, 2147483647, 0, uq.field_f.field_gb, -30 + (-2 + uq.field_f.field_Db) - 40);
              var2_int = dr.field_c + 3;
              if (dg.field_T.length < 2) {
                var2_int--;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0) {
                var2_int--;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var3 = (-8 + (rq.field_x.field_Db - 10 + (var2_int - -1) / 2)) / (var2_int - -1) + -2;
              if (30 >= var3) {
                break L5;
              } else {
                var3 = 30;
                break L5;
              }
            }
            L6: {
              var4 = -5 + (rq.field_x.field_Db - (5 - -(var2_int * (2 + var3))));
              if (var4 <= 40) {
                break L6;
              } else {
                var4 = 40;
                break L6;
              }
            }
            oi.field_q.b(5, 2147483647, 5, -5 + rq.field_x.field_gb + -5, var4);
            var5 = 5 + var4 - -2;
            var6 = param1;
            L7: while (true) {
              if (var6 >= 4 + dr.field_c) {
                de.field_b.b(10, 2147483647, qh.field_l - 360 >> 1, 360, -134 + qh.field_f - 10);
                Pool.field_P.b(0, 2147483647, 0, de.field_b.field_gb, 24);
                aa.field_b.b(24, 2147483647, 0, de.field_b.field_gb, -24 + de.field_b.field_Db);
                aa.field_b.field_F = rp.a(32450, 3, 1, aa.field_b.field_Db, 11579568, 8421504);
                c.field_e.b(5, 2147483647, 5, -10 + aa.field_b.field_gb, -2 + (-24 + (-10 + aa.field_b.field_Db)));
                ba.field_vb.b(-24 + (aa.field_b.field_Db - 5), param1 ^ 2147483647, (-80 + aa.field_b.field_gb) / 2, 80, 24);
                da.a(true);
                break L0;
              } else {
                L8: {
                  L9: {
                    if (var6 != 1) {
                      break L9;
                    } else {
                      if (dg.field_T.length < 2) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (var6 != 3) {
                      break L10;
                    } else {
                      if (ji.field_g > 1) {
                        break L10;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L11: {
                    if (param0) {
                      break L11;
                    } else {
                      if (var6 == 3) {
                        var14 = oi.field_v[var6];
                        var7 = oi.field_v[var6];
                        oi.field_v[var6].field_Db = 0;
                        var14.field_gb = 0;
                        var8 = 0;
                        L12: while (true) {
                          if (mc.field_f[var6].length <= var8) {
                            break L8;
                          } else {
                            L13: {
                              if (null == mc.field_f[var6][var8]) {
                                break L13;
                              } else {
                                var9 = mc.field_f[var6][var8];
                                mc.field_f[var6][var8].field_Db = 0;
                                var9.field_gb = 0;
                                break L13;
                              }
                            }
                            var8++;
                            continue L12;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L14: {
                    if (!param0) {
                      break L14;
                    } else {
                      if (0 == var6) {
                        var7 = oi.field_v[var6];
                        oi.field_v[var6].field_Db = 0;
                        var7.field_gb = 0;
                        var8 = 0;
                        L15: while (true) {
                          if (~var8 <= ~mc.field_f[var6].length) {
                            break L8;
                          } else {
                            L16: {
                              if (null == mc.field_f[var6][var8]) {
                                break L16;
                              } else {
                                var9 = mc.field_f[var6][var8];
                                mc.field_f[var6][var8].field_Db = 0;
                                var9.field_gb = 0;
                                break L16;
                              }
                            }
                            var8++;
                            continue L15;
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  L17: {
                    L18: {
                      if (!param0) {
                        break L18;
                      } else {
                        if (var6 < 4) {
                          break L18;
                        } else {
                          if (null == vl.field_p) {
                            break L18;
                          } else {
                            if (!vl.field_p[-4 + var6]) {
                              break L18;
                            } else {
                              stackOut_35_0 = 1;
                              stackIn_37_0 = stackOut_35_0;
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    stackOut_36_0 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    break L17;
                  }
                  var7_int = stackIn_37_0;
                  if (var7_int != 0) {
                    var8_ref_vh = oi.field_v[var6];
                    oi.field_v[var6].field_Db = 0;
                    var8_ref_vh.field_gb = 0;
                    var15 = 0;
                    var9_int = var15;
                    L19: while (true) {
                      if (~var15 <= ~mc.field_f[var6].length) {
                        break L8;
                      } else {
                        L20: {
                          if (mc.field_f[var6][var15] == null) {
                            break L20;
                          } else {
                            var10 = mc.field_f[var6][var15];
                            mc.field_f[var6][var15].field_Db = 0;
                            var10.field_gb = 0;
                            break L20;
                          }
                        }
                        var15++;
                        continue L19;
                      }
                    }
                  } else {
                    L21: {
                      oi.field_v[var6].b(var5, 2147483647, 5, 103, var3);
                      var8 = 110;
                      if (!param0) {
                        if (null == mc.field_f[var6][0]) {
                          break L21;
                        } else {
                          var9 = mc.field_f[var6][0];
                          mc.field_f[var6][0].field_Db = 0;
                          var9.field_gb = 0;
                          break L21;
                        }
                      } else {
                        mc.field_f[var6][0].a(var8, true, 2, var3, ja.field_b, 38, var5);
                        var8 += 40;
                        break L21;
                      }
                    }
                    var9_int = 2 + -var8 + (-5 + uq.field_f.field_gb);
                    var10_int = mc.field_f[var6].length - 1;
                    var11 = 0;
                    L22: while (true) {
                      if (var11 >= var10_int) {
                        var5 = var5 + (2 + var3);
                        break L8;
                      } else {
                        var12 = var11 * var9_int / var10_int;
                        mc.field_f[var6][1 + var11].a(var12 + var8, true, 2, var3, ja.field_b, -2 + ((var11 + 1) * var9_int / var10_int - var12), var5);
                        var11++;
                        continue L22;
                      }
                    }
                  }
                }
                var6++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "al.OA(" + param0 + 44 + param1 + 41);
        }
    }

    final boolean d(byte param0) {
        if (param0 <= 68) {
            ((al) this).field_x = 56;
        }
        return !((al) this).field_l[0].field_s ? true : false;
    }

    final void c(byte param0) {
        qe var2 = null;
        qe var3 = null;
        ge var4 = null;
        int var5 = 0;
        int var6 = 0;
        dl var7 = null;
        int var8 = 0;
        pq var9 = null;
        int var10 = 0;
        var10 = Pool.field_O;
        if (((al) this).j(41).field_q != 0) {
          return;
        } else {
          if (((al) this).field_u.c((byte) 113) == ((al) this).field_u.a((byte) -127)) {
            return;
          } else {
            var2 = (qe) (Object) ((al) this).field_u.b(-1);
            var3 = (qe) (Object) ((al) this).field_u.a((byte) -127);
            var3.field_T.field_v = 0;
            var4 = var3.field_T;
            this.d(-14894, var4.g(-65));
            var5 = 0;
            L0: while (true) {
              if (var5 >= ((al) this).field_l.length) {
                var5 = 89 % ((41 - param0) / 37);
                var6 = 0;
                L1: while (true) {
                  if (((al) this).field_w.length <= var6) {
                    L2: {
                      var3.field_q = 0;
                      var3.field_m.d((byte) 83);
                      var3.field_s = uk.field_a;
                      if (null == ((al) this).field_i) {
                        ((al) this).field_i = new ko();
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ((al) this).field_i.a((byte) -84, (ma) (Object) var2);
                    return;
                  } else {
                    var7 = ((al) this).field_w[var6];
                    var7.a((byte) 113, var4);
                    if (null != var7.field_c) {
                      var8 = 0;
                      L3: while (true) {
                        if (var7.field_c.a((byte) 101) > var8) {
                          var9 = ((al) this).field_l[var7.field_c.a(var8, 2229)];
                          var9.field_k = var7.field_f;
                          var9.field_p = true;
                          var9.field_g = var7.field_g;
                          var8++;
                          continue L3;
                        } else {
                          var6++;
                          continue L1;
                        }
                      }
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
              } else {
                ((al) this).field_l[var5].a(var4, -1285);
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    final void g(byte param0) {
        qe var3 = null;
        aa var4_ref_aa = null;
        int var4 = 0;
        cr var5 = null;
        dl var6 = null;
        qe var7 = null;
        qe stackIn_6_0 = null;
        qe stackIn_7_0 = null;
        qe stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        qe stackOut_5_0 = null;
        qe stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        qe stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int discarded$2 = 0;
        qa.a(((al) this).field_e, ((al) this).field_c, ((al) this).field_l);
        var7 = ((al) this).j(79);
        if (param0 <= -2) {
          L0: {
            if (var7.field_n == -1) {
              var7.field_n = hb.field_s;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            ((al) this).a(6582, ((al) this).field_l, ((al) this).j(110));
            int discarded$3 = 0;
            stackOut_5_0 = (qe) var7;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!this.d()) {
              stackOut_7_0 = (qe) (Object) stackIn_7_0;
              stackOut_7_1 = 1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              stackOut_6_0 = (qe) (Object) stackIn_6_0;
              stackOut_6_1 = 2;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L1;
            }
          }
          L2: {
            stackIn_8_0.field_q = stackIn_8_1;
            var3 = ((al) this).j(60);
            ((al) this).field_j = 0;
            if (!var3.field_m.c(0)) {
              var4_ref_aa = new aa(var3.field_m);
              var5 = (cr) (Object) var4_ref_aa.a(0);
              L3: while (true) {
                if (var5 == null) {
                  break L2;
                } else {
                  var6 = ((al) this).field_w[var5.field_r];
                  if (!var6.b(var5.field_n, 304)) {
                    var6.a(var5.field_n, 75);
                    ((al) this).field_j = ((al) this).field_j + 1;
                    var5 = (cr) (Object) var4_ref_aa.c((byte) -71);
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          var4 = var7.field_q;
          if (0 == var4) {
            throw new IllegalStateException();
          } else {
            L4: {
              if (1 != var4) {
                if (2 != var4) {
                  break L4;
                } else {
                  var7.c(2, ((al) this).field_f.a((byte) 121));
                  break L4;
                }
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void m() {
        ci.d((byte) -125);
        lf.a(4, (byte) 93);
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        pq var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var6 = 0;
          var7 = ((al) this).field_l[param3];
          var8 = var7.field_g;
          var7.field_g = param1;
          var9 = var7.field_k;
          var7.field_k = param0;
          var7.field_s = true;
          var7.field_o = false;
          var7.d((byte) -58);
          var7.field_p = true;
          if (!param4) {
            break L0;
          } else {
            this.b(param3, (byte) -123);
            break L0;
          }
        }
        var6 = 0;
        this.a((byte) 77);
        var10 = 0;
        L1: while (true) {
          if (hh.field_e <= var10) {
            if (var6 != 0) {
              var7.field_g = var8;
              var7.field_k = var9;
              var10 = 87 / ((param2 - -1) / 34);
              return false;
            } else {
              var7.field_p = true;
              return true;
            }
          } else {
            if (param3 != k.field_N[var10][0]) {
              if (param3 != k.field_N[var10][1]) {
                var10++;
                continue L1;
              } else {
                var6++;
                var10++;
                continue L1;
              }
            } else {
              var6++;
              var10++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, li param1) {
        qe var3 = null;
        RuntimeException var3_ref = null;
        qe var4 = null;
        Object var5 = null;
        pq var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(9437184, 28311552, param1, -30896, 0, 4096);
              var3 = ((al) this).j(97);
              var3.field_u = ((al) this).field_f.a(false);
              var4 = var3;
              var5 = this;
              var6 = ((al) var5).field_l[0];
              var4.field_P = var6.field_g;
              var4.field_Q = var6.field_k;
              if (param0 >= 34) {
                break L1;
              } else {
                ((al) this).k(50);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("al.UA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void i() {
        field_k = new vh(0L, (vh) null, qh.field_l - ff.field_e[4].field_z >> 1, -120 + qh.field_f, ff.field_e[4].field_z, qh.field_f, (String) null);
        ia.a(true, field_k);
        field_k.field_F = ff.field_e;
        qa.field_v = new vh("tut_close", (vh) null);
        vh dupTemp$0 = new vh("tut_skip", (vh) null);
        jq.field_d = dupTemp$0;
        field_k.a(-111, dupTemp$0);
        vh dupTemp$1 = new vh("tut_prev", (vh) null);
        pl.field_b = dupTemp$1;
        field_k.a(-104, dupTemp$1);
        pl.field_b.b(72, 2147483647, 277, 15, 15);
        qa.field_v.b(72, 2147483647, 297, 15, 15);
        jq.field_d.b(72, 2147483647, 317, 15, 15);
        pl.field_b.field_xb = vm.field_d[8];
        pl.field_b.field_G = vm.field_d[12];
        pl.field_b.field_hb = vm.field_d[4];
        pl.field_b.field_ab = vm.field_d[0];
        qa.field_v.field_ab = vm.field_d[2];
        qa.field_v.field_G = vm.field_d[14];
        qa.field_v.field_hb = vm.field_d[6];
        qa.field_v.field_xb = vm.field_d[10];
        jq.field_d.field_xb = vm.field_d[11];
        jq.field_d.field_hb = vm.field_d[7];
        jq.field_d.field_G = vm.field_d[15];
        jq.field_d.field_ab = vm.field_d[3];
    }

    final void a(int[] param0, int param1, byte param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        IllegalArgumentException var14 = null;
        int var14_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
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
            var7_int = ao.a(param1, true);
            var8 = hc.a(2047, param1);
            var9 = ao.a(param3, true);
            var10 = hc.a(2047, param3);
            param0[9] = aj.a(var10, false, var7_int);
            param0[10] = aj.a(var9, false, var7_int);
            param0[3] = var9;
            param0[5] = 0;
            param0[4] = -var10;
            param0[11] = var8;
            param0[6] = aj.a(param0[5], false, param0[10]) + -aj.a(param0[4], false, param0[11]);
            param0[7] = aj.a(param0[3], false, param0[11]) + -aj.a(param0[5], false, param0[9]);
            param0[8] = aj.a(param0[4], false, param0[9]) + -aj.a(param0[3], false, param0[10]);
            var11 = param5 * 65536 / 128;
            var12 = 53 / ((param2 - -17) / 58);
            var13 = param4 * 65536 / 128;
            try {
              L1: {
                var14_int = rf.a(-aj.a(var11, false, var11) + (65536 + -aj.a(var13, false, var13)), -122);
                param0[0] = ((al) this).field_l[0].field_g - -((aj.a(param0[3], false, var11) + (aj.a(param0[6], false, var13) + aj.a(param0[9], false, var14_int))) * 8);
                param0[1] = ((al) this).field_l[0].field_k + 8 * (aj.a(param0[4], false, var11) + aj.a(param0[7], false, var13) + aj.a(param0[10], false, var14_int));
                param0[2] = ((al) this).field_l[0].field_j + (aj.a(param0[5], false, var11) - -aj.a(param0[8], false, var13) + aj.a(param0[11], false, var14_int)) * 8;
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var14 = (IllegalArgumentException) (Object) decompiledCaughtException;
              System.out.println("Oh dear. Strike point is way wrong: " + param5 + "," + param4 + ":\n" + var14.getMessage());
              throw var14;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var7 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("al.J(");
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final void h() {
        this.a(true, new int[72]);
    }

    al(int param0, int param1, String[] param2, int param3) {
        qe var5 = null;
        ((al) this).field_y = 0;
        ((al) this).field_z = 0;
        ((al) this).field_m = false;
        ((al) this).field_u = new ko();
        ((al) this).field_r = null;
        ((al) this).field_t = null;
        ((al) this).field_a = null;
        try {
            ((al) this).field_q = param0;
            ((al) this).field_n = param2.length;
            ((al) this).field_A = param3;
            ((al) this).field_h = param2;
            ((al) this).a(param1, (byte) -128);
            this.d(-14894, ((al) this).field_f.i(26840));
            int discarded$0 = -58;
            this.h();
            int discarded$1 = 10571;
            this.g();
            var5 = new qe();
            ((al) this).field_u.b((byte) -60, (ma) (Object) var5);
            var5.field_L = ((al) this).field_A;
            ((al) this).b(ga.a(512, true, ea.field_r) + 1, 456);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "al.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[8192];
    }
}
