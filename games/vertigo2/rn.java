/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends jg {
    int field_D;
    static String[] field_w;
    int field_E;
    private boolean field_C;
    int field_v;
    int field_B;
    static int[] field_z;
    int field_x;
    static String field_y;
    int field_t;
    static r field_u;
    int field_A;

    private final void d(int param0) {
        int var3;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -23269) {
          if (-5 != (this.field_A ^ -1)) {
            if (this.field_A != 2) {
              if (-4 == (this.field_A ^ -1)) {
                this.field_v = 3;
                return;
              } else {
                this.field_v = 1;
                return;
              }
            } else {
              this.field_v = 3;
              return;
            }
          } else {
            this.field_v = 5;
            return;
          }
        } else {
          this.field_B = 105;
          if (-5 != (this.field_A ^ -1)) {
            if (this.field_A != 2) {
              if (-4 == (this.field_A ^ -1)) {
                this.field_v = 3;
                return;
              } else {
                this.field_v = 1;
                return;
              }
            } else {
              this.field_v = 3;
              return;
            }
          } else {
            this.field_v = 5;
            return;
          }
        }
    }

    public static void e(int param0) {
        field_z = null;
        field_y = null;
        field_w = null;
        field_u = null;
        int var1 = -15 % ((param0 - 24) / 62);
    }

    final void a(boolean param0, int[] param1, boolean param2, boolean param3) {
        if (param0) {
            return;
        }
        try {
            this.a(-30, param1, param2, (byte[]) null, param3);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "rn.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    rn(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3);
        this.field_A = param4;
        this.field_C = true;
        this.field_t = param5;
        this.d(-23269);
    }

    final void a(rn param0, int param1) {
        try {
            super.a(param0, -39);
            this.field_x = param0.field_x;
            this.field_t = param0.field_t;
            this.field_B = param0.field_B;
            this.field_v = param0.field_v;
            this.field_E = param0.field_E;
            if (param1 > -3) {
                mi var4 = (mi) null;
                this.a((mi) null, -11);
            }
            this.field_A = param0.field_A;
            this.field_D = param0.field_D;
            this.field_C = param0.field_C;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "rn.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int[] param1, boolean param2, byte[] param3, boolean param4) {
        int stackIn_8_0 = 0;
        fc[][] stackIn_30_0 = null;
        fc[][] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        fc[][] stackIn_37_0 = null;
        fc[][] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        fc var8 = null;
        Object var9 = null;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        fc var15 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = this.field_p;
              if (22 != var6_int) {
                break L1;
              } else {
                if (-11 < (this.field_k % 20 ^ -1)) {
                  var6_int = 8;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!param4) {
                stackIn_8_0 = pl.field_n;
                break L2;
              } else {
                stackIn_8_0 = pn.field_L;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_8_0;
              if (param0 == -30) {
                break L3;
              } else {
                this.field_A = -31;
                break L3;
              }
            }
            var8 = wi.field_j[var6_int][var7];
            if (var8 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L4: {
                vq.field_q[2] = this.field_g - -64;
                vq.field_q[0] = 64 + this.field_l;
                if (this.field_C) {
                  break L4;
                } else {
                  L5: {
                    if (param3 == null) {
                      break L5;
                    } else {
                      if (bj.field_i[0] <= param3[0]) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  param3 = bj.field_i;
                  break L4;
                }
              }
              L6: {
                vq.field_q[1] = this.field_s;
                if ((this.field_p ^ -1) != -24) {
                  break L6;
                } else {
                  if (-1 == (this.field_s + (this.field_l - -this.field_g) & 15 ^ -1)) {
                    vq.field_q[0] = vq.field_q[0] + (-4 + be.a(9, (byte) 83));
                    vq.field_q[1] = vq.field_q[1] + (be.a(9, (byte) 83) - 4);
                    vq.field_q[2] = vq.field_q[2] + (-4 + be.a(9, (byte) 83));
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                L8: {
                  if ((var6_int ^ -1) == -11) {
                    break L8;
                  } else {
                    if ((var6_int ^ -1) == -6) {
                      break L8;
                    } else {
                      if (this.field_i) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                L9: {
                  if ((var6_int ^ -1) == -11) {
                    L10: {
                      stackIn_37_0 = wi.field_j;

                      if (param2) {
                        stackIn_38_0 = (fc[][]) ((Object) stackIn_37_0);
                        stackIn_38_1 = 27;
                        break L10;
                      } else {
                        stackIn_38_0 = (fc[][]) ((Object) stackIn_37_0);
                        stackIn_38_1 = 3;
                        break L10;
                      }
                    }
                    var9 = stackIn_38_0[stackIn_38_1][var7];
                    break L9;
                  } else {
                    if ((var6_int ^ -1) != -6) {
                      if (this.field_i) {
                        var9 = wi.field_j[27][var7];
                        break L9;
                      } else {
                        var9 = null;
                        break L9;
                      }
                    } else {
                      L11: {
                        stackIn_30_0 = wi.field_j;

                        if (!param2) {
                          stackIn_31_0 = (fc[][]) ((Object) stackIn_30_0);
                          stackIn_31_1 = 4;
                          break L11;
                        } else {
                          stackIn_31_0 = (fc[][]) ((Object) stackIn_30_0);
                          stackIn_31_1 = 27;
                          break L11;
                        }
                      }
                      var9 = stackIn_31_0[stackIn_31_1][var7];
                      break L9;
                    }
                  }
                }
                var12 = ((fc) (var9)).field_R;
                ((fc) (var9)).field_R = param3;
                ((fc) (var9)).a(param1, vq.field_q);
                ((fc) (var9)).field_R = var12;
                break L7;
              }
              L12: {
                if (-1 < (this.field_f ^ -1)) {
                  var14 = var8.field_R;
                  var8.field_R = param3;
                  var8.a(param1, vq.field_q);
                  var8.field_R = var14;
                  break L12;
                } else {
                  var15 = (fc) ((Object) this.field_n.a(true, true, false, var8));
                  var13 = var15.field_R;
                  var8.field_R = param3;
                  var15.a(param1, vq.field_q);
                  var15.field_R = var13;
                  break L12;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var6 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var6);

            stackIn_46_1 = new StringBuilder().append("rn.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L13;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_49_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L14;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L14;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_47_0), stackIn_50_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    rn(rn param0) {
        super(param0);
        try {
            this.a(param0, -127);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 == 0) {
          if (this.field_C) {
            if (!super.b(param0, param1, param2, param3, param4, 0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.a(43, false);
          if (this.field_C) {
            if (!super.b(param0, param1, param2, param3, param4, 0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var3;
        var3 = this.field_k;
        if (!param1) {
          return;
        } else {
          L0: {
            this.a((byte) -80, param0);
            if (this.field_A != 5) {
              break L0;
            } else {
              this.field_k = (short) var3;
              break L0;
            }
          }
          return;
        }
    }

    rn(mi param0) {
        super(1, 0, 0, 0);
        int var2_int = 0;
        try {
            this.a(param0, 12);
            var2_int = this.field_k;
            this.a((byte) -55, this.field_p);
            this.field_k = (short) var2_int;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(byte param0) {
        int var2 = 94 % ((-11 - param0) / 36);
        return this.field_C;
    }

    final boolean b(int param0) {
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_88_0 = null;
        Object stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        Object stackIn_96_0 = null;
        Object stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        Object stackIn_104_0 = null;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        Object stackIn_111_0 = null;
        Object stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int var2;
        int var3;
        var3 = Vertigo2.field_L ? 1 : 0;
        var2 = super.b(param0) ? 1 : 0;
        if (-3 == (this.field_A ^ -1)) {
          L0: {
            if (0 >= this.field_v) {
              break L0;
            } else {
              if (this.field_B > this.field_l) {
                break L0;
              } else {
                L1: {
                  this.field_v = this.field_v * -1;
                  this.field_l = this.field_B;
                  this.field_l = this.field_l + this.field_v;
                  if (this.field_A != 5) {
                    break L1;
                  } else {
                    if (this.field_k < this.field_t) {
                      break L1;
                    } else {
                      L2: {
                        this.field_k = (short) 0;
                        stackIn_88_0 = this;

                        if (this.field_C) {
                          stackIn_89_0 = this;
                          stackIn_89_1 = 0;
                          break L2;
                        } else {
                          stackIn_89_0 = this;
                          stackIn_89_1 = 1;
                          break L2;
                        }
                      }
                      ((rn) (this)).field_C = stackIn_89_1 != 0;
                      break L1;
                    }
                  }
                }
                return var2 != 0;
              }
            }
          }
          if (0 > this.field_v) {
            if (this.field_l > this.field_x) {
              L3: {
                this.field_l = this.field_l + this.field_v;
                if (this.field_A != 5) {
                  break L3;
                } else {
                  if (this.field_k < this.field_t) {
                    break L3;
                  } else {
                    L4: {
                      this.field_k = (short) 0;
                      stackIn_111_0 = this;

                      if (this.field_C) {
                        stackIn_112_0 = this;
                        stackIn_112_1 = 0;
                        break L4;
                      } else {
                        stackIn_112_0 = this;
                        stackIn_112_1 = 1;
                        break L4;
                      }
                    }
                    ((rn) (this)).field_C = stackIn_112_1 != 0;
                    break L3;
                  }
                }
              }
              return var2 != 0;
            } else {
              L5: {
                this.field_l = this.field_x;
                this.field_v = this.field_v * -1;
                this.field_l = this.field_l + this.field_v;
                if (this.field_A != 5) {
                  break L5;
                } else {
                  if (this.field_k < this.field_t) {
                    break L5;
                  } else {
                    L6: {
                      this.field_k = (short) 0;
                      stackIn_104_0 = this;

                      if (this.field_C) {
                        stackIn_105_0 = this;
                        stackIn_105_1 = 0;
                        break L6;
                      } else {
                        stackIn_105_0 = this;
                        stackIn_105_1 = 1;
                        break L6;
                      }
                    }
                    ((rn) (this)).field_C = stackIn_105_1 != 0;
                    break L5;
                  }
                }
              }
              return var2 != 0;
            }
          } else {
            L7: {
              this.field_l = this.field_l + this.field_v;
              if (this.field_A != 5) {
                break L7;
              } else {
                if (this.field_k < this.field_t) {
                  break L7;
                } else {
                  L8: {
                    this.field_k = (short) 0;
                    stackIn_96_0 = this;

                    if (this.field_C) {
                      stackIn_97_0 = this;
                      stackIn_97_1 = 0;
                      break L8;
                    } else {
                      stackIn_97_0 = this;
                      stackIn_97_1 = 1;
                      break L8;
                    }
                  }
                  ((rn) (this)).field_C = stackIn_97_1 != 0;
                  break L7;
                }
              }
            }
            return var2 != 0;
          }
        } else {
          if (this.field_A != 3) {
            if (this.field_A == 4) {
              L9: {
                if (-1 <= (this.field_v ^ -1)) {
                  break L9;
                } else {
                  if (this.field_s < this.field_B) {
                    break L9;
                  } else {
                    L10: {
                      this.field_v = this.field_v * -1;
                      this.field_s = this.field_B;
                      this.field_s = this.field_s + this.field_v;
                      if (this.field_A != 5) {
                        break L10;
                      } else {
                        if (this.field_k < this.field_t) {
                          break L10;
                        } else {
                          L11: {
                            this.field_k = (short) 0;
                            stackIn_53_0 = this;

                            if (this.field_C) {
                              stackIn_54_0 = this;
                              stackIn_54_1 = 0;
                              break L11;
                            } else {
                              stackIn_54_0 = this;
                              stackIn_54_1 = 1;
                              break L11;
                            }
                          }
                          ((rn) (this)).field_C = stackIn_54_1 != 0;
                          break L10;
                        }
                      }
                    }
                    return var2 != 0;
                  }
                }
              }
              if (this.field_v < 0) {
                if (this.field_x >= this.field_s) {
                  this.field_s = this.field_x;
                  this.field_v = this.field_v * -1;
                  L12: {
                    this.field_s = this.field_s + this.field_v;
                    if (this.field_A != 5) {
                      break L12;
                    } else {
                      if (this.field_k < this.field_t) {
                        break L12;
                      } else {
                        L13: {
                          this.field_k = (short) 0;
                          stackIn_79_0 = this;

                          if (this.field_C) {
                            stackIn_80_0 = this;
                            stackIn_80_1 = 0;
                            break L13;
                          } else {
                            stackIn_80_0 = this;
                            stackIn_80_1 = 1;
                            break L13;
                          }
                        }
                        ((rn) (this)).field_C = stackIn_80_1 != 0;
                        break L12;
                      }
                    }
                  }
                  return var2 != 0;
                } else {
                  L14: {
                    this.field_s = this.field_s + this.field_v;
                    if (this.field_A != 5) {
                      break L14;
                    } else {
                      if (this.field_k < this.field_t) {
                        break L14;
                      } else {
                        L15: {
                          this.field_k = (short) 0;
                          stackIn_70_0 = this;

                          if (this.field_C) {
                            stackIn_71_0 = this;
                            stackIn_71_1 = 0;
                            break L15;
                          } else {
                            stackIn_71_0 = this;
                            stackIn_71_1 = 1;
                            break L15;
                          }
                        }
                        ((rn) (this)).field_C = stackIn_71_1 != 0;
                        break L14;
                      }
                    }
                  }
                  return var2 != 0;
                }
              } else {
                L16: {
                  this.field_s = this.field_s + this.field_v;
                  if (this.field_A != 5) {
                    break L16;
                  } else {
                    if (this.field_k < this.field_t) {
                      break L16;
                    } else {
                      L17: {
                        this.field_k = (short) 0;
                        stackIn_62_0 = this;

                        if (this.field_C) {
                          stackIn_63_0 = this;
                          stackIn_63_1 = 0;
                          break L17;
                        } else {
                          stackIn_63_0 = this;
                          stackIn_63_1 = 1;
                          break L17;
                        }
                      }
                      ((rn) (this)).field_C = stackIn_63_1 != 0;
                      break L16;
                    }
                  }
                }
                return var2 != 0;
              }
            } else {
              L18: {
                if (this.field_A != 5) {
                  break L18;
                } else {
                  if (this.field_k < this.field_t) {
                    break L18;
                  } else {
                    L19: {
                      this.field_k = (short) 0;
                      stackIn_44_0 = this;

                      if (this.field_C) {
                        stackIn_45_0 = this;
                        stackIn_45_1 = 0;
                        break L19;
                      } else {
                        stackIn_45_0 = this;
                        stackIn_45_1 = 1;
                        break L19;
                      }
                    }
                    ((rn) (this)).field_C = stackIn_45_1 != 0;
                    break L18;
                  }
                }
              }
              return var2 != 0;
            }
          } else {
            L20: {
              if (-1 <= (this.field_v ^ -1)) {
                break L20;
              } else {
                if (this.field_B > this.field_g) {
                  break L20;
                } else {
                  this.field_v = this.field_v * -1;
                  this.field_g = this.field_B;
                  L21: {
                    this.field_g = this.field_g + this.field_v;
                    if (this.field_A != 5) {
                      break L21;
                    } else {
                      if (this.field_k < this.field_t) {
                        break L21;
                      } else {
                        L22: {
                          this.field_k = (short) 0;
                          stackIn_9_0 = this;

                          if (this.field_C) {
                            stackIn_10_0 = this;
                            stackIn_10_1 = 0;
                            break L22;
                          } else {
                            stackIn_10_0 = this;
                            stackIn_10_1 = 1;
                            break L22;
                          }
                        }
                        ((rn) (this)).field_C = stackIn_10_1 != 0;
                        break L21;
                      }
                    }
                  }
                  return var2 != 0;
                }
              }
            }
            if (0 > this.field_v) {
              if (1 + this.field_x < this.field_g) {
                L23: {
                  this.field_g = this.field_g + this.field_v;
                  if (this.field_A != 5) {
                    break L23;
                  } else {
                    if (this.field_k < this.field_t) {
                      break L23;
                    } else {
                      L24: {
                        this.field_k = (short) 0;
                        stackIn_35_0 = this;

                        if (this.field_C) {
                          stackIn_36_0 = this;
                          stackIn_36_1 = 0;
                          break L24;
                        } else {
                          stackIn_36_0 = this;
                          stackIn_36_1 = 1;
                          break L24;
                        }
                      }
                      ((rn) (this)).field_C = stackIn_36_1 != 0;
                      break L23;
                    }
                  }
                }
                return var2 != 0;
              } else {
                this.field_v = this.field_v * -1;
                this.field_g = this.field_x;
                L25: {
                  this.field_g = this.field_g + this.field_v;
                  if (this.field_A != 5) {
                    break L25;
                  } else {
                    if (this.field_k < this.field_t) {
                      break L25;
                    } else {
                      L26: {
                        this.field_k = (short) 0;
                        stackIn_28_0 = this;

                        if (this.field_C) {
                          stackIn_29_0 = this;
                          stackIn_29_1 = 0;
                          break L26;
                        } else {
                          stackIn_29_0 = this;
                          stackIn_29_1 = 1;
                          break L26;
                        }
                      }
                      ((rn) (this)).field_C = stackIn_29_1 != 0;
                      break L25;
                    }
                  }
                }
                return var2 != 0;
              }
            } else {
              L27: {
                this.field_g = this.field_g + this.field_v;
                if (this.field_A != 5) {
                  break L27;
                } else {
                  if (this.field_k < this.field_t) {
                    break L27;
                  } else {
                    L28: {
                      this.field_k = (short) 0;
                      stackIn_18_0 = this;

                      if (this.field_C) {
                        stackIn_19_0 = this;
                        stackIn_19_1 = 0;
                        break L28;
                      } else {
                        stackIn_19_0 = this;
                        stackIn_19_1 = 1;
                        break L28;
                      }
                    }
                    ((rn) (this)).field_C = stackIn_19_1 != 0;
                    break L27;
                  }
                }
              }
              return var2 != 0;
            }
          }
        }
    }

    final static void a(int param0, si param1) {
        try {
            if (param0 <= 33) {
                si var3 = (si) null;
                rn.a(9, (si) null);
            }
            bm.a(param1, true, 4);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "rn.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(wo param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -this.field_l + (-64 + param0.field_E);
                var4 = -53 % ((38 - param1) / 37);
                var5 = -64 + (-this.field_g + param0.field_y);
                var6 = -this.field_s + param0.field_k;
                if (var3_int * var3_int >= 4096) {
                  break L2;
                } else {
                  if ((var5 * var5 ^ -1) <= -4097) {
                    break L2;
                  } else {
                    if (-31 >= (var6 ^ -1)) {
                      break L2;
                    } else {
                      stackIn_5_0 = 1;
                      break L1;
                    }
                  }
                }
              }
              stackIn_5_0 = 0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("rn.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, byte param1) {
        int var3;
        var3 = this.field_k;
        this.a((byte) -72, param0);
        if (param1 <= -121) {
          if ((this.field_A ^ -1) != -6) {
            if (28 == param0) {
              return;
            } else {
              this.field_k = (short) var3;
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_t = -19;
          if ((this.field_A ^ -1) != -6) {
            if (28 == param0) {
              return;
            } else {
              this.field_k = (short) var3;
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void a(mi param0, int param1) {
        try {
            this.field_p = param0.c((byte) -119, 5);
            this.field_A = param0.c((byte) -97, 3);
            this.field_t = param0.c((byte) -102, 9);
            this.field_k = (short)param0.c((byte) -125, 8);
            this.field_l = param0.c((byte) -95, 10);
            this.field_g = param0.c((byte) -114, 10);
            this.field_s = param0.c((byte) -116, param1) + -193;
            this.field_h = param0.c((byte) -121, 3);
            this.field_r = param0.c((byte) -96, 3);
            this.field_o = param0.c((byte) -113, 4);
            this.field_C = 1 == param0.c((byte) -105, 1) ? true : false;
            this.field_v = -5 + param0.c((byte) -106, 4);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "rn.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_w = new String[16];
        field_y = "The game options are not all set.";
    }
}
