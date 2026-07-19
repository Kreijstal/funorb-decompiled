/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class l {
    byte[] field_k;
    static String field_i;
    byte[] field_f;
    private em field_b;
    int field_h;
    private int field_a;
    static oh[] field_c;
    je field_g;
    int field_l;
    bi field_d;
    byte[] field_e;
    int field_m;
    static int field_j;

    final static int a(Random param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param2 > 0) {
              if (!re.a((byte) -127, param2)) {
                L1: {
                  var3_int = -2147483648 - (int)(4294967296L % (long)param2);
                  if (param1 > 71) {
                    break L1;
                  } else {
                    l.a(-15, -7);
                    break L1;
                  }
                }
                L2: while (true) {
                  var4 = param0.nextInt();
                  if (var3_int > var4) {
                    stackOut_9_0 = oa.a(var4, 13309, param2);
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L2;
                  }
                }
              } else {
                stackOut_3_0 = (int)(((long)param0.nextInt() & 4294967295L) * (long)param2 >> -36980832);
                stackIn_4_0 = stackOut_3_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("l.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_10_0;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        this.field_f = new byte[6];
        var3 = 0;
        L0: while (true) {
          if (-5 >= (var3 ^ -1)) {
            var3 = 0;
            L1: while (true) {
              if (-8 >= (var3 ^ -1)) {
                var3 = 0;
                L2: while (true) {
                  if ((var3 ^ -1) <= -5) {
                    L3: {
                      var8 = -98 % ((32 - param0) / 39);
                      if (0 != (this.field_h ^ -1)) {
                        break L3;
                      } else {
                        this.field_f = null;
                        break L3;
                      }
                    }
                    return;
                  } else {
                    var4 = (byte)(1 << var3);
                    var5 = (byte)(2 << var3);
                    var6 = (byte)(4 << var3);
                    var7 = (byte)(8 << var3);
                    var2 = 0;
                    L4: while (true) {
                      if (-4 >= (var2 ^ -1)) {
                        var3++;
                        continue L2;
                      } else {
                        L5: {
                          if (var4 != (this.field_e[var2] & var4)) {
                            break L5;
                          } else {
                            if (var5 != (var5 & this.field_e[var2 - -1])) {
                              break L5;
                            } else {
                              if (var6 != (this.field_e[2 + var2] & var6)) {
                                break L5;
                              } else {
                                if (var7 == (this.field_e[var2 - -3] & var7)) {
                                  this.field_f[var2] = (byte)mc.a((int) this.field_f[var2], var4);
                                  this.field_f[1 + var2] = (byte)mc.a((int) this.field_f[1 + var2], var5);
                                  this.field_f[var2 - -2] = (byte)mc.a((int) this.field_f[var2 - -2], var6);
                                  this.field_f[3 + var2] = (byte)mc.a((int) this.field_f[3 + var2], var7);
                                  this.field_h = 0;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        L6: {
                          if (var7 != (this.field_e[var2] & var7)) {
                            break L6;
                          } else {
                            if (var6 != (this.field_e[1 + var2] & var6)) {
                              break L6;
                            } else {
                              if ((var5 & this.field_e[var2 + 2]) != var5) {
                                break L6;
                              } else {
                                if (var4 == (this.field_e[var2 - -3] & var4)) {
                                  this.field_f[var2] = (byte)mc.a((int) this.field_f[var2], var7);
                                  this.field_f[var2 - -1] = (byte)mc.a((int) this.field_f[var2 - -1], var6);
                                  this.field_f[var2 - -2] = (byte)mc.a((int) this.field_f[var2 - -2], var5);
                                  this.field_f[var2 + 3] = (byte)mc.a((int) this.field_f[var2 + 3], var4);
                                  this.field_h = 0;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        L7: {
                          if (var4 != (var4 & this.field_k[var2])) {
                            break L7;
                          } else {
                            if ((var5 & this.field_k[var2 + 1]) != var5) {
                              break L7;
                            } else {
                              if ((var6 & this.field_k[var2 + 2]) != var6) {
                                break L7;
                              } else {
                                if ((this.field_k[3 + var2] & var7) == var7) {
                                  this.field_f[var2] = (byte)mc.a((int) this.field_f[var2], var4);
                                  this.field_f[1 + var2] = (byte)mc.a((int) this.field_f[1 + var2], var5);
                                  this.field_f[2 + var2] = (byte)mc.a((int) this.field_f[2 + var2], var6);
                                  this.field_f[var2 - -3] = (byte)mc.a((int) this.field_f[var2 - -3], var7);
                                  this.field_h = 1;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                        if (var7 == (var7 & this.field_k[var2])) {
                          if (var6 == (this.field_k[1 + var2] & var6)) {
                            if (var5 == (var5 & this.field_k[var2 - -2])) {
                              if ((this.field_k[3 + var2] & var4) == var4) {
                                this.field_f[var2] = (byte)mc.a((int) this.field_f[var2], var7);
                                this.field_f[1 + var2] = (byte)mc.a((int) this.field_f[1 + var2], var6);
                                this.field_f[2 + var2] = (byte)mc.a((int) this.field_f[2 + var2], var5);
                                this.field_f[3 + var2] = (byte)mc.a((int) this.field_f[3 + var2], var4);
                                this.field_h = 1;
                                var2++;
                                continue L4;
                              } else {
                                var2++;
                                continue L4;
                              }
                            } else {
                              var2++;
                              continue L4;
                            }
                          } else {
                            var2++;
                            continue L4;
                          }
                        } else {
                          var2++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              } else {
                var4 = (byte)(1 << var3);
                var2 = 0;
                L8: while (true) {
                  if (var2 >= 3) {
                    var3++;
                    continue L1;
                  } else {
                    L9: {
                      if (var4 != (var4 & this.field_e[var2])) {
                        break L9;
                      } else {
                        if (var4 != (this.field_e[1 + var2] & var4)) {
                          break L9;
                        } else {
                          if (var4 != (this.field_e[var2 - -2] & var4)) {
                            break L9;
                          } else {
                            if ((this.field_e[var2 + 3] & var4) == var4) {
                              this.field_f[var2] = (byte)mc.a((int) this.field_f[var2], var4);
                              this.field_f[var2 - -1] = (byte)mc.a((int) this.field_f[var2 - -1], var4);
                              this.field_f[var2 + 2] = (byte)mc.a((int) this.field_f[var2 + 2], var4);
                              this.field_f[3 + var2] = (byte)mc.a((int) this.field_f[3 + var2], var4);
                              this.field_h = 0;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                    if (var4 == (var4 & this.field_k[var2])) {
                      if (var4 == (this.field_k[var2 + 1] & var4)) {
                        if (var4 == (this.field_k[var2 + 2] & var4)) {
                          if (var4 == (this.field_k[3 + var2] & var4)) {
                            this.field_f[var2] = (byte)mc.a((int) this.field_f[var2], var4);
                            this.field_f[1 + var2] = (byte)mc.a((int) this.field_f[1 + var2], var4);
                            this.field_f[2 + var2] = (byte)mc.a((int) this.field_f[2 + var2], var4);
                            this.field_f[3 + var2] = (byte)mc.a((int) this.field_f[3 + var2], var4);
                            this.field_h = 1;
                            var2++;
                            continue L8;
                          } else {
                            var2++;
                            continue L8;
                          }
                        } else {
                          var2++;
                          continue L8;
                        }
                      } else {
                        var2++;
                        continue L8;
                      }
                    } else {
                      var2++;
                      continue L8;
                    }
                  }
                }
              }
            }
          } else {
            var4 = (byte)(15 << var3);
            var2 = 0;
            L10: while (true) {
              if (6 <= var2) {
                var3++;
                continue L0;
              } else {
                L11: {
                  if ((var4 & this.field_e[var2]) != var4) {
                    break L11;
                  } else {
                    this.field_f[var2] = (byte)mc.a((int) this.field_f[var2], var4);
                    this.field_h = 0;
                    break L11;
                  }
                }
                if (var4 == (var4 & this.field_k[var2])) {
                  this.field_f[var2] = (byte)mc.a((int) this.field_f[var2], var4);
                  this.field_h = 1;
                  var2++;
                  continue L10;
                } else {
                  var2++;
                  continue L10;
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 > -63) {
            field_j = -41;
        }
        int var3 = null != qe.field_a ? 1 : 0;
        if (9 == dg.field_e) {
            if (fi.a(ml.field_jb, vf.field_b, vd.field_h, (byte) -86, ba.field_N)) {
                if (vf.field_b != 2) {
                    if (var3 != 0) {
                        return false;
                    }
                }
                return sj.a(ml.field_jb, vd.field_h, ba.field_N, 108, vf.field_b);
            }
        }
        if (dg.field_e == 10) {
            if (!(var3 == 0)) {
                return false;
            }
            em.d(-20715);
            return true;
        }
        if (dg.field_e == 11) {
            if (!va.field_u) {
                return false;
            }
            if ((kd.field_h ^ -1) == -3) {
                if (!(nl.a((byte) 127, qf.field_j, rc.field_N))) {
                    return false;
                }
            }
            if (kd.field_h != 2) {
                if (var3 != 0) {
                    return false;
                }
            }
            if (!(!ui.a((byte) -46))) {
                String var4 = (String) null;
                eo.a(-3, me.field_g, param0, qf.field_j, kd.field_h, (String) null);
            }
            return true;
        }
        return false;
    }

    final static void a(java.awt.Component param0, int param1, g param2, int param3, boolean param4, ie param5) {
        try {
            ll.a(param4, param0, param1, param5, param2, param3, (byte) 127, param1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "l.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = TetraLink.field_J;
        for (var2 = 0; (var2 ^ -1) > -7; var2++) {
            this.field_e[var2] = this.field_b.field_p[var2];
            this.field_k[var2] = this.field_b.field_e[var2];
        }
        this.field_d = null;
        this.field_g.b(1);
        this.d(115);
        this.a(this.field_l, (byte) -96);
        if (param0 <= 12) {
            this.field_f = (byte[]) null;
        }
    }

    final void e(int param0) {
        bf discarded$1 = null;
        ej var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        var2 = (ej) ((Object) this.field_g.c(false));
        L0: while (true) {
          if (var2 == null) {
            L1: {
              if (param0 > 72) {
                break L1;
              } else {
                this.a((byte) 43);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var3 = var2.field_q;
              if (var3 != 0) {
                if (var3 == 1) {
                  var2.field_s = var2.field_s + 4;
                  if (28 >= var2.field_s) {
                    break L2;
                  } else {
                    var2.field_q = 2;
                    var2.field_s = 28;
                    break L2;
                  }
                } else {
                  if (var3 == 2) {
                    L3: {
                      var2.field_s = var2.field_s - 3;
                      var2.field_y = var2.field_y - 40;
                      if (-1 >= (var2.field_s ^ -1)) {
                        break L3;
                      } else {
                        if (-1 < (var2.field_y ^ -1)) {
                          L4: {
                            discarded$1 = lb.a(ti.field_a[ui.a(5, 1692)], 573509761);
                            var3 = 1 << var2.field_u;
                            if (var2.field_x) {
                              this.field_e[var2.field_n] = (byte)mc.a((int) this.field_e[var2.field_n], var3);
                              break L4;
                            } else {
                              this.field_k[var2.field_n] = (byte)mc.a((int) this.field_k[var2.field_n], var3);
                              break L4;
                            }
                          }
                          var2.b(false);
                          this.d(-85);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var2.field_y >= 0) {
                        break L5;
                      } else {
                        var2.field_y = 0;
                        break L5;
                      }
                    }
                    if (-1 < (var2.field_s ^ -1)) {
                      var2.field_s = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              } else {
                var2.field_y = var2.field_y + 40;
                if (var2.field_y > 300 - 60 * var2.field_n) {
                  var2.field_y = 300 - 60 * var2.field_n;
                  var2.field_q = 1;
                  break L2;
                } else {
                  var2 = (ej) ((Object) this.field_g.a((byte) -70));
                  continue L0;
                }
              }
            }
            var2 = (ej) ((Object) this.field_g.a((byte) -70));
            continue L0;
          }
        }
    }

    private final boolean a(boolean param0, int param1, int param2, int param3) {
        int var6 = TetraLink.field_J;
        if (param3 != -14933) {
            this.field_m = 52;
        }
        ej var5 = (ej) ((Object) this.field_g.c(false));
        while (var5 != null) {
            if ((!var5.field_x ? 1 : 0) != (param0 ? 1 : 0)) {
                if (param2 == var5.field_n) {
                    if (param1 == var5.field_u) {
                        return true;
                    }
                }
            }
            var5 = (ej) ((Object) this.field_g.a((byte) -70));
        }
        return false;
    }

    final void a(byte param0) {
        bf discarded$2 = null;
        bf discarded$3 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -7) {
            if (param0 == 56) {
              this.a(this.field_l, (byte) -96);
              return;
            } else {
              return;
            }
          } else {
            L1: {
              var3 = this.field_b.field_p[var2] ^ this.field_e[var2];
              if (var3 == 0) {
                break L1;
              } else {
                if (0 == (var3 & this.field_e[var2])) {
                  var4 = 0;
                  L2: while (true) {
                    if (7 <= var4) {
                      break L1;
                    } else {
                      var5 = 1 << var4;
                      if ((var3 & var5) != 0) {
                        if (!this.a(true, var4, var2, -14933)) {
                          L3: {
                            if (this.field_a != 0) {
                              break L3;
                            } else {
                              if (!this.a((byte) -75, var4, var2)) {
                                break L3;
                              } else {
                                this.field_g.a(new ej(this.field_d, true), false);
                                this.field_d = null;
                                var4++;
                                continue L2;
                              }
                            }
                          }
                          this.field_g.a(new ej(var2, var4, true), false);
                          discarded$2 = lb.a(s.field_a[ui.a(5, 1692)], 573509761);
                          var4++;
                          continue L2;
                        } else {
                          var4++;
                          continue L2;
                        }
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  this.field_e[var2] = this.field_b.field_p[var2];
                  var2++;
                  continue L0;
                }
              }
            }
            var4 = this.field_k[var2] ^ this.field_b.field_e[var2];
            if (var4 != 0) {
              if (0 == (this.field_k[var2] & var4)) {
                var5 = 0;
                L4: while (true) {
                  if (-8 < (var5 ^ -1)) {
                    var6 = 1 << var5;
                    if ((var6 & var4) != 0) {
                      if (!this.a(false, var5, var2, param0 ^ -14957)) {
                        L5: {
                          if (-2 != (this.field_a ^ -1)) {
                            break L5;
                          } else {
                            if (!this.a((byte) -75, var5, var2)) {
                              break L5;
                            } else {
                              this.field_g.a(new ej(this.field_d, false), false);
                              this.field_d = null;
                              var5++;
                              continue L4;
                            }
                          }
                        }
                        this.field_g.a(new ej(var2, var5, false), false);
                        discarded$3 = lb.a(s.field_a[ui.a(5, 1692)], param0 ^ 573509817);
                        var5++;
                        continue L4;
                      } else {
                        var5++;
                        continue L4;
                      }
                    } else {
                      var5++;
                      continue L4;
                    }
                  } else {
                    var2++;
                    continue L0;
                  }
                }
              } else {
                this.field_k[var2] = this.field_b.field_e[var2];
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

    final static void a(int param0) {
        me.field_a = param0;
    }

    final static void a(int param0, int param1) {
        bc var2 = nd.field_Lb;
        var2.f(param1, (byte) -92);
        var2.field_t = var2.field_t + 1;
        int var3 = var2.field_t;
        var2.a(2, false);
        var2.a(0, 128, km.field_o, km.field_o.length);
        var2.a(ni.field_c, false);
        var2.a(qa.field_A, false);
        var2.a(param0, param0 + 128, lo.field_a, lo.field_a.length);
        var2.b(var2.field_t + -var3, -2);
    }

    public static void b(int param0) {
        field_i = null;
        int var1 = 118 % ((param0 - -38) / 43);
        field_c = null;
    }

    private final boolean a(byte param0, int param1, int param2) {
        ie var5 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -75) {
            break L0;
          } else {
            var5 = (ie) null;
            l.a((java.awt.Component) null, 34, (g) null, 1, false, (ie) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_d == null) {
              break L2;
            } else {
              if (this.field_d.field_b != param2) {
                break L2;
              } else {
                if (this.field_d.field_f != param1) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, byte param1) {
        if (param1 != -96) {
            this.field_h = -98;
        }
        this.field_l = param0;
        int dupTemp$0 = this.field_b.a(param0, (byte) 101);
        this.field_m = dupTemp$0;
        if ((dupTemp$0 ^ -1) == 0) {
            this.field_l = -1;
        }
    }

    l(em param0, int param1) {
        try {
            this.field_a = param1;
            this.field_l = -1;
            this.field_b = param0;
            this.field_g = new je();
            this.field_k = new byte[6];
            this.field_h = -1;
            this.field_f = null;
            this.field_e = new byte[6];
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_i = "Add <%0> to friend list";
    }
}
