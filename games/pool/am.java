/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class am implements fp, io {
    static String field_n;
    private int field_l;
    int field_d;
    int field_m;
    lr field_a;
    static int field_q;
    int field_g;
    static uf field_e;
    int field_f;
    int field_p;
    int field_j;
    private boolean field_o;
    int field_i;
    int field_k;
    int field_c;
    static int field_h;
    int field_b;

    final static String a(int param0, int param1) {
        String stackIn_11_0 = null;
        String stackOut_10_0 = null;
        String stackOut_9_0 = null;
        String stackOut_8_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        L0: {
          if (param0 == 8) {
            break L0;
          } else {
            field_h = -19;
            break L0;
          }
        }
        L1: {
          if (-1 == param1) {
            stackOut_10_0 = "waiting";
            stackIn_11_0 = stackOut_10_0;
            break L1;
          } else {
            if (-2 != param1) {
              if (2 == param1) {
                stackOut_9_0 = "finished";
                stackIn_11_0 = stackOut_9_0;
                break L1;
              } else {
                if ((param1 ^ -1) == -4) {
                  stackOut_8_0 = "finished with end choice";
                  stackIn_11_0 = stackOut_8_0;
                  break L1;
                } else {
                  stackOut_7_0 = "illegal state";
                  stackIn_11_0 = stackOut_7_0;
                  break L1;
                }
              }
            } else {
              stackOut_4_0 = "animating";
              stackIn_11_0 = stackOut_4_0;
              break L1;
            }
          }
        }
        return stackIn_11_0;
    }

    String c(int param0, ei param1) {
        if (param0 != -1) {
            return null;
        }
        return param1.field_m;
    }

    public final int a(int param0, ei param1) {
        if (param0 != 1) {
            Object var4 = null;
            int discarded$0 = this.a((ei) null, -35, -25, (byte) -43);
        }
        op discarded$1 = ((am) this).b(0, param1);
        return param1.field_x.a((byte) 66) + ((am) this).field_f + ((am) this).field_j;
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 92 / ((28 - param0) / 59);
        field_n = null;
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, ei param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        op var17 = null;
        op var18 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = Pool.field_O;
          if (param4 == 154888568) {
            break L0;
          } else {
            am.a((byte) -85);
            break L0;
          }
        }
        if (param0 != param1) {
          L1: {
            if (!param5.d(55)) {
              break L1;
            } else {
              L2: {
                var17 = ((am) this).b(0, param5);
                var18 = var17;
                if (param1 >= param0) {
                  var9 = param1;
                  var8 = param0;
                  break L2;
                } else {
                  var9 = param0;
                  var8 = param1;
                  break L2;
                }
              }
              var10 = var18.a(var8, param4 ^ 154888568);
              var11 = var18.a(var9, 0);
              wh.a(param2 + param5.field_C, param5.field_D + param3, param5.field_C + (param2 - -param5.field_l), (byte) -118, param5.field_D + (param3 - -param5.field_y));
              var12 = var10;
              L3: while (true) {
                if (var12 > var11) {
                  oc.a(121);
                  break L1;
                } else {
                  L4: {
                    var13 = var17.field_b[var12];
                    if (var10 != var12) {
                      stackOut_12_0 = var13.field_h[0];
                      stackIn_13_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = var18.a(var8, (byte) -72);
                      stackIn_13_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = stackIn_13_0;
                    if (var11 != var12) {
                      if (var13 != null) {
                        stackOut_17_0 = var13.field_h[-1 + var13.field_h.length];
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    } else {
                      stackOut_14_0 = var18.a(var9, (byte) -102);
                      stackIn_18_0 = stackOut_14_0;
                      break L5;
                    }
                  }
                  var15 = stackIn_18_0;
                  db.field_Sb.a(var15 - var14, ((am) this).field_c >>> 154888568, var13.field_i, var13.field_e + ((am) this).field_f + (param5.field_D + (param3 - -param5.field_r)), ((am) this).field_c, (byte) 124, this.a(var14, (byte) 11, param2, param5));
                  var12++;
                  continue L3;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public final int a(byte param0, ei param1) {
        if (param0 != 26) {
            return 65;
        }
        return -((am) this).field_g + (-((am) this).field_i + param1.field_l);
    }

    private final int a(int param0, byte param1, int param2, ei param3) {
        if (param1 != 11) {
            field_h = 21;
        }
        return param3.field_v + ((am) this).field_i + param2 + (param3.field_C + param0);
    }

    am(lr param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final op b(int param0, ei param1) {
        if (!(null != param1.field_x)) {
            param1.field_x = (op) (Object) new ve();
        }
        if (((am) this).field_o) {
            ((ve) (Object) param1.field_x).a(((am) this).field_m, ((am) this).c(-1, param1), ((am) this).field_a, this.b(param1, -3), ((am) this).field_b, ((am) this).a((byte) 26, param1), ((am) this).field_p, 0);
        } else {
            this.a(param1, false);
        }
        if (param0 != 0) {
            return null;
        }
        return param1.field_x;
    }

    public void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        int var6 = 4 % ((param2 - 2) / 41);
        if (null == ((am) this).field_a) {
            return;
        }
        this.a((byte) -117, param4, param1, param3);
    }

    public final int a(ei param0, int param1) {
        op discarded$6 = ((am) this).b(0, param0);
        if (param1 != -1848150943) {
            return -29;
        }
        return param0.field_x.a(-1) - (-((am) this).field_i - ((am) this).field_g);
    }

    public final int a(int param0, int param1, int param2, ei param3, int param4, int param5) {
        if (param4 < 73) {
            ((am) this).field_o = false;
        }
        op discarded$0 = ((am) this).b(0, param3);
        return param3.field_x.a(-((am) this).a(param0, param3, (byte) -7) + param2, -((am) this).a(5286, param3, param5) + param1, -1);
    }

    private final void a(ei param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Pool.field_O;
          if (param0.field_x == null) {
            param0.field_x = (op) (Object) new ve();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = ((am) this).a((byte) 26, param0);
          var4 = this.b(param0, -3);
          var6 = ((am) this).field_p;
          if (var6 != 0) {
            if (2 == var6) {
              var5 = var4 + -((am) this).field_a.field_w;
              break L1;
            } else {
              L2: {
                if (3 == var6) {
                  break L2;
                } else {
                  if (1 == var6) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = ((am) this).field_a.field_C - -(-((am) this).field_a.field_w + (var4 - ((am) this).field_a.field_C) >> -1848150943);
              break L1;
            }
          } else {
            var5 = ((am) this).field_a.field_C;
            break L1;
          }
        }
        L3: {
          if (!param1) {
            break L3;
          } else {
            var8 = null;
            ((am) this).a(116, 45, -107, -47, -40, (ei) null);
            break L3;
          }
        }
        L4: {
          L5: {
            var6 = ((am) this).field_m;
            if (var6 != 0) {
              if (var6 != -4) {
                if (1 == var6) {
                  if (!(param0.field_x instanceof ve)) {
                    break L4;
                  } else {
                    ((ve) (Object) param0.field_x).a(((am) this).field_a, var3 >> -1177150015, var5, ((am) this).c(-1, param0), false);
                    break L4;
                  }
                } else {
                  if (-3 != var6) {
                    break L4;
                  } else {
                    if (!(param0.field_x instanceof ve)) {
                      break L4;
                    } else {
                      ((ve) (Object) param0.field_x).a(((am) this).c(-1, param0), ((am) this).field_a, false, var5, var3);
                      break L4;
                    }
                  }
                }
              } else {
                break L5;
              }
            } else {
              break L5;
            }
          }
          if (!(param0.field_x instanceof ve)) {
            break L4;
          } else {
            ((ve) (Object) param0.field_x).a(var5, ((am) this).c(-1, param0), ((am) this).field_a, true, 0);
            break L4;
          }
        }
    }

    final void a(int param0, am param1) {
        param1.field_d = ((am) this).field_d;
        param1.field_m = ((am) this).field_m;
        param1.field_i = ((am) this).field_i;
        param1.field_g = ((am) this).field_g;
        param1.field_l = ((am) this).field_l;
        param1.field_c = ((am) this).field_c;
        param1.field_f = ((am) this).field_f;
        param1.field_o = ((am) this).field_o;
        param1.field_k = ((am) this).field_k;
        param1.field_p = ((am) this).field_p;
        param1.field_b = ((am) this).field_b;
        param1.field_j = ((am) this).field_j;
        if (param0 != -1177150015) {
            return;
        }
        param1.field_a = ((am) this).field_a;
    }

    final static void b(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = Pool.field_O;
                        if (sq.field_c == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        sq.field_c.c((byte) -80);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null == ri.field_U) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        ri.field_U.a(-11307);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (ih.field_a != null) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ih.field_a.b((byte) 86);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null == ia.field_d) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var1 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (ia.field_d.length <= var1) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (ia.field_d[var1] != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var1++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ia.field_d[var1].b((byte) 86);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        var1++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 16: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 17: {
                        if (param0 == 70) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        String discarded$1 = am.a(-10, 42);
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final int a(int param0) {
        if (param0 != -10492) {
            return 54;
        }
        return ((am) this).field_a.field_C + ((am) this).field_a.field_w;
    }

    final static boolean a(byte param0, int[] param1, float[] param2) {
        if (param0 <= 73) {
            return false;
        }
        param2[0] = 0.5f + 8.0f * param2[0];
        param2[1] = param2[1] * 8.0f + 0.5f;
        param2[2] = 0.5f + 8.0f * param2[2];
        if (!((float)param1[9] * ((float)(-param1[0]) + param2[0]) + (float)param1[10] * ((float)(-param1[1]) + param2[1]) + (param2[2] - (float)param1[2]) * (float)param1[11] >= 0.0f)) {
            return false;
        }
        ag.a(param1, param2, 9);
        return true;
    }

    private final int a(ei param0, int param1, int param2, byte param3) {
        if (param3 <= 68) {
            ((am) this).field_f = -82;
        }
        return param2 + (param0.field_D + ((am) this).field_f) - (-param0.field_r - param1);
    }

    public final int a(int param0, ei param1, int param2) {
        if (param0 != 5286) {
            Object var5 = null;
            int discarded$0 = ((am) this).a(51, (ei) null, 122);
        }
        return this.a(0, (byte) 11, param2, param1);
    }

    public final void a(int param0, int param1, int param2, int param3, ei param4) {
        op var14 = null;
        op var15 = null;
        int var7 = 0;
        vj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param4.d(66)) {
            var14 = ((am) this).b(param0 + -1, param4);
            var15 = var14;
            var7 = var15.a(param2, 0);
            var8 = var14.field_b[var7];
            var9 = var15.a(param2, (byte) -94);
            var10 = this.a(var9, (byte) 11, param3, param4);
            var11 = ((am) this).a(param1, param4, (byte) -7) + Math.max(0, var8.field_e);
            var12 = ((am) this).a(param1, param4, (byte) -7) + Math.min(this.b(param4, -3), Math.min(var8.field_i, 1 + var7 < var15.field_b.length ? var14.field_b[var7 + 1].field_e : var8.field_i));
            wh.a(param4.field_C + param3, param4.field_D + param1, param4.field_C + param3 + param4.field_l, (byte) -125, param4.field_y + param4.field_D + param1);
            db.field_Sb.a(-1, var10, var12, ((am) this).field_k, var10, var11);
            oc.a(param0 + 114);
        }
        if (param0 != 1) {
            Object var13 = null;
            int discarded$0 = this.a((ei) null, 37, -42, (byte) -76);
        }
    }

    public final int a(int param0, ei param1, byte param2) {
        if (param2 != -7) {
            ((am) this).field_g = -17;
        }
        return this.a(param1, 0, param0, (byte) 98);
    }

    final static void b(int param0) {
        if (param0 < 114) {
            field_h = 49;
        }
        v.b((byte) -60);
    }

    private final int b(ei param0, int param1) {
        if (param1 != -3) {
            Object var4 = null;
            this.a((byte) -37, (ei) null, 11, -127);
        }
        return param0.field_y + -((am) this).field_f - ((am) this).field_j;
    }

    private final void a(int param0, int param1, ei param2, int param3, int param4, int param5, int param6, byte param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Pool.field_O;
          wh.a(param2.field_C + param6, param5 + param2.field_D, param2.field_l + param2.field_C + param6, (byte) 85, param2.field_D + param5 + param2.field_y);
          var9 = ((am) this).a((byte) 26, param2);
          var10 = this.b(param2, param7 + 19);
          if (param7 == -22) {
            break L0;
          } else {
            ((am) this).field_l = 62;
            break L0;
          }
        }
        L1: {
          if (!((am) this).field_o) {
            L2: {
              var12 = ((am) this).field_p;
              if (0 == var12) {
                var11 = ((am) this).field_a.field_C;
                break L2;
              } else {
                if (-3 != var12) {
                  L3: {
                    if (var12 == 3) {
                      break L3;
                    } else {
                      if (-2 != var12) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var11 = (var10 - ((am) this).field_a.field_C - ((am) this).field_a.field_w >> 268347649) + ((am) this).field_a.field_C;
                  break L2;
                } else {
                  var11 = -((am) this).field_a.field_w + var10;
                  break L2;
                }
              }
            }
            L4: {
              var12 = ((am) this).field_m;
              if (-1 == (var12 ^ -1)) {
                break L4;
              } else {
                if ((var12 ^ -1) != -4) {
                  if (var12 == 1) {
                    ((am) this).field_a.b(((am) this).c(-1, param2), this.a(param3, (byte) 11, param6, param2) - -(var9 >> -378478975), this.a(param2, param0, param5, (byte) 125) - -var11, param1, param4);
                    break L1;
                  } else {
                    if ((var12 ^ -1) != -3) {
                      break L1;
                    } else {
                      ((am) this).field_a.c(((am) this).c(-1, param2), this.a(param3, (byte) 11, param6, param2) + var9, this.a(param2, param0, param5, (byte) 106) + var11, param1, param4);
                      break L1;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            ((am) this).field_a.d(((am) this).c(param7 ^ 21, param2), this.a(param3, (byte) 11, param6, param2), var11 + this.a(param2, param0, param5, (byte) 92), param1, param4);
            break L1;
          } else {
            int discarded$1 = ((am) this).field_a.a(((am) this).c(param7 ^ 21, param2), this.a(param3, (byte) 11, param6, param2), this.a(param2, param0, param5, (byte) 70), var9, var10, param1, param4, ((am) this).field_m, ((am) this).field_p, ((am) this).field_b);
            break L1;
          }
        }
        oc.a(114);
    }

    private final void a(byte param0, ei param1, int param2, int param3) {
        int var5 = -52 / ((param0 - -10) / 61);
        this.a(0, ((am) this).field_d, param1, 0, ((am) this).field_l, param3, param2, (byte) -22);
    }

    protected am() {
    }

    am(lr param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((am) this).field_l = param6;
        ((am) this).field_p = param8;
        ((am) this).field_c = param11;
        ((am) this).field_f = param3;
        ((am) this).field_o = param12 ? true : false;
        ((am) this).field_a = param0;
        ((am) this).field_k = param10;
        ((am) this).field_i = param1;
        ((am) this).field_b = param9;
        ((am) this).field_g = param2;
        ((am) this).field_d = param5;
        ((am) this).field_j = param4;
        ((am) this).field_m = param7;
    }

    static {
    }
}
