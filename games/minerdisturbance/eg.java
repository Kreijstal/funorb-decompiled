/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class eg implements ad, cf {
    int field_r;
    int field_c;
    static ea field_b;
    static String field_g;
    int field_i;
    private int field_o;
    private boolean field_f;
    static wh field_p;
    int field_d;
    int field_a;
    int field_q;
    int field_j;
    int field_l;
    int field_e;
    we field_k;
    int field_n;
    static ea[] field_m;
    static int field_h;

    private final void a(int param0, byte param1, int param2, fe param3) {
        int var5 = -123 / ((param1 - 47) / 60);
        this.a(0, true, ((eg) this).field_o, ((eg) this).field_q, param2, 0, param0, param3);
    }

    public final int a(int param0, fe param1, int param2) {
        if (param0 != 28793) {
            ((eg) this).field_j = 105;
        }
        return this.a(param1, param2, -4, 0);
    }

    final void a(int param0, eg param1) {
        param1.field_q = ((eg) this).field_q;
        param1.field_n = ((eg) this).field_n;
        param1.field_k = ((eg) this).field_k;
        param1.field_c = ((eg) this).field_c;
        int var3 = 5 % ((-58 - param0) / 37);
        param1.field_l = ((eg) this).field_l;
        param1.field_d = ((eg) this).field_d;
        param1.field_r = ((eg) this).field_r;
        param1.field_f = ((eg) this).field_f;
        param1.field_i = ((eg) this).field_i;
        param1.field_j = ((eg) this).field_j;
        param1.field_o = ((eg) this).field_o;
        param1.field_e = ((eg) this).field_e;
        param1.field_a = ((eg) this).field_a;
    }

    public final int a(int param0) {
        int var2 = -44 % ((61 - param0) / 61);
        return ((eg) this).field_k.field_I - -((eg) this).field_k.field_E;
    }

    public final int a(int param0, fe param1) {
        if (param0 != 14463) {
            return 15;
        }
        nf discarded$0 = ((eg) this).c(0, param1);
        return param1.field_B.a(-1) + ((eg) this).field_n - -((eg) this).field_i;
    }

    final static bj a(int param0, int param1, boolean param2, boolean param3, boolean param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            int var8 = 0;
            ij var9 = null;
            bj stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            bj stackOut_11_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (jl.field_fb.field_k != null) {
                    fe.field_z = new me(jl.field_fb.field_k, 5200, 0);
                    jl.field_fb.field_k = null;
                    var6 = (Object) (Object) new uh(255, fe.field_z, new me(jl.field_fb.field_f, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var7 = null;
                  var8 = -4 / ((param0 - 18) / 41);
                  if (fe.field_z == null) {
                    break L2;
                  } else {
                    L3: {
                      if (null != aa.field_h) {
                        break L3;
                      } else {
                        aa.field_h = new me[jl.field_fb.field_e.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (null != aa.field_h[param1]) {
                        break L4;
                      } else {
                        aa.field_h[param1] = new me(jl.field_fb.field_e[param1], 12000, 0);
                        jl.field_fb.field_e[param1] = null;
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new uh(param1, fe.field_z, aa.field_h[param1], 2097152);
                    break L2;
                  }
                }
                L5: {
                  var9 = ke.field_U.a(param1, (uh) var7, param2, 0, (uh) var6);
                  if (!param3) {
                    break L5;
                  } else {
                    var9.b(-37);
                    break L5;
                  }
                }
                stackOut_11_0 = new bj((vb) (Object) var9, param4, param5);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_12_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final nf c(int param0, fe param1) {
        if (null == param1.field_B) {
            param1.field_B = (nf) (Object) new bm();
        }
        if (!((eg) this).field_f) {
            this.d(119, param1);
        } else {
            ((bm) (Object) param1.field_B).a(((eg) this).field_d, this.a(param1, 0), ((eg) this).field_k, ((eg) this).a(param1, (byte) -122), ((eg) this).a(param1, false), (byte) 101, ((eg) this).field_e, ((eg) this).field_j);
        }
        if (param0 != 0) {
            ((eg) this).field_d = -104;
        }
        return param1.field_B;
    }

    public final int b(int param0, fe param1, int param2) {
        if (param0 != 100) {
            return 28;
        }
        return this.a(param1, 0, (byte) 26, param2);
    }

    public final void a(int param0, int param1, int param2, int param3, fe param4) {
        nf var13 = null;
        nf var14 = null;
        int var7 = 0;
        mg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (!(!param4.k(42))) {
            var13 = ((eg) this).c(0, param4);
            var14 = var13;
            var7 = var14.a((byte) 39, param2);
            var8 = var13.field_f[var7];
            var9 = var14.a(param2, (byte) -124);
            var10 = this.a(param4, param1, -4, var9);
            var11 = ((eg) this).b(100, param4, param3) + Math.max(0, var8.field_h);
            var12 = ((eg) this).b(100, param4, param3) + Math.min(this.a(param4, 0), Math.min(var8.field_i, 1 + var7 >= var14.field_f.length ? var8.field_i : var13.field_f[var7 - -1].field_h));
            wf.a(param3 + param4.field_t, param1 - -param4.field_u, (byte) 8, param1 - -param4.field_u + param4.field_v, param4.field_q + (param3 + param4.field_t));
            bd.field_c.a(var10, var12, var11, (byte) 97, var10, ((eg) this).field_a);
            tk.b(true);
        }
        if (param0 != 13034) {
            ((eg) this).field_k = null;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, fe param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = MinerDisturbance.field_ab;
          wf.a(param7.field_t + param4, param6 + param7.field_u, (byte) 8, param6 - (-param7.field_u - param7.field_v), param7.field_q + param4 - -param7.field_t);
          var9 = ((eg) this).a(param7, false);
          var10 = this.a(param7, 0);
          if (!((eg) this).field_f) {
            L1: {
              var12 = ((eg) this).field_d;
              if (0 == var12) {
                var11 = ((eg) this).field_k.field_I;
                break L1;
              } else {
                if (2 != var12) {
                  L2: {
                    if (3 != var12) {
                      if ((var12 ^ -1) != -2) {
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  var11 = ((eg) this).field_k.field_I - -(-((eg) this).field_k.field_E + -((eg) this).field_k.field_I + var10 >> 2073389121);
                  break L1;
                } else {
                  var11 = -((eg) this).field_k.field_E + var10;
                  break L1;
                }
              }
            }
            L3: {
              var12 = ((eg) this).field_j;
              if (0 == var12) {
                break L3;
              } else {
                if (-4 == (var12 ^ -1)) {
                  break L3;
                } else {
                  if (1 == var12) {
                    ((eg) this).field_k.b(((eg) this).a(param7, (byte) 101), (var9 >> -768530591) + this.a(param7, param6, -4, param5), var11 + this.a(param7, param0, (byte) 26, param4), param3, param2);
                    break L0;
                  } else {
                    if ((var12 ^ -1) != -3) {
                      break L0;
                    } else {
                      ((eg) this).field_k.c(((eg) this).a(param7, (byte) -114), this.a(param7, param6, -4, param5) + var9, this.a(param7, param0, (byte) 26, param4) + var11, param3, param2);
                      break L0;
                    }
                  }
                }
              }
            }
            ((eg) this).field_k.a(((eg) this).a(param7, (byte) -100), this.a(param7, param6, -4, param5), var11 + this.a(param7, param0, (byte) 26, param4), param3, param2);
            break L0;
          } else {
            int discarded$1 = ((eg) this).field_k.a(((eg) this).a(param7, (byte) 67), this.a(param7, param6, -4, param5), this.a(param7, param0, (byte) 26, param4), var9, var10, param3, param2, ((eg) this).field_j, ((eg) this).field_d, ((eg) this).field_e);
            break L0;
          }
        }
        tk.b(param1);
    }

    final static boolean b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 19) {
            break L0;
          } else {
            boolean discarded$2 = eg.b(122);
            break L0;
          }
        }
        L1: {
          L2: {
            if (kj.a(false)) {
              break L2;
            } else {
              if (pj.field_a > 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final int a(fe param0, int param1) {
        if (param1 != 0) {
            ((eg) this).field_q = 121;
        }
        return param0.field_q - (((eg) this).field_c - -((eg) this).field_l);
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void c(int param0) {
        field_b = null;
        field_g = null;
        field_m = null;
        field_p = null;
        if (param0 != -7709) {
            field_g = null;
        }
    }

    private final int a(fe param0, int param1, byte param2, int param3) {
        if (param2 != 26) {
            Object var6 = null;
            String discarded$0 = ((eg) this).a((fe) null, (byte) 74);
        }
        return param1 + (param0.field_o + param3 + param0.field_t + ((eg) this).field_c);
    }

    final static boolean a(bj param0, int param1, bj param2, bj param3) {
        L0: {
          if (!param2.a((byte) 127)) {
            break L0;
          } else {
            if (!param2.a(false, "commonui")) {
              break L0;
            } else {
              L1: {
                if (!param0.a((byte) 95)) {
                  break L1;
                } else {
                  if (!param0.a(false, "commonui")) {
                    break L1;
                  } else {
                    if (param1 == 4) {
                      L2: {
                        if (!param3.a((byte) 83)) {
                          break L2;
                        } else {
                          if (!param3.a(false, "button.gif")) {
                            break L2;
                          } else {
                            return true;
                          }
                        }
                      }
                      return false;
                    } else {
                      return false;
                    }
                  }
                }
              }
              return false;
            }
          }
        }
        return false;
    }

    public final int a(fe param0, int param1, boolean param2, int param3, int param4, int param5) {
        if (param2) {
            Object var8 = null;
            int discarded$0 = ((eg) this).b(77, (fe) null);
        }
        nf discarded$1 = ((eg) this).c(0, param0);
        return param0.field_B.a(true, -((eg) this).a(28793, param0, param1) + param4, -((eg) this).b(100, param0, param5) + param3);
    }

    public final void a(int param0, fe param1, int param2, int param3, int param4, boolean param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        mg var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        nf var17 = null;
        nf var18 = null;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var16 = MinerDisturbance.field_ab;
        if (param4 != param0) {
          L0: {
            if (param1.k(-126)) {
              L1: {
                var17 = ((eg) this).c(0, param1);
                var18 = var17;
                if (param4 < param0) {
                  var9 = param0;
                  var8 = param4;
                  break L1;
                } else {
                  var9 = param4;
                  var8 = param0;
                  break L1;
                }
              }
              var10 = var18.a((byte) 39, var8);
              var11 = var18.a((byte) 39, var9);
              wf.a(param1.field_t + param2, param3 - -param1.field_u, (byte) 8, param1.field_u + (param3 - -param1.field_v), param1.field_q + (param1.field_t + param2));
              var12 = var10;
              L2: while (true) {
                if (var12 > var11) {
                  tk.b(true);
                  break L0;
                } else {
                  L3: {
                    var13 = var17.field_f[var12];
                    if (var10 == var12) {
                      stackOut_11_0 = var18.a(var8, (byte) -125);
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = var13.field_d[0];
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_12_0;
                    if (var11 == var12) {
                      stackOut_16_0 = var18.a(var9, (byte) -122);
                      stackIn_17_0 = stackOut_16_0;
                      break L4;
                    } else {
                      if (var13 != null) {
                        stackOut_15_0 = var13.field_d[-1 + var13.field_d.length];
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_17_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                  }
                  var15 = stackIn_17_0;
                  bd.field_c.a(((eg) this).field_r >>> 1732030488, 0, var13.field_i, ((eg) this).field_r, var15 + -var14, this.a(param1, param3, -4, var14), param1.field_o + (((eg) this).field_c + (param1.field_t + (param2 + var13.field_h))));
                  var12++;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
          L5: {
            if (!param5) {
              break L5;
            } else {
              ((eg) this).field_r = -102;
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void d(int param0, fe param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = MinerDisturbance.field_ab;
          if (param1.field_B == null) {
            param1.field_B = (nf) (Object) new bm();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = ((eg) this).a(param1, false);
          var4 = this.a(param1, 0);
          var6 = ((eg) this).field_d;
          if (0 == var6) {
            var5 = ((eg) this).field_k.field_I;
            break L1;
          } else {
            if (2 == var6) {
              var5 = -((eg) this).field_k.field_E + var4;
              break L1;
            } else {
              L2: {
                if ((var6 ^ -1) != -4) {
                  if (-2 != (var6 ^ -1)) {
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              var5 = ((eg) this).field_k.field_I + (-((eg) this).field_k.field_E + (-((eg) this).field_k.field_I + var4) >> 2016393505);
              break L1;
            }
          }
        }
        L3: {
          L4: {
            var6 = ((eg) this).field_j;
            if (-1 == (var6 ^ -1)) {
              break L4;
            } else {
              if ((var6 ^ -1) == -4) {
                break L4;
              } else {
                if (1 == var6) {
                  if (!(param1.field_B instanceof bm)) {
                    break L3;
                  } else {
                    ((bm) (Object) param1.field_B).a(((eg) this).a(param1, (byte) 119), 27994, var5, ((eg) this).field_k, var3 >> 1625099841);
                    break L3;
                  }
                } else {
                  if (var6 == 2) {
                    if (!(param1.field_B instanceof bm)) {
                      break L3;
                    } else {
                      ((bm) (Object) param1.field_B).a(0, var3, ((eg) this).a(param1, (byte) -108), ((eg) this).field_k, var5);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
            }
          }
          if (!(param1.field_B instanceof bm)) {
            break L3;
          } else {
            ((bm) (Object) param1.field_B).a(0, ((eg) this).field_k, ((eg) this).a(param1, (byte) -121), 110, var5);
            break L3;
          }
        }
        L5: {
          if (param0 >= 41) {
            break L5;
          } else {
            var8 = null;
            eg.a(93, (byte) 88, (byte[]) null, -74, (java.math.BigInteger) null, (sb) null, (java.math.BigInteger) null);
            break L5;
          }
        }
    }

    final static void a(String param0, int param1, String param2, long param3, java.applet.Applet param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var9 = param4.getParameter("cookiehost");
                  var7 = var9;
                  var7 = var9;
                  var10 = param0 + "=" + param2 + "; version=1; path=/; domain=" + var9;
                  var7 = var10;
                  var7 = var10;
                  if (param3 >= 0L) {
                    var7 = var10 + "; Expires=" + e.a(sf.a((byte) 99) - -(1000L * param3), -128) + "; Max-Age=" + param3;
                    break L1;
                  } else {
                    var7 = var10 + "; Discard;";
                    break L1;
                  }
                }
                lk.a(param4, "document.cookie=\"" + var7 + "\"", (byte) -106);
                var8 = 39 / ((12 - param1) / 62);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var6 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final int a(fe param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            int discarded$0 = ((eg) this).b(10, (fe) null);
        }
        return -((eg) this).field_i + (-((eg) this).field_n + param0.field_v);
    }

    public void a(int param0, int param1, fe param2, int param3, boolean param4) {
        if (!(null != ((eg) this).field_k)) {
            return;
        }
        if (param0 != 12088) {
            return;
        }
        this.a(param1, (byte) -31, param3, param2);
    }

    private final int a(fe param0, int param1, int param2, int param3) {
        if (param2 != -4) {
            ((eg) this).field_n = -33;
        }
        return param0.field_p + param0.field_u + (param1 + ((eg) this).field_n + param3);
    }

    eg(we param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    String a(fe param0, byte param1) {
        int var3 = 99 / ((param1 - 0) / 33);
        return param0.field_s;
    }

    public final int b(int param0, fe param1) {
        if (param0 < 13) {
            return -39;
        }
        nf discarded$0 = ((eg) this).c(0, param1);
        return param1.field_B.b(102) - (-((eg) this).field_c - ((eg) this).field_l);
    }

    protected eg() {
    }

    final static void a(int param0, byte param1, byte[] param2, int param3, java.math.BigInteger param4, sb param5, java.math.BigInteger param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = MinerDisturbance.field_ab;
          var7 = th.a((byte) 24, param3);
          if (null == ae.field_d) {
            ae.field_d = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (4 <= var9) {
            L2: {
              L3: {
                if (null == bd.field_f) {
                  break L3;
                } else {
                  if (var7 <= bd.field_f.field_u.length) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              bd.field_f = new sb(var7);
              break L2;
            }
            L4: {
              L5: {
                bd.field_f.field_o = 0;
                bd.field_f.a(param0, param3, true, param2);
                bd.field_f.a(-1, var7);
                bd.field_f.a(var15, 31747);
                if (null == c.field_a) {
                  break L5;
                } else {
                  if (-101 >= (c.field_a.field_u.length ^ -1)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              c.field_a = new sb(100);
              break L4;
            }
            c.field_a.field_o = 0;
            c.field_a.c(10, 25564);
            if (param1 > 8) {
              var11 = 0;
              var9 = var11;
              L6: while (true) {
                if (var11 >= 4) {
                  c.field_a.b((byte) 122, param3);
                  c.field_a.a((byte) -49, param4, param6);
                  param5.a(0, c.field_a.field_o, true, c.field_a.field_u);
                  param5.a(0, bd.field_f.field_o, true, bd.field_f.field_u);
                  return;
                } else {
                  c.field_a.a((byte) 84, var15[var11]);
                  var11++;
                  continue L6;
                }
              }
            } else {
              return;
            }
          } else {
            var8[var9] = ae.field_d.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    eg(we param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((eg) this).field_e = param9;
        ((eg) this).field_i = param2;
        ((eg) this).field_l = param4;
        ((eg) this).field_r = param11;
        ((eg) this).field_n = param1;
        ((eg) this).field_d = param8;
        ((eg) this).field_k = param0;
        ((eg) this).field_o = param6;
        ((eg) this).field_f = param12 ? true : false;
        ((eg) this).field_c = param3;
        ((eg) this).field_q = param5;
        ((eg) this).field_j = param7;
        ((eg) this).field_a = param10;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "More Achievements to earn";
        field_h = 0;
    }
}
