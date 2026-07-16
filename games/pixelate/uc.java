/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uc implements eb, af {
    int field_e;
    int field_j;
    private int field_p;
    static String field_m;
    int field_c;
    int field_h;
    int field_k;
    jl field_a;
    static boolean field_n;
    private boolean field_i;
    int field_g;
    int field_f;
    int field_o;
    static int[] field_b;
    int field_d;
    int field_l;

    private final void a(int param0, ng param1, int param2, int param3) {
        if (param0 > -71) {
            Object var6 = null;
            int discarded$0 = ((uc) this).a(74, (ng) null, (byte) -48);
        }
        this.a(0, ((uc) this).field_p, param1, param2, ((uc) this).field_g, param3, -3, 0);
    }

    final static void a(int param0, byte param1) {
        if (param1 <= 124) {
            uc.a(117, (byte) 117);
        }
        pc var2 = aa.field_f;
        var2.g(param0, 15514);
        var2.field_m = var2.field_m + 1;
        int var3 = var2.field_m;
        var2.e(160, 5);
        var2.e(160, io.field_c.field_ec);
        int var4 = io.field_c.field_Ib + (io.field_c.field_Tb << -900350330);
        var2.e(160, var4);
        var2.a(io.field_c.field_Eb.length, 0, -3493, io.field_c.field_Eb);
        var2.f(var2.field_m - var3, -1);
    }

    public final int a(int param0) {
        if (param0 != -3) {
            Object var3 = null;
            uc.a(false, -120, (java.awt.Canvas) null);
        }
        return ((uc) this).field_a.field_z + ((uc) this).field_a.field_w;
    }

    public final int a(byte param0, ng param1, int param2) {
        if (param0 != 69) {
            Object var5 = null;
            int discarded$0 = ((uc) this).a(113, (ng) null);
        }
        return this.b(param2, param1, 2, 0);
    }

    public static void b(int param0) {
        field_b = null;
        field_m = null;
        if (param0 > -107) {
            field_b = null;
        }
    }

    final static java.awt.Frame a(cb param0, int param1, int param2, int param3, int param4, boolean param5) {
        bo[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        bo[] var10 = null;
        ei var11 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        if (param0.a((byte) -125)) {
          L0: {
            if (0 != param1) {
              break L0;
            } else {
              var10 = jj.a(param0, -855969982);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (var10[var8].field_l == param2) {
                      if (var10[var8].field_i == param3) {
                        L2: {
                          if (param4 == 0) {
                            break L2;
                          } else {
                            if (var10[var8].field_g == param4) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (param1 < var10[var8].field_j) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        var7_int = 1;
                        param1 = var10[var8].field_j;
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
                  }
                }
              } else {
                return null;
              }
            }
          }
          if (param5) {
            var11 = param0.a(param1, param3, param2, 27705, param4);
            L4: while (true) {
              if (var11.field_b != 0) {
                var7 = (java.awt.Frame) var11.field_e;
                if (var7 != null) {
                  if (-3 == (var11.field_b ^ -1)) {
                    dc.a((byte) -124, var7, param0);
                    return null;
                  } else {
                    return var7;
                  }
                } else {
                  return null;
                }
              } else {
                vg.a(10L, (byte) 23);
                continue L4;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        if (param1 != -124) {
            return;
        }
        if (((uc) this).field_a == null) {
            return;
        }
        this.a(-115, param0, param2, param3);
    }

    final static String a(aa param0, int param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          var2 = null;
          if (param0.field_m == null) {
            break L0;
          } else {
            L1: {
              var6 = param0.field_m;
              var2 = (Object) (Object) var6;
              var2 = (Object) (Object) var6;
              if (1 == param0.field_i) {
                var2 = (Object) (Object) ("<img=0>" + var6);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0.field_i != 2) {
              break L0;
            } else {
              var2 = (Object) (Object) ("<img=1>" + var2);
              break L0;
            }
          }
        }
        L2: {
          var4 = -2 / ((54 - param1) / 62);
          var3 = "";
          if (-3 != (param0.field_j ^ -1)) {
            L3: {
              if (param0.field_j != 0) {
                break L3;
              } else {
                if (!ge.field_f) {
                  break L3;
                } else {
                  var3 = "[" + ul.field_m + "] ";
                  break L3;
                }
              }
            }
            L4: {
              if (1 == param0.field_j) {
                var3 = "[" + sd.a(fk.field_q, 106, new String[1]) + "] ";
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((param0.field_j ^ -1) != -5) {
                break L5;
              } else {
                if (null != mn.field_f) {
                  var3 = "[" + mn.field_f + "] ";
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if ((param0.field_j ^ -1) == -4) {
                var3 = "[#" + param0.field_h + "] ";
                break L6;
              } else {
                break L6;
              }
            }
            if (!param0.field_a) {
              var3 = var3 + var2 + ": ";
              break L2;
            } else {
              break L2;
            }
          } else {
            if (!param0.field_a) {
              L7: {
                if ((param0.field_d ^ -1) != -1) {
                  break L7;
                } else {
                  if (-1 != (param0.field_e ^ -1)) {
                    break L7;
                  } else {
                    var3 = sd.a(dg.field_b, 77, new String[1]);
                    break L2;
                  }
                }
              }
              var3 = sd.a(sk.field_c, 109, new String[1]);
              break L2;
            } else {
              break L2;
            }
          }
        }
        return var3;
    }

    private final int b(int param0, ng param1, int param2, int param3) {
        if (param2 != 2) {
            return -19;
        }
        return param1.field_B + param1.field_z + (param0 - (-((uc) this).field_h - param3));
    }

    private final int c(int param0, ng param1) {
        int var3 = 124 / ((param0 - 39) / 54);
        return param1.field_C + -((uc) this).field_k + -((uc) this).field_f;
    }

    public final kd b(int param0, ng param1) {
        if (param1.field_r == null) {
            param1.field_r = (kd) (Object) new no();
        }
        if (!((uc) this).field_i) {
            this.d(3, param1);
        } else {
            ((no) (Object) param1.field_r).a(((uc) this).a(true, param1), -1, ((uc) this).b(param1, -472248767), ((uc) this).field_a, this.c(-114, param1), ((uc) this).field_l, ((uc) this).field_d, ((uc) this).field_j);
        }
        if (param0 >= -28) {
            ((uc) this).field_d = -33;
        }
        return param1.field_r;
    }

    public final int a(int param0, ng param1, byte param2) {
        int var4 = -10 % ((param2 - 12) / 61);
        return this.a(45, 0, param0, param1);
    }

    public final void a(int param0, ng param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        mn var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        kd var18 = null;
        kd var19 = null;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          var16 = Pixelate.field_H ? 1 : 0;
          if (param2 == -1) {
            break L0;
          } else {
            var17 = null;
            int discarded$1 = ((uc) this).a(-51, -38, 41, 14, 84, (ng) null);
            break L0;
          }
        }
        if (param0 != param3) {
          L1: {
            if (param1.b(true)) {
              L2: {
                var18 = ((uc) this).b(param2 ^ 44, param1);
                var19 = var18;
                if (param0 >= param3) {
                  var8 = param3;
                  var9 = param0;
                  break L2;
                } else {
                  var9 = param3;
                  var8 = param0;
                  break L2;
                }
              }
              var10 = var19.a(false, var8);
              var11 = var19.a(false, var9);
              hp.a(param1.field_z + param5, param4 + (param1.field_p - -param1.field_C), param1.field_E + (param5 + param1.field_z), (byte) -104, param4 + param1.field_p);
              var12 = var10;
              L3: while (true) {
                if (var11 < var12) {
                  ia.a((byte) 92);
                  break L1;
                } else {
                  L4: {
                    var13 = var18.field_b[var12];
                    if (var10 != var12) {
                      stackOut_13_0 = var13.field_g[0];
                      stackIn_14_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = var19.b(true, var8);
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = stackIn_14_0;
                    if (var12 != var11) {
                      if (var13 == null) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = var13.field_g[-1 + var13.field_g.length];
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    } else {
                      stackOut_15_0 = var19.b(true, var9);
                      stackIn_19_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  var15 = stackIn_19_0;
                  h.field_X.a(((uc) this).field_o >>> 23547960, ((uc) this).field_o, this.b(param5, param1, 2, var14), var13.field_d, var15 + -var14, -90, param1.field_x + (param4 + param1.field_p + (((uc) this).field_k - -var13.field_b)));
                  var12++;
                  continue L3;
                }
              }
            } else {
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(uc param0, byte param1) {
        param0.field_k = ((uc) this).field_k;
        param0.field_f = ((uc) this).field_f;
        param0.field_a = ((uc) this).field_a;
        param0.field_g = ((uc) this).field_g;
        param0.field_d = ((uc) this).field_d;
        if (param1 < 125) {
            ((uc) this).field_o = -99;
        }
        param0.field_e = ((uc) this).field_e;
        param0.field_h = ((uc) this).field_h;
        param0.field_j = ((uc) this).field_j;
        param0.field_o = ((uc) this).field_o;
        param0.field_i = ((uc) this).field_i;
        param0.field_c = ((uc) this).field_c;
        param0.field_p = ((uc) this).field_p;
        param0.field_l = ((uc) this).field_l;
    }

    private final int a(int param0, int param1, int param2, ng param3) {
        if (param0 < 41) {
            Object var6 = null;
            this.d(-45, (ng) null);
        }
        return param2 + (param3.field_p + ((uc) this).field_k) - (-param3.field_x - param1);
    }

    String b(ng param0, int param1) {
        if (param1 != -472248767) {
            ((uc) this).field_a = null;
        }
        return param0.field_q;
    }

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        int var3 = 72 / ((param1 - 19) / 45);
        if (hf.field_q < 10) {
            var4 = 0;
            if (!(!sn.field_s)) {
                sn.field_s = false;
                var4 = 1;
            }
            on.a(true, var4 != 0, sl.field_i, nl.a(false), sc.c(16422));
        } else {
            if (!dm.q(22452)) {
                t.d();
                io.a(240, (byte) -99, 320);
                fj.a(0, 0, (byte) 119, param2);
            } else {
                if (-1 == (el.field_b ^ -1)) {
                    dm.a(false, param0, 0);
                    fj.a(0, 0, (byte) -82, param2);
                } else {
                    si.a(-1913, param2);
                }
            }
        }
    }

    uc(jl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void a(int param0, int param1, byte param2, ng param3, int param4) {
        kd var7 = null;
        int var8 = 0;
        mn var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var6 = 97 % ((-46 - param2) / 40);
        if (param3.b(true)) {
            var7 = ((uc) this).b(-86, param3);
            var8 = var7.a(false, param4);
            var9 = var7.field_b[var8];
            var10 = var7.b(true, param4);
            var11 = this.b(param0, param3, 2, var10);
            var12 = ((uc) this).a(param1, param3, (byte) 80) - -Math.max(0, var9.field_b);
            var13 = ((uc) this).a(param1, param3, (byte) -57) - -Math.min(this.c(101, param3), Math.min(var9.field_d, var7.field_b.length <= 1 + var8 ? var9.field_d : var7.field_b[1 + var8].field_b));
            hp.a(param0 + param3.field_z, param3.field_p + param1 - -param3.field_C, param3.field_E + param0 - -param3.field_z, (byte) -91, param1 + param3.field_p);
            h.field_X.a(var12, var13, var11, var11, ((uc) this).field_e, false);
            ia.a((byte) 92);
        }
    }

    public final int a(boolean param0, ng param1) {
        if (!param0) {
            return -103;
        }
        return -((uc) this).field_c + -((uc) this).field_h + param1.field_E;
    }

    public final int a(int param0, ng param1) {
        kd discarded$6 = ((uc) this).b(-82, param1);
        if (param0 != 14871) {
            return -70;
        }
        return param1.field_r.a(0) - (-((uc) this).field_h + -((uc) this).field_c);
    }

    public final int a(int param0, int param1, int param2, int param3, int param4, ng param5) {
        kd discarded$6 = ((uc) this).b(-80, param5);
        if (param2 != 0) {
            ((uc) this).field_e = 41;
        }
        return param5.field_r.a(param4 + -((uc) this).a(param0, param5, (byte) -70), param2 + 126, -((uc) this).a((byte) 69, param5, param1) + param3);
    }

    public final int a(ng param0, int param1) {
        kd discarded$6 = ((uc) this).b(-36, param0);
        if (param1 != 4592) {
            return -5;
        }
        return param0.field_r.b(1) - (-((uc) this).field_k - ((uc) this).field_f);
    }

    private final void a(int param0, int param1, ng param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Pixelate.field_H ? 1 : 0;
          hp.a(param2.field_z + param5, param2.field_C + param3 + param2.field_p, param2.field_E + param5 + param2.field_z, (byte) -103, param2.field_p + param3);
          if (param6 == -3) {
            break L0;
          } else {
            ((uc) this).field_i = false;
            break L0;
          }
        }
        L1: {
          var9 = ((uc) this).a(true, param2);
          var10 = this.c(113, param2);
          if (!((uc) this).field_i) {
            L2: {
              var12 = ((uc) this).field_d;
              if (var12 != 0) {
                if ((var12 ^ -1) == -3) {
                  var11 = var10 - ((uc) this).field_a.field_z;
                  break L2;
                } else {
                  L3: {
                    if (3 != var12) {
                      if (-2 != (var12 ^ -1)) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var11 = (-((uc) this).field_a.field_z + (var10 + -((uc) this).field_a.field_w) >> -1479238527) + ((uc) this).field_a.field_w;
                  break L2;
                }
              } else {
                var11 = ((uc) this).field_a.field_w;
                break L2;
              }
            }
            L4: {
              var12 = ((uc) this).field_l;
              if (0 != var12) {
                if (3 == var12) {
                  break L4;
                } else {
                  if (1 == var12) {
                    ((uc) this).field_a.b(((uc) this).b(param2, -472248767), (var9 >> -1240779775) + this.b(param5, param2, param6 + 5, param7), this.a(99, param0, param3, param2) - -var11, param4, param1);
                    break L1;
                  } else {
                    if (-3 == (var12 ^ -1)) {
                      ((uc) this).field_a.c(((uc) this).b(param2, -472248767), var9 + this.b(param5, param2, 2, param7), this.a(param6 + 59, param0, param3, param2) - -var11, param4, param1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            ((uc) this).field_a.a(((uc) this).b(param2, param6 + -472248764), this.b(param5, param2, 2, param7), var11 + this.a(88, param0, param3, param2), param4, param1);
            break L1;
          } else {
            int discarded$1 = ((uc) this).field_a.a(((uc) this).b(param2, -472248767), this.b(param5, param2, 2, param7), this.a(95, param0, param3, param2), var9, var10, param4, param1, ((uc) this).field_l, ((uc) this).field_d, ((uc) this).field_j);
            break L1;
          }
        }
        ia.a((byte) 92);
    }

    protected uc() {
    }

    private final void d(int param0, ng param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (null == param1.field_r) {
            param1.field_r = (kd) (Object) new no();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = ((uc) this).a(true, param1);
          var4 = this.c(-94, param1);
          var6 = ((uc) this).field_d;
          if (var6 != 0) {
            if ((var6 ^ -1) != -3) {
              L2: {
                if (var6 != 3) {
                  if (var6 == 1) {
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              var5 = ((uc) this).field_a.field_w + (-((uc) this).field_a.field_z + var4 + -((uc) this).field_a.field_w >> -472248767);
              break L1;
            } else {
              var5 = -((uc) this).field_a.field_z + var4;
              break L1;
            }
          } else {
            var5 = ((uc) this).field_a.field_w;
            break L1;
          }
        }
        L3: {
          if (param0 == 3) {
            break L3;
          } else {
            ((uc) this).field_j = 122;
            break L3;
          }
        }
        L4: {
          L5: {
            var6 = ((uc) this).field_l;
            if (var6 != 0) {
              if (-4 != (var6 ^ -1)) {
                if (1 != var6) {
                  if (-3 != (var6 ^ -1)) {
                    break L4;
                  } else {
                    if (!(param1.field_r instanceof no)) {
                      break L4;
                    } else {
                      ((no) (Object) param1.field_r).a(((uc) this).field_a, var5, var3, false, ((uc) this).b(param1, -472248767));
                      break L4;
                    }
                  }
                } else {
                  if (param1.field_r instanceof no) {
                    ((no) (Object) param1.field_r).a(((uc) this).b(param1, param0 + -472248770), false, var5, ((uc) this).field_a, var3 >> 1072573025);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              } else {
                break L5;
              }
            } else {
              break L5;
            }
          }
          if (!(param1.field_r instanceof no)) {
            break L4;
          } else {
            ((no) (Object) param1.field_r).a(((uc) this).b(param1, -472248767), var5, ((uc) this).field_a, 0, 61);
            break L4;
          }
        }
    }

    uc(jl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((uc) this).field_f = param4;
        ((uc) this).field_i = param12 ? true : false;
        ((uc) this).field_e = param10;
        ((uc) this).field_j = param9;
        ((uc) this).field_o = param11;
        ((uc) this).field_c = param2;
        ((uc) this).field_g = param5;
        ((uc) this).field_h = param1;
        ((uc) this).field_d = param8;
        ((uc) this).field_a = param0;
        ((uc) this).field_k = param3;
        ((uc) this).field_l = param7;
        ((uc) this).field_p = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Macroing or use of bots";
    }
}
