/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rj extends ae {
    int field_x;
    private boolean field_u;
    private boolean field_v;
    boolean field_y;
    boolean field_w;

    boolean a(char param0, ae param1, int param2, boolean param3) {
        if (!((rj) this).b((byte) -34)) {
          if (!param3) {
            ((rj) this).f((byte) -61);
            return false;
          } else {
            return false;
          }
        } else {
          if ((param2 ^ -1) != -85) {
            if ((param2 ^ -1) != -84) {
              if (!param3) {
                ((rj) this).f((byte) -61);
                return false;
              } else {
                return false;
              }
            } else {
              ((rj) this).b(-1, 1, -1, -81);
              return true;
            }
          } else {
            ((rj) this).b(-1, 1, -1, -81);
            return true;
          }
        }
    }

    rj(String param0, isa param1, qc param2) {
        super(param0, param1, param2);
        ((rj) this).field_u = false;
        ((rj) this).field_x = 0;
        ((rj) this).field_v = true;
        ((rj) this).field_y = true;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        Object var6 = null;
        if (((rj) this).a((byte) -122, param0, param1, param2)) {
          ((rj) this).a(1, param2, param1, param0);
          if (!((rj) this).field_w) {
            if (((rj) this).field_y) {
              if (param3 != 0) {
                var6 = null;
                boolean discarded$8 = ((rj) this).a((ae) null, true);
                return param2;
              } else {
                return param2;
              }
            } else {
              StringBuilder discarded$9 = param2.append(" disabled");
              if (param3 != 0) {
                var6 = null;
                boolean discarded$10 = ((rj) this).a((ae) null, true);
                return param2;
              } else {
                return param2;
              }
            }
          } else {
            StringBuilder discarded$11 = param2.append(" active");
            if (!((rj) this).field_y) {
              StringBuilder discarded$12 = param2.append(" disabled");
              if (param3 != 0) {
                var6 = null;
                boolean discarded$13 = ((rj) this).a((ae) null, true);
                return param2;
              } else {
                return param2;
              }
            } else {
              if (param3 != 0) {
                var6 = null;
                boolean discarded$14 = ((rj) this).a((ae) null, true);
                return param2;
              } else {
                return param2;
              }
            }
          }
        } else {
          if (param3 != 0) {
            var6 = null;
            boolean discarded$15 = ((rj) this).a((ae) null, true);
            return param2;
          } else {
            return param2;
          }
        }
    }

    rj(String param0, qc param1) {
        this(param0, afa.field_c.field_u, param1);
    }

    void a(int param0, int param1, ae param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((rj) this).field_x = 0;
        if (((rj) this).field_s != 0) {
          if (((rj) this).field_s != ksa.field_p) {
            if (!((rj) this).a(jba.field_j, param0, param1 ^ -2097252, sta.field_B, param3)) {
              ((rj) this).a((byte) 59, param2, sta.field_B, param0, param3, jba.field_j);
              return;
            } else {
              if (-1 == (ksa.field_p ^ -1)) {
                ((rj) this).b(sta.field_B - param3, ((rj) this).field_s, -param0 + jba.field_j, -86);
                ((rj) this).a((byte) 59, param2, sta.field_B, param0, param3, jba.field_j);
                return;
              } else {
                ((rj) this).a((byte) 59, param2, sta.field_B, param0, param3, jba.field_j);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    boolean a(ae param0, boolean param1) {
        if (((rj) this).field_y) {
          if (((rj) this).field_v) {
            param0.f((byte) -127);
            ((rj) this).field_u = true;
            if (!param1) {
              if (null != ((rj) this).field_h) {
                if (!(((rj) this).field_h instanceof vfa)) {
                  return true;
                } else {
                  ((vfa) (Object) ((rj) this).field_h).a((ae) this, (byte) 90, ((rj) this).field_u);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              ((rj) this).field_v = true;
              if (null != ((rj) this).field_h) {
                if (!(((rj) this).field_h instanceof vfa)) {
                  return true;
                } else {
                  ((vfa) (Object) ((rj) this).field_h).a((ae) this, (byte) 90, ((rj) this).field_u);
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void f(byte param0) {
        int var2 = 0;
        if (((rj) this).field_u) {
          ((rj) this).field_u = false;
          if (((rj) this).field_h != null) {
            if (!(((rj) this).field_h instanceof vfa)) {
              var2 = 101 / ((param0 - -38) / 60);
              return;
            } else {
              ((vfa) (Object) ((rj) this).field_h).a((ae) this, (byte) -74, ((rj) this).field_u);
              var2 = 101 / ((param0 - -38) / 60);
              return;
            }
          } else {
            var2 = 101 / ((param0 - -38) / 60);
            return;
          }
        } else {
          var2 = 101 / ((param0 - -38) / 60);
          return;
        }
    }

    rj(int param0, int param1, int param2, int param3, isa param4, qc param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((rj) this).field_u = false;
        ((rj) this).field_x = 0;
        ((rj) this).field_v = true;
        ((rj) this).field_y = true;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4_ref = null;
        sda var4_ref_sda = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        mm var10 = null;
        kh var11 = null;
        kh var14 = null;
        Object var19 = null;
        mm var19_ref = null;
        kh var20 = null;
        Object var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        mm var25 = null;
        var4_ref = null;
        var19 = null;
        var22 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 == 4) {
          var20 = vc.field_q;
          var2 = var20.h(255);
          if (-1 == (var2 ^ -1)) {
            var25 = (mm) (Object) wma.field_n.f(-80);
            if (var25 == null) {
              dea.a(60);
              return;
            } else {
              L0: {
                var4 = var20.h(param0 ^ 251);
                if (var4 == 0) {
                  var5 = null;
                  break L0;
                } else {
                  var24 = new byte[var4];
                  var20.a(var24, 0, -115, var4);
                  break L0;
                }
              }
              var20.field_h = var20.field_h + 4;
              if (var20.a((byte) 114)) {
                var25.p(95);
                return;
              } else {
                dea.a(60);
                return;
              }
            }
          } else {
            if (var2 != 1) {
              ssa.a("A1: " + kk.a(32), (byte) 117, (Throwable) null);
              dea.a(60);
              return;
            } else {
              var3 = var20.e(-34);
              var4_ref_sda = (sda) (Object) qd.field_a.f(param0 + -84);
              L1: while (true) {
                if (var4_ref_sda == null) {
                  if (var4_ref_sda != null) {
                    var4_ref_sda.p(24);
                    return;
                  } else {
                    dea.a(60);
                    return;
                  }
                } else {
                  if (var4_ref_sda.field_l != var3) {
                    var4_ref_sda = (sda) (Object) qd.field_a.e(117);
                    continue L1;
                  } else {
                    if (var4_ref_sda != null) {
                      var4_ref_sda.p(24);
                      return;
                    } else {
                      dea.a(60);
                      return;
                    }
                  }
                }
              }
            }
          }
        } else {
          var7 = null;
          iu[] discarded$1 = rj.a((cn) null, 5, -25, (byte) 14);
          var14 = vc.field_q;
          var11 = var14;
          var2 = var14.h(255);
          if (-1 == (var2 ^ -1)) {
            var19_ref = (mm) (Object) wma.field_n.f(-80);
            var10 = var19_ref;
            if (var19_ref == null) {
              dea.a(60);
              return;
            } else {
              L2: {
                var4 = var14.h(param0 ^ 251);
                if (var4 == 0) {
                  var5 = null;
                  break L2;
                } else {
                  var23 = new byte[var4];
                  var14.a(var23, 0, -115, var4);
                  break L2;
                }
              }
              var14.field_h = var14.field_h + 4;
              if (var14.a((byte) 114)) {
                var19_ref.p(95);
                return;
              } else {
                dea.a(60);
                return;
              }
            }
          } else {
            if (var2 == 1) {
              var3 = var14.e(-34);
              var4_ref_sda = (sda) (Object) qd.field_a.f(param0 + -84);
              L3: while (true) {
                if (var4_ref_sda != null) {
                  if (var4_ref_sda.field_l != var3) {
                    var4_ref_sda = (sda) (Object) qd.field_a.e(117);
                    continue L3;
                  } else {
                    if (var4_ref_sda == null) {
                      dea.a(60);
                      return;
                    } else {
                      var4_ref_sda.p(24);
                      return;
                    }
                  }
                } else {
                  if (var4_ref_sda == null) {
                    dea.a(60);
                    return;
                  } else {
                    var4_ref_sda.p(24);
                    return;
                  }
                }
              }
            } else {
              ssa.a("A1: " + kk.a(32), (byte) 117, (Throwable) null);
              dea.a(60);
              return;
            }
          }
        }
    }

    public rj() {
        ((rj) this).field_u = false;
        ((rj) this).field_x = 0;
        ((rj) this).field_v = true;
        ((rj) this).field_y = true;
        ((rj) this).field_r = afa.field_c.field_v;
    }

    final static iu[] a(cn param0, int param1, int param2, byte param3) {
        if (jna.a(false, param1, param2, param0)) {
          if (param3 != -82) {
            rj.a(23);
            return fj.c(1500);
          } else {
            return fj.c(1500);
          }
        } else {
          return null;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        if (((rj) this).field_y) {
          if (((rj) this).a(param6, param1, 125, param3, param2)) {
            boolean discarded$2 = ((rj) this).a(param5, false);
            ((rj) this).field_s = param4;
            if (null != ((rj) this).field_h) {
              if (!(((rj) this).field_h instanceof om)) {
                return true;
              } else {
                ((om) (Object) ((rj) this).field_h).a(param3, param6, (rj) this, 453, param2, param4, param1);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param0 <= 70) {
              ((rj) this).field_y = true;
              return false;
            } else {
              return false;
            }
          }
        } else {
          if (param0 <= 70) {
            ((rj) this).field_y = true;
            return false;
          } else {
            return false;
          }
        }
    }

    final boolean b(byte param0) {
        if (param0 != -34) {
            ((rj) this).field_u = false;
            return ((rj) this).field_u;
        }
        return ((rj) this).field_u;
    }

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        Object var8 = null;
        if (((rj) this).field_h != null) {
          if (((rj) this).field_h instanceof om) {
            ((om) (Object) ((rj) this).field_h).a(param4, param3, 12728, param2, (rj) this, param5);
            if (param0 != 59) {
              var8 = null;
              boolean discarded$3 = ((rj) this).a((ae) null, true);
              ((rj) this).field_s = 0;
              return;
            } else {
              ((rj) this).field_s = 0;
              return;
            }
          } else {
            if (param0 != 59) {
              var8 = null;
              boolean discarded$4 = ((rj) this).a((ae) null, true);
              ((rj) this).field_s = 0;
              return;
            } else {
              ((rj) this).field_s = 0;
              return;
            }
          }
        } else {
          if (param0 != 59) {
            var8 = null;
            boolean discarded$5 = ((rj) this).a((ae) null, true);
            ((rj) this).field_s = 0;
            return;
          } else {
            ((rj) this).field_s = 0;
            return;
          }
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        ((rj) this).field_x = param1;
        if (null != ((rj) this).field_h) {
          if (((rj) this).field_h instanceof tsa) {
            ((tsa) (Object) ((rj) this).field_h).a(param0, param2, (rj) this, param1, (byte) 115);
            if (param3 > -40) {
              rj.a(14);
              return;
            } else {
              return;
            }
          } else {
            if (param3 > -40) {
              rj.a(14);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 > -40) {
            rj.a(14);
            return;
          } else {
            return;
          }
        }
    }

    static {
    }
}
