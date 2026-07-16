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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        String var8 = null;
        String var9 = null;
        L0: {
          var3 = param0.a(((we) this).a(true), (byte) -77);
          var4 = param0.a(((we) this).f(237239984), 0);
          bi.d(var3, var4, ((we) this).field_Vb, 255);
          bi.d(var3, var4, ((we) this).field_pb, 65535);
          if (((we) this).field_Qb != null) {
            bi.e(var3, var4, param0.a(((we) this).field_Qb.a(true), (byte) -63), param0.a(((we) this).field_Qb.f(param1 ^ 237235572), 0), 16711680);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (null == ((we) this).field_yb) {
            break L1;
          } else {
            var5 = param0.a(((we) this).field_yb.a(true), (byte) -81);
            var6 = param0.a(((we) this).field_yb.f(param1 + 237234924), param1 ^ 5060);
            bi.e(var3, var4, var5, var6, 16776960);
            bj.field_q.c(Integer.toString(((we) this).field_yb.field_F), var5, var6 - 48, 16777215, 0);
            break L1;
          }
        }
        if (param1 != 5060) {
          var7 = null;
          we.a((le) null, 97, (le) null);
          bi.e(var3, var4, param0.a(((we) this).field_Y, (byte) -94), param0.a(((we) this).field_X, param1 + -5060), 16711935);
          var8 = Integer.toString(((we) this).field_F);
          bj.field_q.c(var8, var3, var4 - 48, 16777215, 0);
          return;
        } else {
          bi.e(var3, var4, param0.a(((we) this).field_Y, (byte) -94), param0.a(((we) this).field_X, param1 + -5060), 16711935);
          var9 = Integer.toString(((we) this).field_F);
          bj.field_q.c(var9, var3, var4 - 48, 16777215, 0);
          return;
        }
    }

    public static void x(int param0) {
        field_Sb = null;
        field_Rb = null;
        field_Tb = null;
        field_Ub = null;
        if (param0 != 16777215) {
            field_Ub = null;
        }
    }

    final void l(byte param0) {
        if (param0 == 52) {
          if (!((we) this).a(-117, ((we) this).field_Nb, false)) {
            if (((we) this).field_Qb == null) {
              this.y(3);
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
                this.y(3);
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
                this.y(3);
                break L0;
              } else {
                if (9 == ((we) this).field_Qb.field_F) {
                  this.y(3);
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
        int var3 = ZombieDawn.field_J;
        super.g(103);
        if (param0 <= 95) {
            return;
        }
        if (0 == ((we) this).field_F) {
            if (null != ((we) this).field_Qb) {
                this.b(false);
                return;
            }
            int fieldTemp$0 = ((we) this).field_Ob;
            ((we) this).field_Ob = ((we) this).field_Ob + 1;
            if (fieldTemp$0 < 50) {
                return;
            }
            this.y(3);
            ((we) this).field_Ob = 0;
            return;
        }
        if ((((we) this).field_F ^ -1) == -2) {
            int fieldTemp$1 = ((we) this).field_Ob;
            ((we) this).field_Ob = ((we) this).field_Ob + 1;
            if (-51 >= (fieldTemp$1 ^ -1)) {
                this.b(false);
                ((we) this).field_Ob = 0;
                int fieldTemp$2 = ((we) this).field_Pb;
                ((we) this).field_Pb = ((we) this).field_Pb + 1;
                if (fieldTemp$2 < 4) {
                    return;
                }
                ((we) this).l((byte) 52);
                ((we) this).field_Pb = 0;
                return;
            }
            int fieldTemp$3 = ((we) this).field_Pb;
            ((we) this).field_Pb = ((we) this).field_Pb + 1;
            if (fieldTemp$3 < 4) {
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
        L0: {
          if (null != param2.field_d) {
            param2.b(-27598);
            break L0;
          } else {
            break L0;
          }
        }
        param2.field_d = param0.field_d;
        if (param1 != 0) {
          we.w(112);
          param2.field_b = param0;
          param2.field_d.field_b = param2;
          param2.field_b.field_d = param2;
          return;
        } else {
          param2.field_b = param0;
          param2.field_d.field_b = param2;
          param2.field_b.field_d = param2;
          return;
        }
    }

    private final void a(kd param0, byte param1) {
        param0.field_Bb = param0.field_Bb + 1;
        int var3 = 114 / ((param1 - -3) / 58);
        ((we) this).field_Qb = param0;
    }

    final void o(int param0) {
        this.z(12451);
        if (param0 != -6253) {
            return;
        }
        super.o(param0 + 0);
    }

    private final void b(boolean param0) {
        Object var3 = null;
        if (((we) this).field_Qb == null) {
          return;
        } else {
          if (param0) {
            var3 = null;
            ((we) this).a((nc) null, (byte) -119);
            ((we) this).a(((we) this).field_Qb.a(true), (byte) -99, ((we) this).field_Qb.f(237239984));
            return;
          } else {
            ((we) this).a(((we) this).field_Qb.a(true), (byte) -99, ((we) this).field_Qb.f(237239984));
            return;
          }
        }
    }

    final void c(int param0, int param1, int param2) {
        if (param1 < 24) {
            ((we) this).field_Ob = -93;
        }
    }

    final void a(nc param0, byte param1) {
        int var3 = -92 % ((-53 - param1) / 54);
    }

    private final void y(int param0) {
        Object var2 = null;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        kd var6_ref = null;
        int var8 = 0;
        qh var9 = null;
        qh var10 = null;
        qh var29 = null;
        var6 = null;
        var8 = ZombieDawn.field_J;
        int discarded$4 = ((we) this).a(true);
        int discarded$5 = ((we) this).f(237239984);
        if (((we) this).field_yb == null) {
          L0: {
            if (((we) this).field_Qb != null) {
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
            var6_ref = (kd) (Object) ((we) this).a((byte) -74, ((we) this).field_Vb, 2);
            L1: while (true) {
              if (var6_ref == null) {
                if (var3 == null) {
                  if (var2 == null) {
                    L2: {
                      this.z(12451);
                      if (null != ((we) this).field_Qb) {
                        this.b(false);
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
                    this.a((kd) var3, (byte) 108);
                    if (null != ((we) this).field_Qb) {
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
                    var10 = dj.field_e.field_H.a(true, ((we) this).a(true), var6_ref.f(237239984), var6_ref.a(true), ((we) this).f(237239984));
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
                          var3 = (Object) (Object) var6_ref;
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
            ((we) this).field_Nb = -9;
            var6_ref = (kd) (Object) ((we) this).a((byte) -74, ((we) this).field_Vb, 2);
            L9: while (true) {
              if (var6_ref == null) {
                if (var3 == null) {
                  if (var2 == null) {
                    L10: {
                      this.z(12451);
                      if (null != ((we) this).field_Qb) {
                        this.b(false);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return;
                  } else {
                    L11: {
                      this.a((kd) var2, (byte) 110);
                      if (null != ((we) this).field_Qb) {
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
                    this.a((kd) var3, (byte) 108);
                    if (null != ((we) this).field_Qb) {
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
                    var29 = dj.field_e.field_H.a(true, ((we) this).a(true), var6_ref.f(237239984), var6_ref.a(true), ((we) this).f(237239984));
                    if (var29 == null) {
                      break L13;
                    } else {
                      L14: {
                        if (var6_ref.field_Bb == 0) {
                          L15: {
                            if (var29.field_g > var5) {
                              break L15;
                            } else {
                              if (0 == (var5 ^ -1)) {
                                break L15;
                              } else {
                                break L14;
                              }
                            }
                          }
                          var3 = (Object) (Object) var6_ref;
                          var5 = var29.field_g;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L16: {
                        if (var29.field_g > var4) {
                          break L16;
                        } else {
                          if (var4 == -1) {
                            break L16;
                          } else {
                            break L13;
                          }
                        }
                      }
                      var4 = var29.field_g;
                      var2 = (Object) (Object) var6_ref;
                      break L13;
                    }
                  }
                  var6_ref = (kd) (Object) ((we) this).e((byte) 32);
                  continue L9;
                } else {
                  var6_ref = (kd) (Object) ((we) this).e((byte) 32);
                  continue L9;
                }
              }
            }
          }
        } else {
          L17: {
            int discarded$6 = ((we) this).field_yb.a(true);
            int discarded$7 = ((we) this).field_yb.f(237239984);
            ((we) this).field_yb = null;
            if (((we) this).field_Qb != null) {
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
              var6_ref = (kd) (Object) ((we) this).a((byte) -74, ((we) this).field_Vb, 2);
              break L18;
            } else {
              ((we) this).field_Nb = -9;
              var6_ref = (kd) (Object) ((we) this).a((byte) -74, ((we) this).field_Vb, 2);
              break L18;
            }
          }
          L19: while (true) {
            if (var6_ref == null) {
              L20: {
                if (var3 == null) {
                  if (var2 != null) {
                    this.a((kd) var2, (byte) 110);
                    break L20;
                  } else {
                    this.z(12451);
                    break L20;
                  }
                } else {
                  this.a((kd) var3, (byte) 108);
                  break L20;
                }
              }
              L21: {
                if (null != ((we) this).field_Qb) {
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
                  var9 = dj.field_e.field_H.a(true, ((we) this).a(true), var6_ref.f(237239984), var6_ref.a(true), ((we) this).f(237239984));
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
                        var3 = (Object) (Object) var6_ref;
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
                    var2 = (Object) (Object) var6_ref;
                    break L22;
                  }
                }
                var6_ref = (kd) (Object) ((we) this).e((byte) 32);
                continue L19;
              } else {
                var6_ref = (kd) (Object) ((we) this).e((byte) 32);
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
