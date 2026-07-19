/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    boolean field_e;
    static String field_b;
    private int field_g;
    int field_h;
    boolean field_j;
    private int field_a;
    static ce field_d;
    private int field_c;
    private int field_i;
    int field_k;
    static int field_l;
    private int field_f;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != 49) {
            wc.a(false, -49, true);
        }
    }

    final boolean b(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (!param0) {
          if (this.field_g != 2) {
            if (this.field_c == 96) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          this.field_g = -57;
          if (this.field_g == 2) {
            return true;
          } else {
            L0: {
              if (this.field_c != 96) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -98) {
          L0: {
            this.field_a = -21;
            if (-98 != (this.field_c ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-98 != (this.field_c ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int c(int param0) {
        dc discarded$0 = null;
        if (param0 != -31119) {
            discarded$0 = wc.a(97, -30, 91, (byte) 54);
            return bl.field_h;
        }
        return bl.field_h;
    }

    final boolean b(byte param0) {
        int discarded$14 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -18) {
          if (0 == this.field_i) {
            if (this.field_c != 84) {
              if (83 == this.field_c) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          discarded$14 = this.a((byte) -45, -80, 2, 65, -24, 89, 16);
          if (0 == this.field_i) {
            if (this.field_c == 84) {
              return true;
            } else {
              L0: {
                if (83 != this.field_c) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final boolean e(int param0) {
        if (param0 != 0) {
            return true;
        }
        return -104 == (this.field_c ^ -1) ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param0 != 0) {
          return;
        } else {
          var6 = this.a((byte) 113, param2, dh.field_d, param3, param4, bj.field_y, param1);
          var7 = this.a((byte) 124, param2, sf.field_c, param3, param4, ng.field_ob, param1);
          this.a(var7, (byte) 118, var6);
          return;
        }
    }

    final void a(boolean param0, int param1) {
        if (this.field_a != 0) {
          if (param0) {
            this.field_c = -57;
            return;
          } else {
            return;
          }
        } else {
          this.field_e = true;
          this.field_j = false;
          this.field_h = param1;
          if (!param0) {
            return;
          } else {
            this.field_c = -57;
            return;
          }
        }
    }

    final void c(byte param0) {
        this.field_e = false;
        this.field_c = 0;
        if (param0 == 6) {
          this.field_g = 0;
          this.field_i = 0;
          if (this.field_a != 0) {
            if (0 != this.field_a) {
              if (0 == this.field_a) {
                if ((nk.field_n ^ -1) == -100) {
                  this.field_h = this.field_h + 1;
                  this.field_j = false;
                  this.field_e = true;
                  if (this.field_h >= this.field_k) {
                    this.field_h = 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_c = nk.field_n;
              if (0 == this.field_a) {
                if ((nk.field_n ^ -1) == -100) {
                  this.field_h = this.field_h + 1;
                  this.field_j = false;
                  this.field_e = true;
                  if (this.field_h < this.field_k) {
                    return;
                  } else {
                    this.field_h = 0;
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
            if ((nk.field_n ^ -1) == -99) {
              if (this.field_h > 0) {
                this.field_e = true;
                this.field_j = false;
                this.field_h = this.field_h - 1;
                if (0 != this.field_a) {
                  if (0 == this.field_a) {
                    if ((nk.field_n ^ -1) == -100) {
                      this.field_h = this.field_h + 1;
                      this.field_j = false;
                      this.field_e = true;
                      if (this.field_h >= this.field_k) {
                        this.field_h = 0;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L0: {
                    this.field_c = nk.field_n;
                    if (0 != this.field_a) {
                      break L0;
                    } else {
                      if ((nk.field_n ^ -1) != -100) {
                        break L0;
                      } else {
                        this.field_h = this.field_h + 1;
                        this.field_j = false;
                        this.field_e = true;
                        if (this.field_h < this.field_k) {
                          break L0;
                        } else {
                          this.field_h = 0;
                          break L0;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                this.field_h = this.field_k;
                this.field_e = true;
                this.field_j = false;
                this.field_h = this.field_h - 1;
                if (0 != this.field_a) {
                  if (0 == this.field_a) {
                    if ((nk.field_n ^ -1) == -100) {
                      this.field_h = this.field_h + 1;
                      this.field_j = false;
                      this.field_e = true;
                      if (this.field_h < this.field_k) {
                        return;
                      } else {
                        this.field_h = 0;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  this.field_c = nk.field_n;
                  if (0 == this.field_a) {
                    if ((nk.field_n ^ -1) == -100) {
                      this.field_h = this.field_h + 1;
                      this.field_j = false;
                      this.field_e = true;
                      if (this.field_h >= this.field_k) {
                        this.field_h = 0;
                        return;
                      } else {
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
            } else {
              if (0 == this.field_a) {
                this.field_c = nk.field_n;
                if (0 == this.field_a) {
                  if ((nk.field_n ^ -1) == -100) {
                    this.field_h = this.field_h + 1;
                    this.field_j = false;
                    this.field_e = true;
                    if (this.field_h >= this.field_k) {
                      this.field_h = 0;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L1: {
                  if (0 != this.field_a) {
                    break L1;
                  } else {
                    if ((nk.field_n ^ -1) != -100) {
                      break L1;
                    } else {
                      this.field_h = this.field_h + 1;
                      this.field_j = false;
                      this.field_e = true;
                      if (this.field_h < this.field_k) {
                        break L1;
                      } else {
                        this.field_h = 0;
                        break L1;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((wc) (this)).field_j = stackIn_3_1 != 0;
        this.field_a = 0;
        if (param0 > 89) {
          if (!this.field_j) {
            this.field_h = param3;
            return;
          } else {
            this.field_h = param2;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, mf param1, mf param2, mf param3) {
        te discarded$1 = null;
        RuntimeException var4 = null;
        te[] var5 = null;
        te[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        te[] var10 = null;
        int var11_int = 0;
        ed var11 = null;
        ed var12 = null;
        int var13 = 0;
        te[] var14 = null;
        ed var15 = null;
        int[][] var16 = null;
        ed var17 = null;
        ed var18 = null;
        int[][] var19 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            nn.field_a = kh.a(param2, (byte) 126, "commonui", "frame_top");
            bn.field_d = kh.a(param2, (byte) -114, "commonui", "frame_bottom");
            cc.field_j = fe.a("commonui", param2, "jagex_logo_grey", true);
            fk.field_f = kh.a(param2, (byte) -81, "commonui", "button");
            ul.field_E = ui.a("validation", param2, "commonui", (byte) 77);
            ke.field_c = (wl) ((Object) ac.a("arezzo12", -110, param2, "commonui", param3));
            sb.field_a = (wl) ((Object) ac.a("arezzo14", -124, param2, "commonui", param3));
            dl.field_b = (wl) ((Object) ac.a("arezzo14bold", -93, param2, "commonui", param3));
            var17 = new ed(param1.a(-4, "", "button.gif"), (java.awt.Component) ((Object) of.field_d));
            discarded$1 = bf.a(param2, 50, "dropdown", "commonui");
            var5 = ae.a("commonui", "screen_options", (byte) -65, param2);
            ec.field_f = new te[4];
            hk.field_w = new te[4];
            ej.field_f = new te[4];
            var6 = new te[][]{ec.field_f, ej.field_f, hk.field_w};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_l;
            var8 = 1;
            L1: while (true) {
              if (var19.length <= var8) {
                var8 = var5[0].field_k[0];
                var19[2][var8] = 16777215;
                var19[1][var8] = 2394342;
                var19[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (3 <= var9) {
                    var9 = var17.field_x;
                    hf.a(-123);
                    var17.g();
                    em.c(0, 0, em.field_l, em.field_d);
                    var15 = new ed(var9, var9);
                    var18 = var15;
                    var18.g();
                    var17.d(0, 0);
                    if (param0 == 83) {
                      var11 = new ed(var9, var9);
                      var11.g();
                      var17.d(-var17.field_s + var9, 0);
                      var12 = new ed(-(var9 * 2) + var17.field_s, var9);
                      var12.g();
                      var17.d(-var9, 0);
                      dl.a((byte) -109);
                      fk.field_f = new ed[]{var15, var12, var11};
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L3: while (true) {
                      if (var14.length <= var11_int) {
                        var9++;
                        continue L2;
                      } else {
                        var14[var11_int] = rf.a(-50, var5[var9], var19[var11_int]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) ((Object) var19[0].clone());
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("wc.L(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean g(int param0) {
        int var2 = -51 / ((param0 - 67) / 37);
        return (this.field_c ^ -1) == -97 ? true : false;
    }

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -10809) {
          L0: {
            this.field_h = 24;
            if (this.field_c != 102) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_c != 102) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static dc a(int param0, int param1, int param2, byte param3) {
        dc var4 = null;
        var4 = new dc();
        var4.field_h = new int[param2];
        var4.field_j = param0;
        if (param3 != -51) {
          field_d = (ce) null;
          en.field_i.a(-12328, var4);
          oa.a(param1, var4, -755);
          return var4;
        } else {
          en.field_i.a(-12328, var4);
          oa.a(param1, var4, -755);
          return var4;
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (this.field_k <= param2) {
          throw new IllegalArgumentException();
        } else {
          if (param0 >= this.field_k) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              this.field_g = 0;
              this.field_i = 0;
              this.field_e = false;
              this.field_c = 0;
              if (0 != qi.field_N) {
                this.field_a = qi.field_N;
                this.field_g = qi.field_N;
                this.field_i = qi.field_N;
                this.field_j = true;
                this.field_h = param0;
                this.field_f = af.field_h;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_a != 0) {
              if (-1 != (eb.field_K ^ -1)) {
                L1: {
                  if (0 >= this.field_f) {
                    this.field_f = l.field_H;
                    this.field_g = this.field_a;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  this.field_f = this.field_f - 1;
                  if (qi.field_N != 0) {
                    break L2;
                  } else {
                    if (eb.field_K == 0) {
                      this.field_a = 0;
                      break L2;
                    } else {
                      if (param1 >= 116) {
                        if (this.field_a == 0) {
                          L3: {
                            if (this.field_j) {
                              break L3;
                            } else {
                              if (ah.field_h) {
                                break L3;
                              } else {
                                return;
                              }
                            }
                          }
                          if (param2 >= 0) {
                            if (param2 == this.field_h) {
                              this.field_h = param2;
                              this.field_j = true;
                              return;
                            } else {
                              this.field_e = true;
                              this.field_h = param2;
                              this.field_j = true;
                              return;
                            }
                          } else {
                            if (this.field_j) {
                              this.field_h = -1;
                              return;
                            } else {
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
                  }
                }
                if (param1 >= 116) {
                  if (this.field_a == 0) {
                    L4: {
                      if (this.field_j) {
                        break L4;
                      } else {
                        if (ah.field_h) {
                          break L4;
                        } else {
                          return;
                        }
                      }
                    }
                    if (param2 >= 0) {
                      if (param2 == this.field_h) {
                        this.field_h = param2;
                        this.field_j = true;
                        return;
                      } else {
                        this.field_e = true;
                        this.field_h = param2;
                        this.field_j = true;
                        return;
                      }
                    } else {
                      if (this.field_j) {
                        this.field_h = -1;
                        return;
                      } else {
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
                L5: {
                  if (qi.field_N != 0) {
                    break L5;
                  } else {
                    if (eb.field_K == 0) {
                      this.field_a = 0;
                      break L5;
                    } else {
                      if (param1 >= 116) {
                        if (this.field_a == 0) {
                          L6: {
                            if (this.field_j) {
                              break L6;
                            } else {
                              if (ah.field_h) {
                                break L6;
                              } else {
                                return;
                              }
                            }
                          }
                          if (param2 >= 0) {
                            if (param2 == this.field_h) {
                              this.field_h = param2;
                              this.field_j = true;
                              return;
                            } else {
                              this.field_e = true;
                              this.field_h = param2;
                              this.field_j = true;
                              return;
                            }
                          } else {
                            if (!this.field_j) {
                              return;
                            } else {
                              this.field_h = -1;
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
                  }
                }
                if (param1 >= 116) {
                  if (this.field_a == 0) {
                    L7: {
                      if (this.field_j) {
                        break L7;
                      } else {
                        if (ah.field_h) {
                          break L7;
                        } else {
                          return;
                        }
                      }
                    }
                    if (param2 >= 0) {
                      if (param2 == this.field_h) {
                        this.field_h = param2;
                        this.field_j = true;
                        return;
                      } else {
                        this.field_e = true;
                        this.field_h = param2;
                        this.field_j = true;
                        return;
                      }
                    } else {
                      if (!this.field_j) {
                        return;
                      } else {
                        this.field_h = -1;
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
            } else {
              L8: {
                if (qi.field_N != 0) {
                  break L8;
                } else {
                  if (eb.field_K == 0) {
                    this.field_a = 0;
                    break L8;
                  } else {
                    if (param1 >= 116) {
                      if (this.field_a == 0) {
                        L9: {
                          L10: {
                            if (this.field_j) {
                              break L10;
                            } else {
                              if (ah.field_h) {
                                break L10;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (param2 >= 0) {
                            if (param2 == this.field_h) {
                              this.field_h = param2;
                              this.field_j = true;
                              return;
                            } else {
                              this.field_e = true;
                              this.field_h = param2;
                              this.field_j = true;
                              return;
                            }
                          } else {
                            if (this.field_j) {
                              this.field_h = -1;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param1 >= 116) {
                if (this.field_a == 0) {
                  L11: {
                    if (this.field_j) {
                      break L11;
                    } else {
                      if (ah.field_h) {
                        break L11;
                      } else {
                        return;
                      }
                    }
                  }
                  if (param2 >= 0) {
                    if (param2 == this.field_h) {
                      this.field_h = param2;
                      this.field_j = true;
                      return;
                    } else {
                      this.field_e = true;
                      this.field_h = param2;
                      this.field_j = true;
                      return;
                    }
                  } else {
                    if (!this.field_j) {
                      return;
                    } else {
                      this.field_h = -1;
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
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, n param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param4.f(12, -123);
              param4.h(-119, 17);
              param4.h(-114, param3);
              param4.h(92, param0);
              param4.f(param1, -123);
              if (param2) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("wc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0) {
        boolean discarded$2 = false;
        L0: {
          this.field_e = false;
          this.field_i = 0;
          this.field_c = 0;
          this.field_g = 0;
          if (-1 == (this.field_a ^ -1)) {
            this.field_c = nk.field_n;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 69) {
          discarded$2 = this.f(103);
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        dc discarded$4 = null;
        dc discarded$5 = null;
        if (!param2) {
          em.d();
          if (param1 == 1983) {
            se.a(param2, param1 + 15130);
            return;
          } else {
            discarded$4 = wc.a(97, 35, -50, (byte) 98);
            se.a(param2, param1 + 15130);
            return;
          }
        } else {
          em.a(0, 0, em.field_l, em.field_d, 0, 192);
          if (param1 == 1983) {
            se.a(param2, param1 + 15130);
            return;
          } else {
            discarded$5 = wc.a(97, 35, -50, (byte) 98);
            se.a(param2, param1 + 15130);
            return;
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        this.field_a = 0;
        if (param2 == 4767999) {
          L0: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param1) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L0;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L0;
            }
          }
          ((wc) (this)).field_j = stackIn_11_1 != 0;
          if (this.field_j) {
            this.field_h = param0;
            return;
          } else {
            return;
          }
        } else {
          L1: {
            this.a(114, true, -119);
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((wc) (this)).field_j = stackIn_4_1 != 0;
          if (this.field_j) {
            this.field_h = param0;
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            this.a(65, 8, 125, -70, -123);
            if (this.field_a == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_a == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean f(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == 23518) {
          if ((this.field_g ^ -1) != -2) {
            if (-98 != (this.field_c ^ -1)) {
              if (this.field_c != 84) {
                if ((this.field_c ^ -1) == -84) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final int a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        if (param6 <= param2) {
          if (param4 > param2) {
            if (param5 < param1) {
              if (param0 <= 112) {
                discarded$8 = this.b((byte) -27);
                return -1;
              } else {
                return -1;
              }
            } else {
              if (param1 + this.field_k * param3 <= param5) {
                if (param0 <= 112) {
                  discarded$9 = this.b((byte) -27);
                  return -1;
                } else {
                  return -1;
                }
              } else {
                return (param5 - param1) / param3;
              }
            }
          } else {
            if (param0 <= 112) {
              discarded$10 = this.b((byte) -27);
              return -1;
            } else {
              return -1;
            }
          }
        } else {
          if (param0 <= 112) {
            discarded$11 = this.b((byte) -27);
            return -1;
          } else {
            return -1;
          }
        }
    }

    wc(int param0) {
        this.field_j = false;
        this.field_h = 0;
        this.field_k = param0;
    }

    static {
        field_b = "Hard";
    }
}
