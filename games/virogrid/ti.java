/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti implements ol {
    private int field_f;
    static String field_a;
    static e field_g;
    private int field_e;
    static String field_c;
    static km field_h;
    static kf field_i;
    private e field_d;
    static int field_b;

    public static void b(int param0) {
        field_i = null;
        int var1 = 108 % ((58 - param0) / 55);
        field_h = null;
        field_g = null;
        field_c = null;
        field_a = null;
    }

    final static void c(int param0) {
        l.field_c = new p();
        int var1 = -112 / ((-57 - param0) / 39);
    }

    final static String a(int param0) {
        int var1 = 89 % ((53 - param0) / 57);
        return sh.field_qb.h(-121);
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        if ((bn.field_d ^ -1) < -1) {
          if (null != kk.field_q) {
            L0: {
              ih.field_b = kk.field_q.a(11);
              rj.a(2, (byte) -92);
              if (null != ih.field_b) {
                var2 = 2;
                nn.a((java.awt.Canvas) (Object) ih.field_b, (byte) -54);
                break L0;
              } else {
                var2 = 3;
                break L0;
              }
            }
            L1: {
              if (kk.field_q != null) {
                break L1;
              } else {
                if (!ia.field_c) {
                  break L1;
                } else {
                  nm.a(param0, var2, (byte) 33);
                  if (param1 != -1502464351) {
                    field_g = null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param1 != -1502464351) {
              field_g = null;
              return;
            } else {
              return;
            }
          } else {
            L2: {
              ih.field_b = wm.a(640, 0, 480, 0, param1 + 1502469767, ei.field_c);
              if (null != ih.field_b) {
                var2 = 2;
                nn.a((java.awt.Canvas) (Object) ih.field_b, (byte) -54);
                break L2;
              } else {
                var2 = 3;
                break L2;
              }
            }
            if (kk.field_q == null) {
              if (ia.field_c) {
                nm.a(param0, var2, (byte) 33);
                if (param1 != -1502464351) {
                  field_g = null;
                  return;
                } else {
                  return;
                }
              } else {
                if (param1 != -1502464351) {
                  field_g = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 != -1502464351) {
                field_g = null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (qm.i(param1 ^ -1502464331)) {
            var2 = 0;
            if (kk.field_q == null) {
              if (!ia.field_c) {
                L3: {
                  if (param1 == -1502464351) {
                    break L3;
                  } else {
                    field_g = null;
                    break L3;
                  }
                }
                return;
              } else {
                L4: {
                  nm.a(param0, var2, (byte) 33);
                  if (param1 == -1502464351) {
                    break L4;
                  } else {
                    field_g = null;
                    break L4;
                  }
                }
                return;
              }
            } else {
              L5: {
                if (param1 == -1502464351) {
                  break L5;
                } else {
                  field_g = null;
                  break L5;
                }
              }
              return;
            }
          } else {
            var2 = 1;
            L6: {
              if (kk.field_q != null) {
                break L6;
              } else {
                if (!ia.field_c) {
                  break L6;
                } else {
                  nm.a(param0, var2, (byte) 33);
                  if (param1 != -1502464351) {
                    field_g = null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param1 != -1502464351) {
              field_g = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        if (!param1.field_p) {
          if (!param1.f(true)) {
            var6 = 2188450;
            if (param4 == -23294) {
              int discarded$3 = ((ti) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param1.field_n + "</u>", param0 - -param1.field_l, param1.field_u + param3, param1.field_g, param1.field_m, var6, -1, ((ti) this).field_e, ((ti) this).field_f, ((ti) this).field_d.field_H + ((ti) this).field_d.field_G);
              if (param1.f(true)) {
                var7 = ((ti) this).field_d.a(param1.field_n);
                var8 = ((ti) this).field_d.field_G + ((ti) this).field_d.field_H;
                var9 = param0 - -param1.field_l;
                var10 = param3 - -param1.field_u;
                if (((ti) this).field_e != 2) {
                  if ((((ti) this).field_e ^ -1) == -2) {
                    var9 = var9 + (param1.field_g + -var7 >> -532386815);
                    if (((ti) this).field_f != 2) {
                      if (((ti) this).field_f != 1) {
                        b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                        return;
                      } else {
                        var10 = var10 + (param1.field_m - var8 >> -1502464351);
                        b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                        return;
                      }
                    } else {
                      var10 = var10 + (-var8 + param1.field_m);
                      b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                      return;
                    }
                  } else {
                    if (((ti) this).field_f != 2) {
                      if (((ti) this).field_f == 1) {
                        var10 = var10 + (param1.field_m - var8 >> -1502464351);
                        b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                        return;
                      } else {
                        b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                        return;
                      }
                    } else {
                      var10 = var10 + (-var8 + param1.field_m);
                      b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                      return;
                    }
                  }
                } else {
                  var9 = var9 + (param1.field_g + -var7);
                  if (((ti) this).field_f != 2) {
                    if (((ti) this).field_f == 1) {
                      var10 = var10 + (param1.field_m - var8 >> -1502464351);
                      b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                      return;
                    } else {
                      b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                      return;
                    }
                  } else {
                    var10 = var10 + (-var8 + param1.field_m);
                    b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            var6 = 3249872;
            if (param4 == -23294) {
              int discarded$4 = ((ti) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param1.field_n + "</u>", param0 - -param1.field_l, param1.field_u + param3, param1.field_g, param1.field_m, var6, -1, ((ti) this).field_e, ((ti) this).field_f, ((ti) this).field_d.field_H + ((ti) this).field_d.field_G);
              if (param1.f(true)) {
                var7 = ((ti) this).field_d.a(param1.field_n);
                var8 = ((ti) this).field_d.field_G + ((ti) this).field_d.field_H;
                var9 = param0 - -param1.field_l;
                var10 = param3 - -param1.field_u;
                if (((ti) this).field_e != 2) {
                  if ((((ti) this).field_e ^ -1) == -2) {
                    var9 = var9 + (param1.field_g + -var7 >> -532386815);
                    if (((ti) this).field_f != 2) {
                      if (((ti) this).field_f != 1) {
                        b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                        return;
                      } else {
                        var10 = var10 + (param1.field_m - var8 >> -1502464351);
                        b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                        return;
                      }
                    } else {
                      var10 = var10 + (-var8 + param1.field_m);
                      b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                      return;
                    }
                  } else {
                    if (((ti) this).field_f != 2) {
                      if (((ti) this).field_f != 1) {
                        b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                        return;
                      } else {
                        var10 = var10 + (param1.field_m - var8 >> -1502464351);
                        b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                        return;
                      }
                    } else {
                      var10 = var10 + (-var8 + param1.field_m);
                      b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                      return;
                    }
                  }
                } else {
                  L0: {
                    var9 = var9 + (param1.field_g + -var7);
                    if (((ti) this).field_f == 2) {
                      var10 = var10 + (-var8 + param1.field_m);
                      break L0;
                    } else {
                      if (((ti) this).field_f == 1) {
                        var10 = var10 + (param1.field_m - var8 >> -1502464351);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  }
                  b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var6 = 3249872;
          if (param4 == -23294) {
            int discarded$5 = ((ti) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param1.field_n + "</u>", param0 - -param1.field_l, param1.field_u + param3, param1.field_g, param1.field_m, var6, -1, ((ti) this).field_e, ((ti) this).field_f, ((ti) this).field_d.field_H + ((ti) this).field_d.field_G);
            if (param1.f(true)) {
              var7 = ((ti) this).field_d.a(param1.field_n);
              var8 = ((ti) this).field_d.field_G + ((ti) this).field_d.field_H;
              var9 = param0 - -param1.field_l;
              var10 = param3 - -param1.field_u;
              if (((ti) this).field_e != 2) {
                if ((((ti) this).field_e ^ -1) == -2) {
                  var9 = var9 + (param1.field_g + -var7 >> -532386815);
                  if (((ti) this).field_f != 2) {
                    if (((ti) this).field_f != 1) {
                      b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                      return;
                    } else {
                      var10 = var10 + (param1.field_m - var8 >> -1502464351);
                      b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                      return;
                    }
                  } else {
                    var10 = var10 + (-var8 + param1.field_m);
                    b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                    return;
                  }
                } else {
                  L1: {
                    if (((ti) this).field_f == 2) {
                      var10 = var10 + (-var8 + param1.field_m);
                      break L1;
                    } else {
                      if (((ti) this).field_f == 1) {
                        var10 = var10 + (param1.field_m - var8 >> -1502464351);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                  return;
                }
              } else {
                L2: {
                  var9 = var9 + (param1.field_g + -var7);
                  if (((ti) this).field_f == 2) {
                    var10 = var10 + (-var8 + param1.field_m);
                    break L2;
                  } else {
                    if (((ti) this).field_f == 1) {
                      var10 = var10 + (param1.field_m - var8 >> -1502464351);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public ti() {
        ((ti) this).field_d = dj.field_h;
        ((ti) this).field_f = 1;
        ((ti) this).field_e = 1;
    }

    ti(e param0, int param1, int param2) {
        ((ti) this).field_e = param1;
        ((ti) this).field_d = param0;
        ((ti) this).field_f = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Names should contain a maximum of 12 characters";
        field_c = "You have declined the invitation.";
    }
}
