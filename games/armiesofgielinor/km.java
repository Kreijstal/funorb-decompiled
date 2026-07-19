/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class km {
    static ru[] field_c;
    private boolean field_b;
    private int field_k;
    int field_d;
    int field_f;
    private int field_e;
    private int field_g;
    static String field_a;
    static wk[] field_h;
    private vj field_i;
    static String[] field_j;

    final static int a(int param0) {
        if (param0 > -46) {
            field_j = (String[]) null;
            return kw.field_R;
        }
        return kw.field_R;
    }

    final static je c(int param0) {
        if (param0 != 0) {
            return (je) null;
        }
        return mw.field_E.field_Nb;
    }

    private final void a(int param0, int param1, boolean param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 != -44) {
          this.field_i = (vj) null;
          var8 = 0;
          L0: while (true) {
            L1: {
              if (-7 >= (var8 ^ -1)) {
                break L1;
              } else {
                if (var8 * 8 >= this.field_f) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param2) {
                        break L3;
                      } else {
                        var7 = this.field_k + -(2 * (-24 + var8 * 4 + this.field_f)) - -ns.a(false, 1 + var8, li.field_n);
                        var5 = -((var8 * 4 + (-24 + this.field_f)) * 5) + (this.field_g + ns.a(false, var8 - -1, li.field_n));
                        var6 = this.field_d;
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var7 = -((this.field_f + -(var8 * 4)) * 2) + (this.field_k + ns.a(false, var8 - -1, li.field_n));
                    var5 = -(this.field_g + -(5 * (-(4 * var8) + this.field_f))) - -ns.a(false, var8 - -1, li.field_n);
                    var6 = this.field_d;
                    break L2;
                  }
                  fh.a(var7, -(var8 * 40) + 400, (byte) 56, fe.field_o[param0 + 1], -(5 * var8) + 63, var5, var6);
                  var8++;
                  continue L0;
                }
              }
            }
            return;
          }
        } else {
          var8 = 0;
          L4: while (true) {
            L5: {
              if (-7 >= (var8 ^ -1)) {
                break L5;
              } else {
                if (var8 * 8 >= this.field_f) {
                  break L5;
                } else {
                  L6: {
                    L7: {
                      if (param2) {
                        break L7;
                      } else {
                        var7 = this.field_k + -(2 * (-24 + var8 * 4 + this.field_f)) - -ns.a(false, 1 + var8, li.field_n);
                        var5 = -((var8 * 4 + (-24 + this.field_f)) * 5) + (this.field_g + ns.a(false, var8 - -1, li.field_n));
                        var6 = this.field_d;
                        if (var9 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var7 = -((this.field_f + -(var8 * 4)) * 2) + (this.field_k + ns.a(false, var8 - -1, li.field_n));
                    var5 = -(this.field_g + -(5 * (-(4 * var8) + this.field_f))) - -ns.a(false, var8 - -1, li.field_n);
                    var6 = this.field_d;
                    break L6;
                  }
                  fh.a(var7, -(var8 * 40) + 400, (byte) 56, fe.field_o[param0 + 1], -(5 * var8) + 63, var5, var6);
                  var8++;
                  continue L4;
                }
              }
            }
            return;
          }
        }
    }

    final static nt a(int param0, int param1, int param2, int param3) {
        nt var4 = null;
        int var5 = 0;
        nt var6 = null;
        nt var7 = null;
        nt var8 = null;
        nt var9 = null;
        int var10 = 0;
        int var11 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = (nt) ((Object) s.field_a.e((byte) 112));
        L0: while (true) {
          L1: {
            if (var4 == null) {
              break L1;
            } else {
              var11 = param0 ^ -1;
              var10 = var4.field_o ^ -1;
              if (var5 != 0) {
                if (var10 < var11) {
                  field_j = (String[]) null;
                  var6 = new nt();
                  var6.field_o = param0;
                  var6.field_q = param2;
                  s.field_a.a((byte) -119, (tc) (var6));
                  tf.a(param3, var6, (byte) -64);
                  return var6;
                } else {
                  var7 = new nt();
                  var4 = var7;
                  var7.field_o = param0;
                  var7.field_q = param2;
                  s.field_a.a((byte) -119, (tc) (var7));
                  tf.a(param3, var7, (byte) -64);
                  return var7;
                }
              } else {
                if (var10 != var11) {
                  var4 = (nt) ((Object) s.field_a.a((byte) 123));
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  return var4;
                }
              }
            }
          }
          if (param1 < 65) {
            field_j = (String[]) null;
            var8 = new nt();
            var8.field_o = param0;
            var8.field_q = param2;
            s.field_a.a((byte) -119, (tc) (var8));
            tf.a(param3, var8, (byte) -64);
            return var8;
          } else {
            var9 = new nt();
            var9.field_o = param0;
            var9.field_q = param2;
            s.field_a.a((byte) -119, (tc) (var9));
            tf.a(param3, var9, (byte) -64);
            return var9;
          }
        }
    }

    final boolean b(int param0) {
        boolean discarded$2 = false;
        int var2 = 0;
        if (null == this.field_i) {
          var2 = 36 % ((10 - param0) / 61);
          if (0 > (this.field_f ^ -1)) {
            this.field_f = this.field_f - 5;
            if (this.field_f >= 0) {
              return false;
            } else {
              this.field_b = false;
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$2 = this.field_i.a(-94);
          var2 = 36 % ((10 - param0) / 61);
          if (0 > (this.field_f ^ -1)) {
            this.field_f = this.field_f - 5;
            if (this.field_f >= 0) {
              return false;
            } else {
              this.field_b = false;
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void e(int param0) {
        if (param0 != 5) {
            return;
        }
        field_j = null;
        field_c = null;
        field_h = null;
        field_a = null;
    }

    private final void a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        gd var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_7_0 = 0;
        gd stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        int stackIn_20_5 = 0;
        gd stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        gd stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        gd stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        gd stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        gd stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int stackOut_20_6 = 0;
        var4 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 > (this.field_f ^ -1)) {
          return;
        } else {
          L0: {
            L1: {
              if (this.field_i != null) {
                break L1;
              } else {
                var4_ref = (gd) ((Object) cs.field_db[this.field_e].a(false, false, false));
                if (var12 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4_ref = (gd) ((Object) this.field_i.a(false, true, false, cs.field_db[this.field_e]));
            break L0;
          }
          L2: {
            if (!param0) {
              stackOut_6_0 = 140;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            } else {
              stackOut_5_0 = 1908;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
          }
          L3: {
            var5 = stackIn_7_0;
            var6 = 1536;
            var7 = 0;
            var8 = 150;
            if (this.field_e == 2) {
              var4_ref.b(256, 256, 256);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            L5: {
              if (!param0) {
                break L5;
              } else {
                L6: {
                  L7: {
                    var10 = this.field_d;
                    if (2 != this.field_e) {
                      break L7;
                    } else {
                      var11 = this.field_k - -60;
                      if (var12 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var11 = -(2 * this.field_f) + this.field_k;
                  break L6;
                }
                var9 = -(-(5 * this.field_f) + this.field_g);
                if (var12 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            var11 = -(this.field_f * 2) + this.field_k;
            var9 = -(5 * this.field_f) + this.field_g;
            var10 = this.field_d;
            break L4;
          }
          L8: {
            if (param1) {
              np.a(false, var4_ref);
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            stackOut_19_0 = (gd) (var4_ref);
            stackOut_19_1 = var5;
            stackOut_19_2 = var6;
            stackOut_19_3 = var7;
            stackOut_19_4 = var8;
            stackOut_19_5 = var9;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_21_2 = stackOut_19_2;
            stackIn_21_3 = stackOut_19_3;
            stackIn_21_4 = stackOut_19_4;
            stackIn_21_5 = stackOut_19_5;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            stackIn_20_2 = stackOut_19_2;
            stackIn_20_3 = stackOut_19_3;
            stackIn_20_4 = stackOut_19_4;
            stackIn_20_5 = stackOut_19_5;
            if (param1) {
              stackOut_21_0 = (gd) ((Object) stackIn_21_0);
              stackOut_21_1 = stackIn_21_1;
              stackOut_21_2 = stackIn_21_2;
              stackOut_21_3 = stackIn_21_3;
              stackOut_21_4 = stackIn_21_4;
              stackOut_21_5 = stackIn_21_5;
              stackOut_21_6 = 600;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              stackIn_22_3 = stackOut_21_3;
              stackIn_22_4 = stackOut_21_4;
              stackIn_22_5 = stackOut_21_5;
              stackIn_22_6 = stackOut_21_6;
              break L9;
            } else {
              stackOut_20_0 = (gd) ((Object) stackIn_20_0);
              stackOut_20_1 = stackIn_20_1;
              stackOut_20_2 = stackIn_20_2;
              stackOut_20_3 = stackIn_20_3;
              stackOut_20_4 = stackIn_20_4;
              stackOut_20_5 = stackIn_20_5;
              stackOut_20_6 = var11;
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              stackIn_22_3 = stackOut_20_3;
              stackIn_22_4 = stackOut_20_4;
              stackIn_22_5 = stackOut_20_5;
              stackIn_22_6 = stackOut_20_6;
              break L9;
            }
          }
          ((gd) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_22_4, stackIn_22_5, stackIn_22_6, var10);
          return;
        }
    }

    final void a(boolean param0, int param1, boolean param2, int param3) {
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -8) {
          if (this.field_b) {
            L0: {
              if ((this.field_e ^ -1) != -8) {
                break L0;
              } else {
                if (!param2) {
                  this.a(6, param3, param0);
                  if (var6 != 0) {
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            if (this.field_e >= 8) {
              if (!param2) {
                this.a(this.field_e - 8, param3, param0, (byte) -44);
                if (var6 != 0) {
                  this.a(param0, param2, param1 ^ 299);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              this.a(param0, param2, param1 ^ 299);
              return;
            }
          } else {
            return;
          }
        } else {
          field_j = (String[]) null;
          if (this.field_b) {
            L1: {
              if ((this.field_e ^ -1) != -8) {
                break L1;
              } else {
                if (!param2) {
                  this.a(6, param3, param0);
                  if (var6 != 0) {
                    break L1;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            if (this.field_e >= 8) {
              if (!param2) {
                this.a(this.field_e - 8, param3, param0, (byte) -44);
                if (var6 != 0) {
                  this.a(param0, param2, param1 ^ 299);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              this.a(param0, param2, param1 ^ 299);
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int discarded$2 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 6) {
            break L0;
          } else {
            discarded$2 = km.a(52);
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          L2: {
            if (var7 >= 6) {
              break L2;
            } else {
              if (20 * var7 >= this.field_f) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (!param2) {
                      break L4;
                    } else {
                      var4 = -(this.field_g + -(5 * (this.field_f + -(var7 * 10))));
                      var6 = -(2 * (this.field_f + -(10 * var7))) + this.field_k;
                      var5 = this.field_d;
                      if (var8 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var6 = -(2 * (this.field_f - (-(var7 * 10) + 60))) + this.field_k;
                  var5 = this.field_d;
                  var4 = this.field_g + -(5 * (-((-var7 + 6) * 10) + this.field_f));
                  break L3;
                }
                cb.a(var5, hs.field_F[(-var7 + this.field_f / 20) % hs.field_F.length], (-var7 + 6) * 256 / 6, -110, var4, var6);
                var7++;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void d(int param0) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        if (param0 < 8) {
          L0: {
            this.field_b = false;
            if (this.field_i != null) {
              discarded$4 = this.field_i.a(-96);
              break L0;
            } else {
              break L0;
            }
          }
          this.field_f = this.field_f + 5;
          return;
        } else {
          L1: {
            if (this.field_i != null) {
              discarded$5 = this.field_i.a(-96);
              break L1;
            } else {
              break L1;
            }
          }
          this.field_f = this.field_f + 5;
          return;
        }
    }

    km(int param0, int param1, int param2, int param3, int param4) {
        this.field_b = true;
        this.field_g = param0;
        this.field_f = param3;
        this.field_e = param4;
        this.field_k = param1;
        this.field_d = param2;
        if (-1 == (this.field_e ^ -1)) {
            this.field_i = new vj(1);
            this.field_i.a(-1, pv.field_a[0][0]);
        }
        if (this.field_e == 5) {
            this.field_i = new vj(1);
            this.field_i.a(-1, pv.field_a[5][0]);
        }
    }

    static {
        field_a = "Please remove <%0> from your ignore list first.";
        field_j = new String[]{"runewars_select_unit", "runewars_select_position", "runewars_errorsound", "runewars_capture_location"};
    }
}
