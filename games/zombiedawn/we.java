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
        le var7 = null;
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
              var3_int = param0.a(this.a(true), (byte) -77);
              var4 = param0.a(this.f(237239984), 0);
              bi.d(var3_int, var4, this.field_Vb, 255);
              bi.d(var3_int, var4, this.field_pb, 65535);
              if (this.field_Qb != null) {
                bi.e(var3_int, var4, param0.a(this.field_Qb.a(true), (byte) -63), param0.a(this.field_Qb.f(param1 ^ 237235572), 0), 16711680);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == this.field_yb) {
                break L2;
              } else {
                var5_int = param0.a(this.field_yb.a(true), (byte) -81);
                var6 = param0.a(this.field_yb.f(param1 + 237234924), param1 ^ 5060);
                bi.e(var3_int, var4, var5_int, var6, 16776960);
                bj.field_q.c(Integer.toString(this.field_yb.field_F), var5_int, var6 - 48, 16777215, 0);
                break L2;
              }
            }
            L3: {
              if (param1 == 5060) {
                break L3;
              } else {
                var7 = (le) null;
                we.a((le) null, 97, (le) null);
                break L3;
              }
            }
            bi.e(var3_int, var4, param0.a(this.field_Y, (byte) -94), param0.a(this.field_X, param1 + -5060), 16711935);
            var5 = Integer.toString(this.field_F);
            bj.field_q.c(var5, var3_int, var4 - 48, 16777215, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("we.L(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    public static void x(int param0) {
        field_Sb = null;
        field_Rb = null;
        field_Tb = null;
        field_Ub = null;
        if (param0 != 16777215) {
            field_Ub = (vn) null;
        }
    }

    final void l(byte param0) {
        if (param0 == 52) {
          if (!this.a(-117, this.field_Nb, false)) {
            if (this.field_Qb == null) {
              this.y(3);
              if (null == this.field_Qb) {
                if (this.field_F != 0) {
                  this.e(0, -6904);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (9 == this.field_Qb.field_F) {
                this.y(3);
                if (null == this.field_Qb) {
                  if (this.field_F == 0) {
                    return;
                  } else {
                    this.e(0, -6904);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (null == this.field_Qb) {
                  if (this.field_F != 0) {
                    this.e(0, -6904);
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
            this.m((byte) -123);
            this.z(param0 + 12399);
            return;
          }
        } else {
          field_Tb = (vn) null;
          if (!this.a(-117, this.field_Nb, false)) {
            L0: {
              if (this.field_Qb == null) {
                this.y(3);
                break L0;
              } else {
                if (9 == this.field_Qb.field_F) {
                  this.y(3);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (null == this.field_Qb) {
              if (this.field_F == 0) {
                return;
              } else {
                this.e(0, -6904);
                return;
              }
            } else {
              return;
            }
          } else {
            this.m((byte) -123);
            this.z(param0 + 12399);
            return;
          }
        }
    }

    final static boolean o(byte param0) {
        if (param0 != -80) {
            return true;
        }
        if (wo.field_xb == null) {
            return false;
        }
        if (null == wo.field_xb.c(true)) {
            return false;
        }
        return true;
    }

    final void g(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        super.g(103);
        if (param0 > 95) {
          if (0 != this.field_F) {
            if ((this.field_F ^ -1) != -2) {
              if (10 == this.field_F) {
                this.field_N = this.field_N + 3;
                return;
              } else {
                return;
              }
            } else {
              fieldTemp$4 = this.field_Ob;
              this.field_Ob = this.field_Ob + 1;
              if (-51 < (fieldTemp$4 ^ -1)) {
                fieldTemp$5 = this.field_Pb;
                this.field_Pb = this.field_Pb + 1;
                if (fieldTemp$5 < 4) {
                  return;
                } else {
                  this.l((byte) 52);
                  this.field_Pb = 0;
                  return;
                }
              } else {
                this.b(false);
                this.field_Ob = 0;
                fieldTemp$6 = this.field_Pb;
                this.field_Pb = this.field_Pb + 1;
                if (fieldTemp$6 < 4) {
                  return;
                } else {
                  this.l((byte) 52);
                  this.field_Pb = 0;
                  return;
                }
              }
            }
          } else {
            if (null == this.field_Qb) {
              fieldTemp$7 = this.field_Ob;
              this.field_Ob = this.field_Ob + 1;
              if (fieldTemp$7 < 50) {
                return;
              } else {
                this.y(3);
                this.field_Ob = 0;
                return;
              }
            } else {
              this.b(false);
              return;
            }
          }
        } else {
          return;
        }
    }

    we(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Ob = 0;
        this.field_Vb = -1;
        this.field_Nb = 125 - -(int)(250.0 * Math.random());
        this.field_pb = this.field_Nb;
        this.field_Pb = pb.a(so.field_a, 4, 1);
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
            throw sh.a((Throwable) ((Object) runtimeException), "we.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(kd param0, byte param1) {
        try {
            param0.field_Bb = param0.field_Bb + 1;
            int var3_int = 114 / ((param1 - -3) / 58);
            this.field_Qb = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "we.PA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void o(int param0) {
        this.z(12451);
        if (param0 != -6253) {
            return;
        }
        super.o(param0 + 0);
    }

    private final void b(boolean param0) {
        nc var3 = null;
        if (this.field_Qb == null) {
          return;
        } else {
          if (param0) {
            var3 = (nc) null;
            this.a((nc) null, (byte) -119);
            this.a(this.field_Qb.a(true), (byte) -99, this.field_Qb.f(237239984));
            return;
          } else {
            this.a(this.field_Qb.a(true), (byte) -99, this.field_Qb.f(237239984));
            return;
          }
        }
    }

    final void c(int param0, int param1, int param2) {
        if (param1 < 24) {
            this.field_Ob = -93;
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
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("we.O(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
    }

    private final void y(int param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        Object var2 = null;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        kd var6_ref = null;
        int var8 = 0;
        qh var9 = null;
        qh var10 = null;
        qh var17 = null;
        var6 = null;
        var8 = ZombieDawn.field_J;
        int discarded$4 = this.a(true);
        int discarded$5 = this.f(237239984);
        if (this.field_yb == null) {
          L0: {
            if (this.field_Qb != null) {
              this.z(param0 + 12448);
              break L0;
            } else {
              break L0;
            }
          }
          var2 = null;
          var3 = null;
          var4 = -1;
          var5 = -1;
          if (param0 == 3) {
            var6_ref = (kd) ((Object) this.a((byte) -74, this.field_Vb, 2));
            L1: while (true) {
              if (var6_ref == null) {
                if (var3 == null) {
                  if (var2 == null) {
                    L2: {
                      this.z(12451);
                      if (null != this.field_Qb) {
                        this.b(false);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    return;
                  } else {
                    L3: {
                      this.a((kd) (var2), (byte) 110);
                      if (null != this.field_Qb) {
                        this.b(false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  }
                } else {
                  L4: {
                    this.a((kd) (var3), (byte) 108);
                    if (null != this.field_Qb) {
                      this.b(false);
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
                    var10 = dj.field_e.field_H.a(true, this.a(true), var6_ref.f(237239984), var6_ref.a(true), this.f(237239984));
                    if (var10 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (var6_ref.field_Bb == 0) {
                          L7: {
                            if (var10.field_g > var5) {
                              break L7;
                            } else {
                              if (0 == (var5 ^ -1)) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var3 = var6_ref;
                          var5 = var10.field_g;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L8: {
                        if (var10.field_g > var4) {
                          break L8;
                        } else {
                          if (var4 == -1) {
                            break L8;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var4 = var10.field_g;
                      var2 = var6_ref;
                      break L5;
                    }
                  }
                  var6_ref = (kd) ((Object) this.e((byte) 32));
                  continue L1;
                } else {
                  var6_ref = (kd) ((Object) this.e((byte) 32));
                  continue L1;
                }
              }
            }
          } else {
            this.field_Nb = -9;
            var6_ref = (kd) ((Object) this.a((byte) -74, this.field_Vb, 2));
            L9: while (true) {
              if (var6_ref == null) {
                if (var3 == null) {
                  if (var2 == null) {
                    L10: {
                      this.z(12451);
                      if (null != this.field_Qb) {
                        this.b(false);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return;
                  } else {
                    L11: {
                      this.a((kd) (var2), (byte) 110);
                      if (null != this.field_Qb) {
                        this.b(false);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  L12: {
                    this.a((kd) (var3), (byte) 108);
                    if (null != this.field_Qb) {
                      this.b(false);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                if (var6_ref.field_F != 9) {
                  L13: {
                    var17 = dj.field_e.field_H.a(true, this.a(true), var6_ref.f(237239984), var6_ref.a(true), this.f(237239984));
                    if (var17 == null) {
                      break L13;
                    } else {
                      L14: {
                        if (var6_ref.field_Bb == 0) {
                          L15: {
                            if (var17.field_g > var5) {
                              break L15;
                            } else {
                              if (0 == (var5 ^ -1)) {
                                break L15;
                              } else {
                                break L14;
                              }
                            }
                          }
                          var3 = var6_ref;
                          var5 = var17.field_g;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L16: {
                        if (var17.field_g > var4) {
                          break L16;
                        } else {
                          if (var4 == -1) {
                            break L16;
                          } else {
                            break L13;
                          }
                        }
                      }
                      var4 = var17.field_g;
                      var2 = var6_ref;
                      break L13;
                    }
                  }
                  var6_ref = (kd) ((Object) this.e((byte) 32));
                  continue L9;
                } else {
                  var6_ref = (kd) ((Object) this.e((byte) 32));
                  continue L9;
                }
              }
            }
          }
        } else {
          L17: {
            discarded$6 = this.field_yb.a(true);
            discarded$7 = this.field_yb.f(237239984);
            this.field_yb = null;
            if (this.field_Qb != null) {
              this.z(param0 + 12448);
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            var2 = null;
            var3 = null;
            var4 = -1;
            var5 = -1;
            if (param0 == 3) {
              var6_ref = (kd) ((Object) this.a((byte) -74, this.field_Vb, 2));
              break L18;
            } else {
              this.field_Nb = -9;
              var6_ref = (kd) ((Object) this.a((byte) -74, this.field_Vb, 2));
              break L18;
            }
          }
          L19: while (true) {
            if (var6_ref == null) {
              L20: {
                if (var3 == null) {
                  if (var2 != null) {
                    this.a((kd) (var2), (byte) 110);
                    break L20;
                  } else {
                    this.z(12451);
                    break L20;
                  }
                } else {
                  this.a((kd) (var3), (byte) 108);
                  break L20;
                }
              }
              L21: {
                if (null != this.field_Qb) {
                  this.b(false);
                  break L21;
                } else {
                  break L21;
                }
              }
              return;
            } else {
              if (var6_ref.field_F != 9) {
                L22: {
                  var9 = dj.field_e.field_H.a(true, this.a(true), var6_ref.f(237239984), var6_ref.a(true), this.f(237239984));
                  if (var9 == null) {
                    break L22;
                  } else {
                    L23: {
                      if (var6_ref.field_Bb == 0) {
                        L24: {
                          if (var9.field_g > var5) {
                            break L24;
                          } else {
                            if (0 == (var5 ^ -1)) {
                              break L24;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var3 = var6_ref;
                        var5 = var9.field_g;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L25: {
                      if (var9.field_g > var4) {
                        break L25;
                      } else {
                        if (var4 == -1) {
                          break L25;
                        } else {
                          break L22;
                        }
                      }
                    }
                    var4 = var9.field_g;
                    var2 = var6_ref;
                    break L22;
                  }
                }
                var6_ref = (kd) ((Object) this.e((byte) 32));
                continue L19;
              } else {
                var6_ref = (kd) ((Object) this.e((byte) 32));
                continue L19;
              }
            }
          }
        }
    }

    final static void w(int param0) {
        if (rn.field_b == null) {
          p.b(0, 27102);
          if (param0 > -45) {
            field_Tb = (vn) null;
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
            field_Tb = (vn) null;
            return;
          }
        }
    }

    private final void z(int param0) {
        if (param0 == 12451) {
          if (null != this.field_Qb) {
            this.field_Qb.field_Bb = this.field_Qb.field_Bb - 1;
            this.field_Qb = null;
            return;
          } else {
            this.field_Qb = null;
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_Sb = new String[]{"mall", "powerplant", "precinct", "whitehouse", "carpark", "airport", "countryside", "genlab", "buckingham"};
    }
}
