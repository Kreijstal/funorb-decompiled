/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends sn {
    static String field_A;
    private int field_y;
    private int field_E;
    private int[] field_t;
    private si field_D;
    private db field_z;
    private boolean field_w;
    private si field_B;
    static String field_G;
    private db field_H;
    private int[] field_F;
    static int field_x;
    private boolean field_C;
    private si field_u;
    private db field_v;
    private int field_r;
    private int field_s;

    final static void f(int param0) {
        kb.field_e.field_m = 0;
        kb.field_e.field_j = 0;
        if (param0 != -1) {
            field_A = null;
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -50) {
            return;
        }
        ((fk) this).field_s = param0;
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        int var3 = 0;
        if (param2 != 1) {
            er[] discarded$0 = fk.c(-114, 68, -107);
        }
        while (param0 > 0) {
            var3 = 1 & param1 | var3 << 942871553;
            param1 = param1 >>> 1;
            param0--;
        }
        return var3;
    }

    final static java.awt.Container a(byte param0) {
        if (!(eo.field_k == null)) {
            return (java.awt.Container) (Object) eo.field_k;
        }
        if (param0 <= 83) {
            java.awt.Container discarded$0 = fk.a((byte) -30);
        }
        return (java.awt.Container) (Object) ob.e((byte) 116);
    }

    public static void e(int param0) {
        field_A = null;
        field_G = null;
        if (param0 != -257) {
            int discarded$0 = fk.b(-46, -110, -105);
        }
    }

    private final void a(int param0, int param1, db param2, int param3) {
        param2.a(param1, param0, (byte) -61);
        param2.c((byte) 119, param3);
    }

    final static int a(byte param0, int param1) {
        param1 = param1 & 8191;
        if (param0 != -118) {
            return 88;
        }
        if (4096 > param1) {
            return param1 >= 2048 ? -jc.field_b[param1 - 2048] : jc.field_b[-param1 + 2048];
        }
        return -6145 < (param1 ^ -1) ? -jc.field_b[-param1 + 6144] : jc.field_b[param1 + -6144];
    }

    final sn a() {
        return null;
    }

    final synchronized void a(si param0, int param1, int param2, boolean param3, byte param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_32_0 = 0;
        db stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        si stackIn_41_2 = null;
        db stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        si stackIn_42_2 = null;
        db stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        si stackIn_43_2 = null;
        int stackIn_43_3 = 0;
        db stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        si stackIn_51_2 = null;
        db stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        si stackIn_52_2 = null;
        db stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        si stackIn_53_2 = null;
        int stackIn_53_3 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        db stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        si stackOut_50_2 = null;
        db stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        si stackOut_52_2 = null;
        int stackOut_52_3 = 0;
        db stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        si stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        db stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        si stackOut_40_2 = null;
        db stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        si stackOut_42_2 = null;
        int stackOut_42_3 = 0;
        db stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        si stackOut_41_2 = null;
        int stackOut_41_3 = 0;
        L0: {
          var8 = Vertigo2.field_L ? 1 : 0;
          if (!((fk) this).field_w) {
            break L0;
          } else {
            if (param3) {
              L1: {
                if ((((fk) this).field_y ^ -1) < -1) {
                  L2: {
                    if (((fk) this).field_B != null) {
                      ((fk) this).field_v.a(true);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((fk) this).field_B = param0;
                  if (param0 != null) {
                    ((fk) this).field_v.a(-68, param0, false);
                    this.a(-1, param5, ((fk) this).field_v, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  L3: {
                    if (null == ((fk) this).field_u) {
                      break L3;
                    } else {
                      ((fk) this).field_H.a(true);
                      break L3;
                    }
                  }
                  ((fk) this).field_u = param0;
                  if (param0 != null) {
                    ((fk) this).field_H.a(-19, param0, false);
                    this.a(-1, param5, ((fk) this).field_H, param2);
                    return;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        L4: {
          stackOut_16_0 = this;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (!param3) {
            stackOut_18_0 = this;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L4;
          } else {
            stackOut_17_0 = this;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L4;
          }
        }
        ((fk) this).field_w = stackIn_19_1 != 0;
        if (param0 != ((fk) this).field_B) {
          if (param0 == ((fk) this).field_u) {
            ((fk) this).field_y = -param1;
            this.a(-1, param5, ((fk) this).field_H, param2);
            return;
          } else {
            L5: {
              if (param4 > 56) {
                break L5;
              } else {
                ((fk) this).field_B = null;
                break L5;
              }
            }
            L6: {
              if (null == ((fk) this).field_B) {
                var7 = 1;
                break L6;
              } else {
                if (null != ((fk) this).field_u) {
                  L7: {
                    if ((((fk) this).field_r ^ -1) <= -524289) {
                      stackOut_31_0 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      break L7;
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      break L7;
                    }
                  }
                  var7 = stackIn_32_0;
                  break L6;
                } else {
                  var7 = 0;
                  break L6;
                }
              }
            }
            L8: {
              if (var7 == 0) {
                L9: {
                  if (((fk) this).field_u != null) {
                    ((fk) this).field_H.a(true);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  ((fk) this).field_u = param0;
                  if (param0 != null) {
                    L11: {
                      stackOut_50_0 = ((fk) this).field_H;
                      stackOut_50_1 = -34;
                      stackOut_50_2 = (si) param0;
                      stackIn_52_0 = stackOut_50_0;
                      stackIn_52_1 = stackOut_50_1;
                      stackIn_52_2 = stackOut_50_2;
                      stackIn_51_0 = stackOut_50_0;
                      stackIn_51_1 = stackOut_50_1;
                      stackIn_51_2 = stackOut_50_2;
                      if (param3) {
                        stackOut_52_0 = (db) (Object) stackIn_52_0;
                        stackOut_52_1 = stackIn_52_1;
                        stackOut_52_2 = (si) (Object) stackIn_52_2;
                        stackOut_52_3 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        stackIn_53_2 = stackOut_52_2;
                        stackIn_53_3 = stackOut_52_3;
                        break L11;
                      } else {
                        stackOut_51_0 = (db) (Object) stackIn_51_0;
                        stackOut_51_1 = stackIn_51_1;
                        stackOut_51_2 = (si) (Object) stackIn_51_2;
                        stackOut_51_3 = 1;
                        stackIn_53_0 = stackOut_51_0;
                        stackIn_53_1 = stackOut_51_1;
                        stackIn_53_2 = stackOut_51_2;
                        stackIn_53_3 = stackOut_51_3;
                        break L11;
                      }
                    }
                    ((db) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2, stackIn_53_3 != 0);
                    this.a(-1, param5, ((fk) this).field_H, param2);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((fk) this).field_y = -param1;
                break L8;
              } else {
                L12: {
                  if (((fk) this).field_B != null) {
                    ((fk) this).field_v.a(true);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  ((fk) this).field_B = param0;
                  if (param0 != null) {
                    L14: {
                      stackOut_40_0 = ((fk) this).field_v;
                      stackOut_40_1 = -82;
                      stackOut_40_2 = (si) param0;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      stackIn_42_2 = stackOut_40_2;
                      stackIn_41_0 = stackOut_40_0;
                      stackIn_41_1 = stackOut_40_1;
                      stackIn_41_2 = stackOut_40_2;
                      if (param3) {
                        stackOut_42_0 = (db) (Object) stackIn_42_0;
                        stackOut_42_1 = stackIn_42_1;
                        stackOut_42_2 = (si) (Object) stackIn_42_2;
                        stackOut_42_3 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        stackIn_43_2 = stackOut_42_2;
                        stackIn_43_3 = stackOut_42_3;
                        break L14;
                      } else {
                        stackOut_41_0 = (db) (Object) stackIn_41_0;
                        stackOut_41_1 = stackIn_41_1;
                        stackOut_41_2 = (si) (Object) stackIn_41_2;
                        stackOut_41_3 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        stackIn_43_1 = stackOut_41_1;
                        stackIn_43_2 = stackOut_41_2;
                        stackIn_43_3 = stackOut_41_3;
                        break L14;
                      }
                    }
                    ((db) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2, stackIn_43_3 != 0);
                    this.a(-1, param5, ((fk) this).field_v, param2);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                ((fk) this).field_y = param1;
                break L8;
              }
            }
            return;
          }
        } else {
          ((fk) this).field_y = param1;
          this.a(-1, param5, ((fk) this).field_v, param2);
          return;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_32_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_61_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        if (-1 > (((fk) this).field_s ^ -1)) {
          L0: {
            if (!((fk) this).field_w) {
              break L0;
            } else {
              L1: {
                if (((fk) this).field_y <= 0) {
                  break L1;
                } else {
                  if (!((fk) this).field_v.g(-26083)) {
                    ((fk) this).field_w = false;
                    ((fk) this).field_B = null;
                    ((fk) this).field_y = -((fk) this).field_y;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (-1 >= (((fk) this).field_y ^ -1)) {
                break L0;
              } else {
                if (!((fk) this).field_H.g(-26083)) {
                  ((fk) this).field_u = null;
                  ((fk) this).field_y = -((fk) this).field_y;
                  ((fk) this).field_w = false;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            var4 = (((fk) this).field_r >> 2031964492) * ((fk) this).field_s / 256;
            var5 = ((fk) this).field_s - var4;
            if (0 != ((fk) this).field_y) {
              ((fk) this).field_r = ((fk) this).field_r + param2 * ((fk) this).field_y;
              if (((fk) this).field_r < 1048576) {
                if (-1 <= (((fk) this).field_r ^ -1)) {
                  ((fk) this).field_r = 0;
                  if (((fk) this).field_w) {
                    break L2;
                  } else {
                    ((fk) this).field_y = 0;
                    if (!((fk) this).field_C) {
                      L3: {
                        if (null != ((fk) this).field_B) {
                          ((fk) this).field_v.a(true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((fk) this).field_B = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              } else {
                ((fk) this).field_r = 1048576;
                if (!((fk) this).field_w) {
                  ((fk) this).field_y = 0;
                  if (((fk) this).field_C) {
                    break L2;
                  } else {
                    L4: {
                      if (null == ((fk) this).field_u) {
                        break L4;
                      } else {
                        ((fk) this).field_H.a(true);
                        break L4;
                      }
                    }
                    ((fk) this).field_u = null;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L5: {
            if (dd.field_h) {
              stackOut_31_0 = param2 << 831041921;
              stackIn_32_0 = stackOut_31_0;
              break L5;
            } else {
              stackOut_30_0 = param2;
              stackIn_32_0 = stackOut_30_0;
              break L5;
            }
          }
          L6: {
            var6 = stackIn_32_0;
            if (256 > ((fk) this).field_E) {
              L7: {
                if (((fk) this).field_B != null) {
                  break L7;
                } else {
                  if (((fk) this).field_u != null) {
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
              if (-257 == var4) {
                ((fk) this).field_v.b(param0, param1, param2);
                break L6;
              } else {
                if (-257 == var5) {
                  ((fk) this).field_H.b(param0, param1, param2);
                  break L6;
                } else {
                  L8: {
                    L9: {
                      if (((fk) this).field_t == null) {
                        break L9;
                      } else {
                        if (var6 > ((fk) this).field_t.length) {
                          break L9;
                        } else {
                          qq.a(((fk) this).field_t, 0, var6);
                          qq.a(((fk) this).field_F, 0, var6);
                          break L8;
                        }
                      }
                    }
                    ((fk) this).field_t = new int[var6];
                    ((fk) this).field_F = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((fk) this).field_v.b(((fk) this).field_t, 0, param2);
                    ((fk) this).field_H.b(((fk) this).field_F, 0, param2);
                    if (!dd.field_h) {
                      stackOut_45_0 = param1;
                      stackIn_46_0 = stackOut_45_0;
                      break L10;
                    } else {
                      param1 = param1 << 1;
                      stackOut_44_0 = param1 << 1;
                      stackIn_46_0 = stackOut_44_0;
                      break L10;
                    }
                  }
                  var7 = stackIn_46_0;
                  var8 = 0;
                  L11: while (true) {
                    if (var6 <= var8) {
                      break L6;
                    } else {
                      param0[var8 + var7] = param0[var8 + var7] + (((fk) this).field_F[var8] * var5 + ((fk) this).field_t[var8] * var4 >> -1150349912);
                      var8++;
                      continue L11;
                    }
                  }
                }
              }
            } else {
              break L6;
            }
          }
          L12: {
            if (((fk) this).field_D == null) {
              break L12;
            } else {
              if (0 == ((fk) this).field_E) {
                break L12;
              } else {
                L13: {
                  L14: {
                    if (null == ((fk) this).field_t) {
                      break L14;
                    } else {
                      if (var6 <= ((fk) this).field_t.length) {
                        qq.a(((fk) this).field_t, 0, var6);
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ((fk) this).field_t = new int[var6];
                  ((fk) this).field_F = new int[var6];
                  break L13;
                }
                L15: {
                  ((fk) this).field_z.b(((fk) this).field_t, 0, param2);
                  if (dd.field_h) {
                    param1 = param1 << 1;
                    stackOut_60_0 = param1 << 1;
                    stackIn_61_0 = stackOut_60_0;
                    break L15;
                  } else {
                    stackOut_59_0 = param1;
                    stackIn_61_0 = stackOut_59_0;
                    break L15;
                  }
                }
                var7 = stackIn_61_0;
                var8 = ((fk) this).field_s * ((fk) this).field_E / 256;
                var9 = -var8 + ((fk) this).field_s;
                var10 = 0;
                L16: while (true) {
                  if (var10 >= var6) {
                    break L12;
                  } else {
                    param0[var7 - -var10] = var9 * param0[var7 + var10] + var8 * ((fk) this).field_t[var10] >> -659799704;
                    var10++;
                    continue L16;
                  }
                }
              }
            }
          }
          return;
        } else {
          ((fk) this).a(param2);
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        tb.field_b = true;
        String var2 = "tuhstatbut";
        if (param1 != 11514) {
            return;
        }
        String var3 = "rvnadlm";
        long var4 = -1L;
        gl.a(-11, var4, param0, var3, var2);
    }

    final synchronized int d() {
        return 2;
    }

    final static er[] c(int param0, int param1, int param2) {
        if (param0 > -126) {
            return null;
        }
        return ca.a((byte) -123, param1, 1, param2);
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = Vertigo2.field_L ? 1 : 0;
          if (0 >= ((fk) this).field_r) {
            break L0;
          } else {
            if (((fk) this).field_B != null) {
              ((fk) this).field_v.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if ((((fk) this).field_r ^ -1) <= -1048577) {
            if ((((fk) this).field_E ^ -1) >= -1) {
              break L1;
            } else {
              if (((fk) this).field_D == null) {
                break L1;
              } else {
                ((fk) this).field_z.a(param0);
                break L1;
              }
            }
          } else {
            if ((((fk) this).field_E ^ -1) >= -1) {
              break L1;
            } else {
              if (((fk) this).field_D == null) {
                break L1;
              } else {
                ((fk) this).field_z.a(param0);
                break L1;
              }
            }
          }
        }
        L2: {
          if (((fk) this).field_w) {
            L3: {
              if ((((fk) this).field_y ^ -1) >= -1) {
                break L3;
              } else {
                if (!((fk) this).field_v.g(-26083)) {
                  ((fk) this).field_B = null;
                  ((fk) this).field_w = false;
                  ((fk) this).field_y = -((fk) this).field_y;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if ((((fk) this).field_y ^ -1) <= -1) {
              break L2;
            } else {
              if (((fk) this).field_H.g(-26083)) {
                break L2;
              } else {
                ((fk) this).field_y = -((fk) this).field_y;
                ((fk) this).field_u = null;
                ((fk) this).field_w = false;
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (((fk) this).field_y == 0) {
            break L4;
          } else {
            ((fk) this).field_r = ((fk) this).field_r + ((fk) this).field_y * param0;
            if ((((fk) this).field_r ^ -1) <= -1048577) {
              ((fk) this).field_r = 1048576;
              if (((fk) this).field_w) {
                break L4;
              } else {
                ((fk) this).field_y = 0;
                if (!((fk) this).field_C) {
                  L5: {
                    if (null != ((fk) this).field_u) {
                      ((fk) this).field_H.a(true);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((fk) this).field_u = null;
                  break L4;
                } else {
                  break L4;
                }
              }
            } else {
              if ((((fk) this).field_r ^ -1) >= -1) {
                ((fk) this).field_r = 0;
                if (!((fk) this).field_w) {
                  ((fk) this).field_y = 0;
                  if (!((fk) this).field_C) {
                    L6: {
                      if (((fk) this).field_B == null) {
                        break L6;
                      } else {
                        ((fk) this).field_v.a(true);
                        break L6;
                      }
                    }
                    ((fk) this).field_B = null;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
          }
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (param1 == 1282642017) {
          var3 = 0;
          var4 = be.field_t;
          L0: while (true) {
            if (mn.field_q.length <= var3) {
              return -1;
            } else {
              var5 = gd.field_s[var3];
              if (0 > var5) {
                var4 = var4 + gd.field_k;
                var3++;
                continue L0;
              } else {
                var6 = uc.a(mn.field_q[var3], true, false);
                var7 = -(var6 >> -430493823) + vm.field_c;
                var4 = var4 + al.field_z;
                if (pe.a(kd.field_z + (qc.field_z << -826860287), var4, param0, param2, (byte) 17, var7 - gl.field_l, (gl.field_l << -1450028287) + var6)) {
                  return var5;
                } else {
                  var4 = var4 + (kd.field_z + ((qc.field_z << 1282642017) + al.field_z));
                  var3++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return 111;
        }
    }

    final sn c() {
        return null;
    }

    private fk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "<col=ee9d32>Items - Collectables</col>";
        field_G = "Start level:";
    }
}
