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
        try {
            this.field_Ib = new ak(0L, param2);
            this.field_Gb = new vp(0L, param3);
            this.a(this.field_Ib, (byte) 26);
            this.a(this.field_Gb, (byte) 26);
            this.field_Fb = param1;
            this.field_Ib.a(param1, (byte) 26);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "gp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              dk.field_c = false;
              gj.field_V = false;
              if (null == to.field_r) {
                break L1;
              } else {
                if (!to.field_r.field_N) {
                  break L1;
                } else {
                  L2: {
                    if (param2 == 8) {
                      L3: {
                        if (!to.field_s) {
                          param1 = bo.field_b;
                          break L3;
                        } else {
                          param1 = mp.field_e;
                          break L3;
                        }
                      }
                      param2 = 2;
                      nf.field_b.a(h.field_U, -13939);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    var3_int = 1;
                    if ((param2 ^ -1) == -11) {
                      var3_int = 0;
                      dm.i((byte) -51);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int != 0) {
                      L6: {
                        if (gj.field_V) {
                          param1 = sd.a(vf.field_a, 79, new String[]{param1});
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (ke.field_d) {
                          param1 = lh.field_a;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      to.field_r.a(param2, 5804, param1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (256 == param2) {
                    break L1;
                  } else {
                    if ((param2 ^ -1) != -11) {
                      if (!to.field_s) {
                        nf.field_b.m(-10515);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L8: {
              if (param0) {
                break L8;
              } else {
                field_Hb = (String[]) null;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var3);
            stackOut_29_1 = new StringBuilder().append("gp.I(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, byte param4) {
        int var6 = 0;
        L0: {
          if (!this.field_Gb.e((byte) 123)) {
            break L0;
          } else {
            this.field_Fb.field_wb = this.field_Fb.field_wb + param2;
            break L0;
          }
        }
        var6 = 13 / ((70 - param4) / 55);
        if (!this.field_Gb.b((byte) 70)) {
          L1: {
            if (this.field_Gb.f((byte) 83)) {
              this.field_Fb.field_wb = this.field_Fb.field_wb + param1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (this.field_Gb.j(-1)) {
              this.field_Fb.field_wb = this.field_Fb.field_wb - param1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (this.field_W) {
              this.field_Fb.field_wb = this.field_Fb.field_wb - param3;
              break L3;
            } else {
              break L3;
            }
          }
          if (param0) {
            if (0 <= -(this.field_Fb.field_S - -this.field_Fb.field_wb)) {
              if (this.field_Fb.field_Z + this.field_Fb.field_nb + -this.field_Ib.field_nb >= -(this.field_Fb.field_wb + this.field_Fb.field_S)) {
                L4: {
                  if (this.field_Gb.k(92)) {
                    this.field_Fb.field_S = -this.field_Gb.a(3, this.field_Fb.field_nb, param0, this.field_Ib.field_nb);
                    this.field_Fb.field_wb = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_Gb.a(this.field_Ib.field_nb, (byte) 108, -this.field_Fb.field_S, this.field_Fb.field_nb);
                return;
              } else {
                L5: {
                  this.field_Fb.field_wb = -(this.field_Fb.field_nb + this.field_Fb.field_Z + -this.field_Ib.field_nb) + -this.field_Fb.field_S;
                  if (this.field_Gb.k(92)) {
                    this.field_Fb.field_S = -this.field_Gb.a(3, this.field_Fb.field_nb, param0, this.field_Ib.field_nb);
                    this.field_Fb.field_wb = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_Gb.a(this.field_Ib.field_nb, (byte) 108, -this.field_Fb.field_S, this.field_Fb.field_nb);
                return;
              }
            } else {
              L6: {
                this.field_Fb.field_wb = -this.field_Fb.field_S;
                if (this.field_Fb.field_Z + this.field_Fb.field_nb + -this.field_Ib.field_nb < -(this.field_Fb.field_wb + this.field_Fb.field_S)) {
                  this.field_Fb.field_wb = -(this.field_Fb.field_nb + this.field_Fb.field_Z + -this.field_Ib.field_nb) + -this.field_Fb.field_S;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (this.field_Gb.k(92)) {
                  this.field_Fb.field_S = -this.field_Gb.a(3, this.field_Fb.field_nb, param0, this.field_Ib.field_nb);
                  this.field_Fb.field_wb = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
              this.field_Gb.a(this.field_Ib.field_nb, (byte) 108, -this.field_Fb.field_S, this.field_Fb.field_nb);
              return;
            }
          } else {
            if (this.field_Fb.field_Z + this.field_Fb.field_nb + -this.field_Ib.field_nb >= -(this.field_Fb.field_wb + this.field_Fb.field_S)) {
              if ((-(this.field_Fb.field_wb + this.field_Fb.field_S) ^ -1) <= -1) {
                L8: {
                  if (this.field_Gb.k(92)) {
                    this.field_Fb.field_S = -this.field_Gb.a(3, this.field_Fb.field_nb, param0, this.field_Ib.field_nb);
                    this.field_Fb.field_wb = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                this.field_Gb.a(this.field_Ib.field_nb, (byte) 108, -this.field_Fb.field_S, this.field_Fb.field_nb);
                return;
              } else {
                L9: {
                  this.field_Fb.field_wb = -this.field_Fb.field_S;
                  if (this.field_Gb.k(92)) {
                    this.field_Fb.field_S = -this.field_Gb.a(3, this.field_Fb.field_nb, param0, this.field_Ib.field_nb);
                    this.field_Fb.field_wb = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                this.field_Gb.a(this.field_Ib.field_nb, (byte) 108, -this.field_Fb.field_S, this.field_Fb.field_nb);
                return;
              }
            } else {
              this.field_Fb.field_wb = -(this.field_Fb.field_nb + this.field_Fb.field_Z + -this.field_Ib.field_nb) + -this.field_Fb.field_S;
              if ((-(this.field_Fb.field_wb + this.field_Fb.field_S) ^ -1) <= -1) {
                L10: {
                  if (this.field_Gb.k(92)) {
                    this.field_Fb.field_S = -this.field_Gb.a(3, this.field_Fb.field_nb, param0, this.field_Ib.field_nb);
                    this.field_Fb.field_wb = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                this.field_Gb.a(this.field_Ib.field_nb, (byte) 108, -this.field_Fb.field_S, this.field_Fb.field_nb);
                return;
              } else {
                L11: {
                  this.field_Fb.field_wb = -this.field_Fb.field_S;
                  if (this.field_Gb.k(92)) {
                    this.field_Fb.field_S = -this.field_Gb.a(3, this.field_Fb.field_nb, param0, this.field_Ib.field_nb);
                    this.field_Fb.field_wb = 0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                this.field_Gb.a(this.field_Ib.field_nb, (byte) 108, -this.field_Fb.field_S, this.field_Fb.field_nb);
                return;
              }
            }
          }
        } else {
          L12: {
            this.field_Fb.field_wb = this.field_Fb.field_wb - param2;
            if (this.field_Gb.f((byte) 83)) {
              this.field_Fb.field_wb = this.field_Fb.field_wb + param1;
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            if (this.field_Gb.j(-1)) {
              this.field_Fb.field_wb = this.field_Fb.field_wb - param1;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            if (this.field_W) {
              this.field_Fb.field_wb = this.field_Fb.field_wb - param3;
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            if (param0) {
              L16: {
                if (0 <= -(this.field_Fb.field_S - -this.field_Fb.field_wb)) {
                  break L16;
                } else {
                  this.field_Fb.field_wb = -this.field_Fb.field_S;
                  break L16;
                }
              }
              if (this.field_Fb.field_Z + this.field_Fb.field_nb + -this.field_Ib.field_nb < -(this.field_Fb.field_wb + this.field_Fb.field_S)) {
                this.field_Fb.field_wb = -(this.field_Fb.field_nb + this.field_Fb.field_Z + -this.field_Ib.field_nb) + -this.field_Fb.field_S;
                break L15;
              } else {
                break L15;
              }
            } else {
              L17: {
                if (this.field_Fb.field_Z + this.field_Fb.field_nb + -this.field_Ib.field_nb >= -(this.field_Fb.field_wb + this.field_Fb.field_S)) {
                  break L17;
                } else {
                  this.field_Fb.field_wb = -(this.field_Fb.field_nb + this.field_Fb.field_Z + -this.field_Ib.field_nb) + -this.field_Fb.field_S;
                  break L17;
                }
              }
              if ((-(this.field_Fb.field_wb + this.field_Fb.field_S) ^ -1) > -1) {
                this.field_Fb.field_wb = -this.field_Fb.field_S;
                break L15;
              } else {
                break L15;
              }
            }
          }
          L18: {
            if (this.field_Gb.k(92)) {
              this.field_Fb.field_S = -this.field_Gb.a(3, this.field_Fb.field_nb, param0, this.field_Ib.field_nb);
              this.field_Fb.field_wb = 0;
              break L18;
            } else {
              break L18;
            }
          }
          this.field_Gb.a(this.field_Ib.field_nb, (byte) 108, -this.field_Fb.field_S, this.field_Fb.field_nb);
          return;
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        if (param0) {
          field_Jb = (String) null;
          this.field_Ib.field_nb = this.field_nb;
          this.field_Ib.field_K = -param2 + (this.field_K - param1);
          this.field_Fb.field_D = 0;
          this.field_Fb.field_K = -param2 + (this.field_K - param1);
          this.field_Gb.a(-param2 + this.field_K, this.field_Fb.field_nb, this.field_nb, this.field_Ib.field_nb, -this.field_Fb.field_S, param2, 0, -1);
          return;
        } else {
          this.field_Ib.field_nb = this.field_nb;
          this.field_Ib.field_K = -param2 + (this.field_K - param1);
          this.field_Fb.field_D = 0;
          this.field_Fb.field_K = -param2 + (this.field_K - param1);
          this.field_Gb.a(-param2 + this.field_K, this.field_Fb.field_nb, this.field_nb, this.field_Ib.field_nb, -this.field_Fb.field_S, param2, 0, -1);
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        this.field_K = param3;
        this.field_nb = param5;
        this.field_S = param4;
        this.field_D = param0;
        if (param2 < 43) {
          return;
        } else {
          this.a(false, param1, param6);
          return;
        }
    }

    private final boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5, boolean param6) {
        uj discarded$4 = null;
        uj discarded$5 = null;
        uj discarded$6 = null;
        uj discarded$7 = null;
        int var8 = 0;
        if (param3) {
          var8 = 1;
          if (param5 != 7736) {
            discarded$4 = gp.a(-48, -99L);
            this.field_Fb.a(param1, (byte) -128, var8 != 0, this.field_Ib.field_nb);
            this.a(false, param4, param2, param0, (byte) 127);
            return var8 != 0;
          } else {
            this.field_Fb.a(param1, (byte) -128, var8 != 0, this.field_Ib.field_nb);
            this.a(false, param4, param2, param0, (byte) 127);
            return var8 != 0;
          }
        } else {
          if (this.field_W) {
            if (!param6) {
              var8 = 1;
              if (param5 != 7736) {
                discarded$5 = gp.a(-48, -99L);
                this.field_Fb.a(param1, (byte) -128, var8 != 0, this.field_Ib.field_nb);
                this.a(false, param4, param2, param0, (byte) 127);
                return var8 != 0;
              } else {
                this.field_Fb.a(param1, (byte) -128, var8 != 0, this.field_Ib.field_nb);
                this.a(false, param4, param2, param0, (byte) 127);
                return var8 != 0;
              }
            } else {
              var8 = 0;
              if (param5 != 7736) {
                discarded$6 = gp.a(-48, -99L);
                this.field_Fb.a(param1, (byte) -128, var8 != 0, this.field_Ib.field_nb);
                this.a(false, param4, param2, param0, (byte) 127);
                return var8 != 0;
              } else {
                this.field_Fb.a(param1, (byte) -128, var8 != 0, this.field_Ib.field_nb);
                this.a(false, param4, param2, param0, (byte) 127);
                return var8 != 0;
              }
            }
          } else {
            var8 = 0;
            if (param5 != 7736) {
              discarded$7 = gp.a(-48, -99L);
              this.field_Fb.a(param1, (byte) -128, var8 != 0, this.field_Ib.field_nb);
              this.a(false, param4, param2, param0, (byte) 127);
              return var8 != 0;
            } else {
              this.field_Fb.a(param1, (byte) -128, var8 != 0, this.field_Ib.field_nb);
              this.a(false, param4, param2, param0, (byte) 127);
              return var8 != 0;
            }
          }
        }
    }

    final static uj a(int param0, long param1) {
        String var4 = null;
        if (param0 != 2) {
          var4 = (String) null;
          gp.a(true, (String) null, -69);
          return (uj) ((Object) il.field_d.a(param0 + -11436, param1));
        } else {
          return (uj) ((Object) il.field_d.a(param0 + -11436, param1));
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.a(param2, this.field_Ib.field_nb, param1, param3, (byte) -43);
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
        boolean discarded$2 = false;
        if (param4 != 0) {
          discarded$2 = this.a(false, true, -57, 93, -15, 99);
          return this.a(param3, param2, param5, param1, this.field_Ib.field_nb, 7736, param0);
        } else {
          return this.a(param3, param2, param5, param1, this.field_Ib.field_nb, 7736, param0);
        }
    }

    static {
        field_Eb = "Disruptive behaviour";
        field_Hb = new String[]{"Many grids have a dark edge of cells called the <col=FF9900>buffer</col>. Use these to drop tiles half-on, half-off the central grid. They are not included as part of the picture."};
        field_Jb = "Location";
    }
}
