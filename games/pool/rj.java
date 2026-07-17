/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj extends sq {
    static String field_g;
    static String field_i;
    static int field_f;
    static String field_j;
    int[] field_e;
    static int field_h;

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          if (param2 == -1) {
            break L0;
          } else {
            boolean discarded$2 = rj.a(56, -99, 1, -23);
            break L0;
          }
        }
        L1: {
          if (sa.field_f == null) {
            break L1;
          } else {
            if (qi.field_a != 13) {
              break L1;
            } else {
              sa.field_f = null;
              return true;
            }
          }
        }
        if (rg.field_p) {
          if (mp.g((byte) -121)) {
            L2: {
              if (!th.a(param3, -103, param1)) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            L3: {
              L4: {
                var4 = stackIn_22_0;
                if (80 == qi.field_a) {
                  break L4;
                } else {
                  if (84 == qi.field_a) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              rg.field_p = false;
              var4 = 1;
              break L3;
            }
            L5: {
              if (qi.field_a == 13) {
                cl.a(param2 + 14852);
                rg.field_p = false;
                var4 = 1;
                break L5;
              } else {
                break L5;
              }
            }
            return var4 != 0;
          } else {
            return false;
          }
        } else {
          L6: {
            if (fm.field_H) {
              break L6;
            } else {
              if (qi.field_a == 9) {
                break L6;
              } else {
                if (10 == qi.field_a) {
                  break L6;
                } else {
                  if (qi.field_a != 11) {
                    if (qi.field_a != 80) {
                      return false;
                    } else {
                      if (mp.g((byte) -108)) {
                        rg.field_p = true;
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
              }
            }
          }
          return tf.a(param2 + 15586, param0, param3);
        }
    }

    private final void f(int param0, int param1) {
        if (!(((rj) this).field_e[param0] <= 0)) {
            ((rj) this).field_e[param0] = ((rj) this).field_e[param0] - 1;
        }
    }

    final int a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        aa var6_ref_aa = null;
        int var6 = 0;
        cr var7_ref_cr = null;
        int var7 = 0;
        int var8 = 0;
        qe var9 = null;
        qe var10 = null;
        var8 = Pool.field_O;
        var9 = ((rj) this).field_d.j(96);
        var10 = var9;
        if (var10 == null) {
          throw new IllegalStateException("Couldn't get the last shot to examine!");
        } else {
          var3 = 69 % ((-37 - param0) / 60);
          if (2 != var10.field_q) {
            throw new IllegalStateException("Shot not finished yet, foo!");
          } else {
            L0: {
              var4 = ll.field_f;
              if (((rj) this).field_d.d((byte) 125)) {
                var4 = var4 | (nr.field_R | um.field_c);
                var10.field_t = true;
                var10.field_w = (byte)(var10.field_w - 1);
                var10.a(3, -14, new int[1]);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (var10.field_n != -1) {
                break L1;
              } else {
                var10.field_w = (byte)(var10.field_w - 1);
                var10.field_t = true;
                var10.a(7, -14, new int[1]);
                break L1;
              }
            }
            var5 = 0;
            var6_ref_aa = new aa(var10.field_m);
            var7_ref_cr = (cr) (Object) var6_ref_aa.b((byte) -92);
            L2: while (true) {
              if (var7_ref_cr == null) {
                L3: {
                  if (var10.field_M < 0) {
                    L4: {
                      if (var5 == 0) {
                        var10.a(18, -14, new int[1]);
                        this.f(var10.field_L, 8640);
                        break L4;
                      } else {
                        var10.field_w = (byte)(var10.field_w + var5);
                        break L4;
                      }
                    }
                    if (!var10.field_t) {
                      break L3;
                    } else {
                      var10.a(19, -14, new int[0]);
                      this.f(var10.field_L, 8640);
                      break L3;
                    }
                  } else {
                    if (!var10.field_t) {
                      if (var5 == 0) {
                        var4 = nd.field_j;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      var10.a(22, -14, new int[1]);
                      this.f(var10.field_L, 8640);
                      var4 = var4 | (nr.field_R | ob.field_F);
                      break L3;
                    }
                  }
                }
                L5: {
                  if (this.e((byte) -91) <= 1) {
                    if (((rj) this).a((byte) 36, var10.field_L)) {
                      var4 = var4 | ag.field_e;
                      break L5;
                    } else {
                      var4 = var4 | hm.field_e;
                      break L5;
                    }
                  } else {
                    var6 = 0;
                    var7 = 1;
                    L6: while (true) {
                      L7: {
                        if (((rj) this).field_d.field_l.length <= var7) {
                          break L7;
                        } else {
                          if (!((rj) this).field_d.field_l[var7].field_s) {
                            var7++;
                            continue L6;
                          } else {
                            var6 = 1;
                            break L7;
                          }
                        }
                      }
                      if (var6 != 0) {
                        break L5;
                      } else {
                        var4 = var4 | (ob.field_F | nr.field_R);
                        break L5;
                      }
                    }
                  }
                }
                return var4;
              } else {
                L8: {
                  if (0 == var7_ref_cr.field_n) {
                    var10.field_w = (byte)(var10.field_w - 1);
                    break L8;
                  } else {
                    L9: {
                      if (var7_ref_cr.field_n != 8) {
                        break L9;
                      } else {
                        if (!var10.field_t) {
                          var10.a(20, -14, new int[1]);
                          this.d(var10.field_L, 165);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var5++;
                    break L8;
                  }
                }
                var7_ref_cr = (cr) (Object) var6_ref_aa.b(-95);
                continue L2;
              }
            }
          }
        }
    }

    final void a(ge param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (((rj) this).field_d.field_h.length != ((rj) this).field_e.length) {
                ((rj) this).field_e = new int[((rj) this).field_d.field_h.length];
                break L1;
              } else {
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                var4 = param0.g(-119);
                ((rj) this).field_e[var3_int] = rb.b(var4, 254) >> 4;
                var3_int++;
                if (((rj) this).field_d.field_h.length == var3_int) {
                  break L3;
                } else {
                  ((rj) this).field_e[var3_int] = rb.b(var4, 15);
                  var3_int++;
                  if (var3_int != ((rj) this).field_d.field_h.length) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param1) {
                  break L4;
                } else {
                  field_j = null;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("rj.M(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
    }

    final void a(qe param0, boolean param1) {
        try {
            super.a(param0, param1);
            param0.field_N = ((rj) this).field_e[param0.field_L];
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "rj.K(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static long a(long param0, byte param1, long param2) {
        long var5 = 0L;
        L0: {
          var5 = param0 * param2;
          if (param0 >= 0L) {
            break L0;
          } else {
            if (param2 >= 0L) {
              break L0;
            } else {
              if (var5 < 0L) {
                throw new IllegalStateException("Overflow: Multiplied two negative numbers (?!) mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param2 + "[" + cr.a((byte) 89, param2) + ", " + Long.toString(param2, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          L2: {
            L3: {
              if (0L >= param0) {
                break L3;
              } else {
                if (0L > param2) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (param0 >= 0L) {
              break L1;
            } else {
              if (param2 <= 0L) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (var5 <= 0L) {
            break L1;
          } else {
            throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param2 + "[" + cr.a((byte) 89, param2) + ", " + Long.toString(param2, 16) + "]) and got a positive number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
          }
        }
        L4: {
          if (param0 <= 0L) {
            break L4;
          } else {
            if (param2 <= 0L) {
              break L4;
            } else {
              if (0L <= var5) {
                break L4;
              } else {
                throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param0 + "[" + cr.a((byte) 89, param0) + ", " + Long.toString(param0, 16) + "], " + param2 + "[" + cr.a((byte) 89, param2) + ", " + Long.toString(param2, 16) + "]) and got a negative number: " + var5 + "[" + cr.a((byte) 89, var5) + ", " + Long.toString(var5, 16) + "]");
              }
            }
          }
        }
        return var5;
    }

    rj(al param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            ((rj) this).field_e = new int[((rj) this).field_d.field_h.length];
            var2_int = 0;
            L1: while (true) {
              if (((rj) this).field_e.length <= var2_int) {
                break L0;
              } else {
                ((rj) this).field_e[var2_int] = 3;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("rj.<init>(");
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
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final static float e(int param0, int param1) {
        if (param1 != 3) {
            return -1.207617998123169f;
        }
        return de.a(-1, 3, param0);
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Pool.field_O;
        var2 = 0;
        var3 = 0;
        if (param0 <= -71) {
          L0: while (true) {
            if (var3 >= ((rj) this).field_e.length) {
              return var2;
            } else {
              if (((rj) this).a((byte) 115, var3)) {
                var2++;
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return -24;
        }
    }

    final boolean f(int param0) {
        if (param0 <= 113) {
            int discarded$0 = ((rj) this).h(-114);
            return false;
        }
        return false;
    }

    final int b(int param0) {
        int var2 = -32 / ((-79 - param0) / 38);
        return 1;
    }

    final dd b(qe param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 != 1) {
              var4 = null;
              boolean discarded$2 = ((rj) this).a(40, (byte) -54, (qe) null);
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("rj.JA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return (dd) (Object) stackIn_3_0;
    }

    final int a(int param0) {
        if (param0 != -1) {
            ((rj) this).field_e = null;
            return 0;
        }
        return 0;
    }

    final int[] a(int param0, byte param1) {
        if (param1 != -32) {
            this.d(28, 64);
        }
        return uj.field_a;
    }

    final int m(int param0) {
        if (param0 != 0) {
            field_i = null;
        }
        return 1 + ((rj) this).field_d.field_h.length >> 1;
    }

    final int h(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qe var6 = null;
        L0: {
          var5 = Pool.field_O;
          var6 = ((rj) this).field_d.j(45);
          var3 = 0;
          var4 = var6.field_u;
          if (var4 != 2) {
            if (var4 != 3) {
              if (var4 == 1) {
                var3 = ll.field_f | nr.field_R;
                break L0;
              } else {
                var3 = ll.field_f;
                break L0;
              }
            } else {
              var3 = nr.field_V | ll.field_f;
              break L0;
            }
          } else {
            var3 = ll.field_f | nr.field_Q;
            break L0;
          }
        }
        L1: {
          var6.field_t = true;
          if (~var6.field_M <= param0) {
            var3 = var3 | ob.field_F;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          this.f(var6.field_L, 8640);
          if (this.e((byte) -125) > 1) {
            break L2;
          } else {
            if (((rj) this).a((byte) -99, var6.field_L)) {
              var3 = var3 | ag.field_e;
              break L2;
            } else {
              var3 = var3 | hm.field_e;
              break L2;
            }
          }
        }
        return var3;
    }

    final boolean a(int param0, byte param1, int param2) {
        if (param1 < 122) {
            field_f = -9;
        }
        return 0 != param2 ? true : false;
    }

    final boolean a(byte param0, int param1) {
        int var3 = -125 % ((-16 - param0) / 46);
        return ((rj) this).field_e[param1] > 0 ? true : false;
    }

    final void c(int param0) {
        if (param0 >= -25) {
            field_h = 78;
        }
    }

    private final void d(int param0, int param1) {
        if (!(15 <= ((rj) this).field_e[param0])) {
            ((rj) this).field_e[param0] = ((rj) this).field_e[param0] + 1;
        }
        if (param1 != 165) {
            int discarded$0 = ((rj) this).m(-27);
        }
    }

    final int j(int param0) {
        int var2 = 0;
        if (ko.a(param0, (byte) 99)) {
            if (((rj) this).field_d.field_s == 2) {
                var2 = ga.a(14, true, ea.field_r);
                return var2 - (-1 + -(var2 / 7));
            }
        }
        return -1;
    }

    final static void c(byte param0) {
        qk.field_f.field_hb = dq.a(1, param0 ^ -45, Integer.toString(fr.field_n));
        int discarded$6 = 93;
        dk.a(qk.field_f);
        tn.field_w.field_pb = 2 < fr.field_n ? true : false;
        ih.field_e.field_pb = fr.field_n < 8 ? true : false;
        if (param0 != -45) {
            rj.c((byte) -61);
        }
    }

    final boolean a(int param0, int param1) {
        if (param1 >= -28) {
            field_g = null;
            return false;
        }
        return false;
    }

    final int a(boolean param0) {
        if (param0) {
            return 96;
        }
        return 1;
    }

    final byte b(int param0, int param1) {
        if (param1 != 30554) {
            Object var4 = null;
            int discarded$0 = ((rj) this).a((qe) null, 32);
        }
        if (param0 != 0) {
            return (byte) 0;
        }
        return (byte) -1;
    }

    final int a(qe param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -41 % ((-32 - param1) / 40);
            stackOut_0_0 = -1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("rj.CA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    public static void d() {
        field_j = null;
        field_g = null;
        field_i = null;
    }

    final boolean a(int param0, byte param1, qe param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 9) {
                break L1;
              } else {
                int discarded$2 = ((rj) this).a(97);
                break L1;
              }
            }
            L2: {
              if (param0 <= 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("rj.EA(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final boolean c(qe param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 <= -33) {
              L1: {
                if (param0.field_n < 0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("rj.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final int i(int param0) {
        if (param0 != 26840) {
            int[] discarded$0 = ((rj) this).a(-19, (byte) -27);
        }
        return 16;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Spectate";
        field_g = "You are <%2>!";
        field_j = "Off";
        field_h = 165;
    }
}
