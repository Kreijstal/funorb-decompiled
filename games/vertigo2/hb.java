/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends bg {
    int field_z;
    private lg field_i;
    private lg field_h;
    int field_w;
    private wg field_n;
    private wg field_u;
    static String field_o;
    private boolean field_f;
    private int field_E;
    static lg field_A;
    private boolean field_y;
    static wk field_q;
    int field_x;
    private int field_s;
    static cr field_j;
    private int field_v;
    private int field_l;
    private int field_m;
    private boolean field_r;
    private int field_g;
    static cr field_k;
    private lg field_B;
    private lg field_t;
    static cr field_D;
    static int field_p;

    final void a(int param0, int param1) {
        this.field_m = param0;
        if (param1 != -25196) {
            this.field_i = (lg) null;
        }
    }

    final void a(boolean param0, int[] param1, boolean param2, boolean param3) {
        if (!(this.field_t != null)) {
            return;
        }
        try {
            nf.field_q[2] = this.field_z;
            if (param0) {
                this.field_h = (lg) null;
            }
            nf.field_q[3] = 65535;
            nf.field_q[4] = 0;
            nf.field_q[9] = 0;
            nf.field_q[0] = this.field_w;
            nf.field_q[11] = 65535;
            nf.field_q[5] = 0;
            nf.field_q[10] = 0;
            nf.field_q[7] = 65535;
            nf.field_q[6] = 0;
            nf.field_q[1] = this.field_x;
            nf.field_q[8] = 0;
            new fc(this.field_t, 110, 1560, 10, -10, -5).a(param1, nf.field_q);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "hb.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void e(int param0) {
        if (param0 != -1) {
            return;
        }
        fh.field_t = null;
        ug.field_c = null;
    }

    final void a(boolean param0, wo param1) {
        this.field_x = param1.field_k;
        this.field_w = param1.field_E;
        if (param0) {
            return;
        }
        try {
            this.field_z = param1.field_y;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "hb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int b(byte param0) {
        int var1 = 125 % ((param0 - -11) / 49);
        return cf.field_a;
    }

    final int b(int param0) {
        if (param0 <= 97) {
            int[] var3 = (int[]) null;
            this.a(true, (int[]) null, false, false);
        }
        return this.field_m;
    }

    final lg c(byte param0) {
        lg var2 = null;
        lg var3 = null;
        L0: {
          if (param0 == 4) {
            break L0;
          } else {
            field_A = (lg) null;
            break L0;
          }
        }
        if ((this.field_l ^ -1) != -3) {
          if (this.field_l != 20) {
            if (be.field_q) {
              if (null == this.field_t) {
                return null;
              } else {
                var3 = new lg(this.field_t, false, false, false, false);
                var2 = var3;
                var3.field_c = rr.field_D;
                var3.field_o = lf.field_A[6];
                var2.field_D = qj.field_b;
                var2.b();
                return var2;
              }
            } else {
              var2 = new lg(fb.field_v, false, false, false, false);
              return var2;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int c(boolean param0) {
        if (param0) {
            this.field_z = 118;
        }
        return this.field_l;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 88) {
                break L1;
              } else {
                hb.c(105);
                break L1;
              }
            }
            var6_int = pk.a((byte) -14, cj.field_D, param4, ua.field_e);
            var7 = pk.a((byte) -14, cj.field_D, param1, ua.field_e);
            var8 = pk.a((byte) -14, ib.field_a, param5, ap.field_e);
            var9 = pk.a((byte) -14, ib.field_a, param0, ap.field_e);
            var10 = var6_int;
            L2: while (true) {
              if (var7 < var10) {
                break L0;
              } else {
                ki.a(-112, var8, vl.field_e[var10], var9, param3);
                var10++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var6), "hb.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void c(int param0) {
        field_o = null;
        if (param0 != 2) {
            return;
        }
        field_k = null;
        field_j = null;
        field_A = null;
        field_q = null;
        field_D = null;
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        L0: {
          if (param1 == -36) {
            break L0;
          } else {
            this.b(true);
            break L0;
          }
        }
        L1: {
          if (this.field_l >= 0) {
            if (na.field_o[this.field_l] <= this.field_g) {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 0;
              stackIn_8_0 = stackOut_5_0;
              break L1;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_8_0 = stackOut_3_0;
            break L1;
          }
        }
        var3 = stackIn_8_0;
        if (var3 != 0) {
          if (25 == this.field_l) {
            if ((param0 ^ -1) != -8) {
              return;
            } else {
              this.field_g = 0;
              this.field_n.a(ap.field_b[param0], (byte) 71);
              this.field_r = true;
              this.field_l = param0;
              return;
            }
          } else {
            this.field_g = 0;
            this.field_n.a(ap.field_b[param0], (byte) 71);
            this.field_r = true;
            this.field_l = param0;
            return;
          }
        } else {
          if (this.field_l == param0) {
            return;
          } else {
            if (23 != param0) {
              L2: {
                if (this.field_l == 26) {
                  break L2;
                } else {
                  if (13 == this.field_l) {
                    break L2;
                  } else {
                    if (this.field_l == 5) {
                      break L2;
                    } else {
                      if (2 == this.field_l) {
                        break L2;
                      } else {
                        if (20 == this.field_l) {
                          break L2;
                        } else {
                          L3: {
                            if ((param0 ^ -1) != -3) {
                              if (-21 != (param0 ^ -1)) {
                                stackOut_25_0 = 1;
                                stackIn_27_0 = stackOut_25_0;
                                break L3;
                              } else {
                                stackOut_24_0 = 0;
                                stackIn_27_0 = stackOut_24_0;
                                break L3;
                              }
                            } else {
                              stackOut_22_0 = 0;
                              stackIn_27_0 = stackOut_22_0;
                              break L3;
                            }
                          }
                          L4: {
                            var4 = stackIn_27_0;
                            if ((this.field_l ^ -1) != -11) {
                              break L4;
                            } else {
                              if (var4 == 0) {
                                break L4;
                              } else {
                                if (-6 == (this.field_l ^ -1)) {
                                  break L4;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                          L5: {
                            if ((this.field_l ^ -1) != -26) {
                              break L5;
                            } else {
                              if (7 != param0) {
                                return;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (19 != this.field_l) {
                              break L6;
                            } else {
                              if (-26 != (param0 ^ -1)) {
                                return;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (this.field_l != 22) {
                              break L7;
                            } else {
                              if (param0 == 24) {
                                break L7;
                              } else {
                                if (param0 != 25) {
                                  return;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          L8: {
                            if (this.field_l != 24) {
                              break L8;
                            } else {
                              if (param0 == 25) {
                                break L8;
                              } else {
                                return;
                              }
                            }
                          }
                          L9: {
                            if (-10 != (this.field_l ^ -1)) {
                              break L9;
                            } else {
                              if (var4 == 0) {
                                break L9;
                              } else {
                                if (7 == param0) {
                                  break L9;
                                } else {
                                  if (param0 == 17) {
                                    break L9;
                                  } else {
                                    if ((param0 ^ -1) == -6) {
                                      break L9;
                                    } else {
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L10: {
                            if (-22 != (this.field_l ^ -1)) {
                              break L10;
                            } else {
                              if ((param0 ^ -1) == -16) {
                                break L10;
                              } else {
                                if (param0 == 8) {
                                  break L10;
                                } else {
                                  if (var4 == 0) {
                                    break L10;
                                  } else {
                                    if (-6 == (param0 ^ -1)) {
                                      break L10;
                                    } else {
                                      if ((param0 ^ -1) != -18) {
                                        return;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L11: {
                            if (-8 != (this.field_l ^ -1)) {
                              break L11;
                            } else {
                              if (var4 == 0) {
                                break L11;
                              } else {
                                if (param0 == 5) {
                                  break L11;
                                } else {
                                  if (10 == param0) {
                                    break L11;
                                  } else {
                                    if ((param0 ^ -1) == -27) {
                                      break L11;
                                    } else {
                                      if (param0 == 15) {
                                        break L11;
                                      } else {
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L12: {
                            if (-17 != (this.field_l ^ -1)) {
                              break L12;
                            } else {
                              if (var4 == 0) {
                                break L12;
                              } else {
                                if (param0 == 5) {
                                  break L12;
                                } else {
                                  if (param0 == 7) {
                                    break L12;
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                          }
                          L13: {
                            if (this.field_l != 11) {
                              break L13;
                            } else {
                              if (var4 == 0) {
                                break L13;
                              } else {
                                if (param0 == 5) {
                                  break L13;
                                } else {
                                  if ((param0 ^ -1) == -18) {
                                    break L13;
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                          }
                          L14: {
                            if ((this.field_l ^ -1) != -9) {
                              break L14;
                            } else {
                              if (7 == param0) {
                                break L14;
                              } else {
                                if (var4 == 0) {
                                  break L14;
                                } else {
                                  if ((param0 ^ -1) == -6) {
                                    break L14;
                                  } else {
                                    if ((param0 ^ -1) == -10) {
                                      break L14;
                                    } else {
                                      if ((param0 ^ -1) == -18) {
                                        break L14;
                                      } else {
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L15: {
                            if (this.field_l != 15) {
                              break L15;
                            } else {
                              if (param0 == 7) {
                                break L15;
                              } else {
                                if (var4 == 0) {
                                  break L15;
                                } else {
                                  if (-6 == (param0 ^ -1)) {
                                    break L15;
                                  } else {
                                    if (16 == param0) {
                                      break L15;
                                    } else {
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L16: {
                            if ((this.field_l ^ -1) != -18) {
                              break L16;
                            } else {
                              if ((param0 ^ -1) == -8) {
                                break L16;
                              } else {
                                if (var4 == 0) {
                                  break L16;
                                } else {
                                  if (5 == param0) {
                                    break L16;
                                  } else {
                                    if ((param0 ^ -1) == -19) {
                                      break L16;
                                    } else {
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L17: {
                            if ((this.field_l ^ -1) != -19) {
                              break L17;
                            } else {
                              if (7 == param0) {
                                break L17;
                              } else {
                                if (var4 == 0) {
                                  break L17;
                                } else {
                                  if ((param0 ^ -1) != -6) {
                                    return;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                          if (-2 == (this.field_l ^ -1)) {
                            if (0 != param0) {
                              if ((param0 ^ -1) == -5) {
                                return;
                              } else {
                                this.field_g = 0;
                                this.field_n.a(ap.field_b[param0], (byte) 71);
                                this.field_r = true;
                                this.field_l = param0;
                                return;
                              }
                            } else {
                              return;
                            }
                          } else {
                            this.field_g = 0;
                            this.field_n.a(ap.field_b[param0], (byte) 71);
                            this.field_r = true;
                            this.field_l = param0;
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
              return;
            } else {
              this.field_g = 0;
              this.field_n.a(ap.field_b[param0], (byte) 71);
              this.field_r = true;
              this.field_l = param0;
              return;
            }
          }
        }
    }

    final void a(wo param0, byte param1) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        lg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        boolean stackIn_9_1 = false;
        Object stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        Object stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        Object stackIn_12_0 = null;
        boolean stackIn_12_1 = false;
        int stackIn_12_2 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_177_0 = null;
        StringBuilder stackIn_177_1 = null;
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_179_0 = null;
        StringBuilder stackIn_179_1 = null;
        String stackIn_179_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        boolean stackOut_8_1 = false;
        Object stackOut_9_0 = null;
        boolean stackOut_9_1 = false;
        Object stackOut_10_0 = null;
        boolean stackOut_10_1 = false;
        int stackOut_10_2 = 0;
        Object stackOut_11_0 = null;
        boolean stackOut_11_1 = false;
        int stackOut_11_2 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_176_0 = null;
        StringBuilder stackOut_176_1 = null;
        RuntimeException stackOut_178_0 = null;
        StringBuilder stackOut_178_1 = null;
        String stackOut_178_2 = null;
        RuntimeException stackOut_177_0 = null;
        StringBuilder stackOut_177_1 = null;
        String stackOut_177_2 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$2 = this.field_n.c(-660903963);
              this.field_r = this.field_r | this.field_n.field_d;
              var3_int = param0.b(-1);
              if (param1 < -36) {
                break L1;
              } else {
                this.field_g = 92;
                break L1;
              }
            }
            L2: {
              L3: {
                stackOut_3_0 = this;
                stackIn_6_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param0.c(true)) {
                  break L3;
                } else {
                  stackOut_4_0 = this;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (9 != var3_int) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L2;
                  } else {
                    stackOut_5_0 = this;
                    stackIn_6_0 = stackOut_5_0;
                    break L3;
                  }
                }
              }
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L2;
            }
            L4: {
              L5: {
                ((hb) (this)).field_y = stackIn_8_1 != 0;
                discarded$3 = this.field_u.c(-660903963);
                this.field_g = this.field_g + 1;
                stackOut_8_0 = this;
                stackOut_8_1 = this.field_r;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (!this.field_y) {
                  break L5;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = stackIn_9_1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  if (!this.field_u.field_d) {
                    break L5;
                  } else {
                    stackOut_10_0 = this;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    break L4;
                  }
                }
              }
              stackOut_11_0 = this;
              stackOut_11_1 = stackIn_11_1;
              stackOut_11_2 = 0;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            }
            L6: {
              ((hb) (this)).field_r = stackIn_12_1 | stackIn_12_2 != 0;
              if (this.field_l == 2) {
                break L6;
              } else {
                if (-21 != (this.field_l ^ -1)) {
                  L7: {
                    L8: {
                      var4 = param0.j(70);
                      var5 = -this.field_s + var4;
                      if ((var5 ^ -1) <= -65) {
                        break L8;
                      } else {
                        if (var5 <= -64) {
                          break L8;
                        } else {
                          this.field_s = var4;
                          break L7;
                        }
                      }
                    }
                    L9: {
                      L10: {
                        if (0 >= var5) {
                          break L10;
                        } else {
                          if ((var5 ^ -1) > -1025) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (-1024 <= var5) {
                          break L11;
                        } else {
                          if (-2048 < var5) {
                            break L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (this.field_s == var4) {
                        break L7;
                      } else {
                        this.field_s = this.field_s - 64 & 2047;
                        this.field_r = true;
                        break L7;
                      }
                    }
                    this.field_r = true;
                    this.field_s = 64 + this.field_s & 2047;
                    break L7;
                  }
                  if ((this.field_E ^ -1) < -1) {
                    this.field_E = this.field_E - 64;
                    this.field_r = true;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
            }
            L12: {
              if (param0.h(13289) == 0) {
                stackOut_32_0 = 0;
                stackIn_33_0 = stackOut_32_0;
                break L12;
              } else {
                stackOut_31_0 = 1;
                stackIn_33_0 = stackOut_31_0;
                break L12;
              }
            }
            L13: {
              var4 = stackIn_33_0;
              var5 = 0;
              if (this.field_v != var3_int) {
                break L13;
              } else {
                if (-1 != (var3_int ^ -1)) {
                  break L13;
                } else {
                  if (this.field_g != 615) {
                    break L13;
                  } else {
                    gm.a(16, (byte) -55);
                    break L13;
                  }
                }
              }
            }
            L14: {
              if (var3_int == this.field_v) {
                break L14;
              } else {
                L15: {
                  var8_int = var3_int;
                  if (-2 != (var8_int ^ -1)) {
                    if (-5 == (var8_int ^ -1)) {
                      if ((this.field_l ^ -1) == -3) {
                        break L15;
                      } else {
                        if ((this.field_l ^ -1) == -21) {
                          break L15;
                        } else {
                          L16: {
                            var6 = 512;
                            this.field_s = var6 * (this.field_s / var6);
                            mj.a(this.field_w, this.field_z, this.field_E, this.field_s, nf.field_q, (byte) -63, this.field_x);
                            var7 = (param0.field_O + param0.field_c) / 10 & 1;
                            var5 = 1;
                            if (param0.field_G) {
                              break L16;
                            } else {
                              if (this.field_y) {
                                break L16;
                              } else {
                                L17: {
                                  if ((var7 ^ -1) == -2) {
                                    break L17;
                                  } else {
                                    if (-2 != (ol.field_B ^ -1)) {
                                      break L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                L18: {
                                  gm.a(2, (byte) -55);
                                  this.a(20, (byte) -36);
                                  var8_int = param0.m(-1);
                                  if (!param0.c(true)) {
                                    if ((var8_int ^ -1) < -1) {
                                      this.field_i = vl.field_a[7][this.field_m];
                                      break L18;
                                    } else {
                                      if ((var8_int ^ -1) > -1) {
                                        this.field_i = vl.field_a[8][this.field_m];
                                        break L18;
                                      } else {
                                        this.field_i = vl.field_a[6][this.field_m];
                                        break L18;
                                      }
                                    }
                                  } else {
                                    if (var8_int != 0) {
                                      if (-1 <= (var8_int ^ -1)) {
                                        this.field_i = vl.field_a[9][this.field_m];
                                        break L18;
                                      } else {
                                        this.field_i = vl.field_a[10][this.field_m];
                                        break L18;
                                      }
                                    } else {
                                      this.field_i = vl.field_a[12][this.field_m];
                                      break L18;
                                    }
                                  }
                                }
                                ll.field_e[2] = ui.field_e;
                                ll.field_e[0] = this.field_h;
                                ll.field_e[1] = this.field_i;
                                this.field_h = new lg(ll.field_e, 3);
                                break L15;
                              }
                            }
                          }
                          L19: {
                            if (param0.field_G) {
                              gm.a(6, (byte) -55);
                              break L19;
                            } else {
                              gm.a(24, (byte) -55);
                              break L19;
                            }
                          }
                          this.a(2, (byte) -36);
                          this.field_f = param0.field_G;
                          var8 = new lg(this.field_h, false, false, true, false);
                          var9 = nf.field_q[0];
                          var10 = nf.field_q[1];
                          nf.field_q[1] = 0;
                          var11 = nf.field_q[2];
                          nf.field_q[0] = 0;
                          nf.field_q[2] = 0;
                          var8.a(nf.field_q);
                          ll.field_e[0] = var8;
                          nf.field_q[0] = var9;
                          nf.field_q[1] = var10;
                          nf.field_q[2] = var11;
                          ll.field_e[1] = ch.field_d[this.field_m];
                          ll.field_e[2] = sl.field_u;
                          if (!this.field_f) {
                            this.field_h = new lg(ll.field_e, 3);
                            break L15;
                          } else {
                            this.field_h = new lg(ll.field_e, 2);
                            break L15;
                          }
                        }
                      }
                    } else {
                      if ((var8_int ^ -1) != -3) {
                        if (var8_int == 3) {
                          ee.a(1, -109, 3);
                          var5 = 1;
                          this.a(13, (byte) -36);
                          break L15;
                        } else {
                          if (9 != var8_int) {
                            if (var8_int == 10) {
                              this.a(10, (byte) -36);
                              ll.field_e[1] = qo.field_A;
                              ll.field_e[0] = this.field_h;
                              var5 = 1;
                              this.field_h = new lg(ll.field_e, 2);
                              break L15;
                            } else {
                              if (8 == var8_int) {
                                var5 = 1;
                                this.a(23, (byte) -36);
                                this.field_h = vl.field_a[11][this.field_m];
                                break L15;
                              } else {
                                if (-1 == (var8_int ^ -1)) {
                                  L20: {
                                    if ((this.field_v ^ -1) == -2) {
                                      var5 = 1;
                                      if ((param0.field_X ^ -1) != 49) {
                                        this.a(8, (byte) -36);
                                        break L20;
                                      } else {
                                        ee.a(0, -70, 14);
                                        this.a(15, (byte) -36);
                                        break L20;
                                      }
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (-8 != (this.field_v ^ -1)) {
                                      break L21;
                                    } else {
                                      this.d(75);
                                      break L21;
                                    }
                                  }
                                  if (this.field_v != 4) {
                                    break L15;
                                  } else {
                                    this.d(9);
                                    break L15;
                                  }
                                } else {
                                  break L15;
                                }
                              }
                            }
                          } else {
                            this.a(17, (byte) -36);
                            qg.a(1, 500, 10, 1);
                            var5 = 1;
                            break L15;
                          }
                        }
                      } else {
                        ee.a(0, -85, 3);
                        var5 = 1;
                        this.a(5, (byte) -36);
                        break L15;
                      }
                    }
                  } else {
                    L22: {
                      if (-6 == param0.field_X) {
                        L23: {
                          if (this.field_y) {
                            break L23;
                          } else {
                            gm.a(12, (byte) -55);
                            break L23;
                          }
                        }
                        this.a(11, (byte) -36);
                        break L22;
                      } else {
                        gm.a(11, (byte) -55);
                        this.a(21, (byte) -36);
                        break L22;
                      }
                    }
                    var5 = 1;
                    break L15;
                  }
                }
                this.field_v = var3_int;
                break L14;
              }
            }
            L24: {
              if (var3_int == 4) {
                break L24;
              } else {
                if (-8 != (var3_int ^ -1)) {
                  L25: {
                    if (-9 == (var3_int ^ -1)) {
                      break L25;
                    } else {
                      if ((var3_int ^ -1) == -7) {
                        break L25;
                      } else {
                        L26: {
                          if (this.field_l != 17) {
                            break L26;
                          } else {
                            if (this.field_n.a(-72)) {
                              this.a(18, (byte) -36);
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                        }
                        L27: {
                          if (var5 != 0) {
                            break L27;
                          } else {
                            L28: {
                              if (!this.field_y) {
                                mn.b(6, 2);
                                break L28;
                              } else {
                                fr.a(2, 76);
                                break L28;
                              }
                            }
                            L29: {
                              var6 = param0.m(-1);
                              if (-21 == (this.field_l ^ -1)) {
                                break L29;
                              } else {
                                if ((this.field_l ^ -1) == -11) {
                                  break L29;
                                } else {
                                  if (-1 <= (var6 ^ -1)) {
                                    if (0 <= var6) {
                                      if (!this.field_y) {
                                        this.field_h = vl.field_a[0][this.field_m];
                                        break L29;
                                      } else {
                                        this.field_h = vl.field_a[3][this.field_m];
                                        break L29;
                                      }
                                    } else {
                                      if (!this.field_y) {
                                        this.field_h = vl.field_a[2][this.field_m];
                                        break L29;
                                      } else {
                                        this.field_h = vl.field_a[5][this.field_m];
                                        break L29;
                                      }
                                    }
                                  } else {
                                    if (!this.field_y) {
                                      this.field_h = vl.field_a[1][this.field_m];
                                      break L29;
                                    } else {
                                      this.field_h = vl.field_a[4][this.field_m];
                                      break L29;
                                    }
                                  }
                                }
                              }
                            }
                            L30: {
                              if (-6 != (this.field_l ^ -1)) {
                                break L30;
                              } else {
                                if ((var3_int ^ -1) == -3) {
                                  break L30;
                                } else {
                                  this.field_l = -1;
                                  break L27;
                                }
                              }
                            }
                            L31: {
                              L32: {
                                var7 = param0.c((byte) -128);
                                if (6 == this.field_l) {
                                  break L32;
                                } else {
                                  if (9 == this.field_l) {
                                    break L32;
                                  } else {
                                    if (this.field_l == 16) {
                                      break L32;
                                    } else {
                                      if (15 == this.field_l) {
                                        break L32;
                                      } else {
                                        if (25 != this.field_l) {
                                          break L31;
                                        } else {
                                          break L32;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (param0.field_z) {
                                this.a(7, (byte) -36);
                                break L27;
                              } else {
                                break L31;
                              }
                            }
                            L33: {
                              if ((var7 ^ -1) >= 9) {
                                break L33;
                              } else {
                                L34: {
                                  if (this.field_l == 15) {
                                    break L34;
                                  } else {
                                    if (8 != this.field_l) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                if (this.field_n.a(-80)) {
                                  if ((param0.field_X ^ -1) == 49) {
                                    this.a(16, (byte) -36);
                                    break L27;
                                  } else {
                                    this.a(9, (byte) -36);
                                    break L27;
                                  }
                                } else {
                                  break L33;
                                }
                              }
                            }
                            if ((var7 ^ -1) < -1) {
                              if (-50 == param0.field_X) {
                                this.a(3, (byte) -36);
                                break L27;
                              } else {
                                if (!this.field_y) {
                                  this.a(6, (byte) -36);
                                  break L27;
                                } else {
                                  this.a(4, (byte) -36);
                                  break L27;
                                }
                              }
                            } else {
                              if (var4 != 0) {
                                L35: {
                                  L36: {
                                    if (var6 <= 0) {
                                      break L36;
                                    } else {
                                      if ((1 & param0.field_C) != 0) {
                                        break L35;
                                      } else {
                                        break L36;
                                      }
                                    }
                                  }
                                  L37: {
                                    if ((var6 ^ -1) <= -1) {
                                      break L37;
                                    } else {
                                      if (0 == (param0.field_C & 2)) {
                                        break L37;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                  if (this.field_y) {
                                    this.a(4, (byte) -36);
                                    break L27;
                                  } else {
                                    this.a(0, (byte) -36);
                                    break L27;
                                  }
                                }
                                L38: {
                                  L39: {
                                    if (this.field_l < 0) {
                                      break L39;
                                    } else {
                                      if (-1 == (this.field_l ^ -1)) {
                                        break L39;
                                      } else {
                                        if (na.field_o[this.field_l] > this.field_g) {
                                          break L38;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                  gm.a(9, (byte) -55);
                                  break L38;
                                }
                                this.a(1, (byte) -36);
                                break L27;
                              } else {
                                if (49 == (param0.field_X ^ -1)) {
                                  this.a(12, (byte) -36);
                                  break L27;
                                } else {
                                  if (!this.field_y) {
                                    this.a(0, (byte) -36);
                                    break L27;
                                  } else {
                                    this.a(4, (byte) -36);
                                    break L27;
                                  }
                                }
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  this.a(23, (byte) -36);
                  this.field_h = vl.field_a[11][this.field_m];
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L24;
                }
              }
            }
            mn.b(6, 2);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L40: {
            var3 = decompiledCaughtException;
            stackOut_176_0 = (RuntimeException) (var3);
            stackOut_176_1 = new StringBuilder().append("hb.U(");
            stackIn_178_0 = stackOut_176_0;
            stackIn_178_1 = stackOut_176_1;
            stackIn_177_0 = stackOut_176_0;
            stackIn_177_1 = stackOut_176_1;
            if (param0 == null) {
              stackOut_178_0 = (RuntimeException) ((Object) stackIn_178_0);
              stackOut_178_1 = (StringBuilder) ((Object) stackIn_178_1);
              stackOut_178_2 = "null";
              stackIn_179_0 = stackOut_178_0;
              stackIn_179_1 = stackOut_178_1;
              stackIn_179_2 = stackOut_178_2;
              break L40;
            } else {
              stackOut_177_0 = (RuntimeException) ((Object) stackIn_177_0);
              stackOut_177_1 = (StringBuilder) ((Object) stackIn_177_1);
              stackOut_177_2 = "{...}";
              stackIn_179_0 = stackOut_177_0;
              stackIn_179_1 = stackOut_177_1;
              stackIn_179_2 = stackOut_177_2;
              break L40;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_179_0), stackIn_179_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void b(boolean param0) {
        int var2_int = 0;
        int[] var2 = null;
        int[] var3 = null;
        int var4 = 0;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          if (this.field_h == null) {
            break L0;
          } else {
            if (!this.field_r) {
              break L0;
            } else {
              L1: {
                this.field_r = false;
                this.field_B.field_z = 0;
                this.field_B.field_G = 0;
                if (this.field_B.field_o != null) {
                  var2_int = this.field_B.field_o.length - 1;
                  L2: while (true) {
                    if (-1 < (var2_int ^ -1)) {
                      break L1;
                    } else {
                      this.field_B.field_o[var2_int] = (byte) 0;
                      var2_int--;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                this.field_B.a(this.field_h, false, false, true, false);
                var2 = this.field_B.field_d;
                var3 = this.field_B.field_q;
                if (!this.field_y) {
                  break L3;
                } else {
                  if (-18 == (this.field_l ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_l == 18) {
                      break L3;
                    } else {
                      if (4 != this.field_l) {
                        this.field_u.a(this.field_B, -875079928);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L4: {
                L5: {
                  this.field_B.field_q = var3;
                  this.field_B.field_d = var2;
                  this.field_n.a(this.field_B, -875079928);
                  this.field_B.field_d = var2;
                  this.field_B.field_q = var3;
                  mj.a(this.field_w, this.field_z, this.field_E, this.field_s, nf.field_q, (byte) -81, this.field_x);
                  qq.a(nf.field_q, 3, eb.field_f, 3, 9);
                  if (-6 == (this.field_l ^ -1)) {
                    break L5;
                  } else {
                    if (this.field_l != 13) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                eb.field_f[7] = 65535;
                eb.field_f[5] = 0;
                eb.field_f[6] = 0;
                eb.field_f[9] = 0;
                eb.field_f[11] = 65535;
                eb.field_f[8] = 0;
                eb.field_f[10] = 0;
                eb.field_f[4] = 0;
                eb.field_f[3] = 65535;
                break L4;
              }
              this.field_B.a(eb.field_f);
              this.field_t = new lg(this.field_B, true, true, param0, true);
              return;
            }
          }
        }
    }

    final int a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_w - param0;
        int var6 = -param1 + this.field_z;
        int var7 = -param3 + (-80 + this.field_x);
        if (param2 != 0) {
            hb.c(123);
        }
        int var8 = -20000 + (var6 * var6 + var5 * var5) - -(var7 * var7);
        return var8;
    }

    final int a(int param0) {
        if (param0 != 5) {
            return 52;
        }
        return this.field_x;
    }

    final void a(int param0, int[] param1, boolean param2, byte[] param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        wo var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_t != null) {
              L1: {
                if (this.field_t.field_z <= param3.length) {
                  var6_int = 0;
                  L2: while (true) {
                    if (this.field_t.field_z <= var6_int) {
                      break L1;
                    } else {
                      L3: {
                        if (this.field_t.field_o[var6_int] < 0) {
                          break L3;
                        } else {
                          this.field_t.field_o[var6_int] = param3[var6_int];
                          break L3;
                        }
                      }
                      var6_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L4: {
                this.a(false, param1, param2, param4);
                if (param0 == -30) {
                  break L4;
                } else {
                  var8 = (wo) null;
                  this.a((wo) null, (byte) 88);
                  break L4;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("hb.L(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        this.field_g = 0;
        int var2 = -37 / ((-83 - param0) / 40);
        this.field_n.a(ap.field_b[0], (byte) 75);
        this.field_f = false;
        this.field_l = 0;
        this.field_v = 0;
    }

    hb() {
        this.field_B = new lg(4096, 4096, 0, true, true, true, false, false);
        this.field_n = new wg();
        this.field_u = new wg();
        this.field_u.a(ap.field_b[27], (byte) 87);
        this.field_l = -1;
        this.a(0, (byte) -36);
    }

    static {
        field_o = "To server list";
    }
}
