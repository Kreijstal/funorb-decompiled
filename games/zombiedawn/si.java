/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends qk {
    static vn[] field_Ub;
    private int field_Pb;
    static int field_Rb;
    private int field_Nb;
    private int field_Sb;
    static int[] field_Qb;
    private int field_Tb;
    private int field_Vb;
    private kd field_Ob;

    final static void x(int param0) {
        tf.field_c.field_h = 0;
        tf.field_c.field_e = param0;
    }

    final void g(int param0) {
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        super.g(109);
        if (-1 <= ((si) this).field_Ab) {
          return;
        } else {
          if (param0 < 95) {
            field_Rb = 94;
            if (-1 == (((si) this).field_F ^ -1)) {
              if (((si) this).field_Ob == null) {
                ((si) this).field_Pb = ((si) this).field_Pb + 1;
                if (5 <= ((si) this).field_Pb) {
                  this.z(124);
                  ((si) this).field_Pb = 0;
                  return;
                } else {
                  return;
                }
              } else {
                this.o((byte) 71);
                return;
              }
            } else {
              if ((((si) this).field_F ^ -1) != -2) {
                if (-11 == ((si) this).field_F) {
                  ((si) this).field_N = ((si) this).field_N + 3;
                  return;
                } else {
                  return;
                }
              } else {
                ((si) this).field_Pb = ((si) this).field_Pb + 1;
                if (((si) this).field_Pb >= 5) {
                  this.o((byte) 71);
                  ((si) this).field_Pb = 0;
                  if (((si) this).field_U != null) {
                    L0: {
                      if (!((si) this).field_U.l()) {
                        break L0;
                      } else {
                        if (0L != tp.field_p % 3L) {
                          break L0;
                        } else {
                          ((si) this).field_U = dc.a((byte) 18, 85);
                          ((si) this).field_Tb = ((si) this).field_Tb + 1;
                          if ((((si) this).field_Tb ^ -1) <= -5) {
                            ((si) this).l((byte) 52);
                            ((si) this).field_Tb = 0;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    ((si) this).field_Tb = ((si) this).field_Tb + 1;
                    if (((si) this).field_Tb <= -5) {
                      ((si) this).l((byte) 52);
                      ((si) this).field_Tb = 0;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (0L != tp.field_p % 3L) {
                      ((si) this).field_Tb = ((si) this).field_Tb + 1;
                      if ((((si) this).field_Tb ^ -1) <= -5) {
                        ((si) this).l((byte) 52);
                        ((si) this).field_Tb = 0;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((si) this).field_U = dc.a((byte) 18, 85);
                      ((si) this).field_Tb = ((si) this).field_Tb + 1;
                      if ((((si) this).field_Tb ^ -1) <= -5) {
                        ((si) this).l((byte) 52);
                        ((si) this).field_Tb = 0;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  ((si) this).field_Tb = ((si) this).field_Tb + 1;
                  if ((((si) this).field_Tb ^ -1) > -5) {
                    return;
                  } else {
                    ((si) this).l((byte) 52);
                    ((si) this).field_Tb = 0;
                    return;
                  }
                }
              }
            }
          } else {
            if (-1 == ((si) this).field_F) {
              if (((si) this).field_Ob == null) {
                ((si) this).field_Pb = ((si) this).field_Pb + 1;
                if (5 > ((si) this).field_Pb) {
                  return;
                } else {
                  this.z(124);
                  ((si) this).field_Pb = 0;
                  return;
                }
              } else {
                this.o((byte) 71);
                return;
              }
            } else {
              if ((((si) this).field_F ^ -1) != -2) {
                if (-11 != ((si) this).field_F) {
                  return;
                } else {
                  ((si) this).field_N = ((si) this).field_N + 3;
                  return;
                }
              } else {
                ((si) this).field_Pb = ((si) this).field_Pb + 1;
                if (((si) this).field_Pb >= 5) {
                  this.o((byte) 71);
                  ((si) this).field_Pb = 0;
                  if (((si) this).field_U == null) {
                    if (0L == tp.field_p % 3L) {
                      ((si) this).field_U = dc.a((byte) 18, 85);
                      ((si) this).field_Tb = ((si) this).field_Tb + 1;
                      if (((si) this).field_Tb > -5) {
                        return;
                      } else {
                        ((si) this).l((byte) 52);
                        ((si) this).field_Tb = 0;
                        return;
                      }
                    } else {
                      ((si) this).field_Tb = ((si) this).field_Tb + 1;
                      if ((((si) this).field_Tb ^ -1) > -5) {
                        return;
                      } else {
                        ((si) this).l((byte) 52);
                        ((si) this).field_Tb = 0;
                        return;
                      }
                    }
                  } else {
                    if (((si) this).field_U.l()) {
                      L1: {
                        if (0L != tp.field_p % 3L) {
                          break L1;
                        } else {
                          ((si) this).field_U = dc.a((byte) 18, 85);
                          break L1;
                        }
                      }
                      ((si) this).field_Tb = ((si) this).field_Tb + 1;
                      if ((((si) this).field_Tb ^ -1) > -5) {
                        return;
                      } else {
                        ((si) this).l((byte) 52);
                        ((si) this).field_Tb = 0;
                        return;
                      }
                    } else {
                      ((si) this).field_Tb = ((si) this).field_Tb + 1;
                      if ((((si) this).field_Tb ^ -1) > -5) {
                        return;
                      } else {
                        ((si) this).l((byte) 52);
                        ((si) this).field_Tb = 0;
                        return;
                      }
                    }
                  }
                } else {
                  ((si) this).field_Tb = ((si) this).field_Tb + 1;
                  if ((((si) this).field_Tb ^ -1) > -5) {
                    return;
                  } else {
                    ((si) this).l((byte) 52);
                    ((si) this).field_Tb = 0;
                    return;
                  }
                }
              }
            }
          }
        }
    }

    private final void z(int param0) {
        kd var2 = null;
        kd var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        kd var6_ref = null;
        int var8 = 0;
        Object var9 = null;
        qh var10 = null;
        qh var11 = null;
        qh var30 = null;
        L0: {
          var6 = null;
          var8 = ZombieDawn.field_J;
          int discarded$6 = ((si) this).a(true);
          int discarded$7 = ((si) this).f(237239984);
          if (null == ((si) this).field_yb) {
            break L0;
          } else {
            int discarded$8 = ((si) this).field_yb.a(true);
            int discarded$9 = ((si) this).field_yb.f(237239984);
            ((si) this).field_yb = null;
            break L0;
          }
        }
        if (((si) this).field_Ob == null) {
          var2 = null;
          if (param0 >= 113) {
            var3 = null;
            var4 = -1;
            var5 = -1;
            var6_ref = (kd) (Object) ((si) this).a((byte) -74, ((si) this).field_Sb, 2);
            L1: while (true) {
              if (var6_ref == null) {
                if (var3 == null) {
                  if (var2 == null) {
                    L2: {
                      this.y(124);
                      if (null != ((si) this).field_Ob) {
                        this.o((byte) 71);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    return;
                  } else {
                    L3: {
                      this.a(-48, var2);
                      if (null != ((si) this).field_Ob) {
                        this.o((byte) 71);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  }
                } else {
                  L4: {
                    this.a(-123, var3);
                    if (null != ((si) this).field_Ob) {
                      this.o((byte) 71);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                }
              } else {
                L5: {
                  if (!var6_ref.x(33)) {
                    break L5;
                  } else {
                    var11 = dj.field_e.field_H.a(true, ((si) this).a(true), var6_ref.f(237239984), var6_ref.a(true), ((si) this).f(237239984));
                    if (var11 != null) {
                      L6: {
                        L7: {
                          if (var11.field_g > var4) {
                            break L7;
                          } else {
                            if (var4 != -1) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var4 = var11.field_g;
                        var2 = var6_ref;
                        break L6;
                      }
                      if (0 == var6_ref.field_Bb) {
                        L8: {
                          if (var11.field_g > var5) {
                            break L8;
                          } else {
                            if ((var5 ^ -1) != 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var3 = var6_ref;
                        var5 = var11.field_g;
                        break L5;
                      } else {
                        var6_ref = (kd) (Object) ((si) this).e((byte) 32);
                        continue L1;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                var6_ref = (kd) (Object) ((si) this).e((byte) 32);
                continue L1;
              }
            }
          } else {
            var9 = null;
            vn discarded$10 = si.a(50, 105, (dj) null, -55);
            var3 = null;
            var4 = -1;
            var5 = -1;
            var6_ref = (kd) (Object) ((si) this).a((byte) -74, ((si) this).field_Sb, 2);
            L9: while (true) {
              if (var6_ref == null) {
                if (var3 == null) {
                  if (var2 != null) {
                    L10: {
                      this.a(-48, var2);
                      if (null != ((si) this).field_Ob) {
                        this.o((byte) 71);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return;
                  } else {
                    L11: {
                      this.y(124);
                      if (null != ((si) this).field_Ob) {
                        this.o((byte) 71);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  L12: {
                    this.a(-123, var3);
                    if (null != ((si) this).field_Ob) {
                      this.o((byte) 71);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  if (!var6_ref.x(33)) {
                    break L13;
                  } else {
                    var30 = dj.field_e.field_H.a(true, ((si) this).a(true), var6_ref.f(237239984), var6_ref.a(true), ((si) this).f(237239984));
                    if (var30 != null) {
                      L14: {
                        L15: {
                          if (var30.field_g > var4) {
                            break L15;
                          } else {
                            if (var4 != -1) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var4 = var30.field_g;
                        var2 = var6_ref;
                        break L14;
                      }
                      if (0 == var6_ref.field_Bb) {
                        L16: {
                          if (var30.field_g > var5) {
                            break L16;
                          } else {
                            if ((var5 ^ -1) != 0) {
                              break L13;
                            } else {
                              break L16;
                            }
                          }
                        }
                        var3 = var6_ref;
                        var5 = var30.field_g;
                        break L13;
                      } else {
                        var6_ref = (kd) (Object) ((si) this).e((byte) 32);
                        continue L9;
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                var6_ref = (kd) (Object) ((si) this).e((byte) 32);
                continue L9;
              }
            }
          }
        } else {
          L17: {
            this.y(126);
            var2 = null;
            if (param0 >= 113) {
              var3 = null;
              var4 = -1;
              var5 = -1;
              var6_ref = (kd) (Object) ((si) this).a((byte) -74, ((si) this).field_Sb, 2);
              break L17;
            } else {
              var9 = null;
              vn discarded$11 = si.a(50, 105, (dj) null, -55);
              var3 = null;
              var4 = -1;
              var5 = -1;
              var6_ref = (kd) (Object) ((si) this).a((byte) -74, ((si) this).field_Sb, 2);
              break L17;
            }
          }
          L18: while (true) {
            if (var6_ref == null) {
              L19: {
                if (var3 != null) {
                  this.a(-123, var3);
                  break L19;
                } else {
                  if (var2 != null) {
                    this.a(-48, var2);
                    break L19;
                  } else {
                    this.y(124);
                    break L19;
                  }
                }
              }
              L20: {
                if (null != ((si) this).field_Ob) {
                  this.o((byte) 71);
                  break L20;
                } else {
                  break L20;
                }
              }
              return;
            } else {
              L21: {
                if (!var6_ref.x(33)) {
                  break L21;
                } else {
                  var10 = dj.field_e.field_H.a(true, ((si) this).a(true), var6_ref.f(237239984), var6_ref.a(true), ((si) this).f(237239984));
                  if (var10 != null) {
                    L22: {
                      L23: {
                        if (var10.field_g > var4) {
                          break L23;
                        } else {
                          if (var4 != -1) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var4 = var10.field_g;
                      var2 = var6_ref;
                      break L22;
                    }
                    if (0 == var6_ref.field_Bb) {
                      L24: {
                        if (var10.field_g > var5) {
                          break L24;
                        } else {
                          if ((var5 ^ -1) != 0) {
                            break L21;
                          } else {
                            break L24;
                          }
                        }
                      }
                      var3 = var6_ref;
                      var5 = var10.field_g;
                      break L21;
                    } else {
                      var6_ref = (kd) (Object) ((si) this).e((byte) 32);
                      continue L18;
                    }
                  } else {
                    break L21;
                  }
                }
              }
              var6_ref = (kd) (Object) ((si) this).e((byte) 32);
              continue L18;
            }
          }
        }
    }

    private final void a(int param0, kd param1) {
        int var3 = 0;
        ((si) this).field_Ob = param1;
        param1.field_Bb = param1.field_Bb + 1;
        var3 = -77 / ((70 - param0) / 46);
        if (null != ((si) this).field_U) {
          if (!((si) this).field_U.l()) {
            return;
          } else {
            ((si) this).field_U = dc.a((byte) 18, 87);
            return;
          }
        } else {
          ((si) this).field_U = dc.a((byte) 18, 87);
          return;
        }
    }

    final void a(wk param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var3 = param0.a(((si) this).a(true), (byte) -80);
        int var4 = param0.a(((si) this).f(param1 + 237234924), param1 ^ param1);
        bi.d(var3, var4, ((si) this).field_Sb, 255);
        bi.d(var3, var4, ((si) this).field_pb, 65535);
        if (!(null == ((si) this).field_Ob)) {
            bi.e(var3, var4, param0.a(((si) this).field_Ob.a(true), (byte) -106), param0.a(((si) this).field_Ob.f(237239984), 0), 16711680);
        }
        if (!(null == ((si) this).field_yb)) {
            var5 = param0.a(((si) this).field_yb.a(true), (byte) -78);
            var6 = param0.a(((si) this).field_yb.f(param1 + 237234924), 0);
            bi.e(var3, -48 + var4 + 10, var5, var6 - 38, 16776960);
            bj.field_q.c(Integer.toString(((si) this).field_F), var3, var4 + -48, 16777215, 0);
            bj.field_q.c(Integer.toString(((si) this).field_yb.field_F), var5, var6 - 48, 16777215, 0);
        }
    }

    final static vn a(int param0, int param1, dj param2, int param3) {
        Object var5 = null;
        if (param3 == 48) {
          if (!ph.a(param1, param3 + 30995, param0, param2)) {
            return null;
          } else {
            return fg.d(-127);
          }
        } else {
          var5 = null;
          vn discarded$5 = si.a(-109, -74, (dj) null, 70);
          if (!ph.a(param1, param3 + 30995, param0, param2)) {
            return null;
          } else {
            return fg.d(-127);
          }
        }
    }

    final void o(int param0) {
        this.y(param0 ^ -6269);
        super.o(param0 ^ 0);
        if (param0 != -6253) {
            ((si) this).o(114);
        }
    }

    private final void y(int param0) {
        L0: {
          if (((si) this).field_Ob != null) {
            ((si) this).field_Ob.field_Bb = ((si) this).field_Ob.field_Bb - 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 3) {
          ((si) this).field_Sb = 0;
          ((si) this).field_Ob = null;
          return;
        } else {
          ((si) this).field_Ob = null;
          return;
        }
    }

    private final void o(byte param0) {
        if (((si) this).field_Ob == null) {
          return;
        } else {
          L0: {
            ((si) this).a(((si) this).field_Ob.a(true), (byte) 121, ((si) this).field_Ob.f(237239984));
            ((si) this).c(0, ((si) this).field_D / 2);
            if (param0 == 71) {
              break L0;
            } else {
              ((si) this).o(28);
              break L0;
            }
          }
          return;
        }
    }

    si(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((si) this).field_Pb = 0;
        ((si) this).field_pb = 360;
        ((si) this).field_Sb = 400;
        ((si) this).field_Vb = 360;
        ((si) this).field_Nb = ((si) this).field_Vb / 4;
    }

    final void l(byte param0) {
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        if (((si) this).field_Ab < 0) {
          super.l((byte) 52);
          return;
        } else {
          L0: {
            if (!((si) this).a(param0 ^ -9, ((si) this).field_Vb, false)) {
              if (null == ((si) this).field_Ob) {
                L1: {
                  this.z(param0 ^ 76);
                  if (null != ((si) this).field_Ob) {
                    break L1;
                  } else {
                    if (((si) this).field_F != 0) {
                      ((si) this).e(0, param0 + -6956);
                      break L1;
                    } else {
                      if (param0 != 52) {
                        field_Rb = -17;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (param0 != 52) {
                  field_Rb = -17;
                  return;
                } else {
                  return;
                }
              } else {
                if ((((si) this).field_Ob.field_F ^ -1) != -10) {
                  if (null != ((si) this).field_Ob) {
                    break L0;
                  } else {
                    if (((si) this).field_F != 0) {
                      ((si) this).e(0, param0 + -6956);
                      break L0;
                    } else {
                      if (param0 == 52) {
                        return;
                      } else {
                        field_Rb = -17;
                        return;
                      }
                    }
                  }
                } else {
                  L2: {
                    this.z(param0 ^ 76);
                    if (null != ((si) this).field_Ob) {
                      break L2;
                    } else {
                      if (((si) this).field_F != 0) {
                        ((si) this).e(0, param0 + -6956);
                        break L2;
                      } else {
                        if (param0 != 52) {
                          field_Rb = -17;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (param0 != 52) {
                    field_Rb = -17;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (!((si) this).field_fb) {
                if (((si) this).field_mb < ((si) this).field_Nb * ((si) this).field_Nb) {
                  if (!((si) this).p(5)) {
                    ((si) this).m((byte) -94);
                    this.y(100);
                    if (param0 != 52) {
                      field_Rb = -17;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (((si) this).field_F == 3) {
                      L3: {
                        ((si) this).e(0, -6904);
                        if (param0 == 52) {
                          break L3;
                        } else {
                          field_Rb = -17;
                          break L3;
                        }
                      }
                      return;
                    } else {
                      break L0;
                    }
                  }
                } else {
                  ((si) this).m((byte) -98);
                  this.y(59);
                  break L0;
                }
              } else {
                if (-4 != (((si) this).field_F ^ -1)) {
                  L4: {
                    if (((si) this).field_U == null) {
                      ((si) this).field_U = dc.a((byte) 18, 86);
                      break L4;
                    } else {
                      if (((si) this).field_U.l()) {
                        ((si) this).field_U = dc.a((byte) 18, 86);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!((si) this).p(-125)) {
                    ((si) this).e(3, -6904);
                    break L0;
                  } else {
                    if (param0 != 52) {
                      field_Rb = -17;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (!((si) this).p(-125)) {
                    ((si) this).e(3, -6904);
                    if (param0 != 52) {
                      field_Rb = -17;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 != 52) {
                      field_Rb = -17;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
          if (param0 == 52) {
            return;
          } else {
            field_Rb = -17;
            return;
          }
        }
    }

    public static void w(int param0) {
        field_Qb = null;
        if (param0 != 255) {
            si.w(-44);
            field_Ub = null;
            return;
        }
        field_Ub = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Rb = 69;
        field_Qb = new int[16];
    }
}
