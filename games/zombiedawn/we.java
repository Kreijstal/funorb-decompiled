/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class we extends qk {
    private int field_Ob;
    static String field_Rb;
    static String[] field_Sb;
    private int field_Vb;
    static vn field_Ub;
    private int field_Nb;
    static vn field_Tb;
    private kd field_Qb;
    private int field_Pb;

    final static String p(byte param0) {
        int var1 = 26 % ((31 - param0) / 38);
        if (fk.field_F == vh.field_c) {
            return field_Rb;
        }
        if (tk.field_a == vh.field_c) {
            return kk.field_k;
        }
        if (!(gl.field_E.a(96))) {
            return kk.field_k;
        }
        return m.field_B;
    }

    final void a(wk param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
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
            L1: {
              var3_int = param0.a(((we) this).a(true), (byte) -77);
              var4 = param0.a(((we) this).f(237239984), 0);
              bi.d(var3_int, var4, ((we) this).field_Vb, 255);
              bi.d(var3_int, var4, ((we) this).field_pb, 65535);
              if (((we) this).field_Qb != null) {
                bi.e(var3_int, var4, param0.a(((we) this).field_Qb.a(true), (byte) -63), param0.a(((we) this).field_Qb.f(param1 ^ 237235572), 0), 16711680);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == ((we) this).field_yb) {
                break L2;
              } else {
                var5_int = param0.a(((we) this).field_yb.a(true), (byte) -81);
                var6 = param0.a(((we) this).field_yb.f(param1 + 237234924), param1 ^ 5060);
                bi.e(var3_int, var4, var5_int, var6, 16776960);
                bj.field_q.c(Integer.toString(((we) this).field_yb.field_F), var5_int, var6 - 48, 16777215, 0);
                break L2;
              }
            }
            L3: {
              if (param1 == 5060) {
                break L3;
              } else {
                var7 = null;
                we.a((le) null, 97, (le) null);
                break L3;
              }
            }
            bi.e(var3_int, var4, param0.a(((we) this).field_Y, (byte) -94), param0.a(((we) this).field_X, param1 + -5060), 16711935);
            var5 = Integer.toString(((we) this).field_F);
            bj.field_q.c(var5, var3_int, var4 - 48, 16777215, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("we.L(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    public static void x() {
        field_Sb = null;
        field_Rb = null;
        field_Tb = null;
        field_Ub = null;
    }

    final void l(byte param0) {
        if (param0 == 52) {
          if (!((we) this).a(-117, ((we) this).field_Nb, false)) {
            if (((we) this).field_Qb == null) {
              int discarded$4 = 3;
              this.y();
              if (null == ((we) this).field_Qb) {
                if (((we) this).field_F != 0) {
                  ((we) this).e(0, -6904);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (9 == ((we) this).field_Qb.field_F) {
                int discarded$5 = 3;
                this.y();
                if (null == ((we) this).field_Qb) {
                  if (((we) this).field_F == 0) {
                    return;
                  } else {
                    ((we) this).e(0, -6904);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (null == ((we) this).field_Qb) {
                  if (((we) this).field_F != 0) {
                    ((we) this).e(0, -6904);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            ((we) this).m((byte) -123);
            this.z(param0 + 12399);
            return;
          }
        } else {
          field_Tb = null;
          if (!((we) this).a(-117, ((we) this).field_Nb, false)) {
            L0: {
              if (((we) this).field_Qb == null) {
                int discarded$6 = 3;
                this.y();
                break L0;
              } else {
                if (9 == ((we) this).field_Qb.field_F) {
                  int discarded$7 = 3;
                  this.y();
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (null == ((we) this).field_Qb) {
              if (((we) this).field_F == 0) {
                return;
              } else {
                ((we) this).e(0, -6904);
                return;
              }
            } else {
              return;
            }
          } else {
            ((we) this).m((byte) -123);
            this.z(param0 + 12399);
            return;
          }
        }
    }

    final static boolean o() {
        if (wo.field_xb == null) {
            return false;
        }
        if (null == wo.field_xb.c(true)) {
            return false;
        }
        return true;
    }

    final void g(int param0) {
        int var3 = ZombieDawn.field_J;
        super.g(103);
        if (param0 <= 95) {
            return;
        }
        if (0 == ((we) this).field_F) {
            if (null != ((we) this).field_Qb) {
                int discarded$0 = 0;
                this.b();
                return;
            }
            int fieldTemp$1 = ((we) this).field_Ob;
            ((we) this).field_Ob = ((we) this).field_Ob + 1;
            if (fieldTemp$1 < 50) {
                return;
            }
            int discarded$2 = 3;
            this.y();
            ((we) this).field_Ob = 0;
            return;
        }
        if (((we) this).field_F == 1) {
            int fieldTemp$3 = ((we) this).field_Ob;
            ((we) this).field_Ob = ((we) this).field_Ob + 1;
            if (fieldTemp$3 >= 50) {
                int discarded$4 = 0;
                this.b();
                ((we) this).field_Ob = 0;
                int fieldTemp$5 = ((we) this).field_Pb;
                ((we) this).field_Pb = ((we) this).field_Pb + 1;
                if (fieldTemp$5 < 4) {
                    return;
                }
                ((we) this).l((byte) 52);
                ((we) this).field_Pb = 0;
                return;
            }
            int fieldTemp$6 = ((we) this).field_Pb;
            ((we) this).field_Pb = ((we) this).field_Pb + 1;
            if (fieldTemp$6 < 4) {
                return;
            }
            ((we) this).l((byte) 52);
            ((we) this).field_Pb = 0;
            return;
        }
        if (10 == ((we) this).field_F) {
            ((we) this).field_N = ((we) this).field_N + 3;
            return;
        }
    }

    we(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((we) this).field_Ob = 0;
        ((we) this).field_Vb = -1;
        ((we) this).field_Nb = 125 - -(int)(250.0 * Math.random());
        ((we) this).field_pb = ((we) this).field_Nb;
        ((we) this).field_Pb = pb.a(so.field_a, 4, 1);
    }

    final static void a(le param0, int param1, le param2) {
        try {
            if (!(null == param2.field_d)) {
                param2.b(-27598);
            }
            param2.field_d = param0.field_d;
            if (param1 != 0) {
                we.w(112);
            }
            param2.field_b = param0;
            param2.field_d.field_b = param2;
            param2.field_b.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "we.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(kd param0, byte param1) {
        try {
            param0.field_Bb = param0.field_Bb + 1;
            int var3_int = 114 / ((param1 - -3) / 58);
            ((we) this).field_Qb = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "we.PA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void o(int param0) {
        this.z(12451);
        if (param0 != -6253) {
            return;
        }
        super.o(param0);
    }

    private final void b() {
        if (!(((we) this).field_Qb != null)) {
            return;
        }
        Object var3 = null;
        ((we) this).a((nc) null, (byte) -119);
        ((we) this).a(((we) this).field_Qb.a(true), (byte) -99, ((we) this).field_Qb.f(237239984));
    }

    final void c(int param0, int param1, int param2) {
        if (param1 < 24) {
            ((we) this).field_Ob = -93;
        }
    }

    final void a(nc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            var3_int = -92 % ((-53 - param1) / 54);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("we.O(");
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
          throw sh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
    }

    private final void y() {
        Object var2 = null;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        kd var6_ref = null;
        int var8 = 0;
        qh var9 = null;
        qh var19 = null;
        var6 = null;
        var8 = ZombieDawn.field_J;
        int discarded$10 = ((we) this).a(true);
        int discarded$11 = ((we) this).f(237239984);
        if (((we) this).field_yb == null) {
          L0: {
            if (((we) this).field_Qb != null) {
              this.z(12451);
              break L0;
            } else {
              break L0;
            }
          }
          var2 = null;
          var3 = null;
          var4 = -1;
          var5 = -1;
          var6_ref = (kd) (Object) ((we) this).a((byte) -74, ((we) this).field_Vb, 2);
          L1: while (true) {
            if (var6_ref == null) {
              if (var3 == null) {
                if (var2 == null) {
                  L2: {
                    this.z(12451);
                    if (null != ((we) this).field_Qb) {
                      int discarded$12 = 0;
                      this.b();
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                } else {
                  L3: {
                    this.a((kd) var2, (byte) 110);
                    if (null != ((we) this).field_Qb) {
                      int discarded$13 = 0;
                      this.b();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                }
              } else {
                L4: {
                  this.a((kd) var3, (byte) 108);
                  if (null != ((we) this).field_Qb) {
                    int discarded$14 = 0;
                    this.b();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            } else {
              if (var6_ref.field_F != 9) {
                L5: {
                  var19 = dj.field_e.field_H.a(true, ((we) this).a(true), var6_ref.f(237239984), var6_ref.a(true), ((we) this).f(237239984));
                  if (var19 == null) {
                    break L5;
                  } else {
                    L6: {
                      if (var6_ref.field_Bb == 0) {
                        L7: {
                          if (var19.field_g > var5) {
                            break L7;
                          } else {
                            if (var5 == -1) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var3 = (Object) (Object) var6_ref;
                        var5 = var19.field_g;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      if (var19.field_g > var4) {
                        break L8;
                      } else {
                        if (var4 == -1) {
                          break L8;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var4 = var19.field_g;
                    var2 = (Object) (Object) var6_ref;
                    break L5;
                  }
                }
                var6_ref = (kd) (Object) ((we) this).e((byte) 32);
                continue L1;
              } else {
                var6_ref = (kd) (Object) ((we) this).e((byte) 32);
                continue L1;
              }
            }
          }
        } else {
          L9: {
            int discarded$15 = ((we) this).field_yb.a(true);
            int discarded$16 = ((we) this).field_yb.f(237239984);
            ((we) this).field_yb = null;
            if (((we) this).field_Qb != null) {
              this.z(12451);
              break L9;
            } else {
              break L9;
            }
          }
          var2 = null;
          var3 = null;
          var4 = -1;
          var5 = -1;
          var6_ref = (kd) (Object) ((we) this).a((byte) -74, ((we) this).field_Vb, 2);
          L10: while (true) {
            if (var6_ref == null) {
              if (var3 == null) {
                if (var2 == null) {
                  L11: {
                    this.z(12451);
                    if (null != ((we) this).field_Qb) {
                      int discarded$17 = 0;
                      this.b();
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return;
                } else {
                  L12: {
                    this.a((kd) var2, (byte) 110);
                    if (null != ((we) this).field_Qb) {
                      int discarded$18 = 0;
                      this.b();
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  this.a((kd) var3, (byte) 108);
                  if (null != ((we) this).field_Qb) {
                    int discarded$19 = 0;
                    this.b();
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return;
              }
            } else {
              if (var6_ref.field_F != 9) {
                L14: {
                  var9 = dj.field_e.field_H.a(true, ((we) this).a(true), var6_ref.f(237239984), var6_ref.a(true), ((we) this).f(237239984));
                  if (var9 == null) {
                    break L14;
                  } else {
                    L15: {
                      if (var6_ref.field_Bb == 0) {
                        L16: {
                          if (var9.field_g > var5) {
                            break L16;
                          } else {
                            if (var5 == -1) {
                              break L16;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var3 = (Object) (Object) var6_ref;
                        var5 = var9.field_g;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L17: {
                      if (var9.field_g > var4) {
                        break L17;
                      } else {
                        if (var4 == -1) {
                          break L17;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var4 = var9.field_g;
                    var2 = (Object) (Object) var6_ref;
                    break L14;
                  }
                }
                var6_ref = (kd) (Object) ((we) this).e((byte) 32);
                continue L10;
              } else {
                var6_ref = (kd) (Object) ((we) this).e((byte) 32);
                continue L10;
              }
            }
          }
        }
    }

    final static void w(int param0) {
        if (rn.field_b == null) {
          p.b(0, 27102);
          if (param0 > -45) {
            field_Tb = null;
            return;
          } else {
            return;
          }
        } else {
          rn.field_b.field_c = false;
          p.b(0, 27102);
          if (param0 <= -45) {
            return;
          } else {
            field_Tb = null;
            return;
          }
        }
    }

    private final void z(int param0) {
        if (param0 == 12451) {
          if (null != ((we) this).field_Qb) {
            ((we) this).field_Qb.field_Bb = ((we) this).field_Qb.field_Bb - 1;
            ((we) this).field_Qb = null;
            return;
          } else {
            ((we) this).field_Qb = null;
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Sb = new String[]{"mall", "powerplant", "precinct", "whitehouse", "carpark", "airport", "countryside", "genlab", "buckingham"};
    }
}
