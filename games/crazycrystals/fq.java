/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fq extends ea implements Cloneable {
    fb field_I;
    private int field_v;
    private transient int field_E;
    int field_u;
    transient int field_w;
    transient int field_t;
    static int field_D;
    transient int field_A;
    static volatile int field_C;
    transient int field_B;
    private transient boolean field_y;
    static wg field_x;
    static String field_z;
    private transient int field_F;
    static String field_G;
    private transient mi field_H;

    final static void a(int param0, java.awt.Canvas param1) {
        rh.a(-1, (java.awt.Component) (Object) param1);
        ji.a(-110, (java.awt.Component) (Object) param1);
        if (param0 >= -29) {
            return;
        }
        if (ok.field_g != null) {
            ok.field_g.a((byte) 55, (java.awt.Component) (Object) param1);
        }
    }

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          L1: {
            if (!vh.field_a) {
              break L1;
            } else {
              if (2 != ((fq) this).field_u) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          qp.field_f = false;
          break L0;
        }
        L2: {
          stackOut_4_0 = this;
          stackIn_10_0 = stackOut_4_0;
          stackIn_5_0 = stackOut_4_0;
          if (0 > param5) {
            stackOut_10_0 = this;
            stackOut_10_1 = 4;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L2;
          } else {
            stackOut_5_0 = this;
            stackIn_9_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if ((param5 ^ -1) < -1) {
              stackOut_9_0 = this;
              stackOut_9_1 = 5;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L2;
            } else {
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (param3 >= 0) {
                stackOut_8_0 = this;
                stackOut_8_1 = 7;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                break L2;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = 6;
                stackIn_11_0 = stackOut_7_0;
                stackIn_11_1 = stackOut_7_1;
                break L2;
              }
            }
          }
        }
        ((fq) this).d(stackIn_11_1, 1, -9634);
        if (!param2) {
          return super.a(param0, param1, false, param3, param4, param5);
        } else {
          return null;
        }
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        f var5 = null;
        de var6 = null;
        de var7 = null;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        if (param3 >= 120) {
          var5 = ((fq) this).field_l;
          L0: while (true) {
            if (var5 instanceof ma) {
              return ((fq) this).a(param2, param0, (f) this, 11460, param1);
            } else {
              L1: {
                if (!(var5 instanceof de)) {
                  if (var5 instanceof pn) {
                    var5 = ((pn) (Object) var5).field_l;
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  var6 = (de) (Object) var5;
                  if (var6.field_j != null) {
                    break L1;
                  } else {
                    fn.field_j = fn.field_j + 20;
                    mb.field_g = mb.field_g + 20;
                    var7 = new de();
                    var7.a((byte) 72, (f) this);
                    return ((fq) this).a(param2, param0, (f) (Object) var7, 11460, param1);
                  }
                }
              }
              return (f) this;
            }
          }
        } else {
          return null;
        }
    }

    private final boolean a(int param0, int param1, byte param2, f[][] param3) {
        gh var6 = null;
        int var5 = 109 / ((param2 - -54) / 45);
        if (param3[param1][param0] instanceof gh) {
            var6 = (gh) (Object) param3[param1][param0];
            if (0 == var6.field_x) {
                return false;
            }
            if (param3[param1 + -1][param0].a(16736352, param3, true, -1, param1, param0, (ea) (Object) var6, 0)) {
                return false;
            }
            if (param3[param1 - -1][param0].a(16736352, param3, true, 1, param1, param0, (ea) (Object) var6, 0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5 = 0;
        mi var5_ref = null;
        mi var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        if (null != ((fq) this).field_I) {
          return (f) this;
        } else {
          L0: {
            ((fq) this).field_l.a((fq) this, 127);
            if (this.a(param3, ((fq) this).field_w, 49, param1, param0)) {
              break L0;
            } else {
              ((fq) this).field_y = true;
              break L0;
            }
          }
          L1: {
            if (((fq) this).i(12555)) {
              ((fq) this).d(mb.field_c[((fq) this).field_w], 0, -9634);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (((fq) this).field_w >= 4) {
              break L2;
            } else {
              if (((fq) this).field_F >= 180) {
                L3: {
                  var5_ref = this.g(param1, param3 + -1, param0, 98);
                  var6 = this.g(param1, 1 + param3, param0, 109);
                  if (var5_ref == null) {
                    break L3;
                  } else {
                    L4: {
                      if (var6 == null) {
                        break L4;
                      } else {
                        if (Math.random() >= 0.5) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((fq) this).d(17, 99, -9634);
                    ((fq) this).field_H = var5_ref;
                    ((fq) this).field_H.field_C = (fq) this;
                    break L2;
                  }
                }
                if (var6 == null) {
                  if (-361 != (((fq) this).field_F ^ -1)) {
                    break L2;
                  } else {
                    var7 = 0;
                    var8 = 0;
                    var9 = 0;
                    L5: while (true) {
                      if (8 <= var9) {
                        var9 = (int)(0.01 + (-0.02 + (double)var7) * Math.random());
                        var10 = 0;
                        L6: while (true) {
                          if (var10 > var9) {
                            ((fq) this).d(8 + var9, hp.field_m[8 - -var9], -9634);
                            break L2;
                          } else {
                            if ((1 << var10 & var8) == 0) {
                              var9++;
                              var10++;
                              continue L6;
                            } else {
                              var10++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        if (this.a(param3, var9 + 8, 105, param1, param0)) {
                          var8 = var8 | 1 << var9;
                          var7++;
                          var9++;
                          continue L5;
                        } else {
                          var9++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  ((fq) this).d(16, 99, -9634);
                  ((fq) this).field_H = var6;
                  ((fq) this).field_H.field_z = (fq) this;
                  break L2;
                }
              } else {
                this.a((byte) -128, param0);
                var5 = -1 / ((-43 - param2) / 51);
                return super.b(param0, param1, (byte) 43, param3);
              }
            }
          }
          this.a((byte) -128, param0);
          var5 = -1 / ((-43 - param2) / 51);
          return super.b(param0, param1, (byte) 43, param3);
        }
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        if (param0 != 16736352) {
            return true;
        }
        return ((fq) this).field_l.a(param0 + 0, param1, param2, param3, param4, param5, param6, param7);
    }

    final boolean b(byte param0) {
        if (param0 < 43) {
            return false;
        }
        return ((fq) this).field_l.b((byte) 53);
    }

    final void d(int param0, int param1, int param2) {
        if (param2 != -9634) {
            Object var5 = null;
            boolean discarded$0 = ((fq) this).a(-45, (f[][]) null, false, -6, 34, -108, (ea) null, -128);
        }
        this.e((byte) -126);
        ((fq) this).field_F = 0;
        ((fq) this).field_E = param1;
        ((fq) this).field_B = 0;
        ((fq) this).field_w = param0;
        ((fq) this).field_y = false;
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int var10 = 0;
        var8 = CrazyCrystals.field_B;
        if (param3 == 11460) {
          L0: {
            if (((fq) this).field_I == null) {
              L1: {
                mb.field_g = mb.field_g + 11;
                fn.field_j = fn.field_j + 11;
                wd.field_j = wd.field_j - 1;
                mb.field_g = mb.field_g - ob.field_l;
                we.field_h = we.field_h + 28;
                fp.field_a = fp.field_a + 28;
                je.field_j = je.field_j + 14;
                b.field_a = b.field_a + 14;
                this.e((byte) 76);
                if (ab.field_D != null) {
                  break L1;
                } else {
                  if (param2 == null) {
                    break L1;
                  } else {
                    var6 = param2.a(false);
                    var7 = 0;
                    L2: while (true) {
                      if (-4 >= (var7 ^ -1)) {
                        break L1;
                      } else {
                        if (((fq) this).field_u != var7) {
                          if (0 != (var6 & 1 << var7)) {
                            q.field_a[var7].field_l = q.field_a[var7].field_l + 1;
                            var7++;
                            continue L2;
                          } else {
                            var7++;
                            continue L2;
                          }
                        } else {
                          var7++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                oe.field_a[((fq) this).field_u] = null;
                if (null == ab.field_D) {
                  q.field_a[((fq) this).field_u].field_h = true;
                  break L3;
                } else {
                  break L3;
                }
              }
              qh.field_o.addElement(this);
              var6 = 1;
              var10 = 0;
              var7 = var10;
              L4: while (true) {
                L5: {
                  if (-4 >= (var10 ^ -1)) {
                    break L5;
                  } else {
                    if (oe.field_a[var10] != null) {
                      var6 = 0;
                      break L5;
                    } else {
                      var10++;
                      continue L4;
                    }
                  }
                }
                L6: {
                  if (var6 != 0) {
                    var9 = null;
                    um.a(0, (String) null, (byte) 124);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ((fq) this).field_I = gg.a((fq) this, (byte) 119, param2, param0);
                break L0;
              }
            } else {
              break L0;
            }
          }
          return (f) this;
        } else {
          return null;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          if (((fq) this).field_I == null) {
            L1: {
              if (24 != param2) {
                break L1;
              } else {
                if (-25 == (param3 ^ -1)) {
                  ((fq) this).h(-110).c(param1, -param3 + param4, ek.field_f[((fq) this).field_u]);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            ((fq) this).h(-62).b(param1, -param3 + param4, param2 * 2, param3 * 3, ek.field_f[((fq) this).field_u]);
            break L0;
          } else {
            ((fq) this).field_I.a(false, param2, param3, (byte) -107, false, param1, param4);
            break L0;
          }
        }
        L2: {
          if (param5 == 4261) {
            break L2;
          } else {
            ((fq) this).a(false, -26, -116, 104, 89, -124);
            break L2;
          }
        }
    }

    final f a(f[][] param0, f param1, int param2, int param3, boolean param4) {
        if (!(2 * ((fq) this).field_m < ((fq) this).field_p)) {
            return ((fq) this).a(-((fq) this).field_s + param2, param3 + -((fq) this).field_o, param1, -117, param0);
        }
        if (!param4) {
            ((fq) this).field_u = 109;
        }
        return (f) this;
    }

    final int d(byte param0) {
        if (param0 > -40) {
            return 72;
        }
        if (vh.field_a) {
            if (!(-3 == (((fq) this).field_u ^ -1))) {
                return -1;
            }
        }
        return -3;
    }

    fq(f param0, int param1, int param2, int param3) {
        super(param0);
        ((fq) this).field_E = 0;
        ((fq) this).field_w = 3;
        ((fq) this).field_I = null;
        ((fq) this).field_B = 0;
        ((fq) this).field_y = false;
        ((fq) this).field_F = 0;
        ((fq) this).field_H = null;
        ((fq) this).field_A = param2;
        ((fq) this).field_u = param1;
        ((fq) this).field_t = param3;
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = CrazyCrystals.field_B;
          if (param0 == 1) {
            break L0;
          } else {
            ((fq) this).f(101, -113, (f[][]) null, -55);
            break L0;
          }
        }
        L1: {
          L2: {
            var5 = 0;
            var6 = 0;
            if (!vh.field_a) {
              break L2;
            } else {
              if ((((fq) this).field_u ^ -1) != -3) {
                L3: {
                  if (-25 != (((fq) this).field_v ^ -1)) {
                    break L3;
                  } else {
                    var6++;
                    break L3;
                  }
                }
                L4: {
                  if (((fq) this).field_v != 74) {
                    break L4;
                  } else {
                    var5--;
                    break L4;
                  }
                }
                L5: {
                  if (25 != ((fq) this).field_v) {
                    break L5;
                  } else {
                    var6--;
                    break L5;
                  }
                }
                L6: {
                  if (((fq) this).field_v == -88) {
                    var5++;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ((fq) this).field_v = ((fq) this).field_v + 1;
                if (-125 == ((fq) this).field_v) {
                  ((fq) this).field_v = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L2;
              }
            }
          }
          L7: {
            if (cp.field_k[bm.field_e[((fq) this).field_u][0]]) {
              var5--;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (!cp.field_k[bm.field_e[((fq) this).field_u][2]]) {
              break L8;
            } else {
              var6--;
              break L8;
            }
          }
          L9: {
            if (cp.field_k[bm.field_e[((fq) this).field_u][1]]) {
              var5++;
              break L9;
            } else {
              break L9;
            }
          }
          if (cp.field_k[bm.field_e[((fq) this).field_u][3]]) {
            var6++;
            break L1;
          } else {
            break L1;
          }
        }
        L10: {
          L11: {
            if (0 <= var5) {
              break L11;
            } else {
              if (param2[param1][-1 + param3].a((byte) -21, param2, param3, 0, param1, (fq) this, -1)) {
                sl discarded$4 = ((fq) this).a(param2, param1, false, 0, param3, -1);
                break L10;
              } else {
                break L11;
              }
            }
          }
          L12: {
            if (var5 <= 0) {
              break L12;
            } else {
              if (param2[param1][param3 + 1].a((byte) -21, param2, param3, 0, param1, (fq) this, 1)) {
                sl discarded$5 = ((fq) this).a(param2, param1, false, 0, param3, 1);
                break L10;
              } else {
                break L12;
              }
            }
          }
          L13: {
            if ((var6 ^ -1) <= -1) {
              break L13;
            } else {
              if (!param2[-1 + param1][param3].a((byte) -21, param2, param3, -1, param1, (fq) this, 0)) {
                break L13;
              } else {
                sl discarded$6 = ((fq) this).a(param2, param1, false, -1, param3, 0);
                break L10;
              }
            }
          }
          if (-1 <= (var6 ^ -1)) {
            break L10;
          } else {
            if (param2[1 + param1][param3].a((byte) -21, param2, param3, 1, param1, (fq) this, 0)) {
              sl discarded$7 = ((fq) this).a(param2, param1, false, 1, param3, 0);
              break L10;
            } else {
              break L10;
            }
          }
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3, int param4, int param5, ea param6) {
        if (param3 != -31135) {
            return null;
        }
        return ((fq) this).a(param4, param1, (f) (Object) param6, param3 + 31015, param2);
    }

    final boolean a(byte param0, f[][] param1, f param2) {
        if (param0 != 42) {
            ((fq) this).a((f[][]) null, -104, 91, false);
        }
        if (!((fq) this).field_l.b((byte) 66)) {
            return false;
        }
        f discarded$0 = ((fq) this).a(param1, ((fq) this).field_t, (f) (Object) new ig(param2, (dl[]) null, (f) null, false), param0 + 11418, ((fq) this).field_A);
        return true;
    }

    final nj a(int param0, nj param1) {
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        String var4_ref = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          if ((var4_int ^ -1) <= -4) {
            L1: {
              if (param0 == 23525) {
                break L1;
              } else {
                field_z = null;
                break L1;
              }
            }
            L2: {
              if (!vh.field_a) {
                var6 = qa.field_h;
                var5 = var6;
                var5 = var6;
                if ((var3 ^ -1) >= -2) {
                  var4 = g.field_c;
                  var5 = p.field_h;
                  break L2;
                } else {
                  var4_ref = q.field_c[((fq) this).field_u];
                  var5 = fh.field_j;
                  break L2;
                }
              } else {
                if (2 != ((fq) this).field_u) {
                  var4_ref = q.field_c[((fq) this).field_u];
                  var5 = pl.field_s;
                  var6 = en.field_F;
                  break L2;
                } else {
                  var6 = ol.field_E;
                  var4 = g.field_c;
                  var5 = p.field_h;
                  break L2;
                }
              }
            }
            return ng.a(var4, param1, (f) (Object) new fq((f) (Object) new kp(-1), ((fq) this).field_u, 0, 0), (byte) -83, var5 + "<br><br>" + var6);
          } else {
            if (q.field_a[var4_int].field_b) {
              var3++;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        wd.field_j = wd.field_j - 1;
        if (param4 != 17512) {
            return null;
        }
        fn.field_j = fn.field_j + ob.field_l;
        ((fq) this).field_A = param6;
        ((fq) this).field_t = param3;
        fn.field_j = fn.field_j + wd.field_j;
        ob.field_l = ob.field_l - 1;
        return super.a(param0, param1, param2, param3, 17512, param5, param6);
    }

    final static boolean a(int param0, byte param1) {
        try {
            int var2 = 0;
            int var3_int = 0;
            IOException var3 = null;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_13_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (kd.field_n.field_f < param0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        if (oi.field_c == null) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        var2 = 43 / ((-3 - param1) / 34);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            var3_int = oi.field_c.c(0);
                            if ((var3_int ^ -1) >= -1) {
                                statePc = 15;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (param0 + -kd.field_n.field_f >= var3_int) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_int = -kd.field_n.field_f + param0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            oi.field_c.a(kd.field_n.field_h, var3_int, 2034, kd.field_n.field_f);
                            wg.field_y = lo.a((byte) -60);
                            kd.field_n.field_f = kd.field_n.field_f + var3_int;
                            if (param0 > kd.field_n.field_f) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            kd.field_n.field_f = 0;
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        try {
                            if (0 > var3_int) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (30000L >= wd.d(-1322)) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            jj.a(4);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return false;
                    }
                    case 20: {
                        var3 = (IOException) (Object) caughtException;
                        jj.a(4);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        return false;
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

    final void c(int param0, int param1, f[][] param2, int param3) {
        pn var5 = null;
        int var6 = CrazyCrystals.field_B;
        if (param1 != 0) {
            return;
        }
        if (((fq) this).field_I != null) {
            ((fq) this).field_I = ((fq) this).field_I.a(124);
            if (((fq) this).field_I != null) {
            } else {
                if (!((((fq) this).field_s | ((fq) this).field_o) == 0)) {
                    sl discarded$0 = ((fq) this).a(param3, param2, param0, (byte) -115);
                }
                if (this == (Object) (Object) param2[param0][param3]) {
                    param2[param0][param3] = ((fq) this).field_l;
                } else {
                    var5 = (pn) (Object) param2[param0][param3];
                    while ((Object) (Object) var5.field_l != this) {
                        var5 = (pn) (Object) var5.field_l;
                    }
                    var5.field_l = ((fq) this).field_l;
                }
                boolean discarded$1 = qh.field_o.removeElement(this);
            }
        }
    }

    final static void a(int param0, String param1) {
        qn.field_z = param1;
        int var2 = -64 / ((-73 - param0) / 44);
        rc.a(-25537, 12);
    }

    private final void e(byte param0) {
        int var2 = -37 / ((param0 - -26) / 56);
        if (null == ((fq) this).field_H) {
        } else {
            if ((Object) (Object) ((fq) this).field_H.field_z != this) {
                // if_acmpne L66
                ((fq) this).field_H.field_C = null;
            } else {
                ((fq) this).field_H.field_z = null;
            }
            ((fq) this).field_H = null;
        }
    }

    final void c(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        if (vh.field_a) {
            if (2 != ((fq) this).field_u) {
                return;
            }
        }
        if (!param0) {
            return;
        }
        oe.field_a[((fq) this).field_u] = (fq) this;
        q.field_a[((fq) this).field_u].field_b = true;
    }

    final boolean a(mj param0, boolean param1, f[][] param2) {
        if (!param1) {
            Object var5 = null;
            f discarded$0 = ((fq) this).a((f[][]) null, 18, (f) null, 35, -62);
            return true;
        }
        return true;
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        we.field_h = we.field_h + 20;
        int var6 = 78 % ((param4 - 73) / 42);
        je.field_j = je.field_j + 10;
        fp.field_a = fp.field_a + 20;
        b.field_a = b.field_a + 10;
        mb.field_g = mb.field_g - 10;
        fn.field_j = fn.field_j - 10;
        return ((fq) this).a(param0, param1, param3, 6, param2);
    }

    final int a(boolean param0, int param1) {
        if (param0) {
            return 3;
        }
        if (param1 != 0) {
            boolean discarded$0 = this.a(95, -64, (byte) 36, (f[][]) null);
            return 0;
        }
        return 0;
    }

    private final mi g(int param0, int param1, f[][] param2, int param3) {
        mi var5 = null;
        if (param3 <= 96) {
            return null;
        }
        if (!(!(param2[param0][param1] instanceof mi))) {
            var5 = (mi) (Object) param2[param0][param1];
            if (0 != (var5.field_o | var5.field_s)) {
                return null;
            }
            return var5;
        }
        return null;
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        fq var7 = null;
        int var8 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          if (param0 == -35) {
            break L0;
          } else {
            this.e((byte) -95);
            break L0;
          }
        }
        L1: {
          ((fq) this).field_A = param2;
          ((fq) this).field_t = param3;
          if (param1 == null) {
            break L1;
          } else {
            var5 = 0;
            L2: while (true) {
              if (var5 >= param1.length) {
                break L1;
              } else {
                var6 = 0;
                L3: while (true) {
                  if (var6 >= param1[0].length) {
                    var5++;
                    continue L2;
                  } else {
                    L4: {
                      if (var6 != param2) {
                        break L4;
                      } else {
                        if (var5 != param3) {
                          break L4;
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                    if (param1[var5][var6] instanceof fq) {
                      var7 = (fq) (Object) param1[var5][var6];
                      if (var7.field_u == var7.field_u) {
                        param1[var5][var6] = var7.field_l;
                        var6++;
                        continue L3;
                      } else {
                        var6++;
                        continue L3;
                      }
                    } else {
                      var6++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        ((fq) this).field_I.a(param4, param2, param0, (byte) -126, false, param1, param3);
    }

    final boolean i(int param0) {
        if (((fq) this).field_y) {
            ((fq) this).field_B = ((fq) this).field_B - 1;
            // ifge L149
            return true;
        }
        if (!(((fq) this).field_w >= 4)) {
            ((fq) this).field_F = ((fq) this).field_F + 1;
        }
        ((fq) this).field_B = ((fq) this).field_B + 1;
        if (!(((fq) this).field_B < bp.field_c[((fq) this).field_w] << uc.field_c[((fq) this).field_w])) {
            ((fq) this).field_B = fg.field_j[((fq) this).field_w] << uc.field_c[((fq) this).field_w];
            if (((fq) this).field_B > -1) {
                return true;
            }
            if (-1 < ((fq) this).field_E) {
                ((fq) this).field_E = ((fq) this).field_E - 1;
                if (!(0 != ((fq) this).field_E)) {
                    ((fq) this).field_y = true;
                }
            }
        }
        if (param0 != 12555) {
            return false;
        }
        return false;
    }

    final void a(f[][] param0, int param1, int param2, boolean param3) {
        if (!(null == ((fq) this).field_I)) {
            return;
        }
        super.a(param0, param1, param2, param3);
    }

    final int b(int param0) {
        if (param0 != -3445) {
            field_G = null;
        }
        return tm.field_e;
    }

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        f var5_ref = null;
        if (param1 >= -74) {
            ((fq) this).f(115, -99, (f[][]) null, -6);
        }
        Object var5 = this;
        if (param2) {
            if (!(((fq) this).field_p < 2 * ((fq) this).field_m)) {
                var5_ref = ((fq) this).a(param0.field_c, param0.field_b, (f) (Object) param0.field_a, 122, param3);
            }
        }
        return (f) (Object) new ma(param0.b((byte) 84), var5_ref, param0);
    }

    private final boolean a(int param0, int param1, int param2, int param3, f[][] param4) {
        int var6 = 0;
        int var7 = 0;
        qf var8 = null;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        var7 = CrazyCrystals.field_B;
        var6 = param1;
        if (-13 != var6) {
          if (-15 != var6) {
            if (-14 == (var6 ^ -1)) {
              return this.a(param0 - -1, param3, (byte) 39, param4);
            } else {
              if ((var6 ^ -1) == -16) {
                return ((fq) this).field_l instanceof pf;
              } else {
                if (var6 != 17) {
                  if (16 == var6) {
                    L0: {
                      if (this.g(param3, param0 - -1, param4, 100) == null) {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        break L0;
                      } else {
                        stackOut_23_0 = 1;
                        stackIn_25_0 = stackOut_23_0;
                        break L0;
                      }
                    }
                    return stackIn_25_0 != 0;
                  } else {
                    if (param2 >= 44) {
                      return true;
                    } else {
                      boolean discarded$1 = fq.a(-24, (byte) -122);
                      return true;
                    }
                  }
                } else {
                  L1: {
                    if (null == this.g(param3, -1 + param0, param4, 124)) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      break L1;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      break L1;
                    }
                  }
                  return stackIn_21_0 != 0;
                }
              }
            }
          } else {
            return this.a(-1 + param0, param3, (byte) 87, param4);
          }
        } else {
          L2: {
            L3: {
              if (!(param4[-1 + param3][param0] instanceof qf)) {
                break L3;
              } else {
                var8 = (qf) (Object) param4[param3 - 1][param0];
                if ((var8.field_o | var8.field_s) != 0) {
                  break L3;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
              }
            }
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            break L2;
          }
          return stackIn_14_0 != 0;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -14;
        }
        return 1 << ((fq) this).field_u;
    }

    private final void a(byte param0, f[][] param1) {
        int var3 = 0;
        int var4 = 0;
        am stackIn_36_0 = null;
        am stackIn_37_0 = null;
        am stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        am stackIn_43_0 = null;
        am stackIn_44_0 = null;
        am stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        am stackOut_35_0 = null;
        am stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        am stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        am stackOut_42_0 = null;
        am stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        am stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        L0: {
          var4 = CrazyCrystals.field_B;
          if (param0 < -110) {
            break L0;
          } else {
            sl discarded$1 = ((fq) this).a((f[][]) null, 107, true, -13, -41, 97);
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = ((fq) this).field_w;
            if (-5 == var3) {
              break L2;
            } else {
              if (-6 != var3) {
                if (6 == var3) {
                  break L2;
                } else {
                  if (7 == var3) {
                    break L2;
                  } else {
                    L3: {
                      if (9 != var3) {
                        if (-11 != var3) {
                          if (var3 != 12) {
                            if (-14 == var3) {
                              L4: {
                                if (-29 == (((fq) this).field_B ^ -1)) {
                                  break L4;
                                } else {
                                  if ((((fq) this).field_B ^ -1) != -35) {
                                    break L1;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                stackOut_35_0 = cb.field_n;
                                stackIn_37_0 = stackOut_35_0;
                                stackIn_36_0 = stackOut_35_0;
                                if ((((fq) this).field_B ^ -1) == -29) {
                                  stackOut_37_0 = (am) (Object) stackIn_37_0;
                                  stackOut_37_1 = 128;
                                  stackIn_38_0 = stackOut_37_0;
                                  stackIn_38_1 = stackOut_37_1;
                                  break L5;
                                } else {
                                  stackOut_36_0 = (am) (Object) stackIn_36_0;
                                  stackOut_36_1 = 96;
                                  stackIn_38_0 = stackOut_36_0;
                                  stackIn_38_1 = stackOut_36_1;
                                  break L5;
                                }
                              }
                              ((am) (Object) stackIn_38_0).a(stackIn_38_1, 6 + ((fq) this).field_A * 12, 12 * ((fq) this).field_t, 60, (byte) -111);
                              break L1;
                            } else {
                              if (-15 != (var3 ^ -1)) {
                                if (15 != var3) {
                                  if (var3 == 16) {
                                    if (((fq) this).field_B != 30) {
                                      if (-37 != (((fq) this).field_B ^ -1)) {
                                        break L1;
                                      } else {
                                        if (((fq) this).field_E != 97) {
                                          break L1;
                                        } else {
                                          c.field_q.a(128, ((fq) this).field_A * 12 - -3, ((fq) this).field_t * 12, 60, (byte) -111);
                                          break L1;
                                        }
                                      }
                                    } else {
                                      oj.field_E.a(128, 12 * ((fq) this).field_A - -9, 12 * ((fq) this).field_t, 60, (byte) -111);
                                      break L1;
                                    }
                                  } else {
                                    if ((var3 ^ -1) == -18) {
                                      if (-31 == ((fq) this).field_B) {
                                        oj.field_E.a(128, ((fq) this).field_A * 12 - 9, 12 * ((fq) this).field_t, 60, (byte) -111);
                                        break L1;
                                      } else {
                                        if (36 != ((fq) this).field_B) {
                                          break L1;
                                        } else {
                                          if (-98 == ((fq) this).field_E) {
                                            c.field_q.a(128, -3 + ((fq) this).field_A * 12, ((fq) this).field_t * 12, 60, (byte) -111);
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                    } else {
                                      break L1;
                                    }
                                  }
                                } else {
                                  L6: {
                                    if (((fq) this).field_B == 0) {
                                      break L6;
                                    } else {
                                      if (-49 == (((fq) this).field_B ^ -1)) {
                                        break L6;
                                      } else {
                                        break L1;
                                      }
                                    }
                                  }
                                  ln.field_f.a(48, ((fq) this).field_A * 12, 12 * ((fq) this).field_t, 60, (byte) -111);
                                  break L1;
                                }
                              } else {
                                L7: {
                                  if (((fq) this).field_B == 28) {
                                    break L7;
                                  } else {
                                    if (34 == ((fq) this).field_B) {
                                      break L7;
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                                L8: {
                                  stackOut_42_0 = cb.field_n;
                                  stackIn_44_0 = stackOut_42_0;
                                  stackIn_43_0 = stackOut_42_0;
                                  if (-29 != (((fq) this).field_B ^ -1)) {
                                    stackOut_44_0 = (am) (Object) stackIn_44_0;
                                    stackOut_44_1 = 96;
                                    stackIn_45_0 = stackOut_44_0;
                                    stackIn_45_1 = stackOut_44_1;
                                    break L8;
                                  } else {
                                    stackOut_43_0 = (am) (Object) stackIn_43_0;
                                    stackOut_43_1 = 128;
                                    stackIn_45_0 = stackOut_43_0;
                                    stackIn_45_1 = stackOut_43_1;
                                    break L8;
                                  }
                                }
                                ((am) (Object) stackIn_45_0).a(stackIn_45_1, 12 * ((fq) this).field_A - 6, ((fq) this).field_t * 12, 60, (byte) -111);
                                break L1;
                              }
                            }
                          } else {
                            if (36 != ((fq) this).field_B) {
                              break L1;
                            } else {
                              if (-3 == (((fq) this).field_E ^ -1)) {
                                rb.field_g.a(128, ((fq) this).field_A * 12, -6 + 12 * ((fq) this).field_t, 60, (byte) -111);
                                break L1;
                              } else {
                                break L1;
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    if (((fq) this).field_B != 10) {
                      break L1;
                    } else {
                      ((fq) this).field_l.a(-29660, ((fq) this).field_t * 12, ((fq) this).field_A * 12);
                      break L1;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
          }
          if (2 != ((fq) this).field_B) {
            if ((((fq) this).field_B ^ -1) == -9) {
              param1[((fq) this).field_t - -((fq) this).field_s][((fq) this).field_A + ((fq) this).field_o].a(-29660, ((fq) this).field_t * 12 - -(((fq) this).field_s * ((fq) this).field_m), ((fq) this).field_m * ((fq) this).field_o + ((fq) this).field_A * 12);
              break L1;
            } else {
              break L1;
            }
          } else {
            ((fq) this).field_l.a(-29660, ((fq) this).field_t * 12 + ((fq) this).field_s * ((fq) this).field_m, ((fq) this).field_o * ((fq) this).field_m + ((fq) this).field_A * 12);
            break L1;
          }
        }
    }

    final void c(int param0, int param1, int param2) {
        ((fq) this).field_A = param0;
        ((fq) this).field_t = param2;
        if (param1 != -5) {
            ((fq) this).field_u = -80;
        }
    }

    public static void b(boolean param0) {
        field_G = null;
        field_z = null;
        field_x = null;
        if (!param0) {
            boolean discarded$0 = fq.a(29, (byte) -86);
        }
    }

    final dl h(int param0) {
        if (param0 > -2) {
            ((fq) this).d(102, -119, -74);
        }
        return vj.field_a[((fq) this).field_w][((fq) this).field_B >> uc.field_c[((fq) this).field_w]];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = -1;
        field_z = "OVER <%0>";
        field_G = "Arcade Highscores";
    }
}
