/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp extends ak {
    static String field_Jb;
    static String field_Eb;
    static v field_Lb;
    ak field_Fb;
    static String[] field_Hb;
    vp field_Gb;
    ak field_Ib;
    static tf field_Kb;

    gp(long param0, ak param1, ak param2, vp param3) {
        super(param0, (ak) null);
        ((gp) this).field_Ib = new ak(0L, param2);
        ((gp) this).field_Gb = new vp(0L, param3);
        ((gp) this).a(((gp) this).field_Ib, (byte) 26);
        ((gp) this).a((ak) (Object) ((gp) this).field_Gb, (byte) 26);
        ((gp) this).field_Fb = param1;
        ((gp) this).field_Ib.a(param1, (byte) 26);
    }

    final static void a(boolean param0, String param1, int param2) {
        int var3 = 0;
        dk.field_c = false;
        gj.field_V = false;
        if (null != to.field_r) {
          if (to.field_r.field_N) {
            L0: {
              if (param2 == 8) {
                L1: {
                  if (!to.field_s) {
                    param1 = bo.field_b;
                    break L1;
                  } else {
                    param1 = mp.field_e;
                    break L1;
                  }
                }
                param2 = 2;
                nf.field_b.a(h.field_U, -13939);
                break L0;
              } else {
                break L0;
              }
            }
            L2: {
              var3 = 1;
              if ((param2 ^ -1) == -11) {
                var3 = 0;
                dm.i((byte) -51);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var3 != 0) {
                L4: {
                  if (gj.field_V) {
                    param1 = sd.a(vf.field_a, 79, new String[1]);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (ke.field_d) {
                    param1 = lh.field_a;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                to.field_r.a(param2, 5804, param1);
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (256 == param2) {
                break L6;
              } else {
                if ((param2 ^ -1) != -11) {
                  if (!to.field_s) {
                    nf.field_b.m(-10515);
                    break L6;
                  } else {
                    if (!param0) {
                      field_Hb = null;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (!param0) {
                    field_Hb = null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (!param0) {
              field_Hb = null;
              return;
            } else {
              return;
            }
          } else {
            if (!param0) {
              field_Hb = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (!param0) {
            field_Hb = null;
            return;
          } else {
            return;
          }
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, byte param4) {
        int var6 = 0;
        L0: {
          if (!((gp) this).field_Gb.e((byte) 123)) {
            break L0;
          } else {
            ((gp) this).field_Fb.field_wb = ((gp) this).field_Fb.field_wb + param2;
            break L0;
          }
        }
        var6 = 13 / ((70 - param4) / 55);
        if (!((gp) this).field_Gb.b((byte) 70)) {
          L1: {
            if (((gp) this).field_Gb.f((byte) 83)) {
              ((gp) this).field_Fb.field_wb = ((gp) this).field_Fb.field_wb + param1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (((gp) this).field_Gb.j(-1)) {
              ((gp) this).field_Fb.field_wb = ((gp) this).field_Fb.field_wb - param1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (((gp) this).field_W) {
              ((gp) this).field_Fb.field_wb = ((gp) this).field_Fb.field_wb - param3;
              break L3;
            } else {
              break L3;
            }
          }
          if (param0) {
            if (0 <= -(((gp) this).field_Fb.field_S - -((gp) this).field_Fb.field_wb)) {
              if (((gp) this).field_Fb.field_Z + ((gp) this).field_Fb.field_nb + -((gp) this).field_Ib.field_nb >= -(((gp) this).field_Fb.field_wb + ((gp) this).field_Fb.field_S)) {
                L4: {
                  if (((gp) this).field_Gb.k(92)) {
                    ((gp) this).field_Fb.field_S = -((gp) this).field_Gb.a(3, ((gp) this).field_Fb.field_nb, param0, ((gp) this).field_Ib.field_nb);
                    ((gp) this).field_Fb.field_wb = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((gp) this).field_Gb.a(((gp) this).field_Ib.field_nb, (byte) 108, -((gp) this).field_Fb.field_S, ((gp) this).field_Fb.field_nb);
                return;
              } else {
                L5: {
                  ((gp) this).field_Fb.field_wb = -(((gp) this).field_Fb.field_nb + ((gp) this).field_Fb.field_Z + -((gp) this).field_Ib.field_nb) + -((gp) this).field_Fb.field_S;
                  if (((gp) this).field_Gb.k(92)) {
                    ((gp) this).field_Fb.field_S = -((gp) this).field_Gb.a(3, ((gp) this).field_Fb.field_nb, param0, ((gp) this).field_Ib.field_nb);
                    ((gp) this).field_Fb.field_wb = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((gp) this).field_Gb.a(((gp) this).field_Ib.field_nb, (byte) 108, -((gp) this).field_Fb.field_S, ((gp) this).field_Fb.field_nb);
                return;
              }
            } else {
              L6: {
                ((gp) this).field_Fb.field_wb = -((gp) this).field_Fb.field_S;
                if (((gp) this).field_Fb.field_Z + ((gp) this).field_Fb.field_nb + -((gp) this).field_Ib.field_nb < -(((gp) this).field_Fb.field_wb + ((gp) this).field_Fb.field_S)) {
                  ((gp) this).field_Fb.field_wb = -(((gp) this).field_Fb.field_nb + ((gp) this).field_Fb.field_Z + -((gp) this).field_Ib.field_nb) + -((gp) this).field_Fb.field_S;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (((gp) this).field_Gb.k(92)) {
                  ((gp) this).field_Fb.field_S = -((gp) this).field_Gb.a(3, ((gp) this).field_Fb.field_nb, param0, ((gp) this).field_Ib.field_nb);
                  ((gp) this).field_Fb.field_wb = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
              ((gp) this).field_Gb.a(((gp) this).field_Ib.field_nb, (byte) 108, -((gp) this).field_Fb.field_S, ((gp) this).field_Fb.field_nb);
              return;
            }
          } else {
            if (((gp) this).field_Fb.field_Z + ((gp) this).field_Fb.field_nb + -((gp) this).field_Ib.field_nb >= -(((gp) this).field_Fb.field_wb + ((gp) this).field_Fb.field_S)) {
              if ((-(((gp) this).field_Fb.field_wb + ((gp) this).field_Fb.field_S) ^ -1) <= -1) {
                L8: {
                  if (((gp) this).field_Gb.k(92)) {
                    ((gp) this).field_Fb.field_S = -((gp) this).field_Gb.a(3, ((gp) this).field_Fb.field_nb, param0, ((gp) this).field_Ib.field_nb);
                    ((gp) this).field_Fb.field_wb = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                ((gp) this).field_Gb.a(((gp) this).field_Ib.field_nb, (byte) 108, -((gp) this).field_Fb.field_S, ((gp) this).field_Fb.field_nb);
                return;
              } else {
                L9: {
                  ((gp) this).field_Fb.field_wb = -((gp) this).field_Fb.field_S;
                  if (((gp) this).field_Gb.k(92)) {
                    ((gp) this).field_Fb.field_S = -((gp) this).field_Gb.a(3, ((gp) this).field_Fb.field_nb, param0, ((gp) this).field_Ib.field_nb);
                    ((gp) this).field_Fb.field_wb = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((gp) this).field_Gb.a(((gp) this).field_Ib.field_nb, (byte) 108, -((gp) this).field_Fb.field_S, ((gp) this).field_Fb.field_nb);
                return;
              }
            } else {
              ((gp) this).field_Fb.field_wb = -(((gp) this).field_Fb.field_nb + ((gp) this).field_Fb.field_Z + -((gp) this).field_Ib.field_nb) + -((gp) this).field_Fb.field_S;
              if ((-(((gp) this).field_Fb.field_wb + ((gp) this).field_Fb.field_S) ^ -1) <= -1) {
                L10: {
                  if (((gp) this).field_Gb.k(92)) {
                    ((gp) this).field_Fb.field_S = -((gp) this).field_Gb.a(3, ((gp) this).field_Fb.field_nb, param0, ((gp) this).field_Ib.field_nb);
                    ((gp) this).field_Fb.field_wb = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((gp) this).field_Gb.a(((gp) this).field_Ib.field_nb, (byte) 108, -((gp) this).field_Fb.field_S, ((gp) this).field_Fb.field_nb);
                return;
              } else {
                L11: {
                  ((gp) this).field_Fb.field_wb = -((gp) this).field_Fb.field_S;
                  if (((gp) this).field_Gb.k(92)) {
                    ((gp) this).field_Fb.field_S = -((gp) this).field_Gb.a(3, ((gp) this).field_Fb.field_nb, param0, ((gp) this).field_Ib.field_nb);
                    ((gp) this).field_Fb.field_wb = 0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                ((gp) this).field_Gb.a(((gp) this).field_Ib.field_nb, (byte) 108, -((gp) this).field_Fb.field_S, ((gp) this).field_Fb.field_nb);
                return;
              }
            }
          }
        } else {
          L12: {
            ((gp) this).field_Fb.field_wb = ((gp) this).field_Fb.field_wb - param2;
            if (((gp) this).field_Gb.f((byte) 83)) {
              ((gp) this).field_Fb.field_wb = ((gp) this).field_Fb.field_wb + param1;
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            if (((gp) this).field_Gb.j(-1)) {
              ((gp) this).field_Fb.field_wb = ((gp) this).field_Fb.field_wb - param1;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            if (((gp) this).field_W) {
              ((gp) this).field_Fb.field_wb = ((gp) this).field_Fb.field_wb - param3;
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            if (param0) {
              L16: {
                if (0 <= -(((gp) this).field_Fb.field_S - -((gp) this).field_Fb.field_wb)) {
                  break L16;
                } else {
                  ((gp) this).field_Fb.field_wb = -((gp) this).field_Fb.field_S;
                  break L16;
                }
              }
              if (((gp) this).field_Fb.field_Z + ((gp) this).field_Fb.field_nb + -((gp) this).field_Ib.field_nb < -(((gp) this).field_Fb.field_wb + ((gp) this).field_Fb.field_S)) {
                ((gp) this).field_Fb.field_wb = -(((gp) this).field_Fb.field_nb + ((gp) this).field_Fb.field_Z + -((gp) this).field_Ib.field_nb) + -((gp) this).field_Fb.field_S;
                break L15;
              } else {
                break L15;
              }
            } else {
              L17: {
                if (((gp) this).field_Fb.field_Z + ((gp) this).field_Fb.field_nb + -((gp) this).field_Ib.field_nb >= -(((gp) this).field_Fb.field_wb + ((gp) this).field_Fb.field_S)) {
                  break L17;
                } else {
                  ((gp) this).field_Fb.field_wb = -(((gp) this).field_Fb.field_nb + ((gp) this).field_Fb.field_Z + -((gp) this).field_Ib.field_nb) + -((gp) this).field_Fb.field_S;
                  break L17;
                }
              }
              if ((-(((gp) this).field_Fb.field_wb + ((gp) this).field_Fb.field_S) ^ -1) > -1) {
                ((gp) this).field_Fb.field_wb = -((gp) this).field_Fb.field_S;
                break L15;
              } else {
                break L15;
              }
            }
          }
          L18: {
            if (((gp) this).field_Gb.k(92)) {
              ((gp) this).field_Fb.field_S = -((gp) this).field_Gb.a(3, ((gp) this).field_Fb.field_nb, param0, ((gp) this).field_Ib.field_nb);
              ((gp) this).field_Fb.field_wb = 0;
              break L18;
            } else {
              break L18;
            }
          }
          ((gp) this).field_Gb.a(((gp) this).field_Ib.field_nb, (byte) 108, -((gp) this).field_Fb.field_S, ((gp) this).field_Fb.field_nb);
          return;
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        if (param0) {
          field_Jb = null;
          ((gp) this).field_Ib.field_nb = ((gp) this).field_nb;
          ((gp) this).field_Ib.field_K = -param2 + (((gp) this).field_K - param1);
          ((gp) this).field_Fb.field_D = 0;
          ((gp) this).field_Fb.field_K = -param2 + (((gp) this).field_K - param1);
          ((gp) this).field_Gb.a(-param2 + ((gp) this).field_K, ((gp) this).field_Fb.field_nb, ((gp) this).field_nb, ((gp) this).field_Ib.field_nb, -((gp) this).field_Fb.field_S, param2, 0, -1);
          return;
        } else {
          ((gp) this).field_Ib.field_nb = ((gp) this).field_nb;
          ((gp) this).field_Ib.field_K = -param2 + (((gp) this).field_K - param1);
          ((gp) this).field_Fb.field_D = 0;
          ((gp) this).field_Fb.field_K = -param2 + (((gp) this).field_K - param1);
          ((gp) this).field_Gb.a(-param2 + ((gp) this).field_K, ((gp) this).field_Fb.field_nb, ((gp) this).field_nb, ((gp) this).field_Ib.field_nb, -((gp) this).field_Fb.field_S, param2, 0, -1);
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        ((gp) this).field_K = param3;
        ((gp) this).field_nb = param5;
        ((gp) this).field_S = param4;
        ((gp) this).field_D = param0;
        if (param2 < 43) {
          return;
        } else {
          this.a(false, param1, param6);
          return;
        }
    }

    private final boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        if (param3) {
          var8 = 1;
          if (param5 != 7736) {
            uj discarded$4 = gp.a(-48, -99L);
            ((gp) this).field_Fb.a(param1, (byte) -128, var8 != 0, ((gp) this).field_Ib.field_nb);
            this.a(false, param4, param2, param0, (byte) 127);
            return var8 != 0;
          } else {
            ((gp) this).field_Fb.a(param1, (byte) -128, var8 != 0, ((gp) this).field_Ib.field_nb);
            this.a(false, param4, param2, param0, (byte) 127);
            return var8 != 0;
          }
        } else {
          if (((gp) this).field_W) {
            if (!param6) {
              var8 = 1;
              if (param5 != 7736) {
                uj discarded$5 = gp.a(-48, -99L);
                ((gp) this).field_Fb.a(param1, (byte) -128, var8 != 0, ((gp) this).field_Ib.field_nb);
                this.a(false, param4, param2, param0, (byte) 127);
                return var8 != 0;
              } else {
                ((gp) this).field_Fb.a(param1, (byte) -128, var8 != 0, ((gp) this).field_Ib.field_nb);
                this.a(false, param4, param2, param0, (byte) 127);
                return var8 != 0;
              }
            } else {
              var8 = 0;
              if (param5 != 7736) {
                uj discarded$6 = gp.a(-48, -99L);
                ((gp) this).field_Fb.a(param1, (byte) -128, var8 != 0, ((gp) this).field_Ib.field_nb);
                this.a(false, param4, param2, param0, (byte) 127);
                return var8 != 0;
              } else {
                ((gp) this).field_Fb.a(param1, (byte) -128, var8 != 0, ((gp) this).field_Ib.field_nb);
                this.a(false, param4, param2, param0, (byte) 127);
                return var8 != 0;
              }
            }
          } else {
            var8 = 0;
            if (param5 != 7736) {
              uj discarded$7 = gp.a(-48, -99L);
              ((gp) this).field_Fb.a(param1, (byte) -128, var8 != 0, ((gp) this).field_Ib.field_nb);
              this.a(false, param4, param2, param0, (byte) 127);
              return var8 != 0;
            } else {
              ((gp) this).field_Fb.a(param1, (byte) -128, var8 != 0, ((gp) this).field_Ib.field_nb);
              this.a(false, param4, param2, param0, (byte) 127);
              return var8 != 0;
            }
          }
        }
    }

    final static uj a(int param0, long param1) {
        Object var4 = null;
        if (param0 != 2) {
          var4 = null;
          gp.a(true, (String) null, -69);
          return (uj) (Object) il.field_d.a(param0 + -11436, param1);
        } else {
          return (uj) (Object) il.field_d.a(param0 + -11436, param1);
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.a(param2, ((gp) this).field_Ib.field_nb, param1, param3, (byte) -43);
        int var5 = -81 / ((param0 - -15) / 62);
    }

    public static void j(int param0) {
        field_Hb = null;
        field_Eb = null;
        if (param0 != 0) {
            return;
        }
        field_Kb = null;
        field_Lb = null;
        field_Jb = null;
    }

    final boolean a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param4 != 0) {
          boolean discarded$2 = ((gp) this).a(false, true, -57, 93, -15, 99);
          return this.a(param3, param2, param5, param1, ((gp) this).field_Ib.field_nb, 7736, param0);
        } else {
          return this.a(param3, param2, param5, param1, ((gp) this).field_Ib.field_nb, 7736, param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = "Disruptive behaviour";
        field_Hb = new String[]{"Many grids have a dark edge of cells called the <col=FF9900>buffer</col>. Use these to drop tiles half-on, half-off the central grid. They are not included as part of the picture."};
        field_Jb = "Location";
    }
}
